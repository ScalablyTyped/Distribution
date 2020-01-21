package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryEditReelResponseRootObject extends js.Object {
  var reel: HighlightsRepositoryEditReelResponseReel
  var status: String
}

object HighlightsRepositoryEditReelResponseRootObject {
  @scala.inline
  def apply(reel: HighlightsRepositoryEditReelResponseReel, status: String): HighlightsRepositoryEditReelResponseRootObject = {
    val __obj = js.Dynamic.literal(reel = reel.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseRootObject]
  }
}

