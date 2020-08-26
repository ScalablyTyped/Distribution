package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AffineTransform uses a 3x3 matrix with an implied last row of [ 0 0 1 ] to
  * transform source coordinates (x,y) into destination coordinates (x&#39;,
  * y&#39;) according to:        x&#39;  x  =   shear_y  scale_y  translate_y
  * 1  [ 1 ]  After transformation,       x&#39; = scale_x * x + shear_x * y +
  * translate_x;      y&#39; = scale_y * y + shear_y * x + translate_y;  This
  * message is therefore composed of these six matrix elements.
  */
@js.native
trait SchemaAffineTransform extends js.Object {
  /**
    * The X coordinate scaling element.
    */
  var scaleX: js.UndefOr[Double] = js.native
  /**
    * The Y coordinate scaling element.
    */
  var scaleY: js.UndefOr[Double] = js.native
  /**
    * The X coordinate shearing element.
    */
  var shearX: js.UndefOr[Double] = js.native
  /**
    * The Y coordinate shearing element.
    */
  var shearY: js.UndefOr[Double] = js.native
  /**
    * The X coordinate translation element.
    */
  var translateX: js.UndefOr[Double] = js.native
  /**
    * The Y coordinate translation element.
    */
  var translateY: js.UndefOr[Double] = js.native
  /**
    * The units for translate elements.
    */
  var unit: js.UndefOr[String] = js.native
}

object SchemaAffineTransform {
  @scala.inline
  def apply(): SchemaAffineTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAffineTransform]
  }
  @scala.inline
  implicit class SchemaAffineTransformOps[Self <: SchemaAffineTransform] (val x: Self) extends AnyVal {
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
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    @scala.inline
    def setScaleY(value: Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleY: Self = this.set("scaleY", js.undefined)
    @scala.inline
    def setShearX(value: Double): Self = this.set("shearX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShearX: Self = this.set("shearX", js.undefined)
    @scala.inline
    def setShearY(value: Double): Self = this.set("shearY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShearY: Self = this.set("shearY", js.undefined)
    @scala.inline
    def setTranslateX(value: Double): Self = this.set("translateX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslateX: Self = this.set("translateX", js.undefined)
    @scala.inline
    def setTranslateY(value: Double): Self = this.set("translateY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslateY: Self = this.set("translateY", js.undefined)
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
  
}

