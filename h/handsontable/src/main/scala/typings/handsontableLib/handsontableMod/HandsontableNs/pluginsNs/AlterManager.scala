package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlterManager extends js.Object {
  var dataProvider: DataProvider
  var hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core
  var matrix: Matrix
  var sheet: Sheet
  def destroy(): scala.Unit
  def prepareAlter(action: java.lang.String, args: js.Any): scala.Unit
  def triggerAlter(action: java.lang.String, args: js.Any): scala.Unit
}

object AlterManager {
  @scala.inline
  def apply(
    dataProvider: DataProvider,
    destroy: () => scala.Unit,
    hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    matrix: Matrix,
    prepareAlter: (java.lang.String, js.Any) => scala.Unit,
    sheet: Sheet,
    triggerAlter: (java.lang.String, js.Any) => scala.Unit
  ): AlterManager = {
    val __obj = js.Dynamic.literal(dataProvider = dataProvider, destroy = js.Any.fromFunction0(destroy), hot = hot, matrix = matrix, prepareAlter = js.Any.fromFunction2(prepareAlter), sheet = sheet, triggerAlter = js.Any.fromFunction2(triggerAlter))
  
    __obj.asInstanceOf[AlterManager]
  }
}

