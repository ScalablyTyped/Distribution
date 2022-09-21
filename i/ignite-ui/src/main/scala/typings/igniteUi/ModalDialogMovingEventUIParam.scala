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
  var originalPosition: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets access the GroupBy widget object.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the current position of the GroupBy Dialog div as { top, left } object, relative to the page.
    */
  var position: js.UndefOr[Any] = js.undefined
}
object ModalDialogMovingEventUIParam {
  
  inline def apply(): ModalDialogMovingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogMovingEventUIParam]
  }
  
  extension [Self <: ModalDialogMovingEventUIParam](x: Self) {
    
    inline def setModalDialogElement(value: String): Self = StObject.set(x, "modalDialogElement", value.asInstanceOf[js.Any])
    
    inline def setModalDialogElementUndefined: Self = StObject.set(x, "modalDialogElement", js.undefined)
    
    inline def setOriginalPosition(value: Any): Self = StObject.set(x, "originalPosition", value.asInstanceOf[js.Any])
    
    inline def setOriginalPositionUndefined: Self = StObject.set(x, "originalPosition", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
