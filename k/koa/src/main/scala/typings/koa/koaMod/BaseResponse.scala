package typings.koa.koaMod

import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseResponse extends ContextDelegatedResponse {
  /**
    * Return response header.
    */
  var header: js.Any = js.native
  /**
    * Return response header, alias as response.header
    */
  var headers: js.Any = js.native
  /**
    * Return the request socket.
    *
    * @return {Connection}
    * @api public
    */
  var socket: Socket = js.native
  /**
    * Return response header.
    *
    * Examples:
    *
    *     this.get('Content-Type');
    *     // => "text/plain"
    *
    *     this.get('content-type');
    *     // => "text/plain"
    */
  def get(field: String): String = js.native
  /**
    * Inspect implementation.
    */
  def inspect(): js.Any = js.native
  /**
    * Check whether the response is one of the listed types.
    * Pretty much the same as `this.request.is()`.
    *
    * @param {String|Array} types...
    * @return {String|false}
    * @api public
    */
  // is(): string;
  def is(types: String*): String = js.native
  def is(types: js.Array[String]): String = js.native
  /**
    * Return JSON representation.
    */
  def toJSON(): js.Any = js.native
}

