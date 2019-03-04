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
    complete: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    success: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IplaypausestopVoice = {
    val __obj = js.Dynamic.literal(localId = localId)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[IplaypausestopVoice]
  }
}

