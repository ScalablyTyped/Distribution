package typings
package griddleDashReactLib.griddleDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("griddle-react", "plugins")
@js.native
object pluginsNs extends js.Object {
  
  trait PositionSettings extends js.Object {
    // TODO: Unused?
    // The minimum column width
    var defaultColumnWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
    // TODO: Unused?
    // Disable pointer events while scrolling to improve performance
    var disablePointerEvents: js.UndefOr[scala.Boolean] = js.undefined
    // TODO: Unused?
    // Whether or not the header should be fixed
    var fixedHeader: js.UndefOr[scala.Boolean] = js.undefined
    // The minimum row height
    var rowHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
    // The height of the table
    var tableHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
    // The width of the table
    var tableWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  }
  
  var CorePlugin: griddleDashReactLib.griddleDashReactMod.GriddlePlugin = js.native
  var LegacyStylePlugin: griddleDashReactLib.griddleDashReactMod.GriddlePlugin = js.native
  var LocalPlugin: griddleDashReactLib.griddleDashReactMod.GriddlePlugin = js.native
  var PositionPlugin: js.Function1[
    /* settings */ PositionSettings, 
    griddleDashReactLib.griddleDashReactMod.GriddlePlugin
  ] = js.native
}

