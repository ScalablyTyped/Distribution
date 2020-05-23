package typings.imageminPngquant.mod.ImageminPngquant

import typings.node.Buffer
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dithering: js.UndefOr[Double | Boolean] = js.undefined
  var input: js.UndefOr[Buffer | Stream] = js.undefined
  var posterize: js.UndefOr[Double] = js.undefined
  var quality: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var strip: js.UndefOr[Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dithering: Double | Boolean = null,
    input: Buffer | Stream = null,
    posterize: js.UndefOr[Double] = js.undefined,
    quality: js.Tuple2[Double, Double] = null,
    speed: js.UndefOr[Double] = js.undefined,
    strip: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dithering != null) __obj.updateDynamic("dithering")(dithering.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(posterize)) __obj.updateDynamic("posterize")(posterize.get.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strip)) __obj.updateDynamic("strip")(strip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

