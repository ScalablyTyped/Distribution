package typings.k6.wsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This module provides a WebSocket client implementing the WebSocket protocol.
  * https://k6.io/docs/javascript-api/k6-ws
  */
@JSImport("k6/ws", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Open WebSocket connection.
    * https://k6.io/docs/javascript-api/k6-ws/connect-url-params-callback
    * @param url - Request URL.
    * @param callback - Logic to execute with socket.
    * @returns HTTP response to connection request.
    * @example
    * let res = ws.connect(url, function(socket) {
    *   socket.on('open', function() {
    *     console.log('WebSocket connection established!');
    *     socket.close();
    *   });
    * });
    */
  def connect(url: String, callback: Executor): Response = js.native
  def connect(url: String, params: Null, callback: Executor): Response = js.native
  /**
    * Open WebSocket connection.
    * https://k6.io/docs/javascript-api/k6-ws/connect-url-params-callback
    * @param url - Request URL.
    * @param params - Request parameters.
    * @param callback - Logic to execute with socket.
    * @returns HTTP response to connection request.
    * @example
    * let res = ws.connect(url, { param1: true } , function(socket) {
    *   socket.on('open', function() {
    *     console.log('WebSocket connection established!');
    *     socket.close();
    *   });
    * });
    */
  def connect(url: String, params: Params, callback: Executor): Response = js.native
}

