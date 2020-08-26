package typings.mapboxSpritezero.mod

import typings.mapboxSpritezero.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateLayoutOptions extends js.Object {
  /** If true, generate DataLayout ; if false, generate ImgLayout */
  var format: Boolean = js.native
  var imgs: js.Array[Id] = js.native
  /** overrides the max_size in mapnik */
  var maxIconSize: js.UndefOr[Double] = js.native
  /** Ratio of a 72dpi screen pixel to the destination pixel density */
  var pixelRatio: Double = js.native
  /** filters out icons that mapnik says are too big */
  var removeOversizedIcons: js.UndefOr[Boolean] = js.native
}

object GenerateLayoutOptions {
  @scala.inline
  def apply(format: Boolean, imgs: js.Array[Id], pixelRatio: Double): GenerateLayoutOptions = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], imgs = imgs.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateLayoutOptions]
  }
  @scala.inline
  implicit class GenerateLayoutOptionsOps[Self <: GenerateLayoutOptions] (val x: Self) extends AnyVal {
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
    def setFormat(value: Boolean): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setImgsVarargs(value: Id*): Self = this.set("imgs", js.Array(value :_*))
    @scala.inline
    def setImgs(value: js.Array[Id]): Self = this.set("imgs", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxIconSize(value: Double): Self = this.set("maxIconSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxIconSize: Self = this.set("maxIconSize", js.undefined)
    @scala.inline
    def setRemoveOversizedIcons(value: Boolean): Self = this.set("removeOversizedIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveOversizedIcons: Self = this.set("removeOversizedIcons", js.undefined)
  }
  
}

