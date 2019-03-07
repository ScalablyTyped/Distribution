package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gallery模块管理系统相册，支持从相册中选择图片或视频文件、保存图片或视频文件到相册等功能。通过plus.gallery获取相册管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
  */
@js.native
trait PlusGallery extends js.Object {
  /**
    * 相册选择文件过滤类型
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var GalleryFilter: js.UndefOr[PlusGalleryGalleryFilter] = js.native
  /**
    * JSON对象，从相册中选择文件的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var GalleryOptions: js.UndefOr[PlusGalleryGalleryOptions] = js.native
  /**
    * 保存图片到相册成功事件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var GallerySaveEvent: js.UndefOr[PlusGalleryGallerySaveEvent] = js.native
  /**
    * JSON对象，弹出拍照或摄像界面指示位置
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var PopPosition: js.UndefOr[PlusGalleryPopPosition] = js.native
  /**
    * 从系统相册选择文件（图片或视频）
    * 从系统相册中选择图片或视频文件。每次仅能选择一个文件，选择后将返回选择的文件路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  def pick(): scala.Unit = js.native
  def pick(succesCB: js.Function1[/* result */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def pick(
    succesCB: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCB: js.Function1[/* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def pick(
    succesCB: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCB: js.Function1[/* result */ js.Any, scala.Unit],
    options: PlusGalleryGalleryOptions
  ): scala.Unit = js.native
  /**
    * 保存文件到系统相册中
    * 保存文件到系统相册中。
    * 	每次仅能保存一个文件，支持图片类型（jpg/jpeg、png、bmp等格式）和视频文件（3gp、mov等格式）。
    * 	若保存的文件系统不支持，则通过errorCB返回错误信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  def save(): scala.Unit = js.native
  def save(path: java.lang.String): scala.Unit = js.native
  def save(
    path: java.lang.String,
    succesCB: js.Function1[/* result */ PlusGalleryGallerySaveEvent, scala.Unit]
  ): scala.Unit = js.native
  def save(
    path: java.lang.String,
    succesCB: js.Function1[/* result */ PlusGalleryGallerySaveEvent, scala.Unit],
    errorCB: js.Function1[/* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

