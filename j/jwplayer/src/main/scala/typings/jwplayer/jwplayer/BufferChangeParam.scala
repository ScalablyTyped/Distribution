package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferChangeParam extends js.Object {
  var bufferPercent: Double
  var duration: Double
  var metadata: js.Any
  var position: Double
}

object BufferChangeParam {
  @scala.inline
  def apply(bufferPercent: Double, duration: Double, metadata: js.Any, position: Double): BufferChangeParam = {
    val __obj = js.Dynamic.literal(bufferPercent = bufferPercent, duration = duration, metadata = metadata, position = position)
  
    __obj.asInstanceOf[BufferChangeParam]
  }
}

