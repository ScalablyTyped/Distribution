package typings.ltijs

import typings.express.mod.Express
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.Application
import typings.ltijs.anon.Cert
import typings.ltijs.anon.Method
import typings.ltijs.anon.SameSite
import typings.ltijs.databaseMod.DatabaseOptions
import typings.ltijs.deepLinkingMod.DeepLinkingService
import typings.ltijs.gradeServiceMod.GradeService
import typings.ltijs.idTokenMod.IdToken
import typings.ltijs.ltijsBooleans.`false`
import typings.ltijs.ltijsBooleans.`true`
import typings.ltijs.namesAndRolesMod.NamesAndRolesService
import typings.ltijs.platformMod.Platform
import typings.ltijs.platformMod.PlatformConfig
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  @JSImport("ltijs/lib/Provider/Provider", "Provider")
  @js.native
  open class Provider protected () extends StObject {
    def this(encryptionKey: String, database: DatabaseOptions) = this()
    def this(encryptionKey: String, database: DatabaseOptions, options: ProviderOptions) = this()
    
    var Database: typings.ltijs.databaseMod.Database = js.native
    
    var DeepLinking: DeepLinkingService = js.native
    
    var Grade: GradeService = js.native
    
    var NamesAndRoles: NamesAndRolesService = js.native
    
    def app(): Application = js.native
    
    def appUrl(): String = js.native
    
    @JSName("app")
    var app_Original: Express = js.native
    
    def close(): js.Promise[Boolean] = js.native
    
    def deletePlatform(url: String): js.Promise[Boolean] = js.native
    
    def deploy(): js.Promise[js.UndefOr[`true`]] = js.native
    def deploy(options: DeploymentOptions): js.Promise[js.UndefOr[`true`]] = js.native
    
    def getAllPlatforms(): js.Promise[js.Array[Platform] | `false`] = js.native
    
    def getPlatform(url: String): js.Promise[Platform | `false`] = js.native
    
    def invalidTokenUrl(): String = js.native
    
    def keysetUrl(): String = js.native
    
    def loginUrl(): String = js.native
    
    def onConnect(_connectCallback: OnConnectCallback): `true` = js.native
    def onConnect(_connectCallback: OnConnectCallback, options: OnConnectOptions): `true` = js.native
    
    def onDeepLinking(_connectCallback: OnConnectCallback): `true` = js.native
    def onDeepLinking(_connectCallback: OnConnectCallback, options: OnConnectOptions): `true` = js.native
    
    def redirect(response: Response_[Any, Record[String, Any]], path: String): Unit = js.native
    def redirect(response: Response_[Any, Record[String, Any]], path: String, options: RedirectOptions): Unit = js.native
    
    def registerPlatform(config: PlatformConfig): js.Promise[Platform | `false`] = js.native
    
    def sessionTimeoutUrl(): String = js.native
    
    def whitelist(urls: (String | Method)*): `true` = js.native
  }
  
  trait DeploymentOptions extends StObject {
    
    var port: js.UndefOr[Double] = js.undefined
    
    var serverless: js.UndefOr[Boolean] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object DeploymentOptions {
    
    inline def apply(): DeploymentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentOptions]
    }
    
    extension [Self <: DeploymentOptions](x: Self) {
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setServerless(value: Boolean): Self = StObject.set(x, "serverless", value.asInstanceOf[js.Any])
      
      inline def setServerlessUndefined: Self = StObject.set(x, "serverless", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  type OnConnectCallback = js.Function4[
    /* connection */ IdToken, 
    /* request */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* response */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    (Response_[Any, Record[String, Any]]) | Unit
  ]
  
  trait OnConnectOptions extends StObject {
    
    var invalidToken: js.UndefOr[
        js.Function2[
          /* request */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* response */ Response_[Any, Record[String, Any]], 
          Response_[Any, Record[String, Any]]
        ]
      ] = js.undefined
    
    var sessionTimeout: js.UndefOr[
        js.Function2[
          /* request */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* response */ Response_[Any, Record[String, Any]], 
          Response_[Any, Record[String, Any]]
        ]
      ] = js.undefined
  }
  object OnConnectOptions {
    
    inline def apply(): OnConnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnConnectOptions]
    }
    
    extension [Self <: OnConnectOptions](x: Self) {
      
      inline def setInvalidToken(
        value: (/* request */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* response */ Response_[Any, Record[String, Any]]) => Response_[Any, Record[String, Any]]
      ): Self = StObject.set(x, "invalidToken", js.Any.fromFunction2(value))
      
      inline def setInvalidTokenUndefined: Self = StObject.set(x, "invalidToken", js.undefined)
      
      inline def setSessionTimeout(
        value: (/* request */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* response */ Response_[Any, Record[String, Any]]) => Response_[Any, Record[String, Any]]
      ): Self = StObject.set(x, "sessionTimeout", js.Any.fromFunction2(value))
      
      inline def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
    }
  }
  
  trait ProviderOptions extends StObject {
    
    var appUrl: js.UndefOr[String] = js.undefined
    
    var cookies: js.UndefOr[SameSite] = js.undefined
    
    var cors: js.UndefOr[Boolean] = js.undefined
    
    var https: js.UndefOr[Boolean] = js.undefined
    
    var invalidTokenUrl: js.UndefOr[String] = js.undefined
    
    var keysetUrl: js.UndefOr[String] = js.undefined
    
    var logger: js.UndefOr[Boolean] = js.undefined
    
    var loginUrl: js.UndefOr[String] = js.undefined
    
    var serverAddon: js.UndefOr[ServerAddonFunction] = js.undefined
    
    var sessionTimeoutUrl: js.UndefOr[String] = js.undefined
    
    var ssl: js.UndefOr[Cert] = js.undefined
    
    var staticPath: js.UndefOr[String] = js.undefined
  }
  object ProviderOptions {
    
    inline def apply(): ProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProviderOptions]
    }
    
    extension [Self <: ProviderOptions](x: Self) {
      
      inline def setAppUrl(value: String): Self = StObject.set(x, "appUrl", value.asInstanceOf[js.Any])
      
      inline def setAppUrlUndefined: Self = StObject.set(x, "appUrl", js.undefined)
      
      inline def setCookies(value: SameSite): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setCors(value: Boolean): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
      
      inline def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      inline def setInvalidTokenUrl(value: String): Self = StObject.set(x, "invalidTokenUrl", value.asInstanceOf[js.Any])
      
      inline def setInvalidTokenUrlUndefined: Self = StObject.set(x, "invalidTokenUrl", js.undefined)
      
      inline def setKeysetUrl(value: String): Self = StObject.set(x, "keysetUrl", value.asInstanceOf[js.Any])
      
      inline def setKeysetUrlUndefined: Self = StObject.set(x, "keysetUrl", js.undefined)
      
      inline def setLogger(value: Boolean): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setLoginUrl(value: String): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
      
      inline def setLoginUrlUndefined: Self = StObject.set(x, "loginUrl", js.undefined)
      
      inline def setServerAddon(value: /* app */ Express => Unit): Self = StObject.set(x, "serverAddon", js.Any.fromFunction1(value))
      
      inline def setServerAddonUndefined: Self = StObject.set(x, "serverAddon", js.undefined)
      
      inline def setSessionTimeoutUrl(value: String): Self = StObject.set(x, "sessionTimeoutUrl", value.asInstanceOf[js.Any])
      
      inline def setSessionTimeoutUrlUndefined: Self = StObject.set(x, "sessionTimeoutUrl", js.undefined)
      
      inline def setSsl(value: Cert): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      inline def setStaticPath(value: String): Self = StObject.set(x, "staticPath", value.asInstanceOf[js.Any])
      
      inline def setStaticPathUndefined: Self = StObject.set(x, "staticPath", js.undefined)
    }
  }
  
  trait RedirectOptions extends StObject {
    
    var ignoreRoot: js.UndefOr[Boolean] = js.undefined
    
    var isNewResource: js.UndefOr[Boolean] = js.undefined
  }
  object RedirectOptions {
    
    inline def apply(): RedirectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedirectOptions]
    }
    
    extension [Self <: RedirectOptions](x: Self) {
      
      inline def setIgnoreRoot(value: Boolean): Self = StObject.set(x, "ignoreRoot", value.asInstanceOf[js.Any])
      
      inline def setIgnoreRootUndefined: Self = StObject.set(x, "ignoreRoot", js.undefined)
      
      inline def setIsNewResource(value: Boolean): Self = StObject.set(x, "isNewResource", value.asInstanceOf[js.Any])
      
      inline def setIsNewResourceUndefined: Self = StObject.set(x, "isNewResource", js.undefined)
    }
  }
  
  type ServerAddonFunction = js.Function1[/* app */ Express, Unit]
}
