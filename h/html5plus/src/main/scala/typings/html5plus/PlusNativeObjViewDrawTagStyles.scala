package typings.html5plus

import typings.html5plus.html5plusStrings.font
import typings.html5plus.html5plusStrings.img
import typings.html5plus.html5plusStrings.input
import typings.html5plus.html5plusStrings.rect
import typings.html5plus.html5plusStrings.richtext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * View控件绘制元素参数
  * 指定绘制图片、矩形区域、文本内容等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
@js.native
trait PlusNativeObjViewDrawTagStyles extends StObject {
  
  /**
    * 矩形区域颜色
    * 不推荐使用（推荐使用rectStyles），可取值：
    *     "#RRGGBB"格式字符串，如红色为"#FF0000"。
    *     "rgba(R,G,B,A)"，其中R/G/B分别代表红色值/绿色值/蓝色值，正整数类型，取值范围为0-255，A为透明度，浮点数类型，取值范围为0-1（0为全透明，1为不透明），如"rgba(255,0,0,0.5)"，表示红色半透明。
    *     当tag属性值为"rect"时有效，用于指定矩形区域颜色，默认值为"#FFFFFF"（白色）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * 绘制操作标识
    * 可通过view对象的drawBitmap/drawRect/drawText/clearRect方法进行更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * 绘制输入框的样式
    * 当tag属性值为"input"时有效，用于指定绘制输入框的样式、大小位置等信息。，
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var inputStyles: js.UndefOr[PlusNativeObjInputStyles] = js.native
  
  /**
    * 绘制内容区域
    * 当tag属性值为"img"时，用于指定绘制图片的目标区域；
    *     当tag属性值为"rect"时，用于指定绘制的矩形区域；
    *     当tag属性值为"font"时，用于指定绘制文本的目标区域，此时height属性值支持设置为"wrap_content"，表示文本高度根据内容自动计算，此时通过top来定位文本绘制的起始位置。
    *     相对于View控件的区域信息，默认值为{top:'0px',left:'0px',width:'100%',height:'100%'}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var position: js.UndefOr[PlusNativeObjPosition] = js.native
  
  /**
    * 绘制区域的样式
    * 当tag属性值为"rect"时有效，用于指定绘制区域的样式、填充颜色、圆角大小等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var rectStyles: js.UndefOr[PlusNativeObjRectStyles] = js.native
  
  /**
    * 绘制富文本的样式
    * 当tag属性值为"richtext"时有效，用于指定绘制富文本内容的默认字体颜色、字体类型等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var richTextStyles: js.UndefOr[PlusNativeObjRichTextStyles] = js.native
  
  /**
    * 图片源的绘制区域
    * 当tag属性值为"img"时有效，用于指定图片源的绘制区域，相对于图片的区域信息，默认值为{top:'0px',left:'0px',width:'100%',height:'100%'}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var sprite: js.UndefOr[PlusNativeObjPosition] = js.native
  
  /**
    * 绘制的图片资源
    * 当tag属性值为"img"时有效，可以是图片资源路径（字符串类型）或者图片对象（plus.nativeObj.Bitmap对象）。
    *     src路径支持gif图片，但设置的图片路径文件使用".gif"后缀时则认为是gif图片，如"_www/loading.gif"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var src: js.UndefOr[String] = js.native
  
  /**
    * 绘制操作类型
    * 可取值：
    *     "img" - 绘制图片，与drawBitmap操作一致，此时id、src、position、sprite属性值有效；
    *     "rect" - 绘制矩形区域，与drawRect操作一致，此时id、color、position、rectStyles属性值有效；
    *     "font" - 绘制文本内容，与drawText操作一致，此时id、position、text、textStyles属性值有效；
    *     "richtext" - 绘制富文本内容，与drawRichText操作一致，此时id、position、text、richTextStyles属性值有效；
    *     "input" - 绘制输入框内容，此时id、position、inputStyles属性值有效。
    * - img: 绘制图片
    * - rect: 绘制矩形区域
    * - font: 绘制文本内容
    * - richtext: 绘制富文本内容
    * - input: 绘制输入框内容
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var tag: js.UndefOr[img | rect | font | richtext | input] = js.native
  
  /**
    * 绘制的文本内容
    * 当tag属性值为"font"时有效，用于保存绘制的文本内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * 绘制文本的样式
    * 当tag属性值为"font"时有效，用于指定绘制文本内容的字体大小、字体颜色、字体类型等信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var textStyles: js.UndefOr[PlusNativeObjTextStyles] = js.native
}
object PlusNativeObjViewDrawTagStyles {
  
  @scala.inline
  def apply(): PlusNativeObjViewDrawTagStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeObjViewDrawTagStyles]
  }
  
  @scala.inline
  implicit class PlusNativeObjViewDrawTagStylesMutableBuilder[Self <: PlusNativeObjViewDrawTagStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInputStyles(value: PlusNativeObjInputStyles): Self = StObject.set(x, "inputStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStylesUndefined: Self = StObject.set(x, "inputStyles", js.undefined)
    
    @scala.inline
    def setPosition(value: PlusNativeObjPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRectStyles(value: PlusNativeObjRectStyles): Self = StObject.set(x, "rectStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectStylesUndefined: Self = StObject.set(x, "rectStyles", js.undefined)
    
    @scala.inline
    def setRichTextStyles(value: PlusNativeObjRichTextStyles): Self = StObject.set(x, "richTextStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRichTextStylesUndefined: Self = StObject.set(x, "richTextStyles", js.undefined)
    
    @scala.inline
    def setSprite(value: PlusNativeObjPosition): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpriteUndefined: Self = StObject.set(x, "sprite", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setTag(value: img | rect | font | richtext | input): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyles(value: PlusNativeObjTextStyles): Self = StObject.set(x, "textStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStylesUndefined: Self = StObject.set(x, "textStyles", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
