package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Environment. Note that a user can create,
  * delete and update environments of type USER, but can only update the
  * enable_debug and url fields of environments of other types.
  */
trait SchemaEnvironment extends StObject {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The environment authorization code.
    */
  var authorizationCode: js.UndefOr[String] = js.undefined
  
  /**
    * The last update time-stamp for the authorization code.
    */
  var authorizationTimestampMs: js.UndefOr[String] = js.undefined
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.undefined
  
  var containerVersionId: js.UndefOr[String] = js.undefined
  
  /**
    * The environment description. Can be set or changed only on USER type
    * environments.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not to enable debug by default on for the environment.
    */
  var enableDebug: js.UndefOr[Boolean] = js.undefined
  
  /**
    * GTM Environment ID uniquely identifies the GTM Environment.
    */
  var environmentId: js.UndefOr[String] = js.undefined
  
  /**
    * The fingerprint of the GTM environment as computed at storage time. This
    * value is recomputed whenever the environment is modified.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * The environment display name. Can be set or changed only on USER type
    * environments.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The type of this environment.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Default preview page url for the environment.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaEnvironment {
  
  @scala.inline
  def apply(): SchemaEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironment]
  }
  
  @scala.inline
  implicit class SchemaEnvironmentMutableBuilder[Self <: SchemaEnvironment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAuthorizationCode(value: String): Self = StObject.set(x, "authorizationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationCodeUndefined: Self = StObject.set(x, "authorizationCode", js.undefined)
    
    @scala.inline
    def setAuthorizationTimestampMs(value: String): Self = StObject.set(x, "authorizationTimestampMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationTimestampMsUndefined: Self = StObject.set(x, "authorizationTimestampMs", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    @scala.inline
    def setContainerVersionId(value: String): Self = StObject.set(x, "containerVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerVersionIdUndefined: Self = StObject.set(x, "containerVersionId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnableDebug(value: Boolean): Self = StObject.set(x, "enableDebug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDebugUndefined: Self = StObject.set(x, "enableDebug", js.undefined)
    
    @scala.inline
    def setEnvironmentId(value: String): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentIdUndefined: Self = StObject.set(x, "environmentId", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
