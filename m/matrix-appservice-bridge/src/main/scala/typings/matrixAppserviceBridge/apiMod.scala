package typings.matrixAppserviceBridge

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Application_
import typings.express.mod.NextFunction
import typings.express.mod.Response_
import typings.express.mod.Router
import typings.expressRateLimit.mod.Options
import typings.matrixAppserviceBridge.provisioningMod.ProvisioningRequest
import typings.matrixAppserviceBridge.provisioningRequestMod.Methods
import typings.matrixAppserviceBridge.storeMod.ProvisioningStore
import typings.node.urlMod.URL_
import typings.qs.mod.ParsedQs
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  @JSImport("matrix-appservice-bridge/lib/provisioning/api", "DefaultDisallowedIpRanges")
  @js.native
  val DefaultDisallowedIpRanges: js.Array[String] = js.native
  
  @JSImport("matrix-appservice-bridge/lib/provisioning/api", "ProvisioningApi")
  @js.native
  open class ProvisioningApi protected () extends StObject {
    def this(store: ProvisioningStore) = this()
    def this(store: ProvisioningStore, opts: ProvisioningApiOpts) = this()
    
    def addRoute(
      method: Methods,
      path: String,
      handler: js.Function3[
          /* req */ ProvisioningRequest[StringDictionary[String], Any, Any, ParsedQs], 
          /* res */ Response_[Any, Record[String, Any]], 
          /* next */ js.UndefOr[NextFunction], 
          Unit | js.Promise[Unit]
        ]
    ): Unit = js.native
    def addRoute(
      method: Methods,
      path: String,
      handler: js.Function3[
          /* req */ ProvisioningRequest[StringDictionary[String], Any, Any, ParsedQs], 
          /* res */ Response_[Any, Record[String, Any]], 
          /* next */ js.UndefOr[NextFunction], 
          Unit | js.Promise[Unit]
        ],
      fnName: String
    ): Unit = js.native
    
    /* private */ var app: Any = js.native
    
    /* private */ var authenticateRequest: Any = js.native
    
    /* protected */ var baseRoute: Router = js.native
    
    /* private */ var checkIpBlacklist: Any = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    /* private */ var deleteAllSessions: Any = js.native
    
    /* private */ var deleteSession: Any = js.native
    
    /* private */ val disallowedIpRanges: Any = js.native
    
    /* private */ var getHealth: Any = js.native
    
    /* private */ var getSession: Any = js.native
    
    /* private */ var onError: Any = js.native
    
    /* private */ var opts: Any = js.native
    
    /* private */ var postExchangeOpenId: Any = js.native
    
    /* private */ var server: Any = js.native
    
    def start(port: Double): js.Promise[Unit] = js.native
    def start(port: Double, hostname: String): js.Promise[Unit] = js.native
    def start(port: Double, hostname: String, backlog: Double): js.Promise[Unit] = js.native
    def start(port: Double, hostname: Unit, backlog: Double): js.Promise[Unit] = js.native
    
    /* protected */ var store: ProvisioningStore = js.native
    
    /* private */ val wellknown: Any = js.native
    
    /* private */ val widgetTokenLifetimeMs: Any = js.native
    
    /* private */ val widgetTokenPrefix: Any = js.native
  }
  
  trait ExchangeOpenAPIRequestBody extends StObject {
    
    var matrixServer: String
    
    var openIdToken: String
  }
  object ExchangeOpenAPIRequestBody {
    
    inline def apply(matrixServer: String, openIdToken: String): ExchangeOpenAPIRequestBody = {
      val __obj = js.Dynamic.literal(matrixServer = matrixServer.asInstanceOf[js.Any], openIdToken = openIdToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExchangeOpenAPIRequestBody]
    }
    
    extension [Self <: ExchangeOpenAPIRequestBody](x: Self) {
      
      inline def setMatrixServer(value: String): Self = StObject.set(x, "matrixServer", value.asInstanceOf[js.Any])
      
      inline def setOpenIdToken(value: String): Self = StObject.set(x, "openIdToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExchangeOpenAPIResponseBody extends StObject {
    
    var token: String
    
    var userId: String
  }
  object ExchangeOpenAPIResponseBody {
    
    inline def apply(token: String, userId: String): ExchangeOpenAPIResponseBody = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExchangeOpenAPIResponseBody]
    }
    
    extension [Self <: ExchangeOpenAPIResponseBody](x: Self) {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProvisioningApiOpts extends StObject {
    
    /**
      * Prefix to use for the API. E.g. `/api` in `/api/v1/session`
      *
      * Default is `/api`.
      */
    var apiPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * Disallow these IP ranges from being hit when handling OpenID requests. By default, a number of
      * intenal ranges are blocked.
      * @see DefaultDisallowedIpRanges
      */
    var disallowedIpRanges: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Provide an existing express app to bind to.
      *
      * Note: start() and close() will no-op when this is used.
      */
    var expressApp: js.UndefOr[Application_] = js.undefined
    
    /**
      * A set of Matrix server names to override the well known response to. Should
      * only be used for testing.
      */
    var openIdOverride: js.UndefOr[StringDictionary[URL_]] = js.undefined
    
    /**
      * Secret token for provisioning requests
      */
    var provisioningToken: js.UndefOr[String] = js.undefined
    
    /**
      * Options for ratelimiting requests to the api server. Does not affect
      * static content loading.
      */
    var ratelimit: js.UndefOr[Boolean | Options] = js.undefined
    
    /**
      * Where are the files stored for the widget frontend. If undefined, do not host a frontend.
      */
    var widgetFrontendLocation: js.UndefOr[String] = js.undefined
    
    /**
      * How long should a widget token last for?
      */
    var widgetTokenLifetimeMs: js.UndefOr[Double] = js.undefined
    
    /**
      * For widget tokens, use this prefix.
      */
    var widgetTokenPrefix: js.UndefOr[String] = js.undefined
  }
  object ProvisioningApiOpts {
    
    inline def apply(): ProvisioningApiOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProvisioningApiOpts]
    }
    
    extension [Self <: ProvisioningApiOpts](x: Self) {
      
      inline def setApiPrefix(value: String): Self = StObject.set(x, "apiPrefix", value.asInstanceOf[js.Any])
      
      inline def setApiPrefixUndefined: Self = StObject.set(x, "apiPrefix", js.undefined)
      
      inline def setDisallowedIpRanges(value: js.Array[String]): Self = StObject.set(x, "disallowedIpRanges", value.asInstanceOf[js.Any])
      
      inline def setDisallowedIpRangesUndefined: Self = StObject.set(x, "disallowedIpRanges", js.undefined)
      
      inline def setDisallowedIpRangesVarargs(value: String*): Self = StObject.set(x, "disallowedIpRanges", js.Array(value*))
      
      inline def setExpressApp(value: Application_): Self = StObject.set(x, "expressApp", value.asInstanceOf[js.Any])
      
      inline def setExpressAppUndefined: Self = StObject.set(x, "expressApp", js.undefined)
      
      inline def setOpenIdOverride(value: StringDictionary[URL_]): Self = StObject.set(x, "openIdOverride", value.asInstanceOf[js.Any])
      
      inline def setOpenIdOverrideUndefined: Self = StObject.set(x, "openIdOverride", js.undefined)
      
      inline def setProvisioningToken(value: String): Self = StObject.set(x, "provisioningToken", value.asInstanceOf[js.Any])
      
      inline def setProvisioningTokenUndefined: Self = StObject.set(x, "provisioningToken", js.undefined)
      
      inline def setRatelimit(value: Boolean | Options): Self = StObject.set(x, "ratelimit", value.asInstanceOf[js.Any])
      
      inline def setRatelimitUndefined: Self = StObject.set(x, "ratelimit", js.undefined)
      
      inline def setWidgetFrontendLocation(value: String): Self = StObject.set(x, "widgetFrontendLocation", value.asInstanceOf[js.Any])
      
      inline def setWidgetFrontendLocationUndefined: Self = StObject.set(x, "widgetFrontendLocation", js.undefined)
      
      inline def setWidgetTokenLifetimeMs(value: Double): Self = StObject.set(x, "widgetTokenLifetimeMs", value.asInstanceOf[js.Any])
      
      inline def setWidgetTokenLifetimeMsUndefined: Self = StObject.set(x, "widgetTokenLifetimeMs", js.undefined)
      
      inline def setWidgetTokenPrefix(value: String): Self = StObject.set(x, "widgetTokenPrefix", value.asInstanceOf[js.Any])
      
      inline def setWidgetTokenPrefixUndefined: Self = StObject.set(x, "widgetTokenPrefix", js.undefined)
    }
  }
}
