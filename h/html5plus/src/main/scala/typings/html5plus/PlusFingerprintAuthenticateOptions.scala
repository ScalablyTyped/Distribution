package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，指纹识别认证参数
  * 用于设置指纹识别认证界面显示的提示信息等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/fingerprint.html](http://www.html5plus.org/doc/zh_cn/fingerprint.html)
  */
trait PlusFingerprintAuthenticateOptions extends StObject {
  
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
  def apply(): PlusFingerprintAuthenticateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusFingerprintAuthenticateOptions]
  }
  
  @scala.inline
  implicit class PlusFingerprintAuthenticateOptionsMutableBuilder[Self <: PlusFingerprintAuthenticateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
