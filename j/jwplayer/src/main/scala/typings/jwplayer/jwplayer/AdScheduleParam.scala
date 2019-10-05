package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdScheduleParam extends js.Object {
  var adbreaks: js.Array[js.Object]
  var client: String
  var tag: String
}

object AdScheduleParam {
  @scala.inline
  def apply(adbreaks: js.Array[js.Object], client: String, tag: String): AdScheduleParam = {
    val __obj = js.Dynamic.literal(adbreaks = adbreaks, client = client, tag = tag)
  
    __obj.asInstanceOf[AdScheduleParam]
  }
}

