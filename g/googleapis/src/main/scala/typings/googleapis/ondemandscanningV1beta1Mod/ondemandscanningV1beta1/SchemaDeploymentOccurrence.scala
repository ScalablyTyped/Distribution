package typings.googleapis.ondemandscanningV1beta1Mod.ondemandscanningV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeploymentOccurrence extends StObject {
  
  /**
    * Address of the runtime element hosting this deployment.
    */
  var address: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration used to create this deployment.
    */
  var config: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Beginning of the lifetime of this deployment.
    */
  var deployTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Platform hosting this deployment.
    */
  var platform: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource URI for the artifact being deployed taken from the deployable field with the same name.
    */
  var resourceUri: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * End of the lifetime of this deployment.
    */
  var undeployTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identity of the user that triggered this deployment.
    */
  var userEmail: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeploymentOccurrence {
  
  inline def apply(): SchemaDeploymentOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeploymentOccurrence]
  }
  
  extension [Self <: SchemaDeploymentOccurrence](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigNull: Self = StObject.set(x, "config", null)
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setDeployTime(value: String): Self = StObject.set(x, "deployTime", value.asInstanceOf[js.Any])
    
    inline def setDeployTimeNull: Self = StObject.set(x, "deployTime", null)
    
    inline def setDeployTimeUndefined: Self = StObject.set(x, "deployTime", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformNull: Self = StObject.set(x, "platform", null)
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setResourceUri(value: js.Array[String]): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriNull: Self = StObject.set(x, "resourceUri", null)
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
    
    inline def setResourceUriVarargs(value: String*): Self = StObject.set(x, "resourceUri", js.Array(value*))
    
    inline def setUndeployTime(value: String): Self = StObject.set(x, "undeployTime", value.asInstanceOf[js.Any])
    
    inline def setUndeployTimeNull: Self = StObject.set(x, "undeployTime", null)
    
    inline def setUndeployTimeUndefined: Self = StObject.set(x, "undeployTime", js.undefined)
    
    inline def setUserEmail(value: String): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
    
    inline def setUserEmailNull: Self = StObject.set(x, "userEmail", null)
    
    inline def setUserEmailUndefined: Self = StObject.set(x, "userEmail", js.undefined)
  }
}
