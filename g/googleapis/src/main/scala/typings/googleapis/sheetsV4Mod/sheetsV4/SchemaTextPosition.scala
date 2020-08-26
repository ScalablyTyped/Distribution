package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Position settings for text.
  */
@js.native
trait SchemaTextPosition extends js.Object {
  /**
    * Horizontal alignment setting for the piece of text.
    */
  var horizontalAlignment: js.UndefOr[String] = js.native
}

object SchemaTextPosition {
  @scala.inline
  def apply(): SchemaTextPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextPosition]
  }
  @scala.inline
  implicit class SchemaTextPositionOps[Self <: SchemaTextPosition] (val x: Self) extends AnyVal {
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
    def setHorizontalAlignment(value: String): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
  }
  
}

