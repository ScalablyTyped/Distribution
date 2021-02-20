package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifies a subset of entities in a project. This is specified as
  * combinations of kinds and namespaces (either or both of which may be all,
  * as described in the following examples). Example usage:  Entire project:
  * kinds=[], namespace_ids=[]  Kinds Foo and Bar in all namespaces:
  * kinds=[&#39;Foo&#39;, &#39;Bar&#39;], namespace_ids=[]  Kinds Foo and Bar
  * only in the default namespace:   kinds=[&#39;Foo&#39;, &#39;Bar&#39;],
  * namespace_ids=[&#39;&#39;]  Kinds Foo and Bar in both the default and Baz
  * namespaces:   kinds=[&#39;Foo&#39;, &#39;Bar&#39;],
  * namespace_ids=[&#39;&#39;, &#39;Baz&#39;]  The entire Baz namespace:
  * kinds=[], namespace_ids=[&#39;Baz&#39;]
  */
@js.native
trait SchemaGoogleDatastoreAdminV1beta1EntityFilter extends StObject {
  
  /**
    * If empty, then this represents all kinds.
    */
  var kinds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An empty list represents all namespaces. This is the preferred usage for
    * projects that don&#39;t use namespaces.  An empty string element
    * represents the default namespace. This should be used if the project has
    * data in non-default namespaces, but doesn&#39;t want to include them.
    * Each namespace in this list must be unique.
    */
  var namespaceIds: js.UndefOr[js.Array[String]] = js.native
}
object SchemaGoogleDatastoreAdminV1beta1EntityFilter {
  
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1beta1EntityFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1beta1EntityFilter]
  }
  
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1beta1EntityFilterMutableBuilder[Self <: SchemaGoogleDatastoreAdminV1beta1EntityFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKinds(value: js.Array[String]): Self = StObject.set(x, "kinds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindsUndefined: Self = StObject.set(x, "kinds", js.undefined)
    
    @scala.inline
    def setKindsVarargs(value: String*): Self = StObject.set(x, "kinds", js.Array(value :_*))
    
    @scala.inline
    def setNamespaceIds(value: js.Array[String]): Self = StObject.set(x, "namespaceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceIdsUndefined: Self = StObject.set(x, "namespaceIds", js.undefined)
    
    @scala.inline
    def setNamespaceIdsVarargs(value: String*): Self = StObject.set(x, "namespaceIds", js.Array(value :_*))
  }
}
