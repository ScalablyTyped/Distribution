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
  var align: js.UndefOr[left | center | right] = js.undefined
  /**
    * 富文本默认使用的字体名称
    * 例如"Times New Roman"，    如果指定名称的字体不存在，则使用系统默认字体。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var family: js.UndefOr[String] = js.undefined
  /**
    * 富文本默认使用的字体文件路径
    * 加载字体文件路径，必须为本地路径，如果指定的文件路径无效，则使用系统默认字体。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var fontSrc: js.UndefOr[String] = js.undefined
  /**
    * 点击事件回调函数
    * 如果设置此属性，则表示拦截所有RichText上的点击事件（不透传事件）。
    *     如果没有设置此属性，则仅拦截操作包含onclick属性的a/img标签的点击事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var onClick: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.undefined
}

object PlusNativeObjRichTextStyles {
  @scala.inline
  def apply(
    align: left | center | right = null,
    family: String = null,
    fontSrc: String = null,
    onClick: /* result */ js.Any => Unit = null
  ): PlusNativeObjRichTextStyles = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (fontSrc != null) __obj.updateDynamic("fontSrc")(fontSrc.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[PlusNativeObjRichTextStyles]
  }
}

