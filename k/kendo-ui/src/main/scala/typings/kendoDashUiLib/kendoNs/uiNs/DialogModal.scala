package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogModal extends js.Object {
  var preventScroll: js.UndefOr[java.lang.String] = js.undefined
}

object DialogModal {
  @scala.inline
  def apply(preventScroll: java.lang.String = null): DialogModal = {
    val __obj = js.Dynamic.literal()
    if (preventScroll != null) __obj.updateDynamic("preventScroll")(preventScroll)
    __obj.asInstanceOf[DialogModal]
  }
}

