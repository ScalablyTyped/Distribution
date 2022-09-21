package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentOccurrence extends StObject {
  
  /** Address of the runtime element hosting this deployment. */
  var address: js.UndefOr[String] = js.undefined
  
  /** Configuration used to create this deployment. */
  var config: js.UndefOr[String] = js.undefined
  
  /** Required. Beginning of the lifetime of this deployment. */
  var deployTime: js.UndefOr[String] = js.undefined
  
  /** Platform hosting this deployment. */
  var platform: js.UndefOr[String] = js.undefined
  
  /** Output only. Resource URI for the artifact being deployed taken from the deployable field with the same name. */
  var resourceUri: js.UndefOr[js.Array[String]] = js.undefined
  
  /** End of the lifetime of this deployment. */
  var undeployTime: js.UndefOr[String] = js.undefined
  
  /** Identity of the user that triggered this deployment. */
  var userEmail: js.UndefOr[String] = js.undefined
}
object DeploymentOccurrence {
  
  inline def apply(): DeploymentOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentOccurrence]
  }
  
  extension [Self <: DeploymentOccurrence](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setDeployTime(value: String): Self = StObject.set(x, "deployTime", value.asInstanceOf[js.Any])
    
    inline def setDeployTimeUndefined: Self = StObject.set(x, "deployTime", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setResourceUri(value: js.Array[String]): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
    
    inline def setResourceUriVarargs(value: String*): Self = StObject.set(x, "resourceUri", js.Array(value*))
    
    inline def setUndeployTime(value: String): Self = StObject.set(x, "undeployTime", value.asInstanceOf[js.Any])
    
    inline def setUndeployTimeUndefined: Self = StObject.set(x, "undeployTime", js.undefined)
    
    inline def setUserEmail(value: String): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
    
    inline def setUserEmailUndefined: Self = StObject.set(x, "userEmail", js.undefined)
  }
}
