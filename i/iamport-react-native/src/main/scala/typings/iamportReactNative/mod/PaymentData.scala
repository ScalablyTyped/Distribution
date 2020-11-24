package typings.iamportReactNative.mod

import typings.iamportReactNative.anon.Cardquota
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentData extends js.Object {
  
  var amount: Double = js.native
  
  var app_scheme: String = js.native
  
  var biz_num: js.UndefOr[String] = js.native
  
  var buyer_addr: js.UndefOr[String] = js.native
  
  var buyer_email: js.UndefOr[String] = js.native
  
  var buyer_name: js.UndefOr[String] = js.native
  
  var buyer_postcode: js.UndefOr[String] = js.native
  
  var buyer_tel: String = js.native
  
  var currency: js.UndefOr[IMP_CURRENCY] = js.native
  
  var custom_data: js.UndefOr[js.Object] = js.native
  
  var digital: js.UndefOr[Boolean] = js.native
  
  var display: js.UndefOr[Cardquota] = js.native
  
  var escrow: js.UndefOr[Boolean] = js.native
  
  var m_redirect_url: js.UndefOr[String] = js.native
  
  var merchant_uid: String = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var notice_url: js.UndefOr[String | js.Array[String]] = js.native
  
  var pay_method: js.UndefOr[IMP_PAY_METHOD] = js.native
  
  var pg: js.UndefOr[IMP_PG] = js.native
  
  var popup: js.UndefOr[Boolean] = js.native
  
  var tax_free: js.UndefOr[Double] = js.native
  
  var vbank_due: js.UndefOr[String] = js.native
}
object PaymentData {
  
  @scala.inline
  def apply(amount: Double, app_scheme: String, buyer_tel: String, merchant_uid: String): PaymentData = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], app_scheme = app_scheme.asInstanceOf[js.Any], buyer_tel = buyer_tel.asInstanceOf[js.Any], merchant_uid = merchant_uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentData]
  }
  
  @scala.inline
  implicit class PaymentDataOps[Self <: PaymentData] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp_scheme(value: String): Self = this.set("app_scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyer_tel(value: String): Self = this.set("buyer_tel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchant_uid(value: String): Self = this.set("merchant_uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiz_num(value: String): Self = this.set("biz_num", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBiz_num: Self = this.set("biz_num", js.undefined)
    
    @scala.inline
    def setBuyer_addr(value: String): Self = this.set("buyer_addr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuyer_addr: Self = this.set("buyer_addr", js.undefined)
    
    @scala.inline
    def setBuyer_email(value: String): Self = this.set("buyer_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuyer_email: Self = this.set("buyer_email", js.undefined)
    
    @scala.inline
    def setBuyer_name(value: String): Self = this.set("buyer_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuyer_name: Self = this.set("buyer_name", js.undefined)
    
    @scala.inline
    def setBuyer_postcode(value: String): Self = this.set("buyer_postcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuyer_postcode: Self = this.set("buyer_postcode", js.undefined)
    
    @scala.inline
    def setCurrency(value: IMP_CURRENCY): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setCustom_data(value: js.Object): Self = this.set("custom_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_data: Self = this.set("custom_data", js.undefined)
    
    @scala.inline
    def setDigital(value: Boolean): Self = this.set("digital", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigital: Self = this.set("digital", js.undefined)
    
    @scala.inline
    def setDisplay(value: Cardquota): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setEscrow(value: Boolean): Self = this.set("escrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscrow: Self = this.set("escrow", js.undefined)
    
    @scala.inline
    def setM_redirect_url(value: String): Self = this.set("m_redirect_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteM_redirect_url: Self = this.set("m_redirect_url", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotice_urlVarargs(value: String*): Self = this.set("notice_url", js.Array(value :_*))
    
    @scala.inline
    def setNotice_url(value: String | js.Array[String]): Self = this.set("notice_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotice_url: Self = this.set("notice_url", js.undefined)
    
    @scala.inline
    def setPay_method(value: IMP_PAY_METHOD): Self = this.set("pay_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePay_method: Self = this.set("pay_method", js.undefined)
    
    @scala.inline
    def setPg(value: IMP_PG): Self = this.set("pg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePg: Self = this.set("pg", js.undefined)
    
    @scala.inline
    def setPopup(value: Boolean): Self = this.set("popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopup: Self = this.set("popup", js.undefined)
    
    @scala.inline
    def setTax_free(value: Double): Self = this.set("tax_free", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTax_free: Self = this.set("tax_free", js.undefined)
    
    @scala.inline
    def setVbank_due(value: String): Self = this.set("vbank_due", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVbank_due: Self = this.set("vbank_due", js.undefined)
  }
}
