package typings.jwplayer.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeekParam extends js.Object {
  var offset: Double
  var position: Double
}

object SeekParam {
  @scala.inline
  def apply(offset: Double, position: Double): SeekParam = {
    val __obj = js.Dynamic.literal(offset = offset, position = position)
  
    __obj.asInstanceOf[SeekParam]
  }
}

