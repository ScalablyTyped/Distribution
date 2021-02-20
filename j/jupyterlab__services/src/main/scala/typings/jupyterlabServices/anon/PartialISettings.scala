package typings.jupyterlabServices.anon

import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jupyterlab/services.@jupyterlab/services/lib/serverconnection.ServerConnection.ISettings> */
@js.native
trait PartialISettings extends StObject {
  
  var Headers: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Headers */ js.Any
  ] = js.native
  
  var Request: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Request */ js.Any
  ] = js.native
  
  var WebSocket: js.UndefOr[TypeofWebSocket] = js.native
  
  var appUrl: js.UndefOr[String] = js.native
  
  var baseUrl: js.UndefOr[String] = js.native
  
  var fetch: js.UndefOr[
    js.Function2[/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit], js.Promise[Response]]
  ] = js.native
  
  var init: js.UndefOr[RequestInit] = js.native
  
  var token: js.UndefOr[String] = js.native
  
  var wsUrl: js.UndefOr[String] = js.native
}
object PartialISettings {
  
  @scala.inline
  def apply(): PartialISettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialISettings]
  }
  
  @scala.inline
  implicit class PartialISettingsMutableBuilder[Self <: PartialISettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppUrl(value: String): Self = StObject.set(x, "appUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppUrlUndefined: Self = StObject.set(x, "appUrl", js.undefined)
    
    @scala.inline
    def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    @scala.inline
    def setFetch(value: (/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit]) => js.Promise[Response]): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
    
    @scala.inline
    def setHeaders(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Headers */ js.Any): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "Headers", js.undefined)
    
    @scala.inline
    def setInit(value: RequestInit): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setRequest(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Request */ js.Any): Self = StObject.set(x, "Request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "Request", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    @scala.inline
    def setWebSocket(value: TypeofWebSocket): Self = StObject.set(x, "WebSocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebSocketUndefined: Self = StObject.set(x, "WebSocket", js.undefined)
    
    @scala.inline
    def setWsUrl(value: String): Self = StObject.set(x, "wsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWsUrlUndefined: Self = StObject.set(x, "wsUrl", js.undefined)
  }
}
