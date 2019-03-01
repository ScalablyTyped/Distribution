package typings
package kendoDashUiLib.kendoNs.datavizNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAxisOptions extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ChartAxisOptions {
  @scala.inline
  def apply(name: java.lang.String = null): ChartAxisOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ChartAxisOptions]
  }
}

