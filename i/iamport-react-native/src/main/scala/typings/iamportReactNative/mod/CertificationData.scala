package typings.iamportReactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificationData extends js.Object {
  
  var app_scheme: js.UndefOr[String] = js.native
  
  var carrier: js.UndefOr[IMP_CARRIERS] = js.native
  
  var company: js.UndefOr[String] = js.native
  
  var merchant_uid: js.UndefOr[String] = js.native
  
  var min_age: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var phone: js.UndefOr[String] = js.native
}
object CertificationData {
  
  @scala.inline
  def apply(): CertificationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificationData]
  }
  
  @scala.inline
  implicit class CertificationDataOps[Self <: CertificationData] (val x: Self) extends AnyVal {
    
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
    def setApp_scheme(value: String): Self = this.set("app_scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApp_scheme: Self = this.set("app_scheme", js.undefined)
    
    @scala.inline
    def setCarrier(value: IMP_CARRIERS): Self = this.set("carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrier: Self = this.set("carrier", js.undefined)
    
    @scala.inline
    def setCompany(value: String): Self = this.set("company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompany: Self = this.set("company", js.undefined)
    
    @scala.inline
    def setMerchant_uid(value: String): Self = this.set("merchant_uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchant_uid: Self = this.set("merchant_uid", js.undefined)
    
    @scala.inline
    def setMin_age(value: String): Self = this.set("min_age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_age: Self = this.set("min_age", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
  }
}
