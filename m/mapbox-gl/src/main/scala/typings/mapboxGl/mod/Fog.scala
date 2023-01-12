package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fog extends StObject {
  
  var color: js.UndefOr[String | Expression] = js.undefined
  
  var `horizon-blend`: js.UndefOr[Double | Expression] = js.undefined
  
  var range: js.UndefOr[js.Array[Double] | Expression] = js.undefined
}
object Fog {
  
  inline def apply(): Fog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fog] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String | Expression): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def `setHorizon-blend`(value: Double | Expression): Self = StObject.set(x, "horizon-blend", value.asInstanceOf[js.Any])
    
    inline def `setHorizon-blendUndefined`: Self = StObject.set(x, "horizon-blend", js.undefined)
    
    inline def setRange(value: js.Array[Double] | Expression): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value*))
  }
}
