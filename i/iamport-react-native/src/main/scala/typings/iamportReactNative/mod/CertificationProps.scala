package typings.iamportReactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificationProps extends js.Object {
  
  def callback(rsp: CallbackRsp): Unit = js.native
  
  var data: CertificationData = js.native
  
  var loading: js.UndefOr[js.Object] = js.native
  
  var tierCode: js.UndefOr[String] = js.native
  
  var userCode: String = js.native
}
object CertificationProps {
  
  @scala.inline
  def apply(callback: CallbackRsp => Unit, data: CertificationData, userCode: String): CertificationProps = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), data = data.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificationProps]
  }
  
  @scala.inline
  implicit class CertificationPropsOps[Self <: CertificationProps] (val x: Self) extends AnyVal {
    
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
    def setData(value: CertificationData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserCode(value: String): Self = this.set("userCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading(value: js.Object): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setTierCode(value: String): Self = this.set("tierCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTierCode: Self = this.set("tierCode", js.undefined)
  }
}
