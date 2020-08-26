package typings.leafletDraw.mod.DrawOptions

import typings.leaflet.mod.DivIcon_
import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerOptions extends js.Object {
  /**
    * The icon displayed when drawing a marker.
    *
    * @default L.Icon.Default()
    */
  var icon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
  /**
    * Determines if the draw tool remains enabled after drawing a shape.
    *
    * @default false
    */
  var repeatMode: js.UndefOr[Boolean] = js.native
  /**
    * This should be a high number to ensure that you can draw over all other layers on the map.
    *
    * @default 2000
    */
  var zIndexOffset: js.UndefOr[Double] = js.native
}

object MarkerOptions {
  @scala.inline
  def apply(): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerOptions]
  }
  @scala.inline
  implicit class MarkerOptionsOps[Self <: MarkerOptions] (val x: Self) extends AnyVal {
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
    def setIcon(value: Icon_[IconOptions] | DivIcon_): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setRepeatMode(value: Boolean): Self = this.set("repeatMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatMode: Self = this.set("repeatMode", js.undefined)
    @scala.inline
    def setZIndexOffset(value: Double): Self = this.set("zIndexOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndexOffset: Self = this.set("zIndexOffset", js.undefined)
  }
  
}

