package typings.keystonejsKeystone.mod

import typings.keystonejsKeystone.AnonItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationContext extends js.Object {
  var authentication: AnonItem
}

object AuthenticationContext {
  @scala.inline
  def apply(authentication: AnonItem): AuthenticationContext = {
    val __obj = js.Dynamic.literal(authentication = authentication.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthenticationContext]
  }
}

