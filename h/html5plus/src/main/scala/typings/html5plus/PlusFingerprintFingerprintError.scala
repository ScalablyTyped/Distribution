package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，指纹识别错误信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
  */
trait PlusFingerprintFingerprintError extends StObject {
  
  /**
    * 指纹识别不匹配
    * 用户指纹识别认证不通过时返回此错误，错误代码常量值为4。
    *     用户每次尝试指纹识别认证未通过都会触发此错误，此时还可以继续识别认证。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var AUTHENTICATE_MISMATCH: js.UndefOr[Double] = js.undefined
  
  /**
    * 指纹识别次数超过限制
    * 用户多次指纹识别认证不通过时返回此错误，错误代码常量值为5。
    *     通常出现此错误后系统会锁定一段时间禁止使用指纹识别，如果再次调用指纹识别认证会立即返回此错误，因此出现此错误时应该提示用户使用其它方式进行认证。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var AUTHENTICATE_OVERLIMIT: js.UndefOr[Double] = js.undefined
  
  /**
    * 取消指纹识别
    * 用户取消指纹识别认证时返回此错误，错误代码常量值为6。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var CANCEL: js.UndefOr[Double] = js.undefined
  
  /**
    * 未录入指纹识别
    * 当前设备未录入指纹导致无法使用指纹识别功能时返回此错误，错误代码常量值为3。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var FINGERPRINT_UNENROLLED: js.UndefOr[Double] = js.undefined
  
  /**
    * 设备未设置密码锁屏
    * 当前设备为设置密码锁屏导致无法使用指纹识别功能时返回此错误，错误代码常量值为2。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var KEYGUARD_INSECURE: js.UndefOr[Double] = js.undefined
  
  /**
    * 未知错误
    * 其它未知错误，错误代码常量值为7。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var UNKNOWN_ERROR: js.UndefOr[Double] = js.undefined
  
  /**
    * 不支持指纹识别
    * 当前设备不支持指纹识别功能时返回此错误，错误代码常量值为1。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var UNSUPPORT: js.UndefOr[Double] = js.undefined
  
  /**
    * 错误代码
    * 取值范围为FingerprintError对象的错误常量值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var code: js.UndefOr[Double] = js.undefined
  
  /**
    * 错误描述信息
    * 详细错误描述信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var message: js.UndefOr[String] = js.undefined
}
object PlusFingerprintFingerprintError {
  
  inline def apply(): PlusFingerprintFingerprintError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusFingerprintFingerprintError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusFingerprintFingerprintError] (val x: Self) extends AnyVal {
    
    inline def setAUTHENTICATE_MISMATCH(value: Double): Self = StObject.set(x, "AUTHENTICATE_MISMATCH", value.asInstanceOf[js.Any])
    
    inline def setAUTHENTICATE_MISMATCHUndefined: Self = StObject.set(x, "AUTHENTICATE_MISMATCH", js.undefined)
    
    inline def setAUTHENTICATE_OVERLIMIT(value: Double): Self = StObject.set(x, "AUTHENTICATE_OVERLIMIT", value.asInstanceOf[js.Any])
    
    inline def setAUTHENTICATE_OVERLIMITUndefined: Self = StObject.set(x, "AUTHENTICATE_OVERLIMIT", js.undefined)
    
    inline def setCANCEL(value: Double): Self = StObject.set(x, "CANCEL", value.asInstanceOf[js.Any])
    
    inline def setCANCELUndefined: Self = StObject.set(x, "CANCEL", js.undefined)
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setFINGERPRINT_UNENROLLED(value: Double): Self = StObject.set(x, "FINGERPRINT_UNENROLLED", value.asInstanceOf[js.Any])
    
    inline def setFINGERPRINT_UNENROLLEDUndefined: Self = StObject.set(x, "FINGERPRINT_UNENROLLED", js.undefined)
    
    inline def setKEYGUARD_INSECURE(value: Double): Self = StObject.set(x, "KEYGUARD_INSECURE", value.asInstanceOf[js.Any])
    
    inline def setKEYGUARD_INSECUREUndefined: Self = StObject.set(x, "KEYGUARD_INSECURE", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setUNKNOWN_ERROR(value: Double): Self = StObject.set(x, "UNKNOWN_ERROR", value.asInstanceOf[js.Any])
    
    inline def setUNKNOWN_ERRORUndefined: Self = StObject.set(x, "UNKNOWN_ERROR", js.undefined)
    
    inline def setUNSUPPORT(value: Double): Self = StObject.set(x, "UNSUPPORT", value.asInstanceOf[js.Any])
    
    inline def setUNSUPPORTUndefined: Self = StObject.set(x, "UNSUPPORT", js.undefined)
  }
}
