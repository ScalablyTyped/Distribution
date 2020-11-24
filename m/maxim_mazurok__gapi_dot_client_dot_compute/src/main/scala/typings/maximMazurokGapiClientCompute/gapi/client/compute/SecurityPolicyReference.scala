package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityPolicyReference extends js.Object {
  
  var securityPolicy: js.UndefOr[String] = js.native
}
object SecurityPolicyReference {
  
  @scala.inline
  def apply(): SecurityPolicyReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityPolicyReference]
  }
  
  @scala.inline
  implicit class SecurityPolicyReferenceOps[Self <: SecurityPolicyReference] (val x: Self) extends AnyVal {
    
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
    def setSecurityPolicy(value: String): Self = this.set("securityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityPolicy: Self = this.set("securityPolicy", js.undefined)
  }
}
