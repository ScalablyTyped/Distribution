package typings.knuddelsUserappsApi

import typings.knuddelsUserappsApi.mod._Global_.AppContent
import typings.knuddelsUserappsApi.mod._Global_.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppContent extends js.Object {
  var appContent: AppContent
  var user: User
}

object AnonAppContent {
  @scala.inline
  def apply(appContent: AppContent, user: User): AnonAppContent = {
    val __obj = js.Dynamic.literal(appContent = appContent.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAppContent]
  }
}

