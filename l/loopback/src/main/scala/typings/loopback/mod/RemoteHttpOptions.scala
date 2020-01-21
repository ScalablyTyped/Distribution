package typings.loopback.mod

import typings.loopback.loopbackStrings.all
import typings.loopback.loopbackStrings.del
import typings.loopback.loopbackStrings.get
import typings.loopback.loopbackStrings.patch
import typings.loopback.loopbackStrings.post
import typings.loopback.loopbackStrings.put
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
  var errorStatus: js.UndefOr[Double] = js.undefined
  /**
    * HTTP path (relative to the model) at which the method is exposed.
    * ```
    * http: {path: '/sayhi'}
    * ```
    */
  var path: String
  /**
    * status	Default HTTP status set when the callback is called without an error.
    * ```
    * {status: 201}
    * ```
    */
  var status: js.UndefOr[Double] = js.undefined
  /**
    * HTTP method (verb) at which the method is available.
    * ```
    * http: {path: '/sayhi', verb: 'get'}
    * ```
    * default = post
    */
  var verb: get | post | patch | put | del | all
}

object RemoteHttpOptions {
  @scala.inline
  def apply(
    path: String,
    verb: get | post | patch | put | del | all,
    errorStatus: Int | Double = null,
    status: Int | Double = null
  ): RemoteHttpOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    if (errorStatus != null) __obj.updateDynamic("errorStatus")(errorStatus.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteHttpOptions]
  }
}

