package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowEditDialogAfterCloseEventUIParam extends StObject {
  
  /**
    * Gets a reference to row edit dialog DOM element.
    */
  var dialogElement: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object RowEditDialogAfterCloseEventUIParam {
  
  inline def apply(): RowEditDialogAfterCloseEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowEditDialogAfterCloseEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowEditDialogAfterCloseEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setDialogElement(value: Any): Self = StObject.set(x, "dialogElement", value.asInstanceOf[js.Any])
    
    inline def setDialogElementUndefined: Self = StObject.set(x, "dialogElement", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
