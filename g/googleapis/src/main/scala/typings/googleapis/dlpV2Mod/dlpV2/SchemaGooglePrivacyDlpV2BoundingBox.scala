package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bounding box encompassing detected text within an image.
  */
@js.native
trait SchemaGooglePrivacyDlpV2BoundingBox extends js.Object {
  /**
    * Height of the bounding box in pixels.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Left coordinate of the bounding box. (0,0) is upper left.
    */
  var left: js.UndefOr[Double] = js.native
  /**
    * Top coordinate of the bounding box. (0,0) is upper left.
    */
  var top: js.UndefOr[Double] = js.native
  /**
    * Width of the bounding box in pixels.
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaGooglePrivacyDlpV2BoundingBox {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2BoundingBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2BoundingBox]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2BoundingBoxOps[Self <: SchemaGooglePrivacyDlpV2BoundingBox] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

