package typings.kendoDashUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionStartCapFill extends js.Object {
  var color: js.UndefOr[String] = js.undefined
}

object ConnectionStartCapFill {
  @scala.inline
  def apply(color: String = null): ConnectionStartCapFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStartCapFill]
  }
}

