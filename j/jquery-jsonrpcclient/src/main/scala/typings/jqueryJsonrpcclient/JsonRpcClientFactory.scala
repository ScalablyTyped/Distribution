package typings.jqueryJsonrpcclient

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonRpcClientFactory
  extends StObject
     with /**
  * @param {object} options An object stating the backends:
  *                ajaxUrl    A url (relative or absolute) to a http(s) backend.
  *                headers    An object that will be passed along to $.ajax in options.headers
  *                xhrFields  An object that will be passed along to $.ajax in options.xhrFields
  *                socketUrl  A url (relative of absolute) to a ws(s) backend.
  *                onmessage  A socket message handler for other messages (non-responses).
  *                onopen     A socket onopen handler. (Not used for custom getSocket.)
  *                onclose    A socket onclose handler. (Not used for custom getSocket.)
  *                onerror    A socket onerror handler. (Not used for custom getSocket.)
  *                getSocket  A function returning a WebSocket or null.
  *                           It must take an onmessage_cb and bind it to the onmessage event
  *                           (or chain it before/after some other onmessage handler).
  *                           Or, it could return null if no socket is available.
  *                           The returned instance must have readyState <= 1, and if less than 1,
  *                           react to onopen binding.
  *                timeout    (optional) A number of ms to wait before timing out and failing a
  *                           call. If specified a setTimeout will be used to keep track of calls
  *                           made through a websocket.
  */
Instantiable0[JsonRpcClient]
     with Instantiable1[/* options */ JsonRpcClientOptions, JsonRpcClient]
