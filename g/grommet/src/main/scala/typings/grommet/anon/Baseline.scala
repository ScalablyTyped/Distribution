package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Baseline extends StObject {
  
  var baseline: js.UndefOr[Double] = js.undefined
  
  var minSpeed: js.UndefOr[Double] = js.undefined
}
object Baseline {
  
  inline def apply(): Baseline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Baseline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Baseline] (val x: Self) extends AnyVal {
    
    inline def setBaseline(value: Double): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    inline def setMinSpeed(value: Double): Self = StObject.set(x, "minSpeed", value.asInstanceOf[js.Any])
    
    inline def setMinSpeedUndefined: Self = StObject.set(x, "minSpeed", js.undefined)
  }
}
