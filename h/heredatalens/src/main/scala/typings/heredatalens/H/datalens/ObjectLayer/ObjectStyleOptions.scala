package typings.heredatalens.H.datalens.ObjectLayer

import typings.heremaps.H.map.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output from the rowToStyle callback.
  * Defines the styles or the icon that is applied to the map object.
  */
@js.native
trait ObjectStyleOptions extends js.Object {
  /** Style of arrows to render along a polyline */
  var arrows: js.UndefOr[typings.heremaps.H.map.ArrowStyle.Options] = js.native
  /** Marker icon */
  var icon: Icon = js.native
  /** Spatial style */
  var style: js.UndefOr[typings.heremaps.H.map.SpatialStyle.Options] = js.native
  /** The z-index value of the map object, default is 0 */
  var zIndex: js.UndefOr[Double] = js.native
}

object ObjectStyleOptions {
  @scala.inline
  def apply(icon: Icon): ObjectStyleOptions = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectStyleOptions]
  }
  @scala.inline
  implicit class ObjectStyleOptionsOps[Self <: ObjectStyleOptions] (val x: Self) extends AnyVal {
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
    def setIcon(value: Icon): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrows(value: typings.heremaps.H.map.ArrowStyle.Options): Self = this.set("arrows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrows: Self = this.set("arrows", js.undefined)
    @scala.inline
    def setStyle(value: typings.heremaps.H.map.SpatialStyle.Options): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

