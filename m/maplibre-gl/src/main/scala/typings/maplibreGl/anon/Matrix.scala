package typings.maplibreGl.anon

import typings.glMatrix.mod.mat4
import typings.maplibreGl.mod.OverscaledTileID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Matrix extends StObject {
  
  var coord: OverscaledTileID
  
  var matrix: mat4
}
object Matrix {
  
  inline def apply(coord: OverscaledTileID, matrix: mat4): Matrix = {
    val __obj = js.Dynamic.literal(coord = coord.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matrix]
  }
  
  extension [Self <: Matrix](x: Self) {
    
    inline def setCoord(value: OverscaledTileID): Self = StObject.set(x, "coord", value.asInstanceOf[js.Any])
    
    inline def setMatrix(value: mat4): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
  }
}
