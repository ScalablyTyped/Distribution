package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalDialogSortClickEventUIParam extends StObject {
  
  /**
    * Gets the column key.
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the modal dialog element. This is a jQuery object.
    */
  var modalDialogElement: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to GridSorting.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object ModalDialogSortClickEventUIParam {
  
  @scala.inline
  def apply(): ModalDialogSortClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogSortClickEventUIParam]
  }
  
  @scala.inline
  implicit class ModalDialogSortClickEventUIParamMutableBuilder[Self <: ModalDialogSortClickEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    @scala.inline
    def setModalDialogElement(value: String): Self = StObject.set(x, "modalDialogElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogElementUndefined: Self = StObject.set(x, "modalDialogElement", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
