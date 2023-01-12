package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  duration :number | string,   easing :string,   delay :number | string}> */
trait Partialdurationnumberstri extends StObject {
  
  var delay: js.UndefOr[Double | String] = js.undefined
  
  var duration: js.UndefOr[Double | String] = js.undefined
  
  var easing: js.UndefOr[String] = js.undefined
}
object Partialdurationnumberstri {
  
  inline def apply(): Partialdurationnumberstri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialdurationnumberstri]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Partialdurationnumberstri] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double | String): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double | String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
  }
}
