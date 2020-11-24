package typings.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Apns extends js.Object {
  
  var apns: CerData = js.native
  
  var gcm: ServerApiKey = js.native
}
object Apns {
  
  @scala.inline
  def apply(apns: CerData, gcm: ServerApiKey): Apns = {
    val __obj = js.Dynamic.literal(apns = apns.asInstanceOf[js.Any], gcm = gcm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apns]
  }
  
  @scala.inline
  implicit class ApnsOps[Self <: Apns] (val x: Self) extends AnyVal {
    
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
    def setApns(value: CerData): Self = this.set("apns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcm(value: ServerApiKey): Self = this.set("gcm", value.asInstanceOf[js.Any])
  }
}
