package typings.ltijs

import typings.ltijs.anon.Documenttarget
import typings.ltijs.anon.Label
import typings.ltijs.anon.Title
import typings.ltijs.ltijsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsPlatformMod {
  
  @js.native
  trait Platform extends StObject {
    
    def platformAccessToken(scopes: String): js.Promise[String | `false`] = js.native
    
    def platformAccessTokenEndpoint(): js.Promise[String | Boolean] = js.native
    def platformAccessTokenEndpoint(accesstokenEndpoint: String): js.Promise[String | Boolean] = js.native
    
    def platformAuthConfig(method: String, key: String): js.Promise[PlatformAuthConfig | Boolean] = js.native
    
    def platformAuthEndpoint(): js.Promise[String | Boolean] = js.native
    def platformAuthEndpoint(authEndpoint: String): js.Promise[String | Boolean] = js.native
    
    def platformClientId(): js.Promise[String | Boolean] = js.native
    def platformClientId(clientId: String): js.Promise[String | Boolean] = js.native
    
    def platformKid(): String = js.native
    
    def platformName(): js.Promise[String | Boolean] = js.native
    def platformName(name: String): js.Promise[String | Boolean] = js.native
    
    def platformPrivateKey(): js.Promise[String | `false`] = js.native
    
    def platformPublicKey(): js.Promise[String | `false`] = js.native
    
    def platformUrl(): js.Promise[String | Boolean] = js.native
    def platformUrl(url: String): js.Promise[String | Boolean] = js.native
    
    def remove(): js.Promise[Boolean] = js.native
  }
  
  trait PlatformAuthConfig extends StObject {
    
    var key: String
    
    var method: String
  }
  object PlatformAuthConfig {
    
    inline def apply(key: String, method: String): PlatformAuthConfig = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlatformAuthConfig]
    }
    
    extension [Self <: PlatformAuthConfig](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlatformConfig extends StObject {
    
    var accesstokenEndpoint: String
    
    var authConfig: PlatformAuthConfig
    
    var authenticationEndpoint: String
    
    var clientId: String
    
    var name: String
    
    var url: String
  }
  object PlatformConfig {
    
    inline def apply(
      accesstokenEndpoint: String,
      authConfig: PlatformAuthConfig,
      authenticationEndpoint: String,
      clientId: String,
      name: String,
      url: String
    ): PlatformConfig = {
      val __obj = js.Dynamic.literal(accesstokenEndpoint = accesstokenEndpoint.asInstanceOf[js.Any], authConfig = authConfig.asInstanceOf[js.Any], authenticationEndpoint = authenticationEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlatformConfig]
    }
    
    extension [Self <: PlatformConfig](x: Self) {
      
      inline def setAccesstokenEndpoint(value: String): Self = StObject.set(x, "accesstokenEndpoint", value.asInstanceOf[js.Any])
      
      inline def setAuthConfig(value: PlatformAuthConfig): Self = StObject.set(x, "authConfig", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationEndpoint(value: String): Self = StObject.set(x, "authenticationEndpoint", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlatformContext extends StObject {
    
    var __id: String
    
    var __v: Double
    
    var context: Label
    
    var createdAt: js.Date
    
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
    var custom: Any
    
    var deploymentId: String
    
    var launchPresentation: Documenttarget
    
    var messageType: String
    
    var path: String
    
    var resource: Title
    
    var targetLinkUri: String
    
    var user: String
    
    var version: String
  }
  object PlatformContext {
    
    inline def apply(
      __id: String,
      __v: Double,
      context: Label,
      createdAt: js.Date,
      custom: Any,
      deploymentId: String,
      launchPresentation: Documenttarget,
      messageType: String,
      path: String,
      resource: Title,
      targetLinkUri: String,
      user: String,
      version: String
    ): PlatformContext = {
      val __obj = js.Dynamic.literal(__id = __id.asInstanceOf[js.Any], __v = __v.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], launchPresentation = launchPresentation.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], targetLinkUri = targetLinkUri.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlatformContext]
    }
    
    extension [Self <: PlatformContext](x: Self) {
      
      inline def setContext(value: Label): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setCustom(value: Any): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
      
      inline def setLaunchPresentation(value: Documenttarget): Self = StObject.set(x, "launchPresentation", value.asInstanceOf[js.Any])
      
      inline def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setResource(value: Title): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setTargetLinkUri(value: String): Self = StObject.set(x, "targetLinkUri", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def set__id(value: String): Self = StObject.set(x, "__id", value.asInstanceOf[js.Any])
      
      inline def set__v(value: Double): Self = StObject.set(x, "__v", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlatformInfo extends StObject {
    
    var description: String
    
    var family_code: String
    
    var name: String
    
    var version: String
  }
  object PlatformInfo {
    
    inline def apply(description: String, family_code: String, name: String, version: String): PlatformInfo = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], family_code = family_code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlatformInfo]
    }
    
    extension [Self <: PlatformInfo](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setFamily_code(value: String): Self = StObject.set(x, "family_code", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
