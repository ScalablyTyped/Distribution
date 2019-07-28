package typings.jweixin.jweixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IplaypausestopVoice extends BaseParams {
  var localId: String
}

object IplaypausestopVoice {
  @scala.inline
  def apply(
    localId: String,
    complete: /* repeated */ js.Any => Unit = null,
    fail: /* repeated */ js.Any => Unit = null,
    success: /* repeated */ js.Any => Unit = null
  ): IplaypausestopVoice = {
    val __obj = js.Dynamic.literal(localId = localId)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[IplaypausestopVoice]
  }
}

