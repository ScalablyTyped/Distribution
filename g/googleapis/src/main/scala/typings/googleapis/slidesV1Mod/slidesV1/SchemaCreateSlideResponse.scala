package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of creating a slide.
  */
@js.native
trait SchemaCreateSlideResponse extends js.Object {
  /**
    * The object ID of the created slide.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaCreateSlideResponse {
  @scala.inline
  def apply(objectId: String = null): SchemaCreateSlideResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateSlideResponse]
  }
}

