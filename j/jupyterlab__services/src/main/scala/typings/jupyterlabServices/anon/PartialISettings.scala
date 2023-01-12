package typings.jupyterlabServices.anon

import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jupyterlab/services.@jupyterlab/services/lib/serverconnection.ServerConnection.ISettings> */
trait PartialISettings extends StObject {
  
  var Headers: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Headers */ Any
  ] = js.undefined
  
  var Request: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Request */ Any
  ] = js.undefined
  
  var WebSocket: js.UndefOr[TypeofWebSocket] = js.undefined
  
  var appUrl: js.UndefOr[String] = js.undefined
  
  var appendToken: js.UndefOr[Boolean] = js.undefined
  
  var baseUrl: js.UndefOr[String] = js.undefined
  
  var fetch: js.UndefOr[
    js.Function2[/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit], js.Promise[Response]]
  ] = js.undefined
  
  var init: js.UndefOr[RequestInit] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
  
  var wsUrl: js.UndefOr[String] = js.undefined
}
object PartialISettings {
  
  inline def apply(): PartialISettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialISettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialISettings] (val x: Self) extends AnyVal {
    
    inline def setAppUrl(value: String): Self = StObject.set(x, "appUrl", value.asInstanceOf[js.Any])
    
    inline def setAppUrlUndefined: Self = StObject.set(x, "appUrl", js.undefined)
    
    inline def setAppendToken(value: Boolean): Self = StObject.set(x, "appendToken", value.asInstanceOf[js.Any])
    
    inline def setAppendTokenUndefined: Self = StObject.set(x, "appendToken", js.undefined)
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setFetch(value: (/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit]) => js.Promise[Response]): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
    
    inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
    
    inline def setHeaders(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Headers */ Any): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "Headers", js.undefined)
    
    inline def setInit(value: RequestInit): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setRequest(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Request */ Any): Self = StObject.set(x, "Request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "Request", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setWebSocket(value: TypeofWebSocket): Self = StObject.set(x, "WebSocket", value.asInstanceOf[js.Any])
    
    inline def setWebSocketUndefined: Self = StObject.set(x, "WebSocket", js.undefined)
    
    inline def setWsUrl(value: String): Self = StObject.set(x, "wsUrl", value.asInstanceOf[js.Any])
    
    inline def setWsUrlUndefined: Self = StObject.set(x, "wsUrl", js.undefined)
  }
}
