package typings.layuiLayer.layer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhotosData extends js.Object {
  /** 相册包含的图片 */
  var data: js.Array[PhotosDataItem] = js.native
  /** 相册id */
  var id: Double = js.native
  /**
    * 初始显示的图片序号
    * @default 0
    */
  var start: js.UndefOr[Double] = js.native
  /** 相册标题 */
  var title: String = js.native
}

object PhotosData {
  @scala.inline
  def apply(data: js.Array[PhotosDataItem], id: Double, title: String): PhotosData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotosData]
  }
  @scala.inline
  implicit class PhotosDataOps[Self <: PhotosData] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: PhotosDataItem*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[PhotosDataItem]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

