package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectOffset extends StObject {
  
  var `x-offset`: js.UndefOr[Double] = js.undefined
  
  var `y-offset`: js.UndefOr[Double] = js.undefined
  
  var `z-offset`: js.UndefOr[Double] = js.undefined
}
object ObjectOffset {
  
  inline def apply(): ObjectOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectOffset]
  }
  
  extension [Self <: ObjectOffset](x: Self) {
    
    inline def `setX-offset`(value: Double): Self = StObject.set(x, "x-offset", value.asInstanceOf[js.Any])
    
    inline def `setX-offsetUndefined`: Self = StObject.set(x, "x-offset", js.undefined)
    
    inline def `setY-offset`(value: Double): Self = StObject.set(x, "y-offset", value.asInstanceOf[js.Any])
    
    inline def `setY-offsetUndefined`: Self = StObject.set(x, "y-offset", js.undefined)
    
    inline def `setZ-offset`(value: Double): Self = StObject.set(x, "z-offset", value.asInstanceOf[js.Any])
    
    inline def `setZ-offsetUndefined`: Self = StObject.set(x, "z-offset", js.undefined)
  }
}
