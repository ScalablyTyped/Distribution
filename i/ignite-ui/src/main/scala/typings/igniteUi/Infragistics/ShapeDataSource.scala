package typings.igniteUi.Infragistics

import typings.igniteUi.ShapeDataSourceSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.ShapeDataSource")
@js.native
class ShapeDataSource protected () extends js.Object {
  def this(settings: ShapeDataSourceSettings) = this()
  /**
  	 * Returns the current converter instance
  	 */
  def converter(): js.Object = js.native
  /**
  	 * Loads to the current data source
  	 */
  def dataBind(): Unit = js.native
  def dataView(): Unit = js.native
  /**
  	 * Returns true if data is loaded
  	 */
  def isBound(): Boolean = js.native
}

