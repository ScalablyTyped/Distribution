package typings.jweixin.jweixinMod

import typings.jweixin.Anon_TranslateResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================音频接口================================*/
/*=============================智能接口================================*/
trait ItranslateVoice extends BaseParams {
   // 需要识别的音频的本地Id，由录音相关接口获得
  var isShowProgressTips: Double
  var localId: String
   // 默认为1，显示进度提示
  @JSName("success")
  def success_MItranslateVoice(res: Anon_TranslateResult): Unit
}

object ItranslateVoice {
  @scala.inline
  def apply(
    isShowProgressTips: Double,
    localId: String,
    success: Anon_TranslateResult => Unit,
    complete: /* repeated */ js.Any => Unit = null,
    fail: /* repeated */ js.Any => Unit = null
  ): ItranslateVoice = {
    val __obj = js.Dynamic.literal(isShowProgressTips = isShowProgressTips, localId = localId, success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[ItranslateVoice]
  }
}

