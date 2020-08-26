package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents size of a single ad slot, or a creative.
  */
@js.native
trait SchemaAdSize extends js.Object {
  /**
    * The height of the ad slot in pixels. This field will be present only when
    * size type is `PIXEL`.
    */
  var height: js.UndefOr[String] = js.native
  /**
    * The size type of the ad slot.
    */
  var sizeType: js.UndefOr[String] = js.native
  /**
    * The width of the ad slot in pixels. This field will be present only when
    * size type is `PIXEL`.
    */
  var width: js.UndefOr[String] = js.native
}

object SchemaAdSize {
  @scala.inline
  def apply(): SchemaAdSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdSize]
  }
  @scala.inline
  implicit class SchemaAdSizeOps[Self <: SchemaAdSize] (val x: Self) extends AnyVal {
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
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setSizeType(value: String): Self = this.set("sizeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeType: Self = this.set("sizeType", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

