package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of creating an image.
  */
@js.native
trait SchemaCreateImageResponse extends js.Object {
  /**
    * The object ID of the created image.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaCreateImageResponse {
  @scala.inline
  def apply(objectId: String = null): SchemaCreateImageResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateImageResponse]
  }
}

