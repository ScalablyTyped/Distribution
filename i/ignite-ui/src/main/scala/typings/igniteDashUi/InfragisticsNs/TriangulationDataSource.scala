package typings.igniteDashUi.InfragisticsNs

import typings.igniteDashUi.TriangulationDataSourceSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.TriangulationDataSource")
@js.native
class TriangulationDataSource protected () extends js.Object {
  def this(settings: TriangulationDataSourceSettings) = this()
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

