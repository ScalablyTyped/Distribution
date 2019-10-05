package typings.kendoDashUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionStroke extends js.Object {
  var color: js.UndefOr[String] = js.undefined
}

object ConnectionStroke {
  @scala.inline
  def apply(color: String = null): ConnectionStroke = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[ConnectionStroke]
  }
}

