package typings.jqueryGridster

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridsterCollisionData extends StObject {
  
  var area: Double
  
  var area_coords: GridsterCoords
  
  var coords: GridsterCoords
  
  var el: HTMLElement
  
  var player_coords: GridsterCoords
  
  var region: String
}
object GridsterCollisionData {
  
  @scala.inline
  def apply(
    area: Double,
    area_coords: GridsterCoords,
    coords: GridsterCoords,
    el: HTMLElement,
    player_coords: GridsterCoords,
    region: String
  ): GridsterCollisionData = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], area_coords = area_coords.asInstanceOf[js.Any], coords = coords.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], player_coords = player_coords.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridsterCollisionData]
  }
  
  @scala.inline
  implicit class GridsterCollisionDataMutableBuilder[Self <: GridsterCollisionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArea(value: Double): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArea_coords(value: GridsterCoords): Self = StObject.set(x, "area_coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoords(value: GridsterCoords): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayer_coords(value: GridsterCoords): Self = StObject.set(x, "player_coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
  }
}
