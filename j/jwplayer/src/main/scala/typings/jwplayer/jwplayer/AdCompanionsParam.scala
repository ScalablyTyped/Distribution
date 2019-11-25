package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdCompanionsParam extends js.Object {
  var companions: js.Array[_]
  var tag: String
}

object AdCompanionsParam {
  @scala.inline
  def apply(companions: js.Array[_], tag: String): AdCompanionsParam = {
    val __obj = js.Dynamic.literal(companions = companions.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdCompanionsParam]
  }
}

