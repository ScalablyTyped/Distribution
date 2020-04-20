package typings.instagramPrivateApi.highlightsRepositoryCreateReelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryCreateReelResponseRootObject extends js.Object {
  var reel: HighlightsRepositoryCreateReelResponseReel
  var status: String
}

object HighlightsRepositoryCreateReelResponseRootObject {
  @scala.inline
  def apply(reel: HighlightsRepositoryCreateReelResponseReel, status: String): HighlightsRepositoryCreateReelResponseRootObject = {
    val __obj = js.Dynamic.literal(reel = reel.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryCreateReelResponseRootObject]
  }
}

