package typings.griddleDashReact.griddleDashReactMod

import typings.griddleDashReact.griddleDashReactMod.pluginsNs.PositionSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("griddle-react", "plugins")
@js.native
object pluginsNs extends js.Object {
  trait PositionSettings extends js.Object {
    // TODO: Unused?
    // The minimum column width
    var defaultColumnWidth: js.UndefOr[Double | String] = js.undefined
    // TODO: Unused?
    // Disable pointer events while scrolling to improve performance
    var disablePointerEvents: js.UndefOr[Boolean] = js.undefined
    // TODO: Unused?
    // Whether or not the header should be fixed
    var fixedHeader: js.UndefOr[Boolean] = js.undefined
    // The minimum row height
    var rowHeight: js.UndefOr[Double | String] = js.undefined
    // The height of the table
    var tableHeight: js.UndefOr[Double | String] = js.undefined
    // The width of the table
    var tableWidth: js.UndefOr[Double | String] = js.undefined
  }
  
  var CorePlugin: GriddlePlugin = js.native
  var LegacyStylePlugin: GriddlePlugin = js.native
  var LocalPlugin: GriddlePlugin = js.native
  var PositionPlugin: js.Function1[/* settings */ PositionSettings, GriddlePlugin] = js.native
}

