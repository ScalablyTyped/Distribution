package typings.loopback.mod

import typings.loopback.loopbackStrings.all
import typings.loopback.loopbackStrings.del
import typings.loopback.loopbackStrings.get
import typings.loopback.loopbackStrings.patch
import typings.loopback.loopbackStrings.post
import typings.loopback.loopbackStrings.put
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @interface
  * @property {string} path HTTP path (relative to the model) at which the method is exposed.
  * @property {'get' | 'post' | 'patch' | 'put' | 'del' | 'all'} verb HTTP method (verb) at which the method is available.
  * @property {number} status    Default HTTP status set when the callback is called without an error.
  * @property {number} errorStatus    Default HTTP status set when the callback is called with an error.
  */
@js.native
trait RemoteHttpOptions extends js.Object {
  
  /**
    * errorStatus    Default HTTP status set when the callback is called with an error.
    * ```
    * {errorStatus: 400}
    * ```
    */
  var errorStatus: js.UndefOr[Double] = js.native
  
  /**
    * HTTP path (relative to the model) at which the method is exposed.
    * ```
    * http: {path: '/sayhi'}
    * ```
    */
  var path: String = js.native
  
  /**
    * status    Default HTTP status set when the callback is called without an error.
    * ```
    * {status: 201}
    * ```
    */
  var status: js.UndefOr[Double] = js.native
  
  /**
    * HTTP method (verb) at which the method is available.
    * ```
    * http: {path: '/sayhi', verb: 'get'}
    * ```
    * default = post
    */
  var verb: get | post | patch | put | del | all = js.native
}
object RemoteHttpOptions {
  
  @scala.inline
  def apply(path: String, verb: get | post | patch | put | del | all): RemoteHttpOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteHttpOptions]
  }
  
  @scala.inline
  implicit class RemoteHttpOptionsOps[Self <: RemoteHttpOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerb(value: get | post | patch | put | del | all): Self = this.set("verb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorStatus(value: Double): Self = this.set("errorStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorStatus: Self = this.set("errorStatus", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
