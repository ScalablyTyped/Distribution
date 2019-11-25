package typings.heremaps.H.map.render.p2d.RenderEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** optional */
  var enableSubpixelRendering: js.UndefOr[Boolean] = js.undefined
  /** The pixelRatio to use for over-sampling in cases of high-resolution displays */
  var pixelRatio: Double
  /** Object describes how many cached zoom levels should be used as a base map background while base map tiles are */
  var renderBaseBackground: js.UndefOr[js.Object] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    pixelRatio: Double,
    enableSubpixelRendering: js.UndefOr[Boolean] = js.undefined,
    renderBaseBackground: js.Object = null
  ): Options = {
    val __obj = js.Dynamic.literal(pixelRatio = pixelRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSubpixelRendering)) __obj.updateDynamic("enableSubpixelRendering")(enableSubpixelRendering.asInstanceOf[js.Any])
    if (renderBaseBackground != null) __obj.updateDynamic("renderBaseBackground")(renderBaseBackground.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

