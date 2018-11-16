package typings
package igniteDashUiLib.InfragisticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.ShapeDataSource")
@js.native
class ShapeDataSource protected () extends js.Object {
  def this(settings: igniteDashUiLib.ShapeDataSourceSettings) = this()
  /**
  	 * Returns the current converter instance
  	 */
  def converter(): js.Object = js.native
  /**
  	 * Loads to the current data source
  	 */
  def dataBind(): scala.Unit = js.native
  def dataView(): scala.Unit = js.native
  /**
  	 * Returns true if data is loaded
  	 */
  def isBound(): scala.Boolean = js.native
}

