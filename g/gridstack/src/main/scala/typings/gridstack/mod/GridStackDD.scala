package typings.gridstack.mod

import typings.gridstack.anon.TypeofGridStackDD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gridstack", "GridStackDD")
@js.native
class GridStackDD protected ()
  extends typings.gridstack.gridstackDdMod.GridStackDD {
  def this(grid: GridStack) = this()
}
/* static members */
@JSImport("gridstack", "GridStackDD")
@js.native
object GridStackDD extends js.Object {
  
  /** get the current registered plugin to use */
  def get(): TypeofGridStackDD = js.native
  
  /** call this method to register your plugin instead of the default no-op one */
  def registerPlugin(pluginClass: TypeofGridStackDD): Unit = js.native
  
  var registeredPlugins: TypeofGridStackDD = js.native
}
