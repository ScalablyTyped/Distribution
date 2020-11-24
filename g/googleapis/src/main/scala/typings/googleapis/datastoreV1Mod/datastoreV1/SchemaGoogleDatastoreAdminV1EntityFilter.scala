package typings.googleapis.datastoreV1Mod.datastoreV1

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
trait SchemaGoogleDatastoreAdminV1EntityFilter extends js.Object {
  
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
object SchemaGoogleDatastoreAdminV1EntityFilter {
  
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1EntityFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1EntityFilter]
  }
  
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1EntityFilterOps[Self <: SchemaGoogleDatastoreAdminV1EntityFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKindsVarargs(value: String*): Self = this.set("kinds", js.Array(value :_*))
    
    @scala.inline
    def setKinds(value: js.Array[String]): Self = this.set("kinds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinds: Self = this.set("kinds", js.undefined)
    
    @scala.inline
    def setNamespaceIdsVarargs(value: String*): Self = this.set("namespaceIds", js.Array(value :_*))
    
    @scala.inline
    def setNamespaceIds(value: js.Array[String]): Self = this.set("namespaceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaceIds: Self = this.set("namespaceIds", js.undefined)
  }
}
