package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalDialogButtonApplyClickEventUIParam extends StObject {
  
  /**
    * Gets the array of column layouts.
    */
  var groupedColumnLayouts: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Gets the array of grouped columns.
    */
  var groupedColumns: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Gets a reference to the modal dialog element. This is a jQuery object.
    */
  var modalDialogElement: js.UndefOr[String] = js.undefined
  
  /**
    * Gets access the GroupBy widget object.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the array of sorted columns.
    */
  var sortingExpr: js.UndefOr[js.Array[Any]] = js.undefined
}
object ModalDialogButtonApplyClickEventUIParam {
  
  inline def apply(): ModalDialogButtonApplyClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogButtonApplyClickEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModalDialogButtonApplyClickEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setGroupedColumnLayouts(value: js.Array[Any]): Self = StObject.set(x, "groupedColumnLayouts", value.asInstanceOf[js.Any])
    
    inline def setGroupedColumnLayoutsUndefined: Self = StObject.set(x, "groupedColumnLayouts", js.undefined)
    
    inline def setGroupedColumnLayoutsVarargs(value: Any*): Self = StObject.set(x, "groupedColumnLayouts", js.Array(value*))
    
    inline def setGroupedColumns(value: js.Array[Any]): Self = StObject.set(x, "groupedColumns", value.asInstanceOf[js.Any])
    
    inline def setGroupedColumnsUndefined: Self = StObject.set(x, "groupedColumns", js.undefined)
    
    inline def setGroupedColumnsVarargs(value: Any*): Self = StObject.set(x, "groupedColumns", js.Array(value*))
    
    inline def setModalDialogElement(value: String): Self = StObject.set(x, "modalDialogElement", value.asInstanceOf[js.Any])
    
    inline def setModalDialogElementUndefined: Self = StObject.set(x, "modalDialogElement", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setSortingExpr(value: js.Array[Any]): Self = StObject.set(x, "sortingExpr", value.asInstanceOf[js.Any])
    
    inline def setSortingExprUndefined: Self = StObject.set(x, "sortingExpr", js.undefined)
    
    inline def setSortingExprVarargs(value: Any*): Self = StObject.set(x, "sortingExpr", js.Array(value*))
  }
}
