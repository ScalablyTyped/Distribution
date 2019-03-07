package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，View控件的系统状态栏区域样式
  * 仅在应用设置为沉浸式状态栏样式下有效，非沉浸式状态栏样式下忽略此属性。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
trait PlusNativeObjViewStatusbarStyles extends js.Object {
  /**
    * 系统状态栏区域背景颜色
    * 颜色值格式为"#RRGGBB"，如"#FF0000"表示为红色背景，默认值为应用manifest.json中plus-&gt;statusbar-&gt;background属性配置的值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var background: js.UndefOr[java.lang.String] = js.undefined
}

object PlusNativeObjViewStatusbarStyles {
  @scala.inline
  def apply(background: java.lang.String = null): PlusNativeObjViewStatusbarStyles = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    __obj.asInstanceOf[PlusNativeObjViewStatusbarStyles]
  }
}

