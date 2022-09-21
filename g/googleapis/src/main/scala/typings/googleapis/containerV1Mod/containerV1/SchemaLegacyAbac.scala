package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLegacyAbac extends StObject {
  
  /**
    * Whether the ABAC authorizer is enabled for this cluster. When enabled, identities in the system, including service accounts, nodes, and controllers, will have statically granted permissions beyond those provided by the RBAC configuration or IAM.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaLegacyAbac {
  
  inline def apply(): SchemaLegacyAbac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLegacyAbac]
  }
  
  extension [Self <: SchemaLegacyAbac](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
