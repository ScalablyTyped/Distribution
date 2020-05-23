package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeDataSource extends js.Object {
  /**
    * Returns the current converter instance
    */
  def converter(): js.Object
  /**
    * Loads to the current data source
    */
  def dataBind(): Unit
  def dataView(): Unit
  /**
    * Returns true if data is loaded
    */
  def isBound(): Boolean
}

object ShapeDataSource {
  @scala.inline
  def apply(converter: () => js.Object, dataBind: () => Unit, dataView: () => Unit, isBound: () => Boolean): ShapeDataSource = {
    val __obj = js.Dynamic.literal(converter = js.Any.fromFunction0(converter), dataBind = js.Any.fromFunction0(dataBind), dataView = js.Any.fromFunction0(dataView), isBound = js.Any.fromFunction0(isBound))
    __obj.asInstanceOf[ShapeDataSource]
  }
}

