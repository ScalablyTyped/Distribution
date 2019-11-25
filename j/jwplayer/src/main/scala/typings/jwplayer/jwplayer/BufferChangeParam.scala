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
    val __obj = js.Dynamic.literal(bufferPercent = bufferPercent.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BufferChangeParam]
  }
}

