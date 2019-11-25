package typings.knuddelsDashUserappsDashApi

import typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._Global_.AppContent
import typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._Global_.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppContent extends js.Object {
  var appContent: AppContent
  var user: User
}

object Anon_AppContent {
  @scala.inline
  def apply(appContent: AppContent, user: User): Anon_AppContent = {
    val __obj = js.Dynamic.literal(appContent = appContent.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AppContent]
  }
}

