package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，添加上传文件的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
  */
trait PlusUploaderUploadFileOptions extends js.Object {
  /**
    * 文件键名
    * 上传文件在上传任务中的键名，默认值为为文件名称。
    * 	上传任务中如果已经存在相同key的上传文件或数据将导致添加文件失败。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * 文件类型
    * 上传文件的类型（如图片文件为“image/jpeg”），默认值自动根据文件后缀名称生成。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var mime: js.UndefOr[String] = js.undefined
  /**
    * 文件名称
    * 上传文件的名称，默认值为上传文件路径中的名称。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var name: js.UndefOr[String] = js.undefined
}

object PlusUploaderUploadFileOptions {
  @scala.inline
  def apply(key: String = null, mime: String = null, name: String = null): PlusUploaderUploadFileOptions = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (mime != null) __obj.updateDynamic("mime")(mime)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[PlusUploaderUploadFileOptions]
  }
}

