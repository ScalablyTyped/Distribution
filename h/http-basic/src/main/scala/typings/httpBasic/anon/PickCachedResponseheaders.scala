package typings.httpBasic.anon

import typings.httpBasic.headersMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<http-basic.http-basic/lib/CachedResponse.CachedResponse, 'headers' | 'requestTimestamp'> */
@js.native
trait PickCachedResponseheaders extends js.Object {
  
  var headers: Headers = js.native
  
  var requestTimestamp: Double = js.native
}
object PickCachedResponseheaders {
  
  @scala.inline
  def apply(headers: Headers, requestTimestamp: Double): PickCachedResponseheaders = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], requestTimestamp = requestTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCachedResponseheaders]
  }
  
  @scala.inline
  implicit class PickCachedResponseheadersOps[Self <: PickCachedResponseheaders] (val x: Self) extends AnyVal {
    
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
    def setRequestTimestamp(value: Double): Self = this.set("requestTimestamp", value.asInstanceOf[js.Any])
  }
}
