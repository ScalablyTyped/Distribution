package typings.googleapis.smartdevicemanagementV1Mod.smartdevicemanagementV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse extends StObject {
  
  /**
    * The results of executing the command.
    */
  var results: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaGoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse {
  
  inline def apply(): SchemaGoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse]
  }
  
  extension [Self <: SchemaGoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse](x: Self) {
    
    inline def setResults(value: StringDictionary[Any]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsNull: Self = StObject.set(x, "results", null)
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
  }
}
