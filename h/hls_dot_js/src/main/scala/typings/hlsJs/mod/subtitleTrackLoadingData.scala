package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subtitleTrackLoadingData extends js.Object {
  var id: String
  var url: String
}

object subtitleTrackLoadingData {
  @scala.inline
  def apply(id: String, url: String): subtitleTrackLoadingData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[subtitleTrackLoadingData]
  }
}

