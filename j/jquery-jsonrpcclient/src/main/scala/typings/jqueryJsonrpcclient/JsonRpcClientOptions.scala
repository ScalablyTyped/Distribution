package typings.jqueryJsonrpcclient

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery.AjaxSettings
import typings.std.CloseEvent
import typings.std.Event
import typings.std.MessageEvent
import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
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
  implicit class JsonRpcClientOptionsMutableBuilder[Self <: JsonRpcClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAjaxUrl(value: String): Self = StObject.set(x, "ajaxUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSockect(value: /* onmessageCb */ js.Function0[Unit] => WebSocket): Self = StObject.set(x, "getSockect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSockectUndefined: Self = StObject.set(x, "getSockect", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOnclose(value: /* ev */ CloseEvent => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
    
    @scala.inline
    def setOnerror(value: /* ev */ Event => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    @scala.inline
    def setOnmessage(value: /* ev */ MessageEvent[_] => Unit): Self = StObject.set(x, "onmessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmessageUndefined: Self = StObject.set(x, "onmessage", js.undefined)
    
    @scala.inline
    def setOnopen(value: /* ev */ Event => Unit): Self = StObject.set(x, "onopen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnopenUndefined: Self = StObject.set(x, "onopen", js.undefined)
    
    @scala.inline
    def setSocketUrl(value: String): Self = StObject.set(x, "socketUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketUrlUndefined: Self = StObject.set(x, "socketUrl", js.undefined)
  }
}
