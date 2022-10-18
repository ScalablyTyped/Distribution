package typings.maplibreGl.anon

import typings.glMatrix.mod.mat4
import typings.maplibreGl.mod.OverscaledTileID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coord extends StObject {
  
  var coord: OverscaledTileID
  
  var matrix: mat4
}
object Coord {
  
  inline def apply(coord: OverscaledTileID, matrix: mat4): Coord = {
    val __obj = js.Dynamic.literal(coord = coord.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coord]
  }
  
  extension [Self <: Coord](x: Self) {
    
    inline def setCoord(value: OverscaledTileID): Self = StObject.set(x, "coord", value.asInstanceOf[js.Any])
    
    inline def setMatrix(value: mat4): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
  }
}
