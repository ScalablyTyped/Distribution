package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityPolicyAdvancedOptionsConfig extends StObject {
  
  var jsonParsing: js.UndefOr[String] = js.undefined
  
  var logLevel: js.UndefOr[String] = js.undefined
}
object SecurityPolicyAdvancedOptionsConfig {
  
  inline def apply(): SecurityPolicyAdvancedOptionsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityPolicyAdvancedOptionsConfig]
  }
  
  extension [Self <: SecurityPolicyAdvancedOptionsConfig](x: Self) {
    
    inline def setJsonParsing(value: String): Self = StObject.set(x, "jsonParsing", value.asInstanceOf[js.Any])
    
    inline def setJsonParsingUndefined: Self = StObject.set(x, "jsonParsing", js.undefined)
    
    inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
  }
}
