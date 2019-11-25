package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，指纹识别错误信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
  */
trait PlusFingerprintFingerprintError extends js.Object {
  /**
    * 指纹识别不匹配
    * 用户指纹识别认证不通过时返回此错误，错误代码常量值为4。
    * 	用户每次尝试指纹识别认证未通过都会触发此错误，此时还可以继续识别认证。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var AUTHENTICATE_MISMATCH: js.UndefOr[Double] = js.undefined
  /**
    * 指纹识别次数超过限制
    * 用户多次指纹识别认证不通过时返回此错误，错误代码常量值为5。
    * 	通常出现此错误后系统会锁定一段时间禁止使用指纹识别，如果再次调用指纹识别认证会立即返回此错误，因此出现此错误时应该提示用户使用其它方式进行认证。
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
  @scala.inline
  def apply(
    AUTHENTICATE_MISMATCH: Int | Double = null,
    AUTHENTICATE_OVERLIMIT: Int | Double = null,
    CANCEL: Int | Double = null,
    FINGERPRINT_UNENROLLED: Int | Double = null,
    KEYGUARD_INSECURE: Int | Double = null,
    UNKNOWN_ERROR: Int | Double = null,
    UNSUPPORT: Int | Double = null,
    code: Int | Double = null,
    message: String = null
  ): PlusFingerprintFingerprintError = {
    val __obj = js.Dynamic.literal()
    if (AUTHENTICATE_MISMATCH != null) __obj.updateDynamic("AUTHENTICATE_MISMATCH")(AUTHENTICATE_MISMATCH.asInstanceOf[js.Any])
    if (AUTHENTICATE_OVERLIMIT != null) __obj.updateDynamic("AUTHENTICATE_OVERLIMIT")(AUTHENTICATE_OVERLIMIT.asInstanceOf[js.Any])
    if (CANCEL != null) __obj.updateDynamic("CANCEL")(CANCEL.asInstanceOf[js.Any])
    if (FINGERPRINT_UNENROLLED != null) __obj.updateDynamic("FINGERPRINT_UNENROLLED")(FINGERPRINT_UNENROLLED.asInstanceOf[js.Any])
    if (KEYGUARD_INSECURE != null) __obj.updateDynamic("KEYGUARD_INSECURE")(KEYGUARD_INSECURE.asInstanceOf[js.Any])
    if (UNKNOWN_ERROR != null) __obj.updateDynamic("UNKNOWN_ERROR")(UNKNOWN_ERROR.asInstanceOf[js.Any])
    if (UNSUPPORT != null) __obj.updateDynamic("UNSUPPORT")(UNSUPPORT.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusFingerprintFingerprintError]
  }
}

