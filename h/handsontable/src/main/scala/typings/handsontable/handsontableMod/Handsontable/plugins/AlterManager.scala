package typings.handsontable.handsontableMod.Handsontable.plugins

import typings.handsontable.handsontableMod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlterManager extends js.Object {
  var dataProvider: DataProvider
  var hot: Core
  var matrix: Matrix
  var sheet: Sheet
  def destroy(): Unit
  def prepareAlter(action: String, args: js.Any): Unit
  def triggerAlter(action: String, args: js.Any): Unit
}

object AlterManager {
  @scala.inline
  def apply(
    dataProvider: DataProvider,
    destroy: () => Unit,
    hot: Core,
    matrix: Matrix,
    prepareAlter: (String, js.Any) => Unit,
    sheet: Sheet,
    triggerAlter: (String, js.Any) => Unit
  ): AlterManager = {
    val __obj = js.Dynamic.literal(dataProvider = dataProvider, destroy = js.Any.fromFunction0(destroy), hot = hot, matrix = matrix, prepareAlter = js.Any.fromFunction2(prepareAlter), sheet = sheet, triggerAlter = js.Any.fromFunction2(triggerAlter))
  
    __obj.asInstanceOf[AlterManager]
  }
}

