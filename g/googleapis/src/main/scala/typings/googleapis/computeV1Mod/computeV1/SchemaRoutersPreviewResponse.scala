package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRoutersPreviewResponse extends js.Object {
  /**
    * Preview of given router.
    */
  var resource: js.UndefOr[SchemaRouter] = js.native
}

object SchemaRoutersPreviewResponse {
  @scala.inline
  def apply(resource: SchemaRouter = null): SchemaRoutersPreviewResponse = {
    val __obj = js.Dynamic.literal()
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRoutersPreviewResponse]
  }
}

