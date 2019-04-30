package typings
package imageminDashPngquantLib.imageminDashPngquantMod.ImageminPngquantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dithering: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var input: js.UndefOr[nodeLib.Buffer | nodeLib.streamMod.Stream] = js.undefined
  var posterize: js.UndefOr[scala.Double] = js.undefined
  var quality: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
  var strip: js.UndefOr[scala.Boolean] = js.undefined
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dithering: scala.Double | scala.Boolean = null,
    input: nodeLib.Buffer | nodeLib.streamMod.Stream = null,
    posterize: scala.Int | scala.Double = null,
    quality: js.Tuple2[scala.Double, scala.Double] = null,
    speed: scala.Int | scala.Double = null,
    strip: js.UndefOr[scala.Boolean] = js.undefined,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dithering != null) __obj.updateDynamic("dithering")(dithering.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (posterize != null) __obj.updateDynamic("posterize")(posterize.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality)
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (!js.isUndefined(strip)) __obj.updateDynamic("strip")(strip)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Options]
  }
}

