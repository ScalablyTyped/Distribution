package typings.googleapis.connectorsV2Mod.connectorsV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExecuteActionRequest extends StObject {
  
  /**
    * Parameters for executing the action. The parameters can be key/value pairs or nested structs.
    */
  var parameters: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaExecuteActionRequest {
  
  inline def apply(): SchemaExecuteActionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecuteActionRequest]
  }
  
  extension [Self <: SchemaExecuteActionRequest](x: Self) {
    
    inline def setParameters(value: StringDictionary[Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
