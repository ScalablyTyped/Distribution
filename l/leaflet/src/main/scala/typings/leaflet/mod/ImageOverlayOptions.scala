package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageOverlayOptions extends InteractiveLayerOptions {
  var alt: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var crossOrigin: js.UndefOr[CrossOrigin] = js.native
  var errorOverlayUrl: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object ImageOverlayOptions {
  @scala.inline
  def apply(): ImageOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageOverlayOptions]
  }
  @scala.inline
  implicit class ImageOverlayOptionsOps[Self <: ImageOverlayOptions] (val x: Self) extends AnyVal {
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
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCrossOrigin(value: CrossOrigin): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setErrorOverlayUrl(value: String): Self = this.set("errorOverlayUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorOverlayUrl: Self = this.set("errorOverlayUrl", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

