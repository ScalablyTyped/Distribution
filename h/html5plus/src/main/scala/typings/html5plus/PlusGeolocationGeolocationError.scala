package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，定位错误信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
  */
@js.native
trait PlusGeolocationGeolocationError extends js.Object {
  /**
    * 访问权限被拒绝
    * 系统不允许程序获取定位功能，错误代码常量值为1。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var PERMISSION_DENIED: js.UndefOr[Double] = js.native
  /**
    * 位置信息不可用
    * 无法获取有效的位置信息，错误代码常量值为2。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var POSITION_UNAVAILABLE: js.UndefOr[Double] = js.native
  /**
    * 获取位置信息超时
    * 无法在指定的时间内获取位置信息，错误代码常量值为3。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var TIMEOUT: js.UndefOr[Double] = js.native
  /**
    * 未知错误
    * 其它未知错误导致无法获取位置信息，错误代码常量值为4。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var UNKNOWN_ERROR: js.UndefOr[Double] = js.native
  /**
    * 错误代码
    * 取值范围为GeolocationError对象的常量值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var code: js.UndefOr[Double] = js.native
  /**
    * 错误描述信息
    * 详细错误描述信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var message: js.UndefOr[String] = js.native
}

object PlusGeolocationGeolocationError {
  @scala.inline
  def apply(): PlusGeolocationGeolocationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusGeolocationGeolocationError]
  }
  @scala.inline
  implicit class PlusGeolocationGeolocationErrorOps[Self <: PlusGeolocationGeolocationError] (val x: Self) extends AnyVal {
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
    def setPERMISSION_DENIED(value: Double): Self = this.set("PERMISSION_DENIED", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePERMISSION_DENIED: Self = this.set("PERMISSION_DENIED", js.undefined)
    @scala.inline
    def setPOSITION_UNAVAILABLE(value: Double): Self = this.set("POSITION_UNAVAILABLE", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePOSITION_UNAVAILABLE: Self = this.set("POSITION_UNAVAILABLE", js.undefined)
    @scala.inline
    def setTIMEOUT(value: Double): Self = this.set("TIMEOUT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTIMEOUT: Self = this.set("TIMEOUT", js.undefined)
    @scala.inline
    def setUNKNOWN_ERROR(value: Double): Self = this.set("UNKNOWN_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUNKNOWN_ERROR: Self = this.set("UNKNOWN_ERROR", js.undefined)
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

