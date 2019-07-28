package typings.kendoDashUi.kendoNs.datavizNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPointOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object ChartPointOptions {
  @scala.inline
  def apply(name: String = null): ChartPointOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ChartPointOptions]
  }
}

