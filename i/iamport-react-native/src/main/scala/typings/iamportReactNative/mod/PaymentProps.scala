package typings.iamportReactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentProps extends js.Object {
  
  def callback(rsp: CallbackRsp): Unit = js.native
  
  var data: PaymentData = js.native
  
  var handleInicisTrans: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  
  var loading: js.UndefOr[js.Object] = js.native
  
  var open3rdPartyApp: js.UndefOr[js.Function1[/* iamportUrl */ js.Any, Unit]] = js.native
  
  var tierCode: js.UndefOr[String] = js.native
  
  var userCode: String = js.native
}
object PaymentProps {
  
  @scala.inline
  def apply(callback: CallbackRsp => Unit, data: PaymentData, userCode: String): PaymentProps = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), data = data.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentProps]
  }
  
  @scala.inline
  implicit class PaymentPropsOps[Self <: PaymentProps] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: CallbackRsp => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setData(value: PaymentData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserCode(value: String): Self = this.set("userCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleInicisTrans(value: /* event */ js.Any => Unit): Self = this.set("handleInicisTrans", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandleInicisTrans: Self = this.set("handleInicisTrans", js.undefined)
    
    @scala.inline
    def setLoading(value: js.Object): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setOpen3rdPartyApp(value: /* iamportUrl */ js.Any => Unit): Self = this.set("open3rdPartyApp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen3rdPartyApp: Self = this.set("open3rdPartyApp", js.undefined)
    
    @scala.inline
    def setTierCode(value: String): Self = this.set("tierCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTierCode: Self = this.set("tierCode", js.undefined)
  }
}
