package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import typings.std.global.Headers
import typings.std.global.Request
import typings.std.global.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jupyterlab/services.@jupyterlab/services/lib/serverconnection.ServerConnection.ISettings> */
@js.native
trait PartialISettings extends js.Object {
  
  var Headers: js.UndefOr[Instantiable with Instantiable0[typings.std.global.Headers]] = js.native
  
  var Request: js.UndefOr[
    InstantiableRequest with (Instantiable1[/* input */ RequestInfo, typings.std.global.Request])
  ] = js.native
  
  var WebSocket: js.UndefOr[CLOSED with (Instantiable1[/* url */ String, typings.std.global.WebSocket])] = js.native
  
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
  implicit class PartialISettingsOps[Self <: PartialISettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHeaders(value: Instantiable with Instantiable0[Headers]): Self = this.set("Headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("Headers", js.undefined)
    
    @scala.inline
    def setRequest(value: InstantiableRequest with (Instantiable1[/* input */ RequestInfo, Request])): Self = this.set("Request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("Request", js.undefined)
    
    @scala.inline
    def setWebSocket(value: CLOSED with (Instantiable1[/* url */ String, WebSocket])): Self = this.set("WebSocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebSocket: Self = this.set("WebSocket", js.undefined)
    
    @scala.inline
    def setAppUrl(value: String): Self = this.set("appUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppUrl: Self = this.set("appUrl", js.undefined)
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    
    @scala.inline
    def setFetch(value: (/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit]) => js.Promise[Response]): Self = this.set("fetch", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFetch: Self = this.set("fetch", js.undefined)
    
    @scala.inline
    def setInit(value: RequestInit): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setWsUrl(value: String): Self = this.set("wsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsUrl: Self = this.set("wsUrl", js.undefined)
  }
}
