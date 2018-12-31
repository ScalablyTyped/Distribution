package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IupdownloadVoice extends BaseParams {
   // 需要上传的音频的本地ID，由stopRecord接口获得
  var isShowProgressTips: scala.Double
  var localId: java.lang.String
   // 默认为1，显示进度提示
  @JSName("success")
  def success_MIupdownloadVoice(res: Resouce): scala.Unit
}

