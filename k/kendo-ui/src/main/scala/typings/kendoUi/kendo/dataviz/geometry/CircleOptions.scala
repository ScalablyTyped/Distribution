package typings.kendoUi.kendo.dataviz.geometry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object CircleOptions {
  @scala.inline
  def apply(name: String = null): CircleOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleOptions]
  }
}

