package typings.keystonejsKeystone.mod

import typings.keystonejsKeystone.anon.GqlName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationContext extends js.Object {
  var authentication: GqlName
}

object AuthenticationContext {
  @scala.inline
  def apply(authentication: GqlName): AuthenticationContext = {
    val __obj = js.Dynamic.literal(authentication = authentication.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationContext]
  }
}

