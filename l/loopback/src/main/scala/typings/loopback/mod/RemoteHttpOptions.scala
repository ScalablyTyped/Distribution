package typings.loopback.mod

import typings.loopback.loopbackStrings.all
import typings.loopback.loopbackStrings.del
import typings.loopback.loopbackStrings.get
import typings.loopback.loopbackStrings.patch
import typings.loopback.loopbackStrings.post
import typings.loopback.loopbackStrings.put
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @interface
  * @property {string} path HTTP path (relative to the model) at which the method is exposed.
  * @property {'get' | 'post' | 'patch' | 'put' | 'del' | 'all'} verb HTTP method (verb) at which the method is available.
  * @property {number} status    Default HTTP status set when the callback is called without an error.
  * @property {number} errorStatus    Default HTTP status set when the callback is called with an error.
  */
trait RemoteHttpOptions extends StObject {
  
  /**
    * errorStatus    Default HTTP status set when the callback is called with an error.
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
    * status    Default HTTP status set when the callback is called without an error.
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
  
  inline def apply(path: String, verb: get | post | patch | put | del | all): RemoteHttpOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteHttpOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoteHttpOptions] (val x: Self) extends AnyVal {
    
    inline def setErrorStatus(value: Double): Self = StObject.set(x, "errorStatus", value.asInstanceOf[js.Any])
    
    inline def setErrorStatusUndefined: Self = StObject.set(x, "errorStatus", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setVerb(value: get | post | patch | put | del | all): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
  }
}
