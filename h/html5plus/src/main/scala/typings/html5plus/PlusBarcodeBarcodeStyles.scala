package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Barcode扫码控件样式
  * 设置Barcode扫码控件的样式，如扫码框、扫码条的颜色等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
  */
@js.native
trait PlusBarcodeBarcodeStyles extends js.Object {
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
  implicit class PlusBarcodeBarcodeStylesOps[Self <: PlusBarcodeBarcodeStyles] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setFrameColor(value: String): Self = this.set("frameColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameColor: Self = this.set("frameColor", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setScanbarColor(value: String): Self = this.set("scanbarColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScanbarColor: Self = this.set("scanbarColor", js.undefined)
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

