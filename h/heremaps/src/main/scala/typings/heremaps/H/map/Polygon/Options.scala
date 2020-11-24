package typings.heremaps.H.map.Polygon

import typings.heremaps.H.map.ArrowStyle
import typings.heremaps.H.map.SpatialStyle
import typings.heremaps.H.map.provider.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @property style {H.map.SpatialStyle | H.map.SpatialStyle.Options} - The style to be used when tracing the spatial object.
  * @property arrows {H.map.ArrowStyle | H.map.ArrowStyle.Options} - The arrows style to be used when rendering the spatial object.
  * @property visibility {boolean}
  * Indicates whether the map object is visible, the default is true A map object is only treated as visible, if it self and all of its nesting parent groups are visible.
  */
@js.native
trait Options extends js.Object {
  
  var arrows: js.UndefOr[ArrowStyle | typings.heremaps.H.map.ArrowStyle.Options] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var elevation: js.UndefOr[Double] = js.native
  
  var extrusion: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var provider: js.UndefOr[Provider | Null] = js.native
  
  var style: js.UndefOr[SpatialStyle | typings.heremaps.H.map.SpatialStyle.Options] = js.native
  
  var visibility: js.UndefOr[Boolean] = js.native
  
  var volatility: js.UndefOr[Boolean] = js.native
  
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
    def setElevation(value: Double): Self = this.set("elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElevation: Self = this.set("elevation", js.undefined)
    
    @scala.inline
    def setExtrusion(value: Double): Self = this.set("extrusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtrusion: Self = this.set("extrusion", js.undefined)
    
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
    def setProviderNull: Self = this.set("provider", null)
    
    @scala.inline
    def setStyle(value: SpatialStyle | typings.heremaps.H.map.SpatialStyle.Options): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setVisibility(value: Boolean): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    
    @scala.inline
    def setVolatility(value: Boolean): Self = this.set("volatility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolatility: Self = this.set("volatility", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
