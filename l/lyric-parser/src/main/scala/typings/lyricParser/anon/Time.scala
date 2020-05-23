package typings.lyricParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  var time: Double
  var txt: String
}

object Time {
  @scala.inline
  def apply(time: Double, txt: String): Time = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any], txt = txt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
}

