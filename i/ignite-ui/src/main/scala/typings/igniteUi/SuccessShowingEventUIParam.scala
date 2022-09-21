package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuccessShowingEventUIParam extends StObject {
  
  /**
    * Populated with options for the specific field in the collection or null.
    */
  var fieldOptions: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the text of message.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Gets reference to the igValidator widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets reference to the target of the message.
    */
  var target: js.UndefOr[String] = js.undefined
}
object SuccessShowingEventUIParam {
  
  inline def apply(): SuccessShowingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessShowingEventUIParam]
  }
  
  extension [Self <: SuccessShowingEventUIParam](x: Self) {
    
    inline def setFieldOptions(value: Any): Self = StObject.set(x, "fieldOptions", value.asInstanceOf[js.Any])
    
    inline def setFieldOptionsUndefined: Self = StObject.set(x, "fieldOptions", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
