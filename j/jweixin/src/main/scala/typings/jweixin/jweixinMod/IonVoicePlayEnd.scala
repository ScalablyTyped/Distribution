package typings.jweixin.jweixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonVoicePlayEnd extends BaseParams {
  @JSName("success")
  def success_MIonVoicePlayEnd(res: Resouce): Unit
}

object IonVoicePlayEnd {
  @scala.inline
  def apply(
    success: Resouce => Unit,
    complete: /* repeated */ js.Any => Unit = null,
    fail: /* repeated */ js.Any => Unit = null
  ): IonVoicePlayEnd = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[IonVoicePlayEnd]
  }
}

