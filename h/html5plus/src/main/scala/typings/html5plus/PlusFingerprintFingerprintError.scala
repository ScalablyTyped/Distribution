package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，指纹识别错误信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
  */
@js.native
trait PlusFingerprintFingerprintError extends js.Object {
  
  /**
    * 指纹识别不匹配
    * 用户指纹识别认证不通过时返回此错误，错误代码常量值为4。
    *     用户每次尝试指纹识别认证未通过都会触发此错误，此时还可以继续识别认证。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var AUTHENTICATE_MISMATCH: js.UndefOr[Double] = js.native
  
  /**
    * 指纹识别次数超过限制
    * 用户多次指纹识别认证不通过时返回此错误，错误代码常量值为5。
    *     通常出现此错误后系统会锁定一段时间禁止使用指纹识别，如果再次调用指纹识别认证会立即返回此错误，因此出现此错误时应该提示用户使用其它方式进行认证。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var AUTHENTICATE_OVERLIMIT: js.UndefOr[Double] = js.native
  
  /**
    * 取消指纹识别
    * 用户取消指纹识别认证时返回此错误，错误代码常量值为6。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var CANCEL: js.UndefOr[Double] = js.native
  
  /**
    * 未录入指纹识别
    * 当前设备未录入指纹导致无法使用指纹识别功能时返回此错误，错误代码常量值为3。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var FINGERPRINT_UNENROLLED: js.UndefOr[Double] = js.native
  
  /**
    * 设备未设置密码锁屏
    * 当前设备为设置密码锁屏导致无法使用指纹识别功能时返回此错误，错误代码常量值为2。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var KEYGUARD_INSECURE: js.UndefOr[Double] = js.native
  
  /**
    * 未知错误
    * 其它未知错误，错误代码常量值为7。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var UNKNOWN_ERROR: js.UndefOr[Double] = js.native
  
  /**
    * 不支持指纹识别
    * 当前设备不支持指纹识别功能时返回此错误，错误代码常量值为1。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var UNSUPPORT: js.UndefOr[Double] = js.native
  
  /**
    * 错误代码
    * 取值范围为FingerprintError对象的错误常量值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var code: js.UndefOr[Double] = js.native
  
  /**
    * 错误描述信息
    * 详细错误描述信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var message: js.UndefOr[String] = js.native
}
object PlusFingerprintFingerprintError {
  
  @scala.inline
  def apply(): PlusFingerprintFingerprintError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusFingerprintFingerprintError]
  }
  
  @scala.inline
  implicit class PlusFingerprintFingerprintErrorOps[Self <: PlusFingerprintFingerprintError] (val x: Self) extends AnyVal {
    
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
    def setAUTHENTICATE_MISMATCH(value: Double): Self = this.set("AUTHENTICATE_MISMATCH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAUTHENTICATE_MISMATCH: Self = this.set("AUTHENTICATE_MISMATCH", js.undefined)
    
    @scala.inline
    def setAUTHENTICATE_OVERLIMIT(value: Double): Self = this.set("AUTHENTICATE_OVERLIMIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAUTHENTICATE_OVERLIMIT: Self = this.set("AUTHENTICATE_OVERLIMIT", js.undefined)
    
    @scala.inline
    def setCANCEL(value: Double): Self = this.set("CANCEL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCANCEL: Self = this.set("CANCEL", js.undefined)
    
    @scala.inline
    def setFINGERPRINT_UNENROLLED(value: Double): Self = this.set("FINGERPRINT_UNENROLLED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFINGERPRINT_UNENROLLED: Self = this.set("FINGERPRINT_UNENROLLED", js.undefined)
    
    @scala.inline
    def setKEYGUARD_INSECURE(value: Double): Self = this.set("KEYGUARD_INSECURE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKEYGUARD_INSECURE: Self = this.set("KEYGUARD_INSECURE", js.undefined)
    
    @scala.inline
    def setUNKNOWN_ERROR(value: Double): Self = this.set("UNKNOWN_ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUNKNOWN_ERROR: Self = this.set("UNKNOWN_ERROR", js.undefined)
    
    @scala.inline
    def setUNSUPPORT(value: Double): Self = this.set("UNSUPPORT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUNSUPPORT: Self = this.set("UNSUPPORT", js.undefined)
    
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
