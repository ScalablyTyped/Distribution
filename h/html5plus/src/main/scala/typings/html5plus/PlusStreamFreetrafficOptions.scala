package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，免流量操作参数
  * 包含电话号码、验证码等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
  */
trait PlusStreamFreetrafficOptions extends StObject {
  
  /**
    * 验证码
    * 免流量绑定设备使用的验证码。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * 电话号码
    * 免流量请求验证码、绑定设备使用的电话号码。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var phone: js.UndefOr[String] = js.undefined
}
object PlusStreamFreetrafficOptions {
  
  inline def apply(): PlusStreamFreetrafficOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusStreamFreetrafficOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusStreamFreetrafficOptions] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
  }
}
