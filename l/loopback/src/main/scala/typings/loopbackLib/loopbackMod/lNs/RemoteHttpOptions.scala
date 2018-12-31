package typings
package loopbackLib.loopbackMod.lNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @interface
  * @property {string} path HTTP path (relative to the model) at which the method is exposed.
  * @property {'get' | 'post' | 'patch' | 'put' | 'del' | 'all'} verb HTTP method (verb) at which the method is available.
  * @property {number} status	Default HTTP status set when the callback is called without an error.
  * @property {number} errorStatus	Default HTTP status set when the callback is called with an error.
  */
trait RemoteHttpOptions extends js.Object {
  /**
    * errorStatus	Default HTTP status set when the callback is called with an error.
    * ```
    * {errorStatus: 400}
    * ```
    */
  var errorStatus: js.UndefOr[scala.Double] = js.undefined
  /**
    * HTTP path (relative to the model) at which the method is exposed.
    * ```
    * http: {path: '/sayhi'}
    * ```
    */
  var path: java.lang.String
  /**
    * status	Default HTTP status set when the callback is called without an error.
    * ```
    * {status: 201}
    * ```
    */
  var status: js.UndefOr[scala.Double] = js.undefined
  /**
    * HTTP method (verb) at which the method is available.
    * ```
    * http: {path: '/sayhi', verb: 'get'}
    * ```
    * default = post
    */
  var verb: loopbackLib.loopbackLibStrings.get | loopbackLib.loopbackLibStrings.post | loopbackLib.loopbackLibStrings.patch | loopbackLib.loopbackLibStrings.put | loopbackLib.loopbackLibStrings.del | loopbackLib.loopbackLibStrings.all
}

