package typings.instagramPrivateApi.userRepositoryInfoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRepositoryInfoResponseNametag extends js.Object {
  var emoji: String
  var gradient: String
  var mode: Double
  var selfie_sticker: String
}

object UserRepositoryInfoResponseNametag {
  @scala.inline
  def apply(emoji: String, gradient: String, mode: Double, selfie_sticker: String): UserRepositoryInfoResponseNametag = {
    val __obj = js.Dynamic.literal(emoji = emoji.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], selfie_sticker = selfie_sticker.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserRepositoryInfoResponseNametag]
  }
}

