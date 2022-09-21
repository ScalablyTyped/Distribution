package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessScopes extends StObject {
  
  var forbidden: js.UndefOr[js.Array[String]] = js.undefined
  
  var required: js.UndefOr[js.Array[String]] = js.undefined
  
  var selection: js.UndefOr[js.Array[String]] = js.undefined
}
object AccessScopes {
  
  inline def apply(): AccessScopes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessScopes]
  }
  
  extension [Self <: AccessScopes](x: Self) {
    
    inline def setForbidden(value: js.Array[String]): Self = StObject.set(x, "forbidden", value.asInstanceOf[js.Any])
    
    inline def setForbiddenUndefined: Self = StObject.set(x, "forbidden", js.undefined)
    
    inline def setForbiddenVarargs(value: String*): Self = StObject.set(x, "forbidden", js.Array(value*))
    
    inline def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value*))
    
    inline def setSelection(value: js.Array[String]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    inline def setSelectionVarargs(value: String*): Self = StObject.set(x, "selection", js.Array(value*))
  }
}
