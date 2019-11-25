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
trait PlusBarcodeBarcodeStyles extends js.Object {
  /**
    * 条码识别控件背景颜色
    * 颜色值支持(参考CSS颜色规范)：颜色名称(参考CSS Color Names)/十六进制值/rgb值，默认值为红色。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var background: js.UndefOr[String] = js.undefined
  /**
    * 扫码框颜色
    * 颜色值支持(参考CSS颜色规范)：颜色名称(参考CSS Color Names)/十六进制值/rgb值/rgba值，默认值为红色。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var frameColor: js.UndefOr[String] = js.undefined
  /**
    * Barcode扫码控件的高度
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于父Webview窗口的高度。
    * 	默认值为"100%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var height: js.UndefOr[String] = js.undefined
  /**
    * Barcode扫码控件左上角的水平偏移量
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于父Webview窗口的宽度；
    * 		自动计算，如"auto"，根据width值自动计算，相对于父Webview窗口水平居中。
    * 	默认值为"0px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var left: js.UndefOr[String] = js.undefined
  /**
    * Barcode扫码控件在Webview窗口的布局模式
    * 可取值：
    * 		"static" - 静态布局模式，如果页面存在滚动条则随窗口内容滚动；
    * 		"absolute" - 绝对布局模式，如果页面存在滚动条不随窗口内容滚动；
    * 	默认值为"static"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * 扫码条颜色
    * 颜色值支持(参考CSS颜色规范)：颜色名称(参考CSS Color Names)/十六进制值/rgb值/rgba值，默认值为红色。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var scanbarColor: js.UndefOr[String] = js.undefined
  /**
    * Barcode扫码控件左上角的垂直偏移量
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于父Webview窗口的高度；
    * 		自动计算，如"auto",根据height值自动计算，相对于父Webview窗口垂直居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var top: js.UndefOr[String] = js.undefined
  /**
    * Barcode扫码控件的宽度
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于父Webview窗口的宽度。
    * 	默认值为"100%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var width: js.UndefOr[String] = js.undefined
}

object PlusBarcodeBarcodeStyles {
  @scala.inline
  def apply(
    background: String = null,
    frameColor: String = null,
    height: String = null,
    left: String = null,
    position: String = null,
    scanbarColor: String = null,
    top: String = null,
    width: String = null
  ): PlusBarcodeBarcodeStyles = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (frameColor != null) __obj.updateDynamic("frameColor")(frameColor.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (scanbarColor != null) __obj.updateDynamic("scanbarColor")(scanbarColor.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusBarcodeBarcodeStyles]
  }
}

