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
    scaleX: js.UndefOr[Double] = js.undefined,
    scaleY: js.UndefOr[Double] = js.undefined,
    shearX: js.UndefOr[Double] = js.undefined,
    shearY: js.UndefOr[Double] = js.undefined,
    translateX: js.UndefOr[Double] = js.undefined,
    translateY: js.UndefOr[Double] = js.undefined,
    unit: String = null
  ): SchemaAffineTransform = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scaleX)) __obj.updateDynamic("scaleX")(scaleX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleY)) __obj.updateDynamic("scaleY")(scaleY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shearX)) __obj.updateDynamic("shearX")(shearX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shearY)) __obj.updateDynamic("shearY")(shearY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(translateX)) __obj.updateDynamic("translateX")(translateX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(translateY)) __obj.updateDynamic("translateY")(translateY.get.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAffineTransform]
  }
}

