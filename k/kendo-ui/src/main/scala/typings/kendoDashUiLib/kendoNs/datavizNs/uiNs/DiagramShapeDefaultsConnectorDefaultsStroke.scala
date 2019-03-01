package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaultsConnectorDefaultsStroke extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var dashType: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object DiagramShapeDefaultsConnectorDefaultsStroke {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    dashType: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): DiagramShapeDefaultsConnectorDefaultsStroke = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashType != null) __obj.updateDynamic("dashType")(dashType)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeDefaultsConnectorDefaultsStroke]
  }
}

