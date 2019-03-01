package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRendererOptions extends js.Object {
  /**
    * A flag that specifies if `render.bounds` should be used when rendering.
    *
    * @property options.hasBounds
    * @type boolean
    * @default false
    */
  var hasBounds: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The target height in pixels of the `render.canvas` to be created.
    *
    * @property options.height
    * @type number
    * @default 600
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * The target width in pixels of the `render.canvas` to be created.
    *
    * @property options.width
    * @type number
    * @default 800
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * Render wireframes only
    * @type boolean
    * @default true 
    */
  var wireframes: js.UndefOr[scala.Boolean] = js.undefined
}

object IRendererOptions {
  @scala.inline
  def apply(
    hasBounds: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null,
    wireframes: js.UndefOr[scala.Boolean] = js.undefined
  ): IRendererOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasBounds)) __obj.updateDynamic("hasBounds")(hasBounds)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wireframes)) __obj.updateDynamic("wireframes")(wireframes)
    __obj.asInstanceOf[IRendererOptions]
  }
}

