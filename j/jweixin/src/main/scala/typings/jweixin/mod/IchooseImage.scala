package typings.jweixin.mod

import typings.jweixin.anon.LocalIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================基础接口================================*/
/*=============================图像接口================================*/
@js.native
trait IchooseImage extends BaseParams {
  /** 最多可以选择的图片张数，默认9 */
  var count: js.UndefOr[Double] = js.native
  /** original 原图，compressed 压缩图，默认二者都有 */
  var sizeType: js.UndefOr[js.Array[ImageSizeType]] = js.native
  /** album 从相册选图，camera 使用相机，默认二者都有 */
  var sourceType: js.UndefOr[js.Array[ImageSourceType]] = js.native
  def cancel(): Unit = js.native
  /** 成功则返回图片的本地文件路径列表 tempFilePaths */
  @JSName("success")
  def success_MIchooseImage(res: LocalIds): Unit = js.native
}

object IchooseImage {
  @scala.inline
  def apply(cancel: () => Unit, success: LocalIds => Unit): IchooseImage = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IchooseImage]
  }
  @scala.inline
  implicit class IchooseImageOps[Self <: IchooseImage] (val x: Self) extends AnyVal {
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def setSuccess(value: LocalIds => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setSizeTypeVarargs(value: ImageSizeType*): Self = this.set("sizeType", js.Array(value :_*))
    @scala.inline
    def setSizeType(value: js.Array[ImageSizeType]): Self = this.set("sizeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeType: Self = this.set("sizeType", js.undefined)
    @scala.inline
    def setSourceTypeVarargs(value: ImageSourceType*): Self = this.set("sourceType", js.Array(value :_*))
    @scala.inline
    def setSourceType(value: js.Array[ImageSourceType]): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
  }
  
}

