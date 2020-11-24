package typings.imagekit.mod.global.ImageKit

import typings.imagekit.imagekitStrings.Completed
import typings.imagekit.imagekitStrings.Pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response when getting the status of submitted purge request.
  *
  * @see {@link https://docs.imagekit.io/api-reference/media-api/purge-cache-status#understanding-response}
  */
@js.native
trait PurgeCacheStatusResponse extends js.Object {
  
  /**
    * Pending - The request has been successfully submitted, and purging is in progress.
    * Complete - The purge request has been successfully completed. And now you should get a fresh object.
    * Check the Age header in response to confirm this.
    */
  var status: Pending | Completed = js.native
}
object PurgeCacheStatusResponse {
  
  @scala.inline
  def apply(status: Pending | Completed): PurgeCacheStatusResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurgeCacheStatusResponse]
  }
  
  @scala.inline
  implicit class PurgeCacheStatusResponseOps[Self <: PurgeCacheStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: Pending | Completed): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
