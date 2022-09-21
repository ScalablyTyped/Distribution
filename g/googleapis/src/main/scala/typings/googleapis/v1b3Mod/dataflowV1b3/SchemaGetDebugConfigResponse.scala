package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetDebugConfigResponse extends StObject {
  
  /**
    * The encoded debug configuration for the requested component.
    */
  var config: js.UndefOr[String | Null] = js.undefined
}
object SchemaGetDebugConfigResponse {
  
  inline def apply(): SchemaGetDebugConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetDebugConfigResponse]
  }
  
  extension [Self <: SchemaGetDebugConfigResponse](x: Self) {
    
    inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigNull: Self = StObject.set(x, "config", null)
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
  }
}
