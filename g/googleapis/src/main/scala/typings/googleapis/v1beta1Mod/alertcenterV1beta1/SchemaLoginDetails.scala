package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The details of the login action.
  */
@js.native
trait SchemaLoginDetails extends js.Object {
  
  /**
    * Optional. The human-readable IP address (for example, `11.22.33.44`) that
    * is associated with the warning event.
    */
  var ipAddress: js.UndefOr[String] = js.native
  
  /**
    * Optional. The successful login time that is associated with the warning
    * event. This will not be present for blocked login attempts.
    */
  var loginTime: js.UndefOr[String] = js.native
}
object SchemaLoginDetails {
  
  @scala.inline
  def apply(): SchemaLoginDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoginDetails]
  }
  
  @scala.inline
  implicit class SchemaLoginDetailsOps[Self <: SchemaLoginDetails] (val x: Self) extends AnyVal {
    
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
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    
    @scala.inline
    def setLoginTime(value: String): Self = this.set("loginTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginTime: Self = this.set("loginTime", js.undefined)
  }
}
