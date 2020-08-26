package typings.gulpImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var concurrent: js.UndefOr[Double] = js.native
  var gifsicle: js.UndefOr[OptimizerSetting] = js.native
  var guetzli: js.UndefOr[OptimizerSetting] = js.native
  var jpegRecompress: js.UndefOr[OptimizerSetting] = js.native
  var mozjpeg: js.UndefOr[OptimizerSetting] = js.native
  var optipng: js.UndefOr[OptimizerSetting] = js.native
  var pngquant: js.UndefOr[OptimizerSetting] = js.native
  var quiet: js.UndefOr[Boolean] = js.native
  var svgo: js.UndefOr[OptimizerSetting] = js.native
  var zopflipng: js.UndefOr[OptimizerSetting] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setConcurrent(value: Double): Self = this.set("concurrent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrent: Self = this.set("concurrent", js.undefined)
    @scala.inline
    def setGifsicleVarargs(value: js.Any*): Self = this.set("gifsicle", js.Array(value :_*))
    @scala.inline
    def setGifsicle(value: OptimizerSetting): Self = this.set("gifsicle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGifsicle: Self = this.set("gifsicle", js.undefined)
    @scala.inline
    def setGuetzliVarargs(value: js.Any*): Self = this.set("guetzli", js.Array(value :_*))
    @scala.inline
    def setGuetzli(value: OptimizerSetting): Self = this.set("guetzli", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuetzli: Self = this.set("guetzli", js.undefined)
    @scala.inline
    def setJpegRecompressVarargs(value: js.Any*): Self = this.set("jpegRecompress", js.Array(value :_*))
    @scala.inline
    def setJpegRecompress(value: OptimizerSetting): Self = this.set("jpegRecompress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJpegRecompress: Self = this.set("jpegRecompress", js.undefined)
    @scala.inline
    def setMozjpegVarargs(value: js.Any*): Self = this.set("mozjpeg", js.Array(value :_*))
    @scala.inline
    def setMozjpeg(value: OptimizerSetting): Self = this.set("mozjpeg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozjpeg: Self = this.set("mozjpeg", js.undefined)
    @scala.inline
    def setOptipngVarargs(value: js.Any*): Self = this.set("optipng", js.Array(value :_*))
    @scala.inline
    def setOptipng(value: OptimizerSetting): Self = this.set("optipng", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptipng: Self = this.set("optipng", js.undefined)
    @scala.inline
    def setPngquantVarargs(value: js.Any*): Self = this.set("pngquant", js.Array(value :_*))
    @scala.inline
    def setPngquant(value: OptimizerSetting): Self = this.set("pngquant", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePngquant: Self = this.set("pngquant", js.undefined)
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
    @scala.inline
    def setSvgoVarargs(value: js.Any*): Self = this.set("svgo", js.Array(value :_*))
    @scala.inline
    def setSvgo(value: OptimizerSetting): Self = this.set("svgo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgo: Self = this.set("svgo", js.undefined)
    @scala.inline
    def setZopflipngVarargs(value: js.Any*): Self = this.set("zopflipng", js.Array(value :_*))
    @scala.inline
    def setZopflipng(value: OptimizerSetting): Self = this.set("zopflipng", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZopflipng: Self = this.set("zopflipng", js.undefined)
  }
  
}

