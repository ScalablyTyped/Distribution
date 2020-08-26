package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Zip模块管理文件压缩和解压，通过plus.zip可获取压缩管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
  */
@js.native
trait PlusZip extends js.Object {
  /**
    * JSON对象，图片裁剪区域的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  var ClipImageOptions: js.UndefOr[PlusZipClipImageOptions] = js.native
  /**
    * JSON对象，配置图片压缩转换的参数
    * 设置width/height属性则表示需对图片进行缩放转换操作；
    *     设置rotate属性则表示需对图片进行旋转转换操作；
    *     设置clip属性则表示需对图片进行裁剪转换操作；
    *     如同时设置了多个转换操作，则按缩放、旋转、裁剪顺序进行操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  var CompressImageOptions: js.UndefOr[PlusZipCompressImageOptions] = js.native
  /**
    * 压缩生成Zip文件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  def compress(): Unit = js.native
  def compress(
    src: js.UndefOr[scala.Nothing],
    zipfile: js.UndefOr[scala.Nothing],
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def compress(src: js.UndefOr[scala.Nothing], zipfile: js.UndefOr[scala.Nothing], successCB: js.Function0[Unit]): Unit = js.native
  def compress(
    src: js.UndefOr[scala.Nothing],
    zipfile: js.UndefOr[scala.Nothing],
    successCB: js.Function0[Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def compress(src: js.UndefOr[scala.Nothing], zipfile: String): Unit = js.native
  def compress(
    src: js.UndefOr[scala.Nothing],
    zipfile: String,
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def compress(src: js.UndefOr[scala.Nothing], zipfile: String, successCB: js.Function0[Unit]): Unit = js.native
  def compress(
    src: js.UndefOr[scala.Nothing],
    zipfile: String,
    successCB: js.Function0[Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def compress(src: String): Unit = js.native
  def compress(
    src: String,
    zipfile: js.UndefOr[scala.Nothing],
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def compress(src: String, zipfile: js.UndefOr[scala.Nothing], successCB: js.Function0[Unit]): Unit = js.native
  def compress(
    src: String,
    zipfile: js.UndefOr[scala.Nothing],
    successCB: js.Function0[Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def compress(src: String, zipfile: String): Unit = js.native
  def compress(
    src: String,
    zipfile: String,
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def compress(src: String, zipfile: String, successCB: js.Function0[Unit]): Unit = js.native
  def compress(
    src: String,
    zipfile: String,
    successCB: js.Function0[Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 图片压缩转换
    * 可用于图片的质量压缩、大小缩放、方向旋转、区域裁剪、格式转换等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  def compressImage(): Unit = js.native
  def compressImage(
    options: js.UndefOr[scala.Nothing],
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def compressImage(options: js.UndefOr[scala.Nothing], successCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def compressImage(
    options: js.UndefOr[scala.Nothing],
    successCB: js.Function1[/* result */ js.Any, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def compressImage(options: PlusZipCompressImageOptions): Unit = js.native
  def compressImage(
    options: PlusZipCompressImageOptions,
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def compressImage(options: PlusZipCompressImageOptions, successCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def compressImage(
    options: PlusZipCompressImageOptions,
    successCB: js.Function1[/* result */ js.Any, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 解压缩Zip文件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/zip.html](http://www.html5plus.org/doc/zh_cn/zip.html)
    */
  def decompress(): Unit = js.native
  def decompress(
    zipfile: js.UndefOr[scala.Nothing],
    target: js.UndefOr[scala.Nothing],
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def decompress(
    zipfile: js.UndefOr[scala.Nothing],
    target: js.UndefOr[scala.Nothing],
    successCB: js.Function0[Unit]
  ): Unit = js.native
  def decompress(
    zipfile: js.UndefOr[scala.Nothing],
    target: js.UndefOr[scala.Nothing],
    successCB: js.Function0[Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def decompress(zipfile: js.UndefOr[scala.Nothing], target: String): Unit = js.native
  def decompress(
    zipfile: js.UndefOr[scala.Nothing],
    target: String,
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def decompress(zipfile: js.UndefOr[scala.Nothing], target: String, successCB: js.Function0[Unit]): Unit = js.native
  def decompress(
    zipfile: js.UndefOr[scala.Nothing],
    target: String,
    successCB: js.Function0[Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def decompress(zipfile: String): Unit = js.native
  def decompress(
    zipfile: String,
    target: js.UndefOr[scala.Nothing],
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def decompress(zipfile: String, target: js.UndefOr[scala.Nothing], successCB: js.Function0[Unit]): Unit = js.native
  def decompress(
    zipfile: String,
    target: js.UndefOr[scala.Nothing],
    successCB: js.Function0[Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def decompress(zipfile: String, target: String): Unit = js.native
  def decompress(
    zipfile: String,
    target: String,
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def decompress(zipfile: String, target: String, successCB: js.Function0[Unit]): Unit = js.native
  def decompress(
    zipfile: String,
    target: String,
    successCB: js.Function0[Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
}

