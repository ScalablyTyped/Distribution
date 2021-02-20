package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The period during which some deployable was active in a runtime.
  */
@js.native
trait SchemaDeployment extends StObject {
  
  /**
    * Address of the runtime element hosting this deployment.
    */
  var address: js.UndefOr[String] = js.native
  
  /**
    * Configuration used to create this deployment.
    */
  var config: js.UndefOr[String] = js.native
  
  /**
    * Required. Beginning of the lifetime of this deployment.
    */
  var deployTime: js.UndefOr[String] = js.native
  
  /**
    * Platform hosting this deployment.
    */
  var platform: js.UndefOr[String] = js.native
  
  /**
    * Output only. Resource URI for the artifact being deployed taken from the
    * deployable field with the same name.
    */
  var resourceUri: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * End of the lifetime of this deployment.
    */
  var undeployTime: js.UndefOr[String] = js.native
  
  /**
    * Identity of the user that triggered this deployment.
    */
  var userEmail: js.UndefOr[String] = js.native
}
object SchemaDeployment {
  
  @scala.inline
  def apply(): SchemaDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeployment]
  }
  
  @scala.inline
  implicit class SchemaDeploymentMutableBuilder[Self <: SchemaDeployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setDeployTime(value: String): Self = StObject.set(x, "deployTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployTimeUndefined: Self = StObject.set(x, "deployTime", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setResourceUri(value: js.Array[String]): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
    
    @scala.inline
    def setResourceUriVarargs(value: String*): Self = StObject.set(x, "resourceUri", js.Array(value :_*))
    
    @scala.inline
    def setUndeployTime(value: String): Self = StObject.set(x, "undeployTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndeployTimeUndefined: Self = StObject.set(x, "undeployTime", js.undefined)
    
    @scala.inline
    def setUserEmail(value: String): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEmailUndefined: Self = StObject.set(x, "userEmail", js.undefined)
  }
}
