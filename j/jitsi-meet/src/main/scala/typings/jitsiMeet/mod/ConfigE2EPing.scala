package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigE2EPing extends StObject {
  
  var analyticsInterval: js.UndefOr[Double] = js.undefined
  
  var pingInterval: js.UndefOr[Double] = js.undefined
}
object ConfigE2EPing {
  
  inline def apply(): ConfigE2EPing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigE2EPing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigE2EPing] (val x: Self) extends AnyVal {
    
    inline def setAnalyticsInterval(value: Double): Self = StObject.set(x, "analyticsInterval", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsIntervalUndefined: Self = StObject.set(x, "analyticsInterval", js.undefined)
    
    inline def setPingInterval(value: Double): Self = StObject.set(x, "pingInterval", value.asInstanceOf[js.Any])
    
    inline def setPingIntervalUndefined: Self = StObject.set(x, "pingInterval", js.undefined)
  }
}
