package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subtitleTrackLoadingData extends js.Object {
  var id: java.lang.String
  var url: java.lang.String
}

object subtitleTrackLoadingData {
  @scala.inline
  def apply(id: java.lang.String, url: java.lang.String): subtitleTrackLoadingData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[subtitleTrackLoadingData]
  }
}

