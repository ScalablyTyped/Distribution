package typings.imagekit.mod.global.ImageKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response when purging CDN and ImageKit.io internal cache
  *
  * @see {@link https://docs.imagekit.io/api-reference/media-api/purge-cache#response-structure-and-status-code}
  */
@js.native
trait PurgeCacheResponse extends js.Object {
  
  /**
    * requestId can be used to fetch the status of submitted purge request.
    */
  var requestId: String = js.native
}
object PurgeCacheResponse {
  
  @scala.inline
  def apply(requestId: String): PurgeCacheResponse = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurgeCacheResponse]
  }
  
  @scala.inline
  implicit class PurgeCacheResponseOps[Self <: PurgeCacheResponse] (val x: Self) extends AnyVal {
    
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
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
  }
}
