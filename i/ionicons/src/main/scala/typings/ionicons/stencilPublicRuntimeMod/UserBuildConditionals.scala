package typings.ionicons.stencilPublicRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserBuildConditionals extends js.Object {
  var isBrowser: Boolean = js.native
  var isDev: Boolean = js.native
  var isServer: Boolean = js.native
  var isTesting: Boolean = js.native
}

object UserBuildConditionals {
  @scala.inline
  def apply(isBrowser: Boolean, isDev: Boolean, isServer: Boolean, isTesting: Boolean): UserBuildConditionals = {
    val __obj = js.Dynamic.literal(isBrowser = isBrowser.asInstanceOf[js.Any], isDev = isDev.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any], isTesting = isTesting.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserBuildConditionals]
  }
  @scala.inline
  implicit class UserBuildConditionalsOps[Self <: UserBuildConditionals] (val x: Self) extends AnyVal {
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
    def setIsBrowser(value: Boolean): Self = this.set("isBrowser", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDev(value: Boolean): Self = this.set("isDev", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsServer(value: Boolean): Self = this.set("isServer", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTesting(value: Boolean): Self = this.set("isTesting", value.asInstanceOf[js.Any])
  }
  
}

