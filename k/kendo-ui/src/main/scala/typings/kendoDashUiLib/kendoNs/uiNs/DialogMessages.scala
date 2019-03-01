package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogMessages extends js.Object {
  var close: js.UndefOr[java.lang.String] = js.undefined
  var promptInput: js.UndefOr[java.lang.String] = js.undefined
}

object DialogMessages {
  @scala.inline
  def apply(close: java.lang.String = null, promptInput: java.lang.String = null): DialogMessages = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (promptInput != null) __obj.updateDynamic("promptInput")(promptInput)
    __obj.asInstanceOf[DialogMessages]
  }
}

