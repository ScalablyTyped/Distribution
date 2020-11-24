package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizedSellerStatusAssignedTargetingOptionDetails extends js.Object {
  
  /** Output only. The authorized seller status to target. */
  var authorizedSellerStatus: js.UndefOr[String] = js.native
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_AUTHORIZED_SELLER_STATUS`. */
  var targetingOptionId: js.UndefOr[String] = js.native
}
object AuthorizedSellerStatusAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): AuthorizedSellerStatusAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizedSellerStatusAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class AuthorizedSellerStatusAssignedTargetingOptionDetailsOps[Self <: AuthorizedSellerStatusAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = this.set("targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingOptionId: Self = this.set("targetingOptionId", js.undefined)
  }
}
