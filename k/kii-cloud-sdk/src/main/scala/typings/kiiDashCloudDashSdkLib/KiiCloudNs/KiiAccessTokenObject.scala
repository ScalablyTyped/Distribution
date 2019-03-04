package typings
package kiiDashCloudDashSdkLib.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KiiAccessTokenObject extends js.Object {
  var access_token: java.lang.String
  var expires_at: stdLib.Date
}

object KiiAccessTokenObject {
  @scala.inline
  def apply(access_token: java.lang.String, expires_at: stdLib.Date): KiiAccessTokenObject = {
    val __obj = js.Dynamic.literal(access_token = access_token, expires_at = expires_at)
  
    __obj.asInstanceOf[KiiAccessTokenObject]
  }
}

