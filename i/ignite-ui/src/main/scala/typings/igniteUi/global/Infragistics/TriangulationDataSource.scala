package typings.igniteUi.global.Infragistics

import typings.igniteUi.TriangulationDataSourceSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.TriangulationDataSource")
@js.native
class TriangulationDataSource protected ()
  extends typings.igniteUi.Infragistics.TriangulationDataSource {
  def this(settings: TriangulationDataSourceSettings) = this()
  /**
    * Returns the current converter instance
    */
  /* CompleteClass */
  override def converter(): js.Object = js.native
  /**
    * Loads to the current data source
    */
  /* CompleteClass */
  override def dataBind(): Unit = js.native
  /* CompleteClass */
  override def dataView(): Unit = js.native
  /**
    * Returns true if data is loaded
    */
  /* CompleteClass */
  override def isBound(): Boolean = js.native
}

