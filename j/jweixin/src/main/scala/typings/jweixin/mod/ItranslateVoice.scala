package typings.jweixin.mod

import typings.jweixin.anon.TranslateResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================音频接口================================*/
/*=============================智能接口================================*/
@js.native
trait ItranslateVoice extends BaseParams {
   // 需要识别的音频的本地Id，由录音相关接口获得
  var isShowProgressTips: Double = js.native
  var localId: String = js.native
   // 默认为1，显示进度提示
  @JSName("success")
  def success_MItranslateVoice(res: TranslateResult): Unit = js.native
}

object ItranslateVoice {
  @scala.inline
  def apply(isShowProgressTips: Double, localId: String, success: TranslateResult => Unit): ItranslateVoice = {
    val __obj = js.Dynamic.literal(isShowProgressTips = isShowProgressTips.asInstanceOf[js.Any], localId = localId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ItranslateVoice]
  }
  @scala.inline
  implicit class ItranslateVoiceOps[Self <: ItranslateVoice] (val x: Self) extends AnyVal {
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
    def setIsShowProgressTips(value: Double): Self = this.set("isShowProgressTips", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalId(value: String): Self = this.set("localId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: TranslateResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
  
}

