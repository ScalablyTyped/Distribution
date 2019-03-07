package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OS模块管理操作系统信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
  */
trait PlusOs extends js.Object {
  /**
    * 系统语言信息
    * 获取当前操作系统设置的系统语言，字符串类型数据。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 系统的名称
    * 获取当前操作系统的名称，字符串类型数据。
    * - iOS: 
    * 	iOS系统。
    * 								
    * - Android: 
    * 	Android系统。
    * 								
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var name: js.UndefOr[html5plusLib.html5plusLibStrings.iOS | html5plusLib.html5plusLibStrings.Android] = js.undefined
  /**
    * 系统的供应商信息
    * 获取当前操作系统的供应商名称，字符串类型数据。
    * - Apple: 
    * 	iOS设备，包括iPhone、iPad、iTouch。
    * 								
    * - Google: 
    * 	Android设备。
    * 								
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var vendor: js.UndefOr[html5plusLib.html5plusLibStrings.Apple | html5plusLib.html5plusLibStrings.Google] = js.undefined
  /**
    * 系统版本信息
    * 获取当前操作系统的版本信息，字符串类型数据。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object PlusOs {
  @scala.inline
  def apply(
    language: java.lang.String = null,
    name: html5plusLib.html5plusLibStrings.iOS | html5plusLib.html5plusLibStrings.Android = null,
    vendor: html5plusLib.html5plusLibStrings.Apple | html5plusLib.html5plusLibStrings.Google = null,
    version: java.lang.String = null
  ): PlusOs = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (vendor != null) __obj.updateDynamic("vendor")(vendor.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PlusOs]
  }
}

