package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccelerometerMMA7361Option extends AccelerometerGeneralOption {
  
  var sleepPin: js.UndefOr[Double | String] = js.native
}
object AccelerometerMMA7361Option {
  
  @scala.inline
  def apply(): AccelerometerMMA7361Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccelerometerMMA7361Option]
  }
  
  @scala.inline
  implicit class AccelerometerMMA7361OptionMutableBuilder[Self <: AccelerometerMMA7361Option] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSleepPin(value: Double | String): Self = StObject.set(x, "sleepPin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSleepPinUndefined: Self = StObject.set(x, "sleepPin", js.undefined)
  }
}
