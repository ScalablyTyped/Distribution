package typings.ibmDashCloudDashSdkDashCore.iamDashTokenDashManagerV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IamTokenData extends js.Object {
  var access_token: String
  var expiration: Double
  var expires_in: Double
  var refresh_token: String
  var token_type: String
}

object IamTokenData {
  @scala.inline
  def apply(
    access_token: String,
    expiration: Double,
    expires_in: Double,
    refresh_token: String,
    token_type: String
  ): IamTokenData = {
    val __obj = js.Dynamic.literal(access_token = access_token, expiration = expiration, expires_in = expires_in, refresh_token = refresh_token, token_type = token_type)
  
    __obj.asInstanceOf[IamTokenData]
  }
}

