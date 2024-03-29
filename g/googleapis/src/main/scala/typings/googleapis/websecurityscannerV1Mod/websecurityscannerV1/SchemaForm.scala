package typings.googleapis.websecurityscannerV1Mod.websecurityscannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaForm extends StObject {
  
  /**
    * ! The URI where to send the form when it's submitted.
    */
  var actionUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ! The names of form fields related to the vulnerability.
    */
  var fields: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaForm {
  
  inline def apply(): SchemaForm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForm]
  }
  
  extension [Self <: SchemaForm](x: Self) {
    
    inline def setActionUri(value: String): Self = StObject.set(x, "actionUri", value.asInstanceOf[js.Any])
    
    inline def setActionUriNull: Self = StObject.set(x, "actionUri", null)
    
    inline def setActionUriUndefined: Self = StObject.set(x, "actionUri", js.undefined)
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
