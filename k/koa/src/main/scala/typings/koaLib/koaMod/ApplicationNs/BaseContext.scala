package typings
package koaLib.koaMod.ApplicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseContext
  extends koaLib.koaMod.ContextDelegatedRequest
     with koaLib.koaMod.ContextDelegatedResponse
     with /**
  * Custom properties.
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  @JSName("assert")
  var assert_Original: koaLib.Anon_Assert = js.native
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  def assert(value: js.Any): scala.Unit = js.native
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  def assert(value: js.Any, status: scala.Double): scala.Unit = js.native
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  def assert(value: js.Any, status: scala.Double, msg: java.lang.String): scala.Unit = js.native
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  def assert(value: js.Any, status: scala.Double, msg: java.lang.String, opts: js.Object): scala.Unit = js.native
  /**
    * Similar to .throw(), adds assertion.
    *
    *    this.assert(this.user, 401, 'Please login!');
    *
    * See: https://github.com/jshttp/http-assert
    */
  def assert(value: js.Any, status: scala.Double, opts: js.Object): scala.Unit = js.native
  /**
    * util.inspect() implementation, which
    * just returns the JSON output.
    */
  def inspect(): js.Any = js.native
  /**
    * Default error handling.
    */
  def onerror(err: stdLib.Error): scala.Unit = js.native
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
  def `throw`(message: java.lang.String): scala.Nothing = js.native
  def `throw`(message: java.lang.String, code: scala.Double): scala.Nothing = js.native
  def `throw`(message: java.lang.String, code: scala.Double, properties: js.Object): scala.Nothing = js.native
  def `throw`(properties: (scala.Double | java.lang.String | js.Object)*): scala.Nothing = js.native
  def `throw`(status: scala.Double): scala.Nothing = js.native
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

