package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of creating a shape.
  */
@js.native
trait SchemaCreateShapeResponse extends js.Object {
  /**
    * The object ID of the created shape.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaCreateShapeResponse {
  @scala.inline
  def apply(objectId: String = null): SchemaCreateShapeResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateShapeResponse]
  }
}

