package typings.materialUi.MaterialUI.Styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait zIndex extends js.Object {
  var appBar: Double
  var dialog: Double
  var dialogOverlay: Double
  var drawer: Double
  var drawerOverlay: Double
  var layer: Double
  var menu: Double
  var popover: Double
  var snackbar: Double
  var tooltip: Double
}

object zIndex {
  @scala.inline
  def apply(
    appBar: Double,
    dialog: Double,
    dialogOverlay: Double,
    drawer: Double,
    drawerOverlay: Double,
    layer: Double,
    menu: Double,
    popover: Double,
    snackbar: Double,
    tooltip: Double
  ): zIndex = {
    val __obj = js.Dynamic.literal(appBar = appBar.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], dialogOverlay = dialogOverlay.asInstanceOf[js.Any], drawer = drawer.asInstanceOf[js.Any], drawerOverlay = drawerOverlay.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], popover = popover.asInstanceOf[js.Any], snackbar = snackbar.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[zIndex]
  }
}

