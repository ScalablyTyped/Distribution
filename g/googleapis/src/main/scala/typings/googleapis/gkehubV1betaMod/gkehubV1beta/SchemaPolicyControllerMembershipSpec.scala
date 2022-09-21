package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPolicyControllerMembershipSpec extends StObject {
  
  /**
    * Policy Controller configuration for the cluster.
    */
  var policyControllerHubConfig: js.UndefOr[SchemaPolicyControllerHubConfig] = js.undefined
  
  /**
    * Version of Policy Controller installed.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaPolicyControllerMembershipSpec {
  
  inline def apply(): SchemaPolicyControllerMembershipSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyControllerMembershipSpec]
  }
  
  extension [Self <: SchemaPolicyControllerMembershipSpec](x: Self) {
    
    inline def setPolicyControllerHubConfig(value: SchemaPolicyControllerHubConfig): Self = StObject.set(x, "policyControllerHubConfig", value.asInstanceOf[js.Any])
    
    inline def setPolicyControllerHubConfigUndefined: Self = StObject.set(x, "policyControllerHubConfig", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
