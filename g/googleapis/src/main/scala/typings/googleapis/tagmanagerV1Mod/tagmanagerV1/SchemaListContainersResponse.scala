package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Containers Response.
  */
@js.native
trait SchemaListContainersResponse extends js.Object {
  /**
    * All Containers of a GTM Account.
    */
  var containers: js.UndefOr[js.Array[SchemaContainer]] = js.native
}

object SchemaListContainersResponse {
  @scala.inline
  def apply(containers: js.Array[SchemaContainer] = null): SchemaListContainersResponse = {
    val __obj = js.Dynamic.literal()
    if (containers != null) __obj.updateDynamic("containers")(containers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListContainersResponse]
  }
}

