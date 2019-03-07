package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，打开文件参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
  */
trait PlusRuntimeOpenFileOptions extends js.Object {
  /**
    * 优先使用的程序包名
    * 如果指定包名的程序已经安装，则调用其打开文件，若程序不支持打开文件则触发错误回调。
    * 	如果指定包名的程序未安装，则弹出系统支持打开此文件的列表，由用户选择程序打开。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var pname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 弹出系统选择程序界面指示区域
    * JSON对象，格式如{top:10;left:10;width:200;height:200;}，所有值为像素值，左上坐标相对于容器webview的位置。仅在iPad设备平台有效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var popover: js.UndefOr[js.Any] = js.undefined
}

object PlusRuntimeOpenFileOptions {
  @scala.inline
  def apply(pname: java.lang.String = null, popover: js.Any = null): PlusRuntimeOpenFileOptions = {
    val __obj = js.Dynamic.literal()
    if (pname != null) __obj.updateDynamic("pname")(pname)
    if (popover != null) __obj.updateDynamic("popover")(popover)
    __obj.asInstanceOf[PlusRuntimeOpenFileOptions]
  }
}

