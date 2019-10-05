package typings.kiiDashCloudDashSdk.KiiCloud

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KiiAccessTokenObject extends js.Object {
  var access_token: String
  var expires_at: Date
}

object KiiAccessTokenObject {
  @scala.inline
  def apply(access_token: String, expires_at: Date): KiiAccessTokenObject = {
    val __obj = js.Dynamic.literal(access_token = access_token, expires_at = expires_at)
  
    __obj.asInstanceOf[KiiAccessTokenObject]
  }
}

