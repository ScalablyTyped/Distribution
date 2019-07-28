package typings.kendoDashUi.kendoNs.datavizNs.mapNs

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
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ShapeLayerOptions]
  }
}

