package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccelerometerMMA7361Option
  extends StObject
     with AccelerometerGeneralOption {
  
  var sleepPin: js.UndefOr[Double | String] = js.undefined
}
object AccelerometerMMA7361Option {
  
  inline def apply(): AccelerometerMMA7361Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccelerometerMMA7361Option]
  }
  
  extension [Self <: AccelerometerMMA7361Option](x: Self) {
    
    inline def setSleepPin(value: Double | String): Self = StObject.set(x, "sleepPin", value.asInstanceOf[js.Any])
    
    inline def setSleepPinUndefined: Self = StObject.set(x, "sleepPin", js.undefined)
  }
}
