package typings.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonVoiceRecordEnd extends BaseParams {
  // 录音时间超过一分钟没有停止的时候会执行 complete 回调
  @JSName("complete")
  def complete_MIonVoiceRecordEnd(res: Resouce): Unit = js.native
}

object IonVoiceRecordEnd {
  @scala.inline
  def apply(complete: Resouce => Unit): IonVoiceRecordEnd = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[IonVoiceRecordEnd]
  }
  @scala.inline
  implicit class IonVoiceRecordEndOps[Self <: IonVoiceRecordEnd] (val x: Self) extends AnyVal {
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
    def setComplete(value: Resouce => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
  }
  
}

