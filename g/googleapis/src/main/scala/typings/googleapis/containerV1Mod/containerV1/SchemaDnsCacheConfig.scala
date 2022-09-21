package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDnsCacheConfig extends StObject {
  
  /**
    * Whether NodeLocal DNSCache is enabled for this cluster.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDnsCacheConfig {
  
  inline def apply(): SchemaDnsCacheConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDnsCacheConfig]
  }
  
  extension [Self <: SchemaDnsCacheConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
