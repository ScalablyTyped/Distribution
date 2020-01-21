package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of updating an embedded object&#39;s position.
  */
@js.native
trait SchemaUpdateEmbeddedObjectPositionResponse extends js.Object {
  /**
    * The new position of the embedded object.
    */
  var position: js.UndefOr[SchemaEmbeddedObjectPosition] = js.native
}

object SchemaUpdateEmbeddedObjectPositionResponse {
  @scala.inline
  def apply(position: SchemaEmbeddedObjectPosition = null): SchemaUpdateEmbeddedObjectPositionResponse = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateEmbeddedObjectPositionResponse]
  }
}

