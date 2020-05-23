package typings.html5plus

import typings.html5plus.html5plusStrings.default
import typings.html5plus.html5plusStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 条码识别控件扫描参数
  * 设置Barcode扫码控件的扫码识别参数，如是否保存扫码功时的截图等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/barcode.html](http://www.html5plus.org/doc/zh_cn/barcode.html)
  */
trait PlusBarcodeBarcodeOptions extends js.Object {
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
  def apply(
    conserve: js.UndefOr[Boolean] = js.undefined,
    filename: String = null,
    sound: none | default = null,
    vibrate: js.UndefOr[Boolean] = js.undefined
  ): PlusBarcodeBarcodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(conserve)) __obj.updateDynamic("conserve")(conserve.get.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (!js.isUndefined(vibrate)) __obj.updateDynamic("vibrate")(vibrate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusBarcodeBarcodeOptions]
  }
}

