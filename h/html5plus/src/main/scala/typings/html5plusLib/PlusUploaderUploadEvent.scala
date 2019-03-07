package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 上传任务事件类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
  */
trait PlusUploaderUploadEvent extends js.Object {
  /**
    * 上传任务状态变化事件
    * 当上传任务状态发生变化时触发此事件，事件原型参考UploadStateChangedCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var statechanged: js.UndefOr[java.lang.String] = js.undefined
}

object PlusUploaderUploadEvent {
  @scala.inline
  def apply(statechanged: java.lang.String = null): PlusUploaderUploadEvent = {
    val __obj = js.Dynamic.literal()
    if (statechanged != null) __obj.updateDynamic("statechanged")(statechanged)
    __obj.asInstanceOf[PlusUploaderUploadEvent]
  }
}

