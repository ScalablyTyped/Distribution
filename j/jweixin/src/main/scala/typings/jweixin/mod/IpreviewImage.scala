package typings.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpreviewImage extends BaseParams {
  var current: String = js.native
   // 当前显示图片的http链接
  var urls: js.Array[String] = js.native
}

object IpreviewImage {
  @scala.inline
  def apply(current: String, urls: js.Array[String]): IpreviewImage = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpreviewImage]
  }
  @scala.inline
  implicit class IpreviewImageOps[Self <: IpreviewImage] (val x: Self) extends AnyVal {
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
    def setCurrent(value: String): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrlsVarargs(value: String*): Self = this.set("urls", js.Array(value :_*))
    @scala.inline
    def setUrls(value: js.Array[String]): Self = this.set("urls", value.asInstanceOf[js.Any])
  }
  
}

