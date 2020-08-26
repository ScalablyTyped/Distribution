package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，View控件的系统状态栏区域样式
  * 仅在应用设置为沉浸式状态栏样式下有效，非沉浸式状态栏样式下忽略此属性。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
@js.native
trait PlusNativeObjViewStatusbarStyles extends js.Object {
  /**
    * 系统状态栏区域背景颜色
    * 颜色值格式为"#RRGGBB"，如"#FF0000"表示为红色背景，默认值为应用manifest.json中plus-&gt;statusbar-&gt;background属性配置的值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var background: js.UndefOr[String] = js.native
}

object PlusNativeObjViewStatusbarStyles {
  @scala.inline
  def apply(): PlusNativeObjViewStatusbarStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeObjViewStatusbarStyles]
  }
  @scala.inline
  implicit class PlusNativeObjViewStatusbarStylesOps[Self <: PlusNativeObjViewStatusbarStyles] (val x: Self) extends AnyVal {
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
  }
  
}

