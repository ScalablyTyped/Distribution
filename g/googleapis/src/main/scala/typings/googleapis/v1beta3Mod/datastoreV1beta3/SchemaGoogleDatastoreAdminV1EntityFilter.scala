package typings.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(kinds: js.Array[String] = null, namespaceIds: js.Array[String] = null): SchemaGoogleDatastoreAdminV1EntityFilter = {
    val __obj = js.Dynamic.literal()
    if (kinds != null) __obj.updateDynamic("kinds")(kinds.asInstanceOf[js.Any])
    if (namespaceIds != null) __obj.updateDynamic("namespaceIds")(namespaceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1EntityFilter]
  }
}

