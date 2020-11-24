package typings.kiwicomOrbitDesignTokens.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocialColor extends js.Object {
  
  var facebook: String = js.native
  
  var facebookActive: String = js.native
  
  var facebookHover: String = js.native
}
object SocialColor {
  
  @scala.inline
  def apply(facebook: String, facebookActive: String, facebookHover: String): SocialColor = {
    val __obj = js.Dynamic.literal(facebook = facebook.asInstanceOf[js.Any], facebookActive = facebookActive.asInstanceOf[js.Any], facebookHover = facebookHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialColor]
  }
  
  @scala.inline
  implicit class SocialColorOps[Self <: SocialColor] (val x: Self) extends AnyVal {
    
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
    def setFacebook(value: String): Self = this.set("facebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacebookActive(value: String): Self = this.set("facebookActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacebookHover(value: String): Self = this.set("facebookHover", value.asInstanceOf[js.Any])
  }
}
