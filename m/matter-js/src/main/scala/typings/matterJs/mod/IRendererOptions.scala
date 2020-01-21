package typings.matterJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRendererOptions extends js.Object {
  /**
    * Sets scene background
    * @type string
    * default undefined
    */
  var background: js.UndefOr[String] = js.undefined
  /**
    * A flag that specifies if `render.bounds` should be used when rendering.
    *
    * @property options.hasBounds
    * @type boolean
    * @default false
    */
  var hasBounds: js.UndefOr[Boolean] = js.undefined
  /**
    * The target height in pixels of the `render.canvas` to be created.
    *
    * @property options.height
    * @type number
    * @default 600
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The target width in pixels of the `render.canvas` to be created.
    *
    * @property options.width
    * @type number
    * @default 800
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * Render wireframes only
    * @type boolean
    * @default true
    */
  var wireframes: js.UndefOr[Boolean] = js.undefined
}

object IRendererOptions {
  @scala.inline
  def apply(
    background: String = null,
    hasBounds: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    width: Int | Double = null,
    wireframes: js.UndefOr[Boolean] = js.undefined
  ): IRendererOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBounds)) __obj.updateDynamic("hasBounds")(hasBounds.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wireframes)) __obj.updateDynamic("wireframes")(wireframes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRendererOptions]
  }
}

