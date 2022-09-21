package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuccessEventUIParam extends StObject {
  
  /**
    * Populated with options for the specific field in the collection or null.
    */
  var fieldOptions: js.UndefOr[Any] = js.undefined
  
  /**
    * Get the formatted message text, if any.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Gets reference to the igValidator widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Determine the outcome of the validation.
    */
  var valid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the current value in target.
    */
  var value: js.UndefOr[Any] = js.undefined
}
object SuccessEventUIParam {
  
  inline def apply(): SuccessEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessEventUIParam]
  }
  
  extension [Self <: SuccessEventUIParam](x: Self) {
    
    inline def setFieldOptions(value: Any): Self = StObject.set(x, "fieldOptions", value.asInstanceOf[js.Any])
    
    inline def setFieldOptionsUndefined: Self = StObject.set(x, "fieldOptions", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
