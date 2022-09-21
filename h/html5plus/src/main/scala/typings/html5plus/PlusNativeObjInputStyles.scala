package typings.html5plus

import typings.html5plus.html5plusStrings.email
import typings.html5plus.html5plusStrings.number
import typings.html5plus.html5plusStrings.search
import typings.html5plus.html5plusStrings.tel
import typings.html5plus.html5plusStrings.text
import typings.html5plus.html5plusStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 输入框样式
  * 用于定义输入框的显示样式，如字体大小，提示内容等信息。
  *     输入文本内容在指定区域水平居左，垂直居中显示。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
trait PlusNativeObjInputStyles extends StObject {
  
  /**
    * 输入框的边框颜色
    * 可取值： "#RRGGBB"格式字符串，如"#FF0000"表示红色边框。默认值为"#000000"（黑色）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var borderColor: js.UndefOr[String] = js.undefined
  
  /**
    * 输入框边框圆角半径
    * 可取值：圆角半径像素值，数字加"px"格式字符串，如"6px"。
    *     默认值为"0px"（边框无圆角）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var borderRadius: js.UndefOr[String] = js.undefined
  
  /**
    * 输入框的边框宽度
    * 可取值：像素值，数字加"px"格式字符串，如"2px"。 默认值为"1px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var borderWidth: js.UndefOr[String] = js.undefined
  
  /**
    * 输入框的字体大小
    * 可取值：字体高度像素值，数字加"px"格式字符串，如"12px"。 
    *     默认值为"16px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var fontSize: js.UndefOr[String] = js.undefined
  
  /**
    * 输入框失去焦点事件
    * 当编辑框失去焦点时触发。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var onBlur: js.UndefOr[js.Function1[/* result */ Any, Unit]] = js.undefined
  
  /**
    * 输入框完成输入事件
    * 弹出软键盘完成输入后，点击软键盘上的“完成”、“前往”按钮时触发。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var onComplete: js.UndefOr[js.Function1[/* result */ Any, Unit]] = js.undefined
  
  /**
    * 输入框获取焦点事件
    * 当编辑框获取焦点时触发。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var onFocus: js.UndefOr[js.Function1[/* result */ Any, Unit]] = js.undefined
  
  /**
    * 输入框的提示文本
    * 当用户未输入内容时显示在编辑框中（灰色文字）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    * 输入框类型
    * 可取值：
    *         "email" - 邮箱地址输入框；
    *         "number" - 数字输入框；
    *         "search" - 搜索文本输入框；
    *         "tel" - 电话号码输入框；
    *         "text" - 普通文本输入框；
    *         "url" - URL地址输入框。
    *     默认为text（即普通文本输入框）。
    * - email: 邮箱地址输入框
    * - number: 数字输入框
    * - search: 搜索文本输入框
    * - tel: 电话号码输入框
    * - text: 普通文本输入框
    * - url: URL地址输入框
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var `type`: js.UndefOr[email | number | search | tel | text | url] = js.undefined
}
object PlusNativeObjInputStyles {
  
  inline def apply(): PlusNativeObjInputStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeObjInputStyles]
  }
  
  extension [Self <: PlusNativeObjInputStyles](x: Self) {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderRadius(value: String): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderWidth(value: String): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setOnBlur(value: /* result */ Any => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnComplete(value: /* result */ Any => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setOnFocus(value: /* result */ Any => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setType(value: email | number | search | tel | text | url): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
