package typings.handsontable.mod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindStrategy extends js.Object {
  var strategy: String | Unit
  def clearMap(): Unit
  def createMap(length: Double): Unit
  def createRow(params: js.Any): Unit
  def destroy(): Unit
  def klass(): Unit
  def removeRow(params: js.Any): Unit
  def setStrategy(name: String): Unit
  def translate(params: js.Any): Unit
}

object BindStrategy {
  @scala.inline
  def apply(
    clearMap: () => Unit,
    createMap: Double => Unit,
    createRow: js.Any => Unit,
    destroy: () => Unit,
    klass: () => Unit,
    removeRow: js.Any => Unit,
    setStrategy: String => Unit,
    strategy: String | Unit,
    translate: js.Any => Unit
  ): BindStrategy = {
    val __obj = js.Dynamic.literal(clearMap = js.Any.fromFunction0(clearMap), createMap = js.Any.fromFunction1(createMap), createRow = js.Any.fromFunction1(createRow), destroy = js.Any.fromFunction0(destroy), klass = js.Any.fromFunction0(klass), removeRow = js.Any.fromFunction1(removeRow), setStrategy = js.Any.fromFunction1(setStrategy), strategy = strategy.asInstanceOf[js.Any], translate = js.Any.fromFunction1(translate))
  
    __obj.asInstanceOf[BindStrategy]
  }
}

