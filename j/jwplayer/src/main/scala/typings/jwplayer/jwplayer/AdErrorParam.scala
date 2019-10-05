package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdErrorParam extends js.Object {
  var message: String
  var tag: String
}

object AdErrorParam {
  @scala.inline
  def apply(message: String, tag: String): AdErrorParam = {
    val __obj = js.Dynamic.literal(message = message, tag = tag)
  
    __obj.asInstanceOf[AdErrorParam]
  }
}

