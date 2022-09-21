package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMaintenanceExclusionOptions extends StObject {
  
  /**
    * Scope specifies the upgrade scope which upgrades are blocked by the exclusion.
    */
  var scope: js.UndefOr[String | Null] = js.undefined
}
object SchemaMaintenanceExclusionOptions {
  
  inline def apply(): SchemaMaintenanceExclusionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaintenanceExclusionOptions]
  }
  
  extension [Self <: SchemaMaintenanceExclusionOptions](x: Self) {
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
