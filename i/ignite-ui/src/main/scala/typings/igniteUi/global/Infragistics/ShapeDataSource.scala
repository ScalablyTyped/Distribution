package typings.igniteUi.global.Infragistics

import typings.igniteUi.ShapeDataSourceSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.ShapeDataSource")
@js.native
class ShapeDataSource protected ()
  extends typings.igniteUi.Infragistics.ShapeDataSource {
  def this(settings: ShapeDataSourceSettings) = this()
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

