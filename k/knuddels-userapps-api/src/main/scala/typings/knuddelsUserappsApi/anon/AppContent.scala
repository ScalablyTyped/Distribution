package typings.knuddelsUserappsApi.anon

import typings.knuddelsUserappsApi.mod.global.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppContent extends js.Object {
  var appContent: typings.knuddelsUserappsApi.mod.global.AppContent = js.native
  var user: User = js.native
}

object AppContent {
  @scala.inline
  def apply(appContent: typings.knuddelsUserappsApi.mod.global.AppContent, user: User): AppContent = {
    val __obj = js.Dynamic.literal(appContent = appContent.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppContent]
  }
  @scala.inline
  implicit class AppContentOps[Self <: AppContent] (val x: Self) extends AnyVal {
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
    def setAppContent(value: typings.knuddelsUserappsApi.mod.global.AppContent): Self = this.set("appContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

