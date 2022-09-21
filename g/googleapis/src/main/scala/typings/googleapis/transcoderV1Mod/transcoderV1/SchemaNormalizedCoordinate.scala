package typings.googleapis.transcoderV1Mod.transcoderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNormalizedCoordinate extends StObject {
  
  /**
    * Normalized x coordinate.
    */
  var x: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Normalized y coordinate.
    */
  var y: js.UndefOr[Double | Null] = js.undefined
}
object SchemaNormalizedCoordinate {
  
  inline def apply(): SchemaNormalizedCoordinate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNormalizedCoordinate]
  }
  
  extension [Self <: SchemaNormalizedCoordinate](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXNull: Self = StObject.set(x, "x", null)
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYNull: Self = StObject.set(x, "y", null)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
