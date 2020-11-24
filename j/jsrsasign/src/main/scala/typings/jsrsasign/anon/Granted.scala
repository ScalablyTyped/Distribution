package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Granted extends js.Object {
  
  var granted: Double = js.native
  
  var grantedWithMods: Double = js.native
  
  var rejection: Double = js.native
  
  var revocationNotification: Double = js.native
  
  var revocationWarning: Double = js.native
  
  var waiting: Double = js.native
}
object Granted {
  
  @scala.inline
  def apply(
    granted: Double,
    grantedWithMods: Double,
    rejection: Double,
    revocationNotification: Double,
    revocationWarning: Double,
    waiting: Double
  ): Granted = {
    val __obj = js.Dynamic.literal(granted = granted.asInstanceOf[js.Any], grantedWithMods = grantedWithMods.asInstanceOf[js.Any], rejection = rejection.asInstanceOf[js.Any], revocationNotification = revocationNotification.asInstanceOf[js.Any], revocationWarning = revocationWarning.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Granted]
  }
  
  @scala.inline
  implicit class GrantedOps[Self <: Granted] (val x: Self) extends AnyVal {
    
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
    def setGranted(value: Double): Self = this.set("granted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantedWithMods(value: Double): Self = this.set("grantedWithMods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejection(value: Double): Self = this.set("rejection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevocationNotification(value: Double): Self = this.set("revocationNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevocationWarning(value: Double): Self = this.set("revocationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaiting(value: Double): Self = this.set("waiting", value.asInstanceOf[js.Any])
  }
}
