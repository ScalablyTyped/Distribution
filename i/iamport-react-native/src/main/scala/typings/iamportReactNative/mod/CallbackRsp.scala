package typings.iamportReactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallbackRsp extends js.Object {
  
  var apply_num: js.UndefOr[String] = js.native
  
  var buyer_addr: js.UndefOr[String] = js.native
  
  var buyer_email: js.UndefOr[String] = js.native
  
  var buyer_name: js.UndefOr[String] = js.native
  
  var buyer_postcode: js.UndefOr[String] = js.native
  
  var buyer_tel: js.UndefOr[String] = js.native
  
  var custom_data: js.UndefOr[js.Object] = js.native
  
  var error_code: js.UndefOr[String] = js.native
  
  var error_msg: js.UndefOr[String] = js.native
  
  var imp_success: js.UndefOr[String] = js.native
  
  var imp_uid: js.UndefOr[String] = js.native
  
  var merchant_uid: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var paid_amount: js.UndefOr[String] = js.native
  
  var paid_at: js.UndefOr[Double] = js.native
  
  var pay_method: js.UndefOr[String] = js.native
  
  var pg_provider: js.UndefOr[String] = js.native
  
  var pg_tid: js.UndefOr[String] = js.native
  
  var receipt_url: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var success: js.UndefOr[Boolean] = js.native
  
  var vbank_date: js.UndefOr[Double] = js.native
  
  var vbank_holder: js.UndefOr[String] = js.native
  
  var vbank_name: js.UndefOr[String] = js.native
  
  var vbank_num: js.UndefOr[String] = js.native
}
object CallbackRsp {
  
  @scala.inline
  def apply(): CallbackRsp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackRsp]
  }
  
  @scala.inline
  implicit class CallbackRspOps[Self <: CallbackRsp] (val x: Self) extends AnyVal {
    
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
    def setApply_num(value: String): Self = this.set("apply_num", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApply_num: Self = this.set("apply_num", js.undefined)
    
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
    def setBuyer_tel(value: String): Self = this.set("buyer_tel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuyer_tel: Self = this.set("buyer_tel", js.undefined)
    
    @scala.inline
    def setCustom_data(value: js.Object): Self = this.set("custom_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_data: Self = this.set("custom_data", js.undefined)
    
    @scala.inline
    def setError_code(value: String): Self = this.set("error_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError_code: Self = this.set("error_code", js.undefined)
    
    @scala.inline
    def setError_msg(value: String): Self = this.set("error_msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError_msg: Self = this.set("error_msg", js.undefined)
    
    @scala.inline
    def setImp_success(value: String): Self = this.set("imp_success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImp_success: Self = this.set("imp_success", js.undefined)
    
    @scala.inline
    def setImp_uid(value: String): Self = this.set("imp_uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImp_uid: Self = this.set("imp_uid", js.undefined)
    
    @scala.inline
    def setMerchant_uid(value: String): Self = this.set("merchant_uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchant_uid: Self = this.set("merchant_uid", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPaid_amount(value: String): Self = this.set("paid_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaid_amount: Self = this.set("paid_amount", js.undefined)
    
    @scala.inline
    def setPaid_at(value: Double): Self = this.set("paid_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaid_at: Self = this.set("paid_at", js.undefined)
    
    @scala.inline
    def setPay_method(value: String): Self = this.set("pay_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePay_method: Self = this.set("pay_method", js.undefined)
    
    @scala.inline
    def setPg_provider(value: String): Self = this.set("pg_provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePg_provider: Self = this.set("pg_provider", js.undefined)
    
    @scala.inline
    def setPg_tid(value: String): Self = this.set("pg_tid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePg_tid: Self = this.set("pg_tid", js.undefined)
    
    @scala.inline
    def setReceipt_url(value: String): Self = this.set("receipt_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceipt_url: Self = this.set("receipt_url", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setVbank_date(value: Double): Self = this.set("vbank_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVbank_date: Self = this.set("vbank_date", js.undefined)
    
    @scala.inline
    def setVbank_holder(value: String): Self = this.set("vbank_holder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVbank_holder: Self = this.set("vbank_holder", js.undefined)
    
    @scala.inline
    def setVbank_name(value: String): Self = this.set("vbank_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVbank_name: Self = this.set("vbank_name", js.undefined)
    
    @scala.inline
    def setVbank_num(value: String): Self = this.set("vbank_num", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVbank_num: Self = this.set("vbank_num", js.undefined)
  }
}
