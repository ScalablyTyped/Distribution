package typings
package kendoDashUiLib.kendoNs.spreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopFilterOptions extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object TopFilterOptions {
  @scala.inline
  def apply(name: java.lang.String = null): TopFilterOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[TopFilterOptions]
  }
}

