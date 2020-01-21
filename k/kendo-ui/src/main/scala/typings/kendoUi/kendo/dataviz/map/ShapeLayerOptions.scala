package typings.kendoUi.kendo.dataviz.map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeLayerOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object ShapeLayerOptions {
  @scala.inline
  def apply(name: String = null): ShapeLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeLayerOptions]
  }
}

