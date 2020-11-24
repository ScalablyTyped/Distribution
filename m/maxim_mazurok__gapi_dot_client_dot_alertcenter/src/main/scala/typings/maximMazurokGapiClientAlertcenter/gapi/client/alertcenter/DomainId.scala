package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainId extends js.Object {
  
  /** The primary domain for the customer. */
  var customerPrimaryDomain: js.UndefOr[String] = js.native
}
object DomainId {
  
  @scala.inline
  def apply(): DomainId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainId]
  }
  
  @scala.inline
  implicit class DomainIdOps[Self <: DomainId] (val x: Self) extends AnyVal {
    
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
