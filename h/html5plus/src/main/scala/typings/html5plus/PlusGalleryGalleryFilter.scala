package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 相册选择文件过滤类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
  */
trait PlusGalleryGalleryFilter extends js.Object {
  /**
    * 仅可选择图片文件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var image: js.UndefOr[String] = js.undefined
  /**
    * 不过滤，可选择图片或视频文件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var none: js.UndefOr[String] = js.undefined
  /**
    * 仅可选择视频文件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var video: js.UndefOr[String] = js.undefined
}

object PlusGalleryGalleryFilter {
  @scala.inline
  def apply(image: String = null, none: String = null, video: String = null): PlusGalleryGalleryFilter = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image)
    if (none != null) __obj.updateDynamic("none")(none)
    if (video != null) __obj.updateDynamic("video")(video)
    __obj.asInstanceOf[PlusGalleryGalleryFilter]
  }
}

