package typings.kendoDashUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionHoverStroke extends js.Object {
  var color: js.UndefOr[String] = js.undefined
}

object ConnectionHoverStroke {
  @scala.inline
  def apply(color: String = null): ConnectionHoverStroke = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[ConnectionHoverStroke]
  }
}

