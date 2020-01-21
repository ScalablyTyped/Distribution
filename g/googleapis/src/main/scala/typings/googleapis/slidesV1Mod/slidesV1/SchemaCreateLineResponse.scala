package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of creating a line.
  */
@js.native
trait SchemaCreateLineResponse extends js.Object {
  /**
    * The object ID of the created line.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaCreateLineResponse {
  @scala.inline
  def apply(objectId: String = null): SchemaCreateLineResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateLineResponse]
  }
}

