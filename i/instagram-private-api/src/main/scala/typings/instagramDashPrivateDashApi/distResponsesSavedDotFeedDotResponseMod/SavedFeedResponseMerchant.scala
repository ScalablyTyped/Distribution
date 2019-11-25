package typings.instagramDashPrivateDashApi.distResponsesSavedDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedFeedResponseMerchant extends js.Object {
  var pk: Double
  var profile_pic_url: String
  var username: String
}

object SavedFeedResponseMerchant {
  @scala.inline
  def apply(pk: Double, profile_pic_url: String, username: String): SavedFeedResponseMerchant = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SavedFeedResponseMerchant]
  }
}

