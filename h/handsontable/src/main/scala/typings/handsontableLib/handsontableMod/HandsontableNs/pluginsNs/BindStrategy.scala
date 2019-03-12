package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindStrategy extends js.Object {
  var strategy: java.lang.String | scala.Unit
  def clearMap(): scala.Unit
  def createMap(length: scala.Double): scala.Unit
  def createRow(params: js.Any): scala.Unit
  def destroy(): scala.Unit
  def klass(): scala.Unit
  def removeRow(params: js.Any): scala.Unit
  def setStrategy(name: java.lang.String): scala.Unit
  def translate(params: js.Any): scala.Unit
}

object BindStrategy {
  @scala.inline
  def apply(
    clearMap: () => scala.Unit,
    createMap: scala.Double => scala.Unit,
    createRow: js.Any => scala.Unit,
    destroy: () => scala.Unit,
    klass: () => scala.Unit,
    removeRow: js.Any => scala.Unit,
    setStrategy: java.lang.String => scala.Unit,
    strategy: java.lang.String | scala.Unit,
    translate: js.Any => scala.Unit
  ): BindStrategy = {
    val __obj = js.Dynamic.literal(clearMap = js.Any.fromFunction0(clearMap), createMap = js.Any.fromFunction1(createMap), createRow = js.Any.fromFunction1(createRow), destroy = js.Any.fromFunction0(destroy), klass = js.Any.fromFunction0(klass), removeRow = js.Any.fromFunction1(removeRow), setStrategy = js.Any.fromFunction1(setStrategy), strategy = strategy.asInstanceOf[js.Any], translate = js.Any.fromFunction1(translate))
  
    __obj.asInstanceOf[BindStrategy]
  }
}

