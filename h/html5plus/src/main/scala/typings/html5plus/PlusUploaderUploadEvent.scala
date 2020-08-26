package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 上传任务事件类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
  */
@js.native
trait PlusUploaderUploadEvent extends js.Object {
  /**
    * 上传任务状态变化事件
    * 当上传任务状态发生变化时触发此事件，事件原型参考UploadStateChangedCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var statechanged: js.UndefOr[String] = js.native
}

object PlusUploaderUploadEvent {
  @scala.inline
  def apply(): PlusUploaderUploadEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusUploaderUploadEvent]
  }
  @scala.inline
  implicit class PlusUploaderUploadEventOps[Self <: PlusUploaderUploadEvent] (val x: Self) extends AnyVal {
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
    def setStatechanged(value: String): Self = this.set("statechanged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatechanged: Self = this.set("statechanged", js.undefined)
  }
  
}

