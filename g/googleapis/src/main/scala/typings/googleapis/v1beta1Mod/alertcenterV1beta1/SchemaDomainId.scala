package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Domain ID of Gmail phishing alerts.
  */
@js.native
trait SchemaDomainId extends js.Object {
  
  /**
    * The primary domain for the customer.
    */
  var customerPrimaryDomain: js.UndefOr[String] = js.native
}
object SchemaDomainId {
  
  @scala.inline
  def apply(): SchemaDomainId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainId]
  }
  
  @scala.inline
  implicit class SchemaDomainIdOps[Self <: SchemaDomainId] (val x: Self) extends AnyVal {
    
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
    def setCustomerPrimaryDomain(value: String): Self = this.set("customerPrimaryDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerPrimaryDomain: Self = this.set("customerPrimaryDomain", js.undefined)
  }
}
