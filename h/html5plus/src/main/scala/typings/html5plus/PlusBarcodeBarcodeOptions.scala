package typings.html5plus

import typings.html5plus.html5plusStrings.default
import typings.html5plus.html5plusStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 条码识别控件扫描参数
  * 设置Barcode扫码控件的扫码识别参数，如是否保存扫码功时的截图等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
  */
trait PlusBarcodeBarcodeOptions extends StObject {
  
  /**
    * 是否保存扫码成功时的截图
    * 如果设置为true则在扫码成功时将图片保存，并通过onmarked回调函数的file参数返回保存文件的路径。
    *     默认值为false，不保存截图。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var conserve: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 保存扫码成功时图片保存路径
    * 可通过此参数设置保存截图的路径和名称，如果设置图片文件名称则必须指定文件的后缀名（必须是.png），否则认为是指定目录，文件名称则自动生成。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var filename: js.UndefOr[String] = js.undefined
  
  /**
    * 扫码成功时播放的提示音
    * 可取值：
    *     "none" - 不播放提示音；
    *     "default" - 播放默认提示音（5+引擎内置）。
    *     默认值为"default"。
    * - none: 扫码成功时不播放提示音
    * - default: 扫码成功时播放默认提示音
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var sound: js.UndefOr[none | default] = js.undefined
  
  /**
    * 扫码成功时是否需要震动提醒
    * 如果设置为true则在扫码成功时震动设备，false则不震动。
    *     默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
    */
  var vibrate: js.UndefOr[Boolean] = js.undefined
}
object PlusBarcodeBarcodeOptions {
  
  @scala.inline
  def apply(): PlusBarcodeBarcodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusBarcodeBarcodeOptions]
  }
  
  @scala.inline
  implicit class PlusBarcodeBarcodeOptionsMutableBuilder[Self <: PlusBarcodeBarcodeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConserve(value: Boolean): Self = StObject.set(x, "conserve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConserveUndefined: Self = StObject.set(x, "conserve", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setSound(value: none | default): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    
    @scala.inline
    def setVibrate(value: Boolean): Self = StObject.set(x, "vibrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVibrateUndefined: Self = StObject.set(x, "vibrate", js.undefined)
  }
}
