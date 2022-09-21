package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedZoneReverseLookupConfig extends StObject {
  
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaManagedZoneReverseLookupConfig {
  
  inline def apply(): SchemaManagedZoneReverseLookupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZoneReverseLookupConfig]
  }
  
  extension [Self <: SchemaManagedZoneReverseLookupConfig](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
