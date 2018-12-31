package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================音频接口================================*/
/*=============================智能接口================================*/
trait ItranslateVoice extends BaseParams {
   // 需要识别的音频的本地Id，由录音相关接口获得
  var isShowProgressTips: scala.Double
  var localId: java.lang.String
   // 默认为1，显示进度提示
  @JSName("success")
  def success_MItranslateVoice(res: jweixinLib.Anon_TranslateResult): scala.Unit
}

