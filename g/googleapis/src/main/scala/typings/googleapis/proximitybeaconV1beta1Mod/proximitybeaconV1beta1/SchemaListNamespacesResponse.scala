package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to ListNamespacesRequest that contains all the project&#39;s
  * namespaces.
  */
@js.native
trait SchemaListNamespacesResponse extends js.Object {
  /**
    * The attachments that corresponded to the request params.
    */
  var namespaces: js.UndefOr[js.Array[SchemaNamespace]] = js.native
}

object SchemaListNamespacesResponse {
  @scala.inline
  def apply(namespaces: js.Array[SchemaNamespace] = null): SchemaListNamespacesResponse = {
    val __obj = js.Dynamic.literal()
    if (namespaces != null) __obj.updateDynamic("namespaces")(namespaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListNamespacesResponse]
  }
}

