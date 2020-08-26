package typings.heremaps.H.map.Polyline

import typings.heremaps.H.map.ArrowStyle
import typings.heremaps.H.map.SpatialStyle
import typings.heremaps.H.map.provider.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options which are used to initialize a polyline
  * @property style {(H.map.SpatialStyle | H.map.SpatialStyle.Options)=} - the style to be used when tracing the polyline
  * @property arrows {(H.map.ArrowStyle | H.map.ArrowStyle.Options)=} - The arrows style to be used when rendering the polyline.
  * @property visibility {boolean=} - An optional boolean value indicating whether this map object is visible, default is true
  * @property zIndex {number=} - The z-index value of the map object, default is 0
  * @property min {number=} - The minimum zoom level for which the object is visible, default is -Infinity
  * @property max {number=} - The maximum zoom level for which the object is visible, default is Infinity
  * @property provider {(H.map.provider.Provider | null)=} - The provider of this object. This property is only needed if a customized Implementation of ObjectProvider wants to instantiate
  * an object.
  * @property data {*} - Optional arbitrary data to be stored with this map object. This data can be retrieved by calling getData
  */
@js.native
trait Options extends js.Object {
  var arrows: js.UndefOr[ArrowStyle | typings.heremaps.H.map.ArrowStyle.Options] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var provider: js.UndefOr[Provider] = js.native
  var style: js.UndefOr[SpatialStyle | typings.heremaps.H.map.SpatialStyle.Options] = js.native
  var visibility: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
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
    def setArrows(value: ArrowStyle | typings.heremaps.H.map.ArrowStyle.Options): Self = this.set("arrows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrows: Self = this.set("arrows", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setProvider(value: Provider): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    @scala.inline
    def setStyle(value: SpatialStyle | typings.heremaps.H.map.SpatialStyle.Options): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setVisibility(value: Boolean): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

