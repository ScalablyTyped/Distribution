package typings.luminoWidgets.panelMod.Panel

import typings.luminoWidgets.panellayoutMod.PanelLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a panel.
  */
trait IOptions extends js.Object {
  /**
    * The panel layout to use for the panel.
    *
    * The default is a new `PanelLayout`.
    */
  var layout: js.UndefOr[PanelLayout] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(layout: PanelLayout = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

