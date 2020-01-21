package typings.kiwicomOrbitDesignTokens.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocialColor extends js.Object {
  var facebook: String
  var facebookActive: String
  var facebookHover: String
}

object SocialColor {
  @scala.inline
  def apply(facebook: String, facebookActive: String, facebookHover: String): SocialColor = {
    val __obj = js.Dynamic.literal(facebook = facebook.asInstanceOf[js.Any], facebookActive = facebookActive.asInstanceOf[js.Any], facebookHover = facebookHover.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SocialColor]
  }
}

