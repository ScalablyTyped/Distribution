package typings.googlemaps.google.maps.visualization

import typings.googlemaps.google.maps.Map
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeatmapLayerOptions extends js.Object {
  
  var data: js.Any = js.native
  
  var dissipating: js.UndefOr[Boolean] = js.native
  
  var gradient: js.UndefOr[js.Array[String]] = js.native
  
  var map: js.UndefOr[Map[Element]] = js.native
  
  var maxIntensity: js.UndefOr[Double] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var radius: js.UndefOr[Double] = js.native
}
object HeatmapLayerOptions {
  
  @scala.inline
  def apply(data: js.Any): HeatmapLayerOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapLayerOptions]
  }
  
  @scala.inline
  implicit class HeatmapLayerOptionsOps[Self <: HeatmapLayerOptions] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDissipating(value: Boolean): Self = this.set("dissipating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDissipating: Self = this.set("dissipating", js.undefined)
    
    @scala.inline
    def setGradientVarargs(value: String*): Self = this.set("gradient", js.Array(value :_*))
    
    @scala.inline
    def setGradient(value: js.Array[String]): Self = this.set("gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradient: Self = this.set("gradient", js.undefined)
    
    @scala.inline
    def setMap(value: Map[Element]): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setMaxIntensity(value: Double): Self = this.set("maxIntensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxIntensity: Self = this.set("maxIntensity", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
  }
}
