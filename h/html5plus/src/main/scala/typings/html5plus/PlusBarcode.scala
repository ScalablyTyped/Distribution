package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Barcode模块管理条码扫描，支持常见的条码（一维码及二维码）的扫描识别功能。可调用设备的摄像头对条码图片扫描进行数据输入，解码后返回码数据及码类型。通过plus.barcode可获取条码码管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
  */
@js.native
trait PlusBarcode extends StObject {
  
  /**
    * Aztec二维码，数值为3
    * Andrew Longacre发明于1995年，该代码是用于国际出版。最小的Aztec码符号编码13个数字或12个英文字母。最大的Aztec码符号编码3832数字或3067英文字母或1914字节的数据。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var AZTEC: js.UndefOr[Double] = js.native
  
  /**
    * Barcode扫码控件对象
    * Barcode对象表示条码识别控件对象，在窗口中显示条码识别控件，使用此对象可自定义条码识别界面。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var Barcode: js.UndefOr[PlusBarcodeBarcode] = js.native
  
  /**
    * 条码识别控件扫描参数
    * 设置Barcode扫码控件的扫码识别参数，如是否保存扫码功时的截图等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var BarcodeOptions: js.UndefOr[PlusBarcodeBarcodeOptions] = js.native
  
  /**
    * Barcode扫码控件样式
    * 设置Barcode扫码控件的样式，如扫码框、扫码条的颜色等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var BarcodeStyles: js.UndefOr[PlusBarcodeBarcodeStyles] = js.native
  
  /**
    * Codabar条形码，数值为7
    * Codabar码最初是为零售价格标签系统而研制开发的。1975年，National Retail Merchants Association（NRMA）选择了其它符号类型作为标准后，Codabar开始在多个方面用于非零售应用领域，如图书馆、货运和医药业。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var CODABAR: js.UndefOr[Double] = js.native
  
  /**
    * Code128条形码，数值为10
    * CODE128码是1981年引入的一种高密度条码，CODE128 码可表示从 ASCII 0 到ASCII 127 共128个字符，故称128码。CODE128码是广泛应用在企业内部管理、生产流程、物流控制系统方面的条码码制，由于其优良的特性在管理信息系统的设计中被广泛使用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var CODE128: js.UndefOr[Double] = js.native
  
  /**
    * Code39条形码，数值为8
    * Code 39码是Intermec公司于1975年推出的一维条码， 39码是一种可供使用者双向扫瞄的分散式条码，也就是说相临两资料码之间，39码必须包含一个不具任何意义的空白(或细白，其逻辑值为0)，且 39码具有支援文数字的能力，编码规则简单、误码率低、所能表示字符个数多等特点，39码在各个领域有着极为广泛的应用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var CODE39: js.UndefOr[Double] = js.native
  
  /**
    * Code93条形码，数值为9
    * Code 93码的条码符号是由Intermec公司于1982年设计的 提供更高的密度和数据安全增强code39 。它是一个字母，长度可变符号。代码93主要用于由加拿大邮政编码补充提供的资料。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var CODE93: js.UndefOr[Double] = js.native
  
  /**
    * Data Matrix二维码，数值为4
    * Data Matrix原名Data code，由美国国际资料公司(International Data Matrix, 简称IDMatrix)于1989年发明。可编码字元集包括全部的ASCII字元及扩充ASCII字元，容量可包含2235个英文数字资料、1556个8位元资料，3116个数字资料。由于Data Matrix二维条码只需要读取资料的20%即可精确辨读，因此很适合应用在条码容易受损的场所。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var DATAMATRIX: js.UndefOr[Double] = js.native
  
  /**
    * EAN条形码标准版，数值为1
    * 国际物品编码协会在全球推广应用的商品条码，是由13位数字组成。
    *     目前使用最广泛的一维条形码。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var EAN13: js.UndefOr[Double] = js.native
  
  /**
    * ENA条形码简版，数值为2
    * 国际物品编码协会在全球推广应用的商品条码，是由8位数字组成。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var EAN8: js.UndefOr[Double] = js.native
  
  /**
    * ITF条形码，数值为11
    * ITF条码，又称交叉二五条码，由14位数字字符代表组成。主要用于运输包装，是印刷条件较差，不允许印刷EAN-13和UPC-A条码时应选用的一种条码。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var ITF: js.UndefOr[Double] = js.native
  
  /**
    * MaxiCode二维码，数值为12
    * 1996年时，美国自动辨识协会（AIMUSA）制定统一的符号规格，称为Maxicode二维条码，也有人称USS-Maxicode二维条码（Uniform Symbology Specification-Maxicode）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var MAXICODE: js.UndefOr[Double] = js.native
  
  /**
    * PDF 417二维条码，数值为13
    * PDF417条码是由美国SYMBOL公司发明的，PDF（Portable Data File）意思是“便携数据文件”。组成条码的每一个条码字符由4个条和4个空共17个模块构成，故称为PDF417条码。PDF417条码最大的优势在于其庞大的数据容量和极强的纠错能力。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var PDF417: js.UndefOr[Double] = js.native
  
  /**
    * QR二维码，数值为0
    * 1994年由日本Denso-Wave公司发明，QR来自英文Quick Response的缩写，即快速反应的意思，源自发明者希望QR码可让其内容快速被解码。
    *     目前使用最广泛的二维码。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var QR: js.UndefOr[Double] = js.native
  
  /**
    * RSS 14条形组合码，数值为14
    * RSS条码是有国际物品编码协会EAN和美国统一代码委员会UCC开发的RSS（Reduced Space Symbology）条码符号。它是一种一维码和二维码的组合码。和其它线性条码相比，RSS系列码制具有更高的密度，因为它可以表示更多的字符。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var RSS14: js.UndefOr[Double] = js.native
  
  /**
    * 扩展式RSS条形组合码，数值为15
    * RSS条码是有国际物品编码协会EAN和美国统一代码委员会UCC开发的RSS（Reduced Space Symbology）条码符号。它是一种一维码和二维码的组合码。和其它线性条码相比，RSS系列码制具有更高的密度，因为它可以表示更多的字符。扩展式RSS码是长度可以变化的线性码制，能够对74个数字字符或41个字母字符的AI单元数据传数据进行编码。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var RSSEXPANDED: js.UndefOr[Double] = js.native
  
  /**
    * UPC条形码标准版，数值为5
    * UPC码是美国统一代码委员会制定的一种商品用条码，主要用于美国和加拿大地区，常在美国进口的商品上可以看到。UPC码标准版由12位数字构成，故其字码集为数字0~9。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var UPCA: js.UndefOr[Double] = js.native
  
  /**
    * UPC条形码缩短版，数值为6
    * UPC码是美国统一代码委员会制定的一种商品用条码，主要用于美国和加拿大地区，常在美国进口的商品上可以看到。UPC码缩短版由8位数字构成，故其字码集为数字0~9。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var UPCE: js.UndefOr[Double] = js.native
  
  /**
    * 创建Barcode对象
    * 调用此方法创建后并不会显示，需要调用Webview窗口的append方法将其添加到Webview窗口后才能显示。
    *     注意：此时需要通过styles参数的top/left/width/height属性设置控件的位置及大小。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  def create(): PlusBarcodeBarcode = js.native
  def create(id: String): PlusBarcodeBarcode = js.native
  def create(id: String, filters: js.Array[js.Any]): PlusBarcodeBarcode = js.native
  def create(id: String, filters: js.Array[js.Any], styles: PlusBarcodeBarcodeStyles): PlusBarcodeBarcode = js.native
  def create(id: String, filters: Unit, styles: PlusBarcodeBarcodeStyles): PlusBarcodeBarcode = js.native
  def create(id: Unit, filters: js.Array[js.Any]): PlusBarcodeBarcode = js.native
  def create(id: Unit, filters: js.Array[js.Any], styles: PlusBarcodeBarcodeStyles): PlusBarcodeBarcode = js.native
  def create(id: Unit, filters: Unit, styles: PlusBarcodeBarcodeStyles): PlusBarcodeBarcode = js.native
  
  /**
    * 查找已经创建的Barcode对象
    * 调用此方法查找指定id的Barcode对象，如果不存在则返回null。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  def getBarcodeById(): PlusBarcodeBarcode = js.native
  def getBarcodeById(id: String): PlusBarcodeBarcode = js.native
  
  /**
    * 通过图片扫码识别
    * 直接输入图片扫码识别，成功扫描到条码数据后通过successCallback回调返回，失败则通过errorCallback回调返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  def scan(): Unit = js.native
  def scan(path: String): Unit = js.native
  def scan(
    path: String,
    successCB: js.Function3[/* result0 */ Double, /* result1 */ String, /* result2 */ String, Unit]
  ): Unit = js.native
  def scan(
    path: String,
    successCB: js.Function3[/* result0 */ Double, /* result1 */ String, /* result2 */ String, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def scan(
    path: String,
    successCB: js.Function3[/* result0 */ Double, /* result1 */ String, /* result2 */ String, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit],
    filters: js.Array[js.Any]
  ): Unit = js.native
  def scan(
    path: String,
    successCB: js.Function3[/* result0 */ Double, /* result1 */ String, /* result2 */ String, Unit],
    errorCB: Unit,
    filters: js.Array[js.Any]
  ): Unit = js.native
  def scan(path: String, successCB: Unit, errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def scan(
    path: String,
    successCB: Unit,
    errorCB: js.Function1[/* result */ js.Any, Unit],
    filters: js.Array[js.Any]
  ): Unit = js.native
  def scan(path: String, successCB: Unit, errorCB: Unit, filters: js.Array[js.Any]): Unit = js.native
  def scan(
    path: Unit,
    successCB: js.Function3[/* result0 */ Double, /* result1 */ String, /* result2 */ String, Unit]
  ): Unit = js.native
  def scan(
    path: Unit,
    successCB: js.Function3[/* result0 */ Double, /* result1 */ String, /* result2 */ String, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def scan(
    path: Unit,
    successCB: js.Function3[/* result0 */ Double, /* result1 */ String, /* result2 */ String, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit],
    filters: js.Array[js.Any]
  ): Unit = js.native
  def scan(
    path: Unit,
    successCB: js.Function3[/* result0 */ Double, /* result1 */ String, /* result2 */ String, Unit],
    errorCB: Unit,
    filters: js.Array[js.Any]
  ): Unit = js.native
  def scan(path: Unit, successCB: Unit, errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def scan(
    path: Unit,
    successCB: Unit,
    errorCB: js.Function1[/* result */ js.Any, Unit],
    filters: js.Array[js.Any]
  ): Unit = js.native
  def scan(path: Unit, successCB: Unit, errorCB: Unit, filters: js.Array[js.Any]): Unit = js.native
}
