package typings.heatmapJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatmapOverlayConfiguration[V /* <: String */, TLat /* <: String */, TLong /* <: String */] extends BaseHeatmapConfiguration[V] {
  /**
    * The property name of your latitude coordinate in a datapoint
    * Default value: 'x'
    */
  var latField: js.UndefOr[TLat] = js.native
  /**
    * The property name of your longitude coordinate in a datapoint
    * Default value: 'y'
    */
  var lngField: js.UndefOr[TLong] = js.native
}

object HeatmapOverlayConfiguration {
  @scala.inline
  def apply[/* <: java.lang.String */ V, /* <: java.lang.String */ TLat, /* <: java.lang.String */ TLong](): HeatmapOverlayConfiguration[V, TLat, TLong] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatmapOverlayConfiguration[V, TLat, TLong]]
  }
  @scala.inline
  implicit class HeatmapOverlayConfigurationOps[Self <: HeatmapOverlayConfiguration[_, _, _], /* <: java.lang.String */ V, /* <: java.lang.String */ TLat, /* <: java.lang.String */ TLong] (val x: Self with (HeatmapOverlayConfiguration[V, TLat, TLong])) extends AnyVal {
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
    def setLatField(value: TLat): Self = this.set("latField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatField: Self = this.set("latField", js.undefined)
    @scala.inline
    def setLngField(value: TLong): Self = this.set("lngField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLngField: Self = this.set("lngField", js.undefined)
  }
  
}

