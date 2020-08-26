package typings.mapbox.mod.global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleLayerOptions
  extends typings.leaflet.mod.TileLayerOptions {
  var sanitizer: js.UndefOr[js.Function1[/* template */ String, String]] = js.native
}

object StyleLayerOptions {
  @scala.inline
  def apply(): StyleLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleLayerOptions]
  }
  @scala.inline
  implicit class StyleLayerOptionsOps[Self <: StyleLayerOptions] (val x: Self) extends AnyVal {
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
    def setSanitizer(value: /* template */ String => String): Self = this.set("sanitizer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSanitizer: Self = this.set("sanitizer", js.undefined)
  }
  
}

