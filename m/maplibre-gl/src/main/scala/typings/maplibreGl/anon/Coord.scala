package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coord extends StObject {
  
  var coord: X
  
  var crossTileID: Double
}
object Coord {
  
  inline def apply(coord: X, crossTileID: Double): Coord = {
    val __obj = js.Dynamic.literal(coord = coord.asInstanceOf[js.Any], crossTileID = crossTileID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coord]
  }
  
  extension [Self <: Coord](x: Self) {
    
    inline def setCoord(value: X): Self = StObject.set(x, "coord", value.asInstanceOf[js.Any])
    
    inline def setCrossTileID(value: Double): Self = StObject.set(x, "crossTileID", value.asInstanceOf[js.Any])
  }
}
