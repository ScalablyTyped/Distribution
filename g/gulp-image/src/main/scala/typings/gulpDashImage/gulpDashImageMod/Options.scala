package typings.gulpDashImage.gulpDashImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var concurrent: js.UndefOr[Double] = js.undefined
  var gifsicle: js.UndefOr[OptimizerSetting] = js.undefined
  var guetzli: js.UndefOr[OptimizerSetting] = js.undefined
  var jpegRecompress: js.UndefOr[OptimizerSetting] = js.undefined
  var mozjpeg: js.UndefOr[OptimizerSetting] = js.undefined
  var optipng: js.UndefOr[OptimizerSetting] = js.undefined
  var pngquant: js.UndefOr[OptimizerSetting] = js.undefined
  var quiet: js.UndefOr[Boolean] = js.undefined
  var svgo: js.UndefOr[OptimizerSetting] = js.undefined
  var zopflipng: js.UndefOr[OptimizerSetting] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    concurrent: Int | Double = null,
    gifsicle: OptimizerSetting = null,
    guetzli: OptimizerSetting = null,
    jpegRecompress: OptimizerSetting = null,
    mozjpeg: OptimizerSetting = null,
    optipng: OptimizerSetting = null,
    pngquant: OptimizerSetting = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    svgo: OptimizerSetting = null,
    zopflipng: OptimizerSetting = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (concurrent != null) __obj.updateDynamic("concurrent")(concurrent.asInstanceOf[js.Any])
    if (gifsicle != null) __obj.updateDynamic("gifsicle")(gifsicle.asInstanceOf[js.Any])
    if (guetzli != null) __obj.updateDynamic("guetzli")(guetzli.asInstanceOf[js.Any])
    if (jpegRecompress != null) __obj.updateDynamic("jpegRecompress")(jpegRecompress.asInstanceOf[js.Any])
    if (mozjpeg != null) __obj.updateDynamic("mozjpeg")(mozjpeg.asInstanceOf[js.Any])
    if (optipng != null) __obj.updateDynamic("optipng")(optipng.asInstanceOf[js.Any])
    if (pngquant != null) __obj.updateDynamic("pngquant")(pngquant.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet)
    if (svgo != null) __obj.updateDynamic("svgo")(svgo.asInstanceOf[js.Any])
    if (zopflipng != null) __obj.updateDynamic("zopflipng")(zopflipng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

