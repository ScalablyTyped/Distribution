package typings.ionicCore.hapticMod

import typings.ionicCore.ionicCoreStrings.error
import typings.ionicCore.ionicCoreStrings.success
import typings.ionicCore.ionicCoreStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HapticNotificationOptions extends js.Object {
  
  var style: success | warning | error = js.native
}
object HapticNotificationOptions {
  
  @scala.inline
  def apply(style: success | warning | error): HapticNotificationOptions = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[HapticNotificationOptions]
  }
  
  @scala.inline
  implicit class HapticNotificationOptionsOps[Self <: HapticNotificationOptions] (val x: Self) extends AnyVal {
    
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
    def setStyle(value: success | warning | error): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
