package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * View控件绘制元素参数
  * 指定绘制图片、矩形区域、文本内容等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
trait PlusNativeObjViewDrawTagStyles extends js.Object {
  /**
    * 矩形区域颜色
    * 不推荐使用（推荐使用rectStyles），可取值：
    * 	"#RRGGBB"格式字符串，如红色为"#FF0000"。
    * 	"rgba(R,G,B,A)"，其中R/G/B分别代表红色值/绿色值/蓝色值，正整数类型，取值范围为0-255，A为透明度，浮点数类型，取值范围为0-1（0为全透明，1为不透明），如"rgba(255,0,0,0.5)"，表示红色半透明。
    * 	当tag属性值为"rect"时有效，用于指定矩形区域颜色，默认值为"#FFFFFF"（白色）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 绘制操作标识
    * 可通过view对象的drawBitmap/drawRect/drawText/clearRect方法进行更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 绘制输入框的样式
    * 当tag属性值为"input"时有效，用于指定绘制输入框的样式、大小位置等信息。，
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var inputStyles: js.UndefOr[PlusNativeObjInputStyles] = js.undefined
  /**
    * 绘制内容区域
    * 当tag属性值为"img"时，用于指定绘制图片的目标区域；
    * 	当tag属性值为"rect"时，用于指定绘制的矩形区域；
    * 	当tag属性值为"font"时，用于指定绘制文本的目标区域，此时height属性值支持设置为"wrap_content"，表示文本高度根据内容自动计算，此时通过top来定位文本绘制的起始位置。
    * 	相对于View控件的区域信息，默认值为{top:'0px',left:'0px',width:'100%',height:'100%'}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var position: js.UndefOr[PlusNativeObjPosition] = js.undefined
  /**
    * 绘制区域的样式
    * 当tag属性值为"rect"时有效，用于指定绘制区域的样式、填充颜色、圆角大小等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var rectStyles: js.UndefOr[PlusNativeObjRectStyles] = js.undefined
  /**
    * 绘制富文本的样式
    * 当tag属性值为"richtext"时有效，用于指定绘制富文本内容的默认字体颜色、字体类型等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var richTextStyles: js.UndefOr[PlusNativeObjRichTextStyles] = js.undefined
  /**
    * 图片源的绘制区域
    * 当tag属性值为"img"时有效，用于指定图片源的绘制区域，相对于图片的区域信息，默认值为{top:'0px',left:'0px',width:'100%',height:'100%'}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var sprite: js.UndefOr[PlusNativeObjPosition] = js.undefined
  /**
    * 绘制的图片资源
    * 当tag属性值为"img"时有效，可以是图片资源路径（字符串类型）或者图片对象（plus.nativeObj.Bitmap对象）。
    * 	src路径支持gif图片，但设置的图片路径文件使用".gif"后缀时则认为是gif图片，如"_www/loading.gif"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var src: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 绘制操作类型
    * 可取值：
    * 	"img" - 绘制图片，与drawBitmap操作一致，此时id、src、position、sprite属性值有效；
    * 	"rect" - 绘制矩形区域，与drawRect操作一致，此时id、color、position、rectStyles属性值有效；
    * 	"font" - 绘制文本内容，与drawText操作一致，此时id、position、text、textStyles属性值有效；
    * 	"richtext" - 绘制富文本内容，与drawRichText操作一致，此时id、position、text、richTextStyles属性值有效；
    * 	"input" - 绘制输入框内容，此时id、position、inputStyles属性值有效。
    * - img: 绘制图片
    * - rect: 绘制矩形区域
    * - font: 绘制文本内容
    * - richtext: 绘制富文本内容
    * - input: 绘制输入框内容
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var tag: js.UndefOr[
    html5plusLib.html5plusLibStrings.img | html5plusLib.html5plusLibStrings.rect | html5plusLib.html5plusLibStrings.font | html5plusLib.html5plusLibStrings.richtext | html5plusLib.html5plusLibStrings.input
  ] = js.undefined
  /**
    * 绘制的文本内容
    * 当tag属性值为"font"时有效，用于保存绘制的文本内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 绘制文本的样式
    * 当tag属性值为"font"时有效，用于指定绘制文本内容的字体大小、字体颜色、字体类型等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var textStyles: js.UndefOr[PlusNativeObjTextStyles] = js.undefined
}

object PlusNativeObjViewDrawTagStyles {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    id: java.lang.String = null,
    inputStyles: PlusNativeObjInputStyles = null,
    position: PlusNativeObjPosition = null,
    rectStyles: PlusNativeObjRectStyles = null,
    richTextStyles: PlusNativeObjRichTextStyles = null,
    sprite: PlusNativeObjPosition = null,
    src: java.lang.String = null,
    tag: html5plusLib.html5plusLibStrings.img | html5plusLib.html5plusLibStrings.rect | html5plusLib.html5plusLibStrings.font | html5plusLib.html5plusLibStrings.richtext | html5plusLib.html5plusLibStrings.input = null,
    text: java.lang.String = null,
    textStyles: PlusNativeObjTextStyles = null
  ): PlusNativeObjViewDrawTagStyles = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputStyles != null) __obj.updateDynamic("inputStyles")(inputStyles)
    if (position != null) __obj.updateDynamic("position")(position)
    if (rectStyles != null) __obj.updateDynamic("rectStyles")(rectStyles)
    if (richTextStyles != null) __obj.updateDynamic("richTextStyles")(richTextStyles)
    if (sprite != null) __obj.updateDynamic("sprite")(sprite)
    if (src != null) __obj.updateDynamic("src")(src)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (textStyles != null) __obj.updateDynamic("textStyles")(textStyles)
    __obj.asInstanceOf[PlusNativeObjViewDrawTagStyles]
  }
}

