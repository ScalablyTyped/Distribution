package typings.googleapis.smartdevicemanagementV1Mod.smartdevicemanagementV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest extends StObject {
  
  /**
    * The command name to execute, represented by the fully qualified protobuf message name.
    */
  var command: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The command message to execute, represented as a Struct.
    */
  var params: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaGoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest {
  
  inline def apply(): SchemaGoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest]
  }
  
  extension [Self <: SchemaGoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandNull: Self = StObject.set(x, "command", null)
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setParams(value: StringDictionary[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsNull: Self = StObject.set(x, "params", null)
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
