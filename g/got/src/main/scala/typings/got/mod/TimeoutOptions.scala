package typings.got.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties to constrain the duration of each phase of the request lifecycle.
  *
  * @see https://github.com/sindresorhus/got#timeout
  */
@js.native
trait TimeoutOptions extends StObject {
  
  /**
    * Starts when `lookup` completes (or when the socket is assigned if lookup does not apply
    * to the request) and ends when the socket is connected.
    */
  var connect: js.UndefOr[Double] = js.native
  
  /**
    * Starts when a socket is assigned and ends when the hostname has been resolved. Does not
    * apply when using a Unix domain socket.
    */
  var lookup: js.UndefOr[Double] = js.native
  
  /**
    * Starts when the request is initiated and ends when the response's end event fires.
    */
  var request: js.UndefOr[Double] = js.native
  
  /**
    * Starts when the request has been written to the socket and ends when the response headers
    * are received.
    */
  var response: js.UndefOr[Double] = js.native
  
  /**
    * Starts when `connect` completes and ends when the handshaking process completes (HTTPS
    * only).
    */
  var secureConnect: js.UndefOr[Double] = js.native
  
  /**
    * Starts when the socket is connected and ends with the request has been written to the
    * socket.
    */
  var send: js.UndefOr[Double] = js.native
  
  /**
    * Starts when the socket is connected. See [request.setTimeout](https://nodejs.org/api/http.html#http_request_settimeout_timeout_callback).
    */
  var socket: js.UndefOr[Double] = js.native
}
object TimeoutOptions {
  
  @scala.inline
  def apply(): TimeoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeoutOptions]
  }
  
  @scala.inline
  implicit class TimeoutOptionsMutableBuilder[Self <: TimeoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnect(value: Double): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
    
    @scala.inline
    def setLookup(value: Double): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
    
    @scala.inline
    def setRequest(value: Double): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setResponse(value: Double): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setSecureConnect(value: Double): Self = StObject.set(x, "secureConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureConnectUndefined: Self = StObject.set(x, "secureConnect", js.undefined)
    
    @scala.inline
    def setSend(value: Double): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendUndefined: Self = StObject.set(x, "send", js.undefined)
    
    @scala.inline
    def setSocket(value: Double): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
  }
}
