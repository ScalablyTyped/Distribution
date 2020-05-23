package typings.html5plus

import typings.html5plus.html5plusStrings.`line-through`
import typings.html5plus.html5plusStrings.bold
import typings.html5plus.html5plusStrings.center
import typings.html5plus.html5plusStrings.clip
import typings.html5plus.html5plusStrings.italic
import typings.html5plus.html5plusStrings.left
import typings.html5plus.html5plusStrings.none
import typings.html5plus.html5plusStrings.normal
import typings.html5plus.html5plusStrings.nowrap
import typings.html5plus.html5plusStrings.right
import typings.html5plus.html5plusStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 绘制文本样式对象
  * 用于定义文本的显示样式，如字体大小、字体颜色、字体粗细、字体样式、字体名称等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
trait PlusNativeObjTextStyles extends js.Object {
  /**
    * 水平对齐方式
    * 可取值：
    *     "left"-字体在指定的区域中水平居左对齐；
    *     "center"-字体在指定的区域中水平居中对齐；
    *     "right"-字体在指定的区域中水平居右对齐。
    *     默认值为"center"。
    * - left: 字体在指定的区域中水平居左对齐
    * - center: 字体在指定的区域中水平居中对齐
    * - right: 字体在指定的区域中水平居右对齐
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var align: js.UndefOr[left | center | right] = js.undefined
  /**
    * 字体颜色
    * 可取值：
    *     "#RRGGBB"格式字符串，如"#FF0000"表示绘制红色区域；
    *     "rgba(R,G,B,A)"，其中R/G/B分别代表红色值/绿色值/蓝色值，正整数类型，取值范围为0-255，A为透明度，浮点数类型，取值范围为0-1（0为全透明，1为不透明），如"rgba(255,0,0,0.5)"，表示红色半透明。
    *     默认值为"#000000"（黑色）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * 文本装饰
    * 可取值：
    *         "none" - 无装饰效果；
    *         "underline" - 文本带下划线效果；
    *         "line-through" - 文本带贯穿线（删除线）效果。
    *     默认值为"none"。
    * - none: 
    *     无装饰效果
    *                                 
    * - underline: 
    *     文本带下划线效果
    *                                 
    * - line-through: 
    *     文本带贯穿线（删除线）效果
    *                                 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var decoration: js.UndefOr[none | underline | `line-through`] = js.undefined
  /**
    * 字体名称
    * 例如"Times New Roman"，    如果指定名称的字体不存在，则使用默认字体。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var family: js.UndefOr[String] = js.undefined
  /**
    * 字体文件路径
    * 加载字体文件路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var fontSrc: js.UndefOr[String] = js.undefined
  /**
    * 文本的行间距
    * 可取值：
    *     像素值，如"100px"；百分比，如"10%"，相对于字体的高度（size属性）；
    *     默认值为"20%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var lineSpacing: js.UndefOr[String] = js.undefined
  /**
    * 字体的边距
    * 用于设置字体在绘制目标区域四个方向（top/right/bottom/left）的边距，可取值：像素值，如"10px"；百分比，相对于绘制目标区域，如"5%"；
    *     默认值为"0px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var margin: js.UndefOr[String] = js.undefined
  /**
    * 文本内容超出显示区域时处理方式
    * 可取值：
    *         "clip" - 超出显示区域时内容裁剪；
    *         "ellipsis" - 超出显示区域时尾部显示省略标记（...）。
    *     默认值为"clip"。
    * - clip: 
    *     
    *                                 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var overflow: js.UndefOr[clip] = js.undefined
  /**
    * 字体大小
    * 可取值：字体高度像素值，数字加"px"格式字符串，如"12px"。
    *     默认值为"16px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var size: js.UndefOr[String] = js.undefined
  /**
    * 字体样式
    * 可取值："normal" - 正常字体样式；"italic" - 斜体样式。默认值为"normal"。
    * - normal: 正常字体样式
    * - italic: 斜体样式
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var style: js.UndefOr[normal | italic] = js.undefined
  /**
    * 垂直对齐方式
    * 文本内容在指定绘制区域中的垂直对齐方式，可取值：
    *         "top" - 垂直居顶对齐；
    *         "middle" - 垂直居中对齐；
    *         "bottom" - 垂直居底对齐。
    *     默认值为"middle"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var verticalAlign: js.UndefOr[String] = js.undefined
  /**
    * 字体粗细
    * 可取值："normal" - 普通字体；"bold" - 粗字体。默认值为"normal"。
    * - normal: 普通字体
    * - bold: 粗字体
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var weight: js.UndefOr[normal | bold] = js.undefined
  /**
    * 文本换行模式
    * 可取值：
    *         "nowrap" - 不换行，将所有文本在一行中绘制，忽略换行符("\n")；
    *         "normal" - 自动换行，当指定的宽度无法绘制所有文本时自动换行绘制，碰到'\n'字符时强制换行。
    *     默认值为"nowrap"。
    * - nowrap: 
    *     不换行，将所有文本在一行中绘制，忽略换行符("\n")
    *                                 
    * - normal: 
    *     自动换行，当指定的宽度无法绘制所有文本时自动换行绘制，碰到'\n'字符时强制换行
    *                                 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var whiteSpace: js.UndefOr[nowrap | normal] = js.undefined
}

object PlusNativeObjTextStyles {
  @scala.inline
  def apply(
    align: left | center | right = null,
    color: String = null,
    decoration: none | underline | `line-through` = null,
    family: String = null,
    fontSrc: String = null,
    lineSpacing: String = null,
    margin: String = null,
    overflow: clip = null,
    size: String = null,
    style: normal | italic = null,
    verticalAlign: String = null,
    weight: normal | bold = null,
    whiteSpace: nowrap | normal = null
  ): PlusNativeObjTextStyles = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (decoration != null) __obj.updateDynamic("decoration")(decoration.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (fontSrc != null) __obj.updateDynamic("fontSrc")(fontSrc.asInstanceOf[js.Any])
    if (lineSpacing != null) __obj.updateDynamic("lineSpacing")(lineSpacing.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    if (whiteSpace != null) __obj.updateDynamic("whiteSpace")(whiteSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusNativeObjTextStyles]
  }
}

