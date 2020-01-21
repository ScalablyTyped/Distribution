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
  def apply(
    scaleX: Int | Double = null,
    scaleY: Int | Double = null,
    shearX: Int | Double = null,
    shearY: Int | Double = null,
    translateX: Int | Double = null,
    translateY: Int | Double = null,
    unit: String = null
  ): SchemaAffineTransform = {
    val __obj = js.Dynamic.literal()
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (shearX != null) __obj.updateDynamic("shearX")(shearX.asInstanceOf[js.Any])
    if (shearY != null) __obj.updateDynamic("shearY")(shearY.asInstanceOf[js.Any])
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAffineTransform]
  }
}

