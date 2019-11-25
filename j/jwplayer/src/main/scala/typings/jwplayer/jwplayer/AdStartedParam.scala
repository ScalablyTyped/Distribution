package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdStartedParam extends js.Object {
  var creativetype: String
  var tag: String
}

object AdStartedParam {
  @scala.inline
  def apply(creativetype: String, tag: String): AdStartedParam = {
    val __obj = js.Dynamic.literal(creativetype = creativetype.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdStartedParam]
  }
}

