package typings.ltijs

import typings.ltijs.anon.Documenttarget
import typings.ltijs.anon.Label
import typings.ltijs.anon.Title
import typings.ltijs.ltijsBooleans.`false`
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformMod {
  
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
  
  @js.native
  trait PlatformAuthConfig extends StObject {
    
    var key: String = js.native
    
    var method: String = js.native
  }
  object PlatformAuthConfig {
    
    @scala.inline
    def apply(key: String, method: String): PlatformAuthConfig = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlatformAuthConfig]
    }
    
    @scala.inline
    implicit class PlatformAuthConfigMutableBuilder[Self <: PlatformAuthConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PlatformConfig extends StObject {
    
    var accesstokenEndpoint: String = js.native
    
    var authConfig: PlatformAuthConfig = js.native
    
    var authenticationEndpoint: String = js.native
    
    var clientId: String = js.native
    
    var name: String = js.native
    
    var url: String = js.native
  }
  object PlatformConfig {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class PlatformConfigMutableBuilder[Self <: PlatformConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccesstokenEndpoint(value: String): Self = StObject.set(x, "accesstokenEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthConfig(value: PlatformAuthConfig): Self = StObject.set(x, "authConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticationEndpoint(value: String): Self = StObject.set(x, "authenticationEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PlatformContext extends StObject {
    
    var __id: String = js.native
    
    var __v: Double = js.native
    
    var context: Label = js.native
    
    var createdAt: Date = js.native
    
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
    var custom: js.Any = js.native
    
    var deploymentId: String = js.native
    
    var launchPresentation: Documenttarget = js.native
    
    var messageType: String = js.native
    
    var path: String = js.native
    
    var resource: Title = js.native
    
    var targetLinkUri: String = js.native
    
    var user: String = js.native
    
    var version: String = js.native
  }
  object PlatformContext {
    
    @scala.inline
    def apply(
      __id: String,
      __v: Double,
      context: Label,
      createdAt: Date,
      custom: js.Any,
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
    
    @scala.inline
    implicit class PlatformContextMutableBuilder[Self <: PlatformContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: Label): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedAt(value: Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustom(value: js.Any): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchPresentation(value: Documenttarget): Self = StObject.set(x, "launchPresentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResource(value: Title): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetLinkUri(value: String): Self = StObject.set(x, "targetLinkUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__id(value: String): Self = StObject.set(x, "__id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__v(value: Double): Self = StObject.set(x, "__v", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PlatformInfo extends StObject {
    
    var description: String = js.native
    
    var family_code: String = js.native
    
    var name: String = js.native
    
    var version: String = js.native
  }
  object PlatformInfo {
    
    @scala.inline
    def apply(description: String, family_code: String, name: String, version: String): PlatformInfo = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], family_code = family_code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlatformInfo]
    }
    
    @scala.inline
    implicit class PlatformInfoMutableBuilder[Self <: PlatformInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamily_code(value: String): Self = StObject.set(x, "family_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
