package typings.grpcGrpcJs.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataOptions extends js.Object {
  
  var cacheableRequest: js.UndefOr[Boolean] = js.native
  
  var corked: js.UndefOr[Boolean] = js.native
  
  var idempotentRequest: js.UndefOr[Boolean] = js.native
  
  var waitForReady: js.UndefOr[Boolean] = js.native
}
object MetadataOptions {
  
  @scala.inline
  def apply(): MetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataOptions]
  }
  
  @scala.inline
  implicit class MetadataOptionsOps[Self <: MetadataOptions] (val x: Self) extends AnyVal {
    
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
    def setCacheableRequest(value: Boolean): Self = this.set("cacheableRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheableRequest: Self = this.set("cacheableRequest", js.undefined)
    
    @scala.inline
    def setCorked(value: Boolean): Self = this.set("corked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorked: Self = this.set("corked", js.undefined)
    
    @scala.inline
    def setIdempotentRequest(value: Boolean): Self = this.set("idempotentRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdempotentRequest: Self = this.set("idempotentRequest", js.undefined)
    
    @scala.inline
    def setWaitForReady(value: Boolean): Self = this.set("waitForReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForReady: Self = this.set("waitForReady", js.undefined)
  }
}
