package typings.googleapis.dnsV2Mod.dnsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedZoneDnsSecConfig extends StObject {
  
  /**
    * Specifies parameters for generating initial DnsKeys for this ManagedZone. Can only be changed while the state is OFF.
    */
  var defaultKeySpecs: js.UndefOr[js.Array[SchemaDnsKeySpec]] = js.undefined
  
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the mechanism for authenticated denial-of-existence responses. Can only be changed while the state is OFF.
    */
  var nonExistence: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies whether DNSSEC is enabled, and what mode it is in.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaManagedZoneDnsSecConfig {
  
  inline def apply(): SchemaManagedZoneDnsSecConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZoneDnsSecConfig]
  }
  
  extension [Self <: SchemaManagedZoneDnsSecConfig](x: Self) {
    
    inline def setDefaultKeySpecs(value: js.Array[SchemaDnsKeySpec]): Self = StObject.set(x, "defaultKeySpecs", value.asInstanceOf[js.Any])
    
    inline def setDefaultKeySpecsUndefined: Self = StObject.set(x, "defaultKeySpecs", js.undefined)
    
    inline def setDefaultKeySpecsVarargs(value: SchemaDnsKeySpec*): Self = StObject.set(x, "defaultKeySpecs", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNonExistence(value: String): Self = StObject.set(x, "nonExistence", value.asInstanceOf[js.Any])
    
    inline def setNonExistenceNull: Self = StObject.set(x, "nonExistence", null)
    
    inline def setNonExistenceUndefined: Self = StObject.set(x, "nonExistence", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
