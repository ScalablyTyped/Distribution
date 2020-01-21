package typings.instagramPrivateApi.tagsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsFeedResponseCandidatesItem extends js.Object {
  var height: Double
  var url: String
  var width: Double
}

object TagsFeedResponseCandidatesItem {
  @scala.inline
  def apply(height: Double, url: String, width: Double): TagsFeedResponseCandidatesItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagsFeedResponseCandidatesItem]
  }
}

