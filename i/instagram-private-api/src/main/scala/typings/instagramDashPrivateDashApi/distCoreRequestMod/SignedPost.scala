package typings.instagramDashPrivateDashApi.distCoreRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedPost extends js.Object {
  var ig_sig_key_version: String
  var signed_body: String
}

object SignedPost {
  @scala.inline
  def apply(ig_sig_key_version: String, signed_body: String): SignedPost = {
    val __obj = js.Dynamic.literal(ig_sig_key_version = ig_sig_key_version.asInstanceOf[js.Any], signed_body = signed_body.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SignedPost]
  }
}

