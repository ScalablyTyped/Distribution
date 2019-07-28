package typings.hlsDotJs.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait audioTrackLoadingData extends js.Object {
  var id: String
  var url: String
}

object audioTrackLoadingData {
  @scala.inline
  def apply(id: String, url: String): audioTrackLoadingData = {
    val __obj = js.Dynamic.literal(id = id, url = url)
  
    __obj.asInstanceOf[audioTrackLoadingData]
  }
}

