package typings.mapboxSpritezero.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageObject extends js.Object {
  /** Ratio of a 72dpi screen pixel to the destination pixel density */
  var pixelRatio: js.UndefOr[Double] = js.native
  /** A string of the SVG. */
  var svg: js.UndefOr[Buffer | String] = js.native
}

object ImageObject {
  @scala.inline
  def apply(): ImageObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageObject]
  }
  @scala.inline
  implicit class ImageObjectOps[Self <: ImageObject] (val x: Self) extends AnyVal {
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
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
    @scala.inline
    def setSvg(value: Buffer | String): Self = this.set("svg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvg: Self = this.set("svg", js.undefined)
  }
  
}

