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
  def apply(): SchemaUpdateEmbeddedObjectPositionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateEmbeddedObjectPositionResponse]
  }
  @scala.inline
  implicit class SchemaUpdateEmbeddedObjectPositionResponseOps[Self <: SchemaUpdateEmbeddedObjectPositionResponse] (val x: Self) extends AnyVal {
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
    def setPosition(value: SchemaEmbeddedObjectPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

