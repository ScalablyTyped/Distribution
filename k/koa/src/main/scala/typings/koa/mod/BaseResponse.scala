package typings.koa.mod

import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseResponse extends ContextDelegatedResponse {
  
  /**
    * Return response header. If the header is not set, will return an empty
    * string.
    *
    * The `Referrer` header field is special-cased, both `Referrer` and
    * `Referer` are interchangeable.
    *
    * Examples:
    *
    *     this.get('Content-Type');
    *     // => "text/plain"
    *
    *     this.get('content-type');
    *     // => "text/plain"
    *
    *     this.get('Something');
    *     // => ''
    */
  def get(field: String): String = js.native
  
  /**
    * Return response header.
    */
  var header: js.Any = js.native
  
  /**
    * Return response header, alias as response.header
    */
  var headers: js.Any = js.native
  
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
    * Return the request socket.
    *
    * @return {Connection}
    * @api public
    */
  var socket: Socket = js.native
  
  /**
    * Return JSON representation.
    */
  def toJSON(): js.Any = js.native
}
