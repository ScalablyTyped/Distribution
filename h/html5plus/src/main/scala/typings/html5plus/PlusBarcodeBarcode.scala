package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Barcode扫码控件对象
  * Barcode对象表示条码识别控件对象，在窗口中显示条码识别控件，使用此对象可自定义条码识别界面。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
  */
@js.native
trait PlusBarcodeBarcode extends js.Object {
  
  /**
    * 结束条码识别
    * 结束对摄像头获取图片数据进行条码识别操作，同时关闭摄像头的视频捕获。
    *     结束后可调用start方法重新开始识别。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  def cancel(): Unit = js.native
  
  /**
    * 关闭条码识别控件
    * 释放控件占用系统资源，调用close方法后控件对象将不可使用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  def close(): Unit = js.native
  
  /**
    * 条码识别错误事件
    * 描控件识别过程中发生错误时触发的失败事件，并返回错误信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var onerror: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.native
  
  /**
    * 条码识别成功事件
    * Barcode扫码控件识别到有效的条码数据时触发的成功事件，并返回扫码结果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var onmarked: js.UndefOr[
    js.Function3[/* result0 */ Double, /* result1 */ String, /* result2 */ String, Unit]
  ] = js.native
  
  /**
    * 是否开启闪光灯
    * 设置Barcode扫码控件在扫码时是否开启摄像头的闪光灯，默认值为不开启闪光灯。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  def setFlash(): Unit = js.native
  def setFlash(open: Boolean): Unit = js.native
  
  /**
    * 设置Barcode扫码控件的配置参数
    * 用于动态更新Barcode扫码控件的参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  def setStyles(): Unit = js.native
  def setStyles(styles: PlusBarcodeBarcodeStyles): Unit = js.native
  
  /**
    * 开始条码识别
    * 开始调用系统摄像头获取图片数据进行扫码识别，当识别出条码数据时通过onmarked回调函数返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  def start(): Unit = js.native
  def start(optons: PlusBarcodeBarcodeOptions): Unit = js.native
}
