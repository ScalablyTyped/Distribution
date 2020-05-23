package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortingExpressionsManager extends js.Object {
  /**
    * Insert expr at the first position of the se (sorting expressions) if there are not any other expressions with flag group by
    *  otherwise if there are such expressions inserts after the last
    *
    * @param se
    * @param expr
    * @param feature
    */
  def addSortingExpression(se: js.Object, expr: js.Object, feature: js.Object): Unit
  def setFormattersForSortingExprs(exprs: js.Object, grid: js.Object): Unit
  def setGridInstance(grid: js.Object): Unit
}

object SortingExpressionsManager {
  @scala.inline
  def apply(
    addSortingExpression: (js.Object, js.Object, js.Object) => Unit,
    setFormattersForSortingExprs: (js.Object, js.Object) => Unit,
    setGridInstance: js.Object => Unit
  ): SortingExpressionsManager = {
    val __obj = js.Dynamic.literal(addSortingExpression = js.Any.fromFunction3(addSortingExpression), setFormattersForSortingExprs = js.Any.fromFunction2(setFormattersForSortingExprs), setGridInstance = js.Any.fromFunction1(setGridInstance))
    __obj.asInstanceOf[SortingExpressionsManager]
  }
}

