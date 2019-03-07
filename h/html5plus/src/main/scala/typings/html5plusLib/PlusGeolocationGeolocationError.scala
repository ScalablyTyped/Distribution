package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，定位错误信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
  */
trait PlusGeolocationGeolocationError extends js.Object {
  /**
    * 访问权限被拒绝
    * 系统不允许程序获取定位功能，错误代码常量值为1。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var PERMISSION_DENIED: js.UndefOr[scala.Double] = js.undefined
  /**
    * 位置信息不可用
    * 无法获取有效的位置信息，错误代码常量值为2。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var POSITION_UNAVAILABLE: js.UndefOr[scala.Double] = js.undefined
  /**
    * 获取位置信息超时
    * 无法在指定的时间内获取位置信息，错误代码常量值为3。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var TIMEOUT: js.UndefOr[scala.Double] = js.undefined
  /**
    * 未知错误
    * 其它未知错误导致无法获取位置信息，错误代码常量值为4。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var UNKNOWN_ERROR: js.UndefOr[scala.Double] = js.undefined
  /**
    * 错误代码
    * 取值范围为GeolocationError对象的常量值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var code: js.UndefOr[scala.Double] = js.undefined
  /**
    * 错误描述信息
    * 详细错误描述信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object PlusGeolocationGeolocationError {
  @scala.inline
  def apply(
    PERMISSION_DENIED: scala.Int | scala.Double = null,
    POSITION_UNAVAILABLE: scala.Int | scala.Double = null,
    TIMEOUT: scala.Int | scala.Double = null,
    UNKNOWN_ERROR: scala.Int | scala.Double = null,
    code: scala.Int | scala.Double = null,
    message: java.lang.String = null
  ): PlusGeolocationGeolocationError = {
    val __obj = js.Dynamic.literal()
    if (PERMISSION_DENIED != null) __obj.updateDynamic("PERMISSION_DENIED")(PERMISSION_DENIED.asInstanceOf[js.Any])
    if (POSITION_UNAVAILABLE != null) __obj.updateDynamic("POSITION_UNAVAILABLE")(POSITION_UNAVAILABLE.asInstanceOf[js.Any])
    if (TIMEOUT != null) __obj.updateDynamic("TIMEOUT")(TIMEOUT.asInstanceOf[js.Any])
    if (UNKNOWN_ERROR != null) __obj.updateDynamic("UNKNOWN_ERROR")(UNKNOWN_ERROR.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[PlusGeolocationGeolocationError]
  }
}

