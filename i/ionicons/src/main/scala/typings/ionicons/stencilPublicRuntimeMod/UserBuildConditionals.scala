package typings.ionicons.stencilPublicRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserBuildConditionals extends js.Object {
  var isBrowser: Boolean
  var isDev: Boolean
  var isServer: Boolean
  var isTesting: Boolean
}

object UserBuildConditionals {
  @scala.inline
  def apply(isBrowser: Boolean, isDev: Boolean, isServer: Boolean, isTesting: Boolean): UserBuildConditionals = {
    val __obj = js.Dynamic.literal(isBrowser = isBrowser.asInstanceOf[js.Any], isDev = isDev.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any], isTesting = isTesting.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserBuildConditionals]
  }
}

