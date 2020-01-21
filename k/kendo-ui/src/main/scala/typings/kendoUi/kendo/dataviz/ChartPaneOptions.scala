package typings.kendoUi.kendo.dataviz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPaneOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object ChartPaneOptions {
  @scala.inline
  def apply(name: String = null): ChartPaneOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPaneOptions]
  }
}

