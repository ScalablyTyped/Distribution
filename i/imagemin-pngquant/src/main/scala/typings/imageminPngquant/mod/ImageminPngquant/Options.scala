package typings.imageminPngquant.mod.ImageminPngquant

import typings.node.Buffer
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var dithering: js.UndefOr[Double | Boolean] = js.native
  var input: js.UndefOr[Buffer | Stream] = js.native
  var posterize: js.UndefOr[Double] = js.native
  var quality: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var speed: js.UndefOr[Double] = js.native
  var strip: js.UndefOr[Boolean] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
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
    def setDithering(value: Double | Boolean): Self = this.set("dithering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDithering: Self = this.set("dithering", js.undefined)
    @scala.inline
    def setInput(value: Buffer | Stream): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setPosterize(value: Double): Self = this.set("posterize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosterize: Self = this.set("posterize", js.undefined)
    @scala.inline
    def setQuality(value: js.Tuple2[Double, Double]): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setStrip(value: Boolean): Self = this.set("strip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrip: Self = this.set("strip", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

