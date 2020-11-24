package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizedSellerStatusTargetingOptionDetails extends js.Object {
  
  /** Output only. The authorized seller status. */
  var authorizedSellerStatus: js.UndefOr[String] = js.native
}
object AuthorizedSellerStatusTargetingOptionDetails {
  
  @scala.inline
  def apply(): AuthorizedSellerStatusTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizedSellerStatusTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class AuthorizedSellerStatusTargetingOptionDetailsOps[Self <: AuthorizedSellerStatusTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setAuthorizedSellerStatus(value: String): Self = this.set("authorizedSellerStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizedSellerStatus: Self = this.set("authorizedSellerStatus", js.undefined)
  }
}
