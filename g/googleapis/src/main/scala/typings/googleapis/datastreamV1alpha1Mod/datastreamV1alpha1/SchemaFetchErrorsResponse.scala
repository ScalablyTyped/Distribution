package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFetchErrorsResponse extends StObject {
  
  /**
    * The list of errors on the Stream.
    */
  var errors: js.UndefOr[js.Array[SchemaError]] = js.undefined
}
object SchemaFetchErrorsResponse {
  
  inline def apply(): SchemaFetchErrorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFetchErrorsResponse]
  }
  
  extension [Self <: SchemaFetchErrorsResponse](x: Self) {
    
    inline def setErrors(value: js.Array[SchemaError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
