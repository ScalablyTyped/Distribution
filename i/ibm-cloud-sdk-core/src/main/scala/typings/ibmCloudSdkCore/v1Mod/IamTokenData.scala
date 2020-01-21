package typings.ibmCloudSdkCore.v1Mod

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
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IamTokenData]
  }
}

