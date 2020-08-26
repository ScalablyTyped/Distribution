package typings.html5plus

import typings.html5plus.html5plusStrings.center
import typings.html5plus.html5plusStrings.left
import typings.html5plus.html5plusStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 富文本样式
  * 用于定义富文本使用的默认使用的字体名称、字体文件路径等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
@js.native
trait PlusNativeObjRichTextStyles extends js.Object {
  /**
    * 富文本内容的水平对齐方式
    * 对整体内容有效，无法单独控制每行的内容。
    *     可取值：
    *     "left"-字体在指定的区域中水平居左对齐；
    *     "center"-字体在指定的区域中水平居中对齐；
    *     "right"-字体在指定的区域中水平居右对齐。
    *     默认值为"left"。
    * - left: 富文本内容水平居左对齐
    * - center: 富文本内容水平居中对齐
    * - right: 富文本内容水平居右对齐
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var align: js.UndefOr[left | center | right] = js.native
  /**
    * 富文本默认使用的字体名称
    * 例如"Times New Roman"，    如果指定名称的字体不存在，则使用系统默认字体。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var family: js.UndefOr[String] = js.native
  /**
    * 富文本默认使用的字体文件路径
    * 加载字体文件路径，必须为本地路径，如果指定的文件路径无效，则使用系统默认字体。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var fontSrc: js.UndefOr[String] = js.native
  /**
    * 点击事件回调函数
    * 如果设置此属性，则表示拦截所有RichText上的点击事件（不透传事件）。
    *     如果没有设置此属性，则仅拦截操作包含onclick属性的a/img标签的点击事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var onClick: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.native
}

object PlusNativeObjRichTextStyles {
  @scala.inline
  def apply(): PlusNativeObjRichTextStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeObjRichTextStyles]
  }
  @scala.inline
  implicit class PlusNativeObjRichTextStylesOps[Self <: PlusNativeObjRichTextStyles] (val x: Self) extends AnyVal {
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
    def setAlign(value: left | center | right): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    @scala.inline
    def setFontSrc(value: String): Self = this.set("fontSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSrc: Self = this.set("fontSrc", js.undefined)
    @scala.inline
    def setOnClick(value: /* result */ js.Any => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
  
}

