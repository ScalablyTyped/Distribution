package typings.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsServicePostResponseShareCount extends js.Object {
  var post: InsightsServicePostResponsePost
  var tray: InsightsServicePostResponseTray
}

object InsightsServicePostResponseShareCount {
  @scala.inline
  def apply(post: InsightsServicePostResponsePost, tray: InsightsServicePostResponseTray): InsightsServicePostResponseShareCount = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any], tray = tray.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightsServicePostResponseShareCount]
  }
}

