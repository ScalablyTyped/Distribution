package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEgressControlConfig extends StObject {
  
  /**
    * Static Comma separated backends which are common for all Connection resources. Supported formats for each backend are host:port or just host (host can be ip address or domain name).
    */
  var backends: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Extractions Rules to extract the backends from customer provided configuration.
    */
  var extractionRules: js.UndefOr[SchemaExtractionRules] = js.undefined
}
object SchemaEgressControlConfig {
  
  inline def apply(): SchemaEgressControlConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEgressControlConfig]
  }
  
  extension [Self <: SchemaEgressControlConfig](x: Self) {
    
    inline def setBackends(value: String): Self = StObject.set(x, "backends", value.asInstanceOf[js.Any])
    
    inline def setBackendsNull: Self = StObject.set(x, "backends", null)
    
    inline def setBackendsUndefined: Self = StObject.set(x, "backends", js.undefined)
    
    inline def setExtractionRules(value: SchemaExtractionRules): Self = StObject.set(x, "extractionRules", value.asInstanceOf[js.Any])
    
    inline def setExtractionRulesUndefined: Self = StObject.set(x, "extractionRules", js.undefined)
  }
}
