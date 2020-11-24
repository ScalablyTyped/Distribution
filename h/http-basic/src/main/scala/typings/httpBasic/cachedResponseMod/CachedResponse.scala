package typings.httpBasic.cachedResponseMod

import typings.httpBasic.headersMod.Headers
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CachedResponse extends js.Object {
  
  var body: ReadableStream = js.native
  
  var headers: Headers = js.native
  
  var requestHeaders: Headers = js.native
  
  var requestTimestamp: Double = js.native
  
  var statusCode: Double = js.native
}
object CachedResponse {
  
  @scala.inline
  def apply(
    body: ReadableStream,
    headers: Headers,
    requestHeaders: Headers,
    requestTimestamp: Double,
    statusCode: Double
  ): CachedResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], requestHeaders = requestHeaders.asInstanceOf[js.Any], requestTimestamp = requestTimestamp.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedResponse]
  }
  
  @scala.inline
  implicit class CachedResponseOps[Self <: CachedResponse] (val x: Self) extends AnyVal {
    
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
    def setBody(value: ReadableStream): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestHeaders(value: Headers): Self = this.set("requestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTimestamp(value: Double): Self = this.set("requestTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
}
