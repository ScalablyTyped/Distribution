package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridAllowCopy extends js.Object {
  var delimeter: js.UndefOr[String | js.Any] = js.undefined
}

object GridAllowCopy {
  @scala.inline
  def apply(delimeter: String | js.Any = null): GridAllowCopy = {
    val __obj = js.Dynamic.literal()
    if (delimeter != null) __obj.updateDynamic("delimeter")(delimeter.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridAllowCopy]
  }
}

