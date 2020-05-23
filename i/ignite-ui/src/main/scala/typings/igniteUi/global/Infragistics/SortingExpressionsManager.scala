package typings.igniteUi.global.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.SortingExpressionsManager")
@js.native
class SortingExpressionsManager ()
  extends typings.igniteUi.Infragistics.SortingExpressionsManager {
  /**
    * Insert expr at the first position of the se (sorting expressions) if there are not any other expressions with flag group by
    *  otherwise if there are such expressions inserts after the last
    *
    * @param se
    * @param expr
    * @param feature
    */
  /* CompleteClass */
  override def addSortingExpression(se: js.Object, expr: js.Object, feature: js.Object): Unit = js.native
  /* CompleteClass */
  override def setFormattersForSortingExprs(exprs: js.Object, grid: js.Object): Unit = js.native
  /* CompleteClass */
  override def setGridInstance(grid: js.Object): Unit = js.native
}

