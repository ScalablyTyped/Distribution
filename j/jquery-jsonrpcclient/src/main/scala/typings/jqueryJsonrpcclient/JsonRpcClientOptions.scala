package typings.jqueryJsonrpcclient

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery.AjaxSettings
import typings.std.CloseEvent
import typings.std.Event
import typings.std.MessageEvent
import typings.std.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonRpcClientOptions
  extends AjaxSettings[js.Any] {
  
  var ajaxUrl: String = js.native
  
  var getSockect: js.UndefOr[js.Function1[/* onmessageCb */ js.Function0[Unit], WebSocket]] = js.native
  
  @JSName("headers")
  var headers_JsonRpcClientOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var onclose: js.UndefOr[js.Function1[/* ev */ CloseEvent, Unit]] = js.native
  
  var onerror: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  
  var onmessage: js.UndefOr[js.Function1[/* ev */ MessageEvent[_], Unit]] = js.native
  
  var onopen: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  
  var socketUrl: js.UndefOr[String] = js.native
}
object JsonRpcClientOptions {
  
  @scala.inline
  def apply(ajaxUrl: String): JsonRpcClientOptions = {
    val __obj = js.Dynamic.literal(ajaxUrl = ajaxUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonRpcClientOptions]
  }
  
  @scala.inline
  implicit class JsonRpcClientOptionsOps[Self <: JsonRpcClientOptions] (val x: Self) extends AnyVal {
    
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
    def setAjaxUrl(value: String): Self = this.set("ajaxUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSockect(value: /* onmessageCb */ js.Function0[Unit] => WebSocket): Self = this.set("getSockect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetSockect: Self = this.set("getSockect", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[js.Any]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setOnclose(value: /* ev */ CloseEvent => Unit): Self = this.set("onclose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnclose: Self = this.set("onclose", js.undefined)
    
    @scala.inline
    def setOnerror(value: /* ev */ Event => Unit): Self = this.set("onerror", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    
    @scala.inline
    def setOnmessage(value: /* ev */ MessageEvent[_] => Unit): Self = this.set("onmessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnmessage: Self = this.set("onmessage", js.undefined)
    
    @scala.inline
    def setOnopen(value: /* ev */ Event => Unit): Self = this.set("onopen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnopen: Self = this.set("onopen", js.undefined)
    
    @scala.inline
    def setSocketUrl(value: String): Self = this.set("socketUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketUrl: Self = this.set("socketUrl", js.undefined)
  }
}
