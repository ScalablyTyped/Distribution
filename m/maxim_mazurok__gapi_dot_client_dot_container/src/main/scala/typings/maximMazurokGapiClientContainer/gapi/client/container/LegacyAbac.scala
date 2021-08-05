package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegacyAbac extends StObject {
  
  /**
    * Whether the ABAC authorizer is enabled for this cluster. When enabled, identities in the system, including service accounts, nodes, and controllers, will have statically granted
    * permissions beyond those provided by the RBAC configuration or IAM.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object LegacyAbac {
  
  inline def apply(): LegacyAbac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegacyAbac]
  }
  
  extension [Self <: LegacyAbac](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
