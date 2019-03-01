package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertMessages extends js.Object {
  var okText: js.UndefOr[java.lang.String] = js.undefined
}

object AlertMessages {
  @scala.inline
  def apply(okText: java.lang.String = null): AlertMessages = {
    val __obj = js.Dynamic.literal()
    if (okText != null) __obj.updateDynamic("okText")(okText)
    __obj.asInstanceOf[AlertMessages]
  }
}

