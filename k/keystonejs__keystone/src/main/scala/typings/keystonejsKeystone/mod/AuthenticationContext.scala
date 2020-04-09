package typings.keystonejsKeystone.mod

import typings.keystonejsKeystone.AnonGqlName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationContext extends js.Object {
  var authentication: AnonGqlName
}

object AuthenticationContext {
  @scala.inline
  def apply(authentication: AnonGqlName): AuthenticationContext = {
    val __obj = js.Dynamic.literal(authentication = authentication.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthenticationContext]
  }
}

