package typings
package kendoDashUiLib.kendoNs.datavizNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPaneOptions extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ChartPaneOptions {
  @scala.inline
  def apply(name: java.lang.String = null): ChartPaneOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ChartPaneOptions]
  }
}

