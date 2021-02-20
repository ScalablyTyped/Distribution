package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalDialogButtonApplyClickEventUIParam extends StObject {
  
  /**
    * Gets the array of column layouts.
    */
  var groupedColumnLayouts: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Gets the array of grouped columns.
    */
  var groupedColumns: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Gets a reference to the modal dialog element. This is a jQuery object.
    */
  var modalDialogElement: js.UndefOr[String] = js.native
  
  /**
    * Gets access the GroupBy widget object.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the array of sorted columns.
    */
  var sortingExpr: js.UndefOr[js.Array[_]] = js.native
}
object ModalDialogButtonApplyClickEventUIParam {
  
  @scala.inline
  def apply(): ModalDialogButtonApplyClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogButtonApplyClickEventUIParam]
  }
  
  @scala.inline
  implicit class ModalDialogButtonApplyClickEventUIParamMutableBuilder[Self <: ModalDialogButtonApplyClickEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupedColumnLayouts(value: js.Array[_]): Self = StObject.set(x, "groupedColumnLayouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupedColumnLayoutsUndefined: Self = StObject.set(x, "groupedColumnLayouts", js.undefined)
    
    @scala.inline
    def setGroupedColumnLayoutsVarargs(value: js.Any*): Self = StObject.set(x, "groupedColumnLayouts", js.Array(value :_*))
    
    @scala.inline
    def setGroupedColumns(value: js.Array[_]): Self = StObject.set(x, "groupedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupedColumnsUndefined: Self = StObject.set(x, "groupedColumns", js.undefined)
    
    @scala.inline
    def setGroupedColumnsVarargs(value: js.Any*): Self = StObject.set(x, "groupedColumns", js.Array(value :_*))
    
    @scala.inline
    def setModalDialogElement(value: String): Self = StObject.set(x, "modalDialogElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogElementUndefined: Self = StObject.set(x, "modalDialogElement", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setSortingExpr(value: js.Array[_]): Self = StObject.set(x, "sortingExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingExprUndefined: Self = StObject.set(x, "sortingExpr", js.undefined)
    
    @scala.inline
    def setSortingExprVarargs(value: js.Any*): Self = StObject.set(x, "sortingExpr", js.Array(value :_*))
  }
}
