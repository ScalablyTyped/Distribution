package typings.hapiShot.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hapiShot.anon.Req
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseObject extends js.Object {
  
  /** an object containing the response headers. */
  var headers: Headers = js.native
  
  /** the payload as a UTF-8 encoded string. */
  var payload: String = js.native
  
  /** an object containing the raw request and response objects where: */
  var raw: Req = js.native
  
  /** the raw payload as a Buffer. */
  var rawPayload: Buffer = js.native
  
  /** the HTTP status code. */
  var statusCode: Double = js.native
  
  /** the HTTP status message. */
  var statusMessage: String = js.native
  
  /** an object containing the response trailers. */
  var trailers: StringDictionary[js.Any] = js.native
}
object ResponseObject {
  
  @scala.inline
  def apply(
    headers: Headers,
    payload: String,
    raw: Req,
    rawPayload: Buffer,
    statusCode: Double,
    statusMessage: String,
    trailers: StringDictionary[js.Any]
  ): ResponseObject = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], rawPayload = rawPayload.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], trailers = trailers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseObject]
  }
  
  @scala.inline
  implicit class ResponseObjectOps[Self <: ResponseObject] (val x: Self) extends AnyVal {
    
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
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: Req): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawPayload(value: Buffer): Self = this.set("rawPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailers(value: StringDictionary[js.Any]): Self = this.set("trailers", value.asInstanceOf[js.Any])
  }
}
