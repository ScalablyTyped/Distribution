package typings.iitc.mapDataCalcToolsMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapZoomTileParameters extends js.Object {
  
  var hasPortals: Boolean = js.native
  
  var level: Double = js.native
  
  var minLinkLength: Double = js.native
  
  var tilesPerEdge: Double = js.native
  
  var zoom: Double = js.native
}
object MapZoomTileParameters {
  
  @scala.inline
  def apply(hasPortals: Boolean, level: Double, minLinkLength: Double, tilesPerEdge: Double, zoom: Double): MapZoomTileParameters = {
    val __obj = js.Dynamic.literal(hasPortals = hasPortals.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], minLinkLength = minLinkLength.asInstanceOf[js.Any], tilesPerEdge = tilesPerEdge.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapZoomTileParameters]
  }
  
  @scala.inline
  implicit class MapZoomTileParametersOps[Self <: MapZoomTileParameters] (val x: Self) extends AnyVal {
    
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
    def setHasPortals(value: Boolean): Self = this.set("hasPortals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLinkLength(value: Double): Self = this.set("minLinkLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilesPerEdge(value: Double): Self = this.set("tilesPerEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
  }
}
