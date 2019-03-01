package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonVoicePlayEnd extends BaseParams {
  @JSName("success")
  def success_MIonVoicePlayEnd(res: Resouce): scala.Unit
}

object IonVoicePlayEnd {
  @scala.inline
  def apply(
    success: js.Function1[Resouce, scala.Unit],
    complete: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IonVoicePlayEnd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[IonVoicePlayEnd]
  }
}

