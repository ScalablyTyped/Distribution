package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortingExpressionsManager extends js.Object {
  
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
  
  @scala.inline
  implicit class SortingExpressionsManagerOps[Self <: SortingExpressionsManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddSortingExpression(value: (js.Object, js.Object, js.Object) => Unit): Self = this.set("addSortingExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetFormattersForSortingExprs(value: (js.Object, js.Object) => Unit): Self = this.set("setFormattersForSortingExprs", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetGridInstance(value: js.Object => Unit): Self = this.set("setGridInstance", js.Any.fromFunction1(value))
  }
}
