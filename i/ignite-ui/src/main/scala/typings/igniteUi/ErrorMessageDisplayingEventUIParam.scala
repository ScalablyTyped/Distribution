package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorMessageDisplayingEventUIParam extends StObject {
  
  /**
    * Used to get or set the error message that is to be shown.
    */
  var errorMessage: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain reference to the barcode widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ErrorMessageDisplayingEventUIParam {
  
  inline def apply(): ErrorMessageDisplayingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorMessageDisplayingEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorMessageDisplayingEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setErrorMessage(value: Any): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
