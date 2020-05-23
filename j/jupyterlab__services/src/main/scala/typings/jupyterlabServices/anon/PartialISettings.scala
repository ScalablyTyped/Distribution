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
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/services.@jupyterlab/services/lib/serverconnection.ServerConnection.ISettings> */
trait PartialISettings extends js.Object {
  var Headers: js.UndefOr[Instantiable with Instantiable0[typings.std.global.Headers]] = js.undefined
  var Request: js.UndefOr[
    InstantiableRequest with (Instantiable1[/* input */ RequestInfo, typings.std.global.Request])
  ] = js.undefined
  var WebSocket: js.UndefOr[CLOSED with (Instantiable1[/* url */ String, typings.std.global.WebSocket])] = js.undefined
  var appUrl: js.UndefOr[String] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var fetch: js.UndefOr[
    js.Function2[/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit], js.Promise[Response]]
  ] = js.undefined
  var init: js.UndefOr[RequestInit] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var wsUrl: js.UndefOr[String] = js.undefined
}

object PartialISettings {
  @scala.inline
  def apply(
    Headers: Instantiable with Instantiable0[Headers] = null,
    Request: InstantiableRequest with (Instantiable1[/* input */ RequestInfo, Request]) = null,
    WebSocket: CLOSED with (Instantiable1[/* url */ String, WebSocket]) = null,
    appUrl: String = null,
    baseUrl: String = null,
    fetch: (/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit]) => js.Promise[Response] = null,
    init: RequestInit = null,
    token: String = null,
    wsUrl: String = null
  ): PartialISettings = {
    val __obj = js.Dynamic.literal()
    if (Headers != null) __obj.updateDynamic("Headers")(Headers.asInstanceOf[js.Any])
    if (Request != null) __obj.updateDynamic("Request")(Request.asInstanceOf[js.Any])
    if (WebSocket != null) __obj.updateDynamic("WebSocket")(WebSocket.asInstanceOf[js.Any])
    if (appUrl != null) __obj.updateDynamic("appUrl")(appUrl.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2(fetch))
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (wsUrl != null) __obj.updateDynamic("wsUrl")(wsUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialISettings]
  }
}

