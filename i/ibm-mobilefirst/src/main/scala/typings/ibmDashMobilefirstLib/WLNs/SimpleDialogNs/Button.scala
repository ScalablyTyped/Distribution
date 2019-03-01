package typings
package ibmDashMobilefirstLib.WLNs.SimpleDialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  var handler: js.UndefOr[js.Function] = js.undefined
  var text: java.lang.String
}

object Button {
  @scala.inline
  def apply(text: java.lang.String, handler: js.Function = null): Button = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    if (handler != null) __obj.updateDynamic("handler")(handler)
    __obj.asInstanceOf[Button]
  }
}

