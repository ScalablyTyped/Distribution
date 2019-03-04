package typings
package atMaterialDashUiCoreLib.stylesZIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZIndex extends js.Object {
  var appBar: scala.Double
  var drawer: scala.Double
  var mobileStepper: scala.Double
  var modal: scala.Double
  var snackbar: scala.Double
  var tooltip: scala.Double
}

object ZIndex {
  @scala.inline
  def apply(
    appBar: scala.Double,
    drawer: scala.Double,
    mobileStepper: scala.Double,
    modal: scala.Double,
    snackbar: scala.Double,
    tooltip: scala.Double
  ): ZIndex = {
    val __obj = js.Dynamic.literal(appBar = appBar, drawer = drawer, mobileStepper = mobileStepper, modal = modal, snackbar = snackbar, tooltip = tooltip)
  
    __obj.asInstanceOf[ZIndex]
  }
}

