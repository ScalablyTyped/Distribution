package typings.johnnyFive.mod

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
  implicit class AccelerometerMMA7361OptionOps[Self <: AccelerometerMMA7361Option] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSleepPin(value: Double | String): Self = this.set("sleepPin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSleepPin: Self = this.set("sleepPin", js.undefined)
  }
}
