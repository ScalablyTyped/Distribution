package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalDialogSortingChangedEventUIParam extends StObject {
  
  /**
    * Gets the column key.
    */
  var columnKey: js.UndefOr[String] = js.native
  
  /**
    * Gets whether column should be ascending or not. If true it should be ascending
    */
  var isAsc: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets a reference to the modal dialog element. This is a jQuery object.
    */
  var modalDialogElement: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to GridSorting.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ModalDialogSortingChangedEventUIParam {
  
  @scala.inline
  def apply(): ModalDialogSortingChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogSortingChangedEventUIParam]
  }
  
  @scala.inline
  implicit class ModalDialogSortingChangedEventUIParamMutableBuilder[Self <: ModalDialogSortingChangedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    @scala.inline
    def setIsAsc(value: Boolean): Self = StObject.set(x, "isAsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAscUndefined: Self = StObject.set(x, "isAsc", js.undefined)
    
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
