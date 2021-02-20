package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Barcode扫码控件样式
  * 设置Barcode扫码控件的样式，如扫码框、扫码条的颜色等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
  */
@js.native
trait PlusBarcodeBarcodeStyles extends StObject {
  
  /**
    * 条码识别控件背景颜色
    * 颜色值支持(参考CSS颜色规范)：颜色名称(参考CSS Color Names)/十六进制值/rgb值，默认值为红色。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var background: js.UndefOr[String] = js.native
  
  /**
    * 扫码框颜色
    * 颜色值支持(参考CSS颜色规范)：颜色名称(参考CSS Color Names)/十六进制值/rgb值/rgba值，默认值为红色。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var frameColor: js.UndefOr[String] = js.native
  
  /**
    * Barcode扫码控件的高度
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父Webview窗口的高度。
    *     默认值为"100%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var height: js.UndefOr[String] = js.native
  
  /**
    * Barcode扫码控件左上角的水平偏移量
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父Webview窗口的宽度；
    *         自动计算，如"auto"，根据width值自动计算，相对于父Webview窗口水平居中。
    *     默认值为"0px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var left: js.UndefOr[String] = js.native
  
  /**
    * Barcode扫码控件在Webview窗口的布局模式
    * 可取值：
    *         "static" - 静态布局模式，如果页面存在滚动条则随窗口内容滚动；
    *         "absolute" - 绝对布局模式，如果页面存在滚动条不随窗口内容滚动；
    *     默认值为"static"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var position: js.UndefOr[String] = js.native
  
  /**
    * 扫码条颜色
    * 颜色值支持(参考CSS颜色规范)：颜色名称(参考CSS Color Names)/十六进制值/rgb值/rgba值，默认值为红色。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var scanbarColor: js.UndefOr[String] = js.native
  
  /**
    * Barcode扫码控件左上角的垂直偏移量
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父Webview窗口的高度；
    *         自动计算，如"auto",根据height值自动计算，相对于父Webview窗口垂直居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var top: js.UndefOr[String] = js.native
  
  /**
    * Barcode扫码控件的宽度
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父Webview窗口的宽度。
    *     默认值为"100%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var width: js.UndefOr[String] = js.native
}
object PlusBarcodeBarcodeStyles {
  
  @scala.inline
  def apply(): PlusBarcodeBarcodeStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusBarcodeBarcodeStyles]
  }
  
  @scala.inline
  implicit class PlusBarcodeBarcodeStylesMutableBuilder[Self <: PlusBarcodeBarcodeStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setFrameColor(value: String): Self = StObject.set(x, "frameColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameColorUndefined: Self = StObject.set(x, "frameColor", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setScanbarColor(value: String): Self = StObject.set(x, "scanbarColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanbarColorUndefined: Self = StObject.set(x, "scanbarColor", js.undefined)
    
    @scala.inline
    def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
