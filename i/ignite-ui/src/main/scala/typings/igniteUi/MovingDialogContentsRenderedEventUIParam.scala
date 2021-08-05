package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MovingDialogContentsRenderedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the ColumnMoving widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object MovingDialogContentsRenderedEventUIParam {
  
  inline def apply(): MovingDialogContentsRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MovingDialogContentsRenderedEventUIParam]
  }
  
  extension [Self <: MovingDialogContentsRenderedEventUIParam](x: Self) {
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
