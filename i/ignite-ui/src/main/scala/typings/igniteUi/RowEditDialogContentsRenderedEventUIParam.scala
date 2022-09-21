package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowEditDialogContentsRenderedEventUIParam extends StObject {
  
  /**
    * Gets a reference to row edit dialog DOM element.
    */
  var dialogElement: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object RowEditDialogContentsRenderedEventUIParam {
  
  inline def apply(): RowEditDialogContentsRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowEditDialogContentsRenderedEventUIParam]
  }
  
  extension [Self <: RowEditDialogContentsRenderedEventUIParam](x: Self) {
    
    inline def setDialogElement(value: Any): Self = StObject.set(x, "dialogElement", value.asInstanceOf[js.Any])
    
    inline def setDialogElementUndefined: Self = StObject.set(x, "dialogElement", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
