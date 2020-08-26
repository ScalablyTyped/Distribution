package typings.heremaps.H.map.render.p2d.RenderEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** optional */
  var enableSubpixelRendering: js.UndefOr[Boolean] = js.native
  /** The pixelRatio to use for over-sampling in cases of high-resolution displays */
  var pixelRatio: Double = js.native
  /** Object describes how many cached zoom levels should be used as a base map background while base map tiles are */
  var renderBaseBackground: js.UndefOr[js.Object] = js.native
}

object Options {
  @scala.inline
  def apply(pixelRatio: Double): Options = {
    val __obj = js.Dynamic.literal(pixelRatio = pixelRatio.asInstanceOf[js.Any])
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
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableSubpixelRendering(value: Boolean): Self = this.set("enableSubpixelRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSubpixelRendering: Self = this.set("enableSubpixelRendering", js.undefined)
    @scala.inline
    def setRenderBaseBackground(value: js.Object): Self = this.set("renderBaseBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderBaseBackground: Self = this.set("renderBaseBackground", js.undefined)
  }
  
}

