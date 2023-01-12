package typings.heremaps.anon

import typings.heremaps.H.service.MapType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Satellite extends StObject {
  
  var normal: MapType
  
  var satellite: MapType
  
  var terrain: MapType
}
object Satellite {
  
  inline def apply(normal: MapType, satellite: MapType, terrain: MapType): Satellite = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any], satellite = satellite.asInstanceOf[js.Any], terrain = terrain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Satellite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Satellite] (val x: Self) extends AnyVal {
    
    inline def setNormal(value: MapType): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setSatellite(value: MapType): Self = StObject.set(x, "satellite", value.asInstanceOf[js.Any])
    
    inline def setTerrain(value: MapType): Self = StObject.set(x, "terrain", value.asInstanceOf[js.Any])
  }
}
