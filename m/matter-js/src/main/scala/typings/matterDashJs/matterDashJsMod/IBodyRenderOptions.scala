package typings.matterDashJs.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBodyRenderOptions extends js.Object {
  /**
    * A String that defines the fill style to use when rendering the body (if a sprite is not defined). It is the same as when using a canvas, so it accepts CSS style property values.
    Default: a random colour
    */
  var fillStyle: js.UndefOr[String] = js.undefined
  /**
    * A Number that defines the line width to use when rendering the body outline (if a sprite is not defined). A value of 0 means no outline will be rendered.
    Default: 1.5
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /*
  		 * Sets the opacity. 1.0 is fully opaque. 0.0 is fully translucent
  		 */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * An `Object` that defines the sprite properties to use when rendering, if any.
    *
    * @property render.sprite
    * @type object
    */
  var sprite: js.UndefOr[IBodyRenderOptionsSprite] = js.undefined
  /**
    * A String that defines the stroke style to use when rendering the body outline (if a sprite is not defined). It is the same as when using a canvas, so it accepts CSS style property values.
    Default: a random colour
    */
  var strokeStyle: js.UndefOr[String] = js.undefined
  /**
    * A flag that indicates if the body should be rendered.
    *
    * @property render.visible
    * @type boolean
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object IBodyRenderOptions {
  @scala.inline
  def apply(
    fillStyle: String = null,
    lineWidth: Int | Double = null,
    opacity: Int | Double = null,
    sprite: IBodyRenderOptionsSprite = null,
    strokeStyle: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): IBodyRenderOptions = {
    val __obj = js.Dynamic.literal()
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (sprite != null) __obj.updateDynamic("sprite")(sprite)
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IBodyRenderOptions]
  }
}

