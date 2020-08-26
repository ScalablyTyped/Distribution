package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextElement kind that represents auto text.
  */
@js.native
trait SchemaAutoText extends js.Object {
  /**
    * The rendered content of this auto text, if available.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The styling applied to this auto text.
    */
  var style: js.UndefOr[SchemaTextStyle] = js.native
  /**
    * The type of this auto text.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaAutoText {
  @scala.inline
  def apply(): SchemaAutoText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoText]
  }
  @scala.inline
  implicit class SchemaAutoTextOps[Self <: SchemaAutoText] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setStyle(value: SchemaTextStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

