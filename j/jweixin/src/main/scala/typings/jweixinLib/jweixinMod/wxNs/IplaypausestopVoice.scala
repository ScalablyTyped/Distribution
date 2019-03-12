package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IplaypausestopVoice extends BaseParams {
  var localId: java.lang.String
}

object IplaypausestopVoice {
  @scala.inline
  def apply(
    localId: java.lang.String,
    complete: /* repeated */ js.Any => scala.Unit = null,
    fail: /* repeated */ js.Any => scala.Unit = null,
    success: /* repeated */ js.Any => scala.Unit = null
  ): IplaypausestopVoice = {
    val __obj = js.Dynamic.literal(localId = localId)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[IplaypausestopVoice]
  }
}

