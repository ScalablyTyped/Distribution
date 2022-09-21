package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalDialogSortingChangedEventUIParam extends StObject {
  
  /**
    * Gets the column key.
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Gets whether column should be ascending or not. If true it should be ascending
    */
  var isAsc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets a reference to the modal dialog element. This is a jQuery object.
    */
  var modalDialogElement: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to GridSorting.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ModalDialogSortingChangedEventUIParam {
  
  inline def apply(): ModalDialogSortingChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogSortingChangedEventUIParam]
  }
  
  extension [Self <: ModalDialogSortingChangedEventUIParam](x: Self) {
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setIsAsc(value: Boolean): Self = StObject.set(x, "isAsc", value.asInstanceOf[js.Any])
    
    inline def setIsAscUndefined: Self = StObject.set(x, "isAsc", js.undefined)
    
    inline def setModalDialogElement(value: String): Self = StObject.set(x, "modalDialogElement", value.asInstanceOf[js.Any])
    
    inline def setModalDialogElementUndefined: Self = StObject.set(x, "modalDialogElement", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
