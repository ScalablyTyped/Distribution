package typings.koa.mod

import typings.koa.anon.Call
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseContext
  extends ContextDelegatedRequest
     with ContextDelegatedResponse {
  
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  def assert(value: js.Any): Unit = js.native
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  def assert(value: js.Any, status: js.UndefOr[scala.Nothing], msg: js.UndefOr[scala.Nothing], opts: js.Object): Unit = js.native
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  def assert(value: js.Any, status: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  def assert(value: js.Any, status: js.UndefOr[scala.Nothing], msg: String, opts: js.Object): Unit = js.native
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  def assert(value: js.Any, status: js.UndefOr[scala.Nothing], opts: js.Object): Unit = js.native
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  def assert(value: js.Any, status: Double): Unit = js.native
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  def assert(value: js.Any, status: Double, msg: js.UndefOr[scala.Nothing], opts: js.Object): Unit = js.native
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  def assert(value: js.Any, status: Double, msg: String): Unit = js.native
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  def assert(value: js.Any, status: Double, msg: String, opts: js.Object): Unit = js.native
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  def assert(value: js.Any, status: Double, opts: js.Object): Unit = js.native
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  @JSName("assert")
  var assert_Original: Call = js.native
  
  /**
    * util.inspect() implementation, which
    * just returns the JSON output.
    */
  def inspect(): js.Any = js.native
  
  /**
    * Default error handling.
    */
  def onerror(err: Error): Unit = js.native
  
  /**
    * Throw an error with `msg` and optional `status`
    * defaulting to 500. Note that these are user-level
    * errors, and the message may be exposed to the client.
    *
    *    this.throw(403)
    *    this.throw('name required', 400)
    *    this.throw(400, 'name required')
    *    this.throw('something exploded')
    *    this.throw(new Error('invalid'), 400);
    *    this.throw(400, new Error('invalid'));
    *
    * See: https://github.com/jshttp/http-errors
    */
  def `throw`(message: String): scala.Nothing = js.native
  def `throw`(message: String, code: js.UndefOr[scala.Nothing], properties: js.Object): scala.Nothing = js.native
  def `throw`(message: String, code: Double): scala.Nothing = js.native
  def `throw`(message: String, code: Double, properties: js.Object): scala.Nothing = js.native
  def `throw`(properties: (Double | String | js.Object)*): scala.Nothing = js.native
  def `throw`(status: Double): scala.Nothing = js.native
  
  /**
    * Return JSON representation.
    *
    * Here we explicitly invoke .toJSON() on each
    * object, as iteration will otherwise fail due
    * to the getters and cause utilities such as
    * clone() to fail.
    */
  def toJSON(): js.Any = js.native
}
