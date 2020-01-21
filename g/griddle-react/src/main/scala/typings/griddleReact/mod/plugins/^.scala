package typings.griddleReact.mod.plugins

import typings.griddleReact.mod.GriddlePlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("griddle-react", "plugins")
@js.native
object ^ extends js.Object {
  var CorePlugin: GriddlePlugin = js.native
  var LegacyStylePlugin: GriddlePlugin = js.native
  var LocalPlugin: GriddlePlugin = js.native
  var PositionPlugin: js.Function1[/* settings */ PositionSettings, GriddlePlugin] = js.native
}

