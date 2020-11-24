package typings.instagramPrivateApi.userRepositoryInfoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserRepositoryInfoResponseNametag extends js.Object {
  
  var emoji: String = js.native
  
  var gradient: String = js.native
  
  var mode: Double = js.native
  
  var selfie_sticker: String = js.native
}
object UserRepositoryInfoResponseNametag {
  
  @scala.inline
  def apply(emoji: String, gradient: String, mode: Double, selfie_sticker: String): UserRepositoryInfoResponseNametag = {
    val __obj = js.Dynamic.literal(emoji = emoji.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], selfie_sticker = selfie_sticker.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRepositoryInfoResponseNametag]
  }
  
  @scala.inline
  implicit class UserRepositoryInfoResponseNametagOps[Self <: UserRepositoryInfoResponseNametag] (val x: Self) extends AnyVal {
    
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
    def setEmoji(value: String): Self = this.set("emoji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradient(value: String): Self = this.set("gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfie_sticker(value: String): Self = this.set("selfie_sticker", value.asInstanceOf[js.Any])
  }
}
