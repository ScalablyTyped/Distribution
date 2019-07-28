package typings.igniteDashUi.InfragisticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.SortingExpressionsManager")
@js.native
class SortingExpressionsManager () extends js.Object {
  /**
  	 * Insert expr at the first position of the se (sorting expressions) if there are not any other expressions with flag group by
  	 *  otherwise if there are such expressions inserts after the last
  	 *
  	 * @param se
  	 * @param expr
  	 * @param feature
  	 */
  def addSortingExpression(se: js.Object, expr: js.Object, feature: js.Object): Unit = js.native
  def setFormattersForSortingExprs(exprs: js.Object, grid: js.Object): Unit = js.native
  def setGridInstance(grid: js.Object): Unit = js.native
}

