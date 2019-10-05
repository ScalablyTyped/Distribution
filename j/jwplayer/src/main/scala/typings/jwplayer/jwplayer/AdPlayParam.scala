package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdPlayParam extends js.Object {
  var creativetype: String
  var newstate: String
  var oldstate: String
  var tag: String
}

object AdPlayParam {
  @scala.inline
  def apply(creativetype: String, newstate: String, oldstate: String, tag: String): AdPlayParam = {
    val __obj = js.Dynamic.literal(creativetype = creativetype, newstate = newstate, oldstate = oldstate, tag = tag)
  
    __obj.asInstanceOf[AdPlayParam]
  }
}

