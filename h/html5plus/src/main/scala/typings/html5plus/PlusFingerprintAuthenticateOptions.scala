package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，指纹识别认证参数
  * 用于设置指纹识别认证界面显示的提示信息等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
  */
trait PlusFingerprintAuthenticateOptions extends js.Object {
  /**
    * 在指纹识别过程中显示在界面上的提示信息
    * 如果指纹识别认证过程中不显示提示框，则不显示此信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
    */
  var message: js.UndefOr[String] = js.undefined
}

object PlusFingerprintAuthenticateOptions {
  @scala.inline
  def apply(message: String = null): PlusFingerprintAuthenticateOptions = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[PlusFingerprintAuthenticateOptions]
  }
}

