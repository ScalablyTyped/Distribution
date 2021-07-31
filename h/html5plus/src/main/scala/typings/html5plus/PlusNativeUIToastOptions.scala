package typings.html5plus

import typings.html5plus.html5plusStrings.bottom
import typings.html5plus.html5plusStrings.center
import typings.html5plus.html5plusStrings.left
import typings.html5plus.html5plusStrings.long
import typings.html5plus.html5plusStrings.richtext
import typings.html5plus.html5plusStrings.right
import typings.html5plus.html5plusStrings.short
import typings.html5plus.html5plusStrings.text
import typings.html5plus.html5plusStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，系统提示消息框要设置的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
trait PlusNativeUIToastOptions extends StObject {
  
  /**
    * 提示消息框在屏幕中的水平位置
    * 可选值为"left"、"center"、"right"，分别为水平居左、居中、居右，未设置时默认值为"center"。
    * - left: 水平居左对齐
    * - center: 水平居中对齐
    * - right: 水平居左对齐
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var align: js.UndefOr[left | center | right] = js.undefined
  
  /**
    * 提示消息框显示的时间
    * 可选值为"long"、"short"，值为"long"时显示时间约为3.5s，值为"short"时显示时间约为2s，未设置时默认值为"short"。
    * - long: 长显示时间
    * - short: 短显示时间
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var duration: js.UndefOr[long | short] = js.undefined
  
  /**
    * 提示消息框上显示的图标
    * 仅支持本地图片路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * 图标的高度
    * 单位为px（逻辑像素值），默认值为图片的高度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var iconHeight: js.UndefOr[String] = js.undefined
  
  /**
    * 图标的宽度
    * 单位为px（逻辑像素值），默认值为图片的宽度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var iconWidth: js.UndefOr[String] = js.undefined
  
  /**
    * 富文本样式
    * 当type属性值为"richtext"时有效，用于定义富文本的样式，如其文本对齐方式、使用的字体等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var richTextStyle: js.UndefOr[PlusNativeObjRichTextStyles] = js.undefined
  
  /**
    * 提示消息框上显示的样式
    * 可取值：
    *     "block"表示图标与文字分两行显示，上面显示图标，下面显示文字；
    *     "inline"表示图标与文字在同一行显示，左边显示图标，右边显示文字。
    *     默认值为"block"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    * 提示消息框上显示的文本类型
    * 可取值：
    *         "text" - 显示的消息内容为文本字符串；
    *         "richtext" - 显示的消息内容为富文本内容。
    *     默认值为"text"。
    *     当type为"text"时，富文本使用html的部分标签，具体标签如下：
    *     图片标签&lt;img src="图片资源url地址" width="图片显示的宽度" height="图片显示的高度" onclick="console.log('clicked img')"&gt;&lt;/img&gt;；
    *     字体标签&lt;font color="字体颜色"&gt;&lt;/font&gt;，内容在一行显示不下时自动换行，行高默认为字体的1.2倍；
    *     换行标签&lt;br/&gt;；
    *     链接标签&lt;a onclick="console.log('clicked a')"&gt;链接地址&lt;/a&gt;。
    *     如示例“&lt;img onclick="console.log('clicked img')" src="http://img-cdn-qiniu.dcloud.net.cn/icon2.png"/&gt;&lt;a onclick="console.log(clicked a)"&gt;链接地址&lt;/a&gt;”。
    * - text: 文本字符串
    * - richtext: 富文本内容
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var `type`: js.UndefOr[text | richtext] = js.undefined
  
  /**
    * 提示消息在屏幕中的垂直位置
    * 可选值为"top"、"center"、"bottom"，分别为垂直居顶、居中、居底，未设置时默认值为"bottom"。
    * - top: 垂直居顶对齐
    * - center: 垂直居中对齐
    * - bottom: 垂直居底对齐
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var verticalAlign: js.UndefOr[top | center | bottom] = js.undefined
}
object PlusNativeUIToastOptions {
  
  @scala.inline
  def apply(): PlusNativeUIToastOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeUIToastOptions]
  }
  
  @scala.inline
  implicit class PlusNativeUIToastOptionsMutableBuilder[Self <: PlusNativeUIToastOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setDuration(value: long | short): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconHeight(value: String): Self = StObject.set(x, "iconHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconHeightUndefined: Self = StObject.set(x, "iconHeight", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setIconWidth(value: String): Self = StObject.set(x, "iconWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconWidthUndefined: Self = StObject.set(x, "iconWidth", js.undefined)
    
    @scala.inline
    def setRichTextStyle(value: PlusNativeObjRichTextStyles): Self = StObject.set(x, "richTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRichTextStyleUndefined: Self = StObject.set(x, "richTextStyle", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setType(value: text | richtext): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: top | center | bottom): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
  }
}
