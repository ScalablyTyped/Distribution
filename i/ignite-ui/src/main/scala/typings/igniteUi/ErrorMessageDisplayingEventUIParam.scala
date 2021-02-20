package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorMessageDisplayingEventUIParam extends StObject {
  
  /**
    * Used to get or set the error message that is to be shown.
    */
  var errorMessage: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain reference to the barcode widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ErrorMessageDisplayingEventUIParam {
  
  @scala.inline
  def apply(): ErrorMessageDisplayingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorMessageDisplayingEventUIParam]
  }
  
  @scala.inline
  implicit class ErrorMessageDisplayingEventUIParamMutableBuilder[Self <: ErrorMessageDisplayingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: js.Any): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
