package typings.mapboxMapboxSdk.tokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDeleteTokenRequest extends CreateTokenRequest {
  
  var tokenId: String = js.native
}
object UpdateDeleteTokenRequest {
  
  @scala.inline
  def apply(tokenId: String): UpdateDeleteTokenRequest = {
    val __obj = js.Dynamic.literal(tokenId = tokenId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeleteTokenRequest]
  }
  
  @scala.inline
  implicit class UpdateDeleteTokenRequestOps[Self <: UpdateDeleteTokenRequest] (val x: Self) extends AnyVal {
    
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
    def setTokenId(value: String): Self = this.set("tokenId", value.asInstanceOf[js.Any])
  }
}
