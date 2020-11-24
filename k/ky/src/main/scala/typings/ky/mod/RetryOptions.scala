package typings.ky.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryOptions extends js.Object {
  
  /**
  	The HTTP status codes allowed to retry with a `Retry-After` header.
  	@default [413, 429, 503]
  	*/
  var afterStatusCodes: js.UndefOr[js.Array[Double]] = js.native
  
  /**
  	The number of times to retry failed requests.
  	@default 2
  	*/
  var limit: js.UndefOr[Double] = js.native
  
  /**
  	If the `Retry-After` header is greater than `maxRetryAfter`, the request will be canceled.
  	@default Infinity
  	*/
  var maxRetryAfter: js.UndefOr[Double] = js.native
  
  /**
  	The HTTP methods allowed to retry.
  	@default ['get', 'put', 'head', 'delete', 'options', 'trace']
  	*/
  var methods: js.UndefOr[js.Array[String]] = js.native
  
  /**
  	The HTTP status codes allowed to retry.
  	@default [408, 413, 429, 500, 502, 503, 504]
  	*/
  var statusCodes: js.UndefOr[js.Array[Double]] = js.native
}
object RetryOptions {
  
  @scala.inline
  def apply(): RetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryOptions]
  }
  
  @scala.inline
  implicit class RetryOptionsOps[Self <: RetryOptions] (val x: Self) extends AnyVal {
    
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
    def setAfterStatusCodesVarargs(value: Double*): Self = this.set("afterStatusCodes", js.Array(value :_*))
    
    @scala.inline
    def setAfterStatusCodes(value: js.Array[Double]): Self = this.set("afterStatusCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterStatusCodes: Self = this.set("afterStatusCodes", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setMaxRetryAfter(value: Double): Self = this.set("maxRetryAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetryAfter: Self = this.set("maxRetryAfter", js.undefined)
    
    @scala.inline
    def setMethodsVarargs(value: String*): Self = this.set("methods", js.Array(value :_*))
    
    @scala.inline
    def setMethods(value: js.Array[String]): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    
    @scala.inline
    def setStatusCodesVarargs(value: Double*): Self = this.set("statusCodes", js.Array(value :_*))
    
    @scala.inline
    def setStatusCodes(value: js.Array[Double]): Self = this.set("statusCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCodes: Self = this.set("statusCodes", js.undefined)
  }
}
