package typings
package jqueryDashJsonrpcclientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonRpcClientOptions
  extends jqueryLib.JQueryNs.AjaxSettings[js.Any] {
  var ajaxUrl: java.lang.String
  var getSockect: js.UndefOr[js.Function1[/* onmessageCb */ js.Function0[scala.Unit], stdLib.WebSocket]] = js.undefined
  @JSName("headers")
  var headers_JsonRpcClientOptions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var onclose: js.UndefOr[js.Function1[/* ev */ stdLib.CloseEvent, scala.Unit]] = js.undefined
  var onerror: js.UndefOr[js.Function1[/* ev */ stdLib.Event, scala.Unit]] = js.undefined
  var onmessage: js.UndefOr[js.Function1[/* ev */ stdLib.MessageEvent, scala.Unit]] = js.undefined
  var onopen: js.UndefOr[js.Function1[/* ev */ stdLib.Event, scala.Unit]] = js.undefined
  var socketUrl: js.UndefOr[java.lang.String] = js.undefined
}

