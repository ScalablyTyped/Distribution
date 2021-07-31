package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalDialogMovingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the modal dialog element. This is a jQuery object.
    */
  var modalDialogElement: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the original position of the GroupBy Dialog div as { top, left } object, relative to the page.
    */
  var originalPosition: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets access the GroupBy widget object.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the current position of the GroupBy Dialog div as { top, left } object, relative to the page.
    */
  var position: js.UndefOr[js.Any] = js.undefined
}
object ModalDialogMovingEventUIParam {
  
  @scala.inline
  def apply(): ModalDialogMovingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogMovingEventUIParam]
  }
  
  @scala.inline
  implicit class ModalDialogMovingEventUIParamMutableBuilder[Self <: ModalDialogMovingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModalDialogElement(value: String): Self = StObject.set(x, "modalDialogElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogElementUndefined: Self = StObject.set(x, "modalDialogElement", js.undefined)
    
    @scala.inline
    def setOriginalPosition(value: js.Any): Self = StObject.set(x, "originalPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalPositionUndefined: Self = StObject.set(x, "originalPosition", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
