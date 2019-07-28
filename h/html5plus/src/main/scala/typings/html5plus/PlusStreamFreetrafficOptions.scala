package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，免流量操作参数
  * 包含电话号码、验证码等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
  */
trait PlusStreamFreetrafficOptions extends js.Object {
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
  @scala.inline
  def apply(code: String = null, phone: String = null): PlusStreamFreetrafficOptions = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    __obj.asInstanceOf[PlusStreamFreetrafficOptions]
  }
}

