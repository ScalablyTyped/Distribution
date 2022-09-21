package typings.googleapis.connectorsV2Mod.connectorsV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateEntitiesWithConditionsResponse extends StObject {
  
  /**
    * Response returned by the external system.
    */
  var response: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaUpdateEntitiesWithConditionsResponse {
  
  inline def apply(): SchemaUpdateEntitiesWithConditionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateEntitiesWithConditionsResponse]
  }
  
  extension [Self <: SchemaUpdateEntitiesWithConditionsResponse](x: Self) {
    
    inline def setResponse(value: StringDictionary[Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseNull: Self = StObject.set(x, "response", null)
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
