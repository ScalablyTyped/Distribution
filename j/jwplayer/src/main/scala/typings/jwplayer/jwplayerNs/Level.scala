package typings.jwplayer.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  var bitrate: Double
  var height: Double
  var label: String
  var width: Double
}

object Level {
  @scala.inline
  def apply(bitrate: Double, height: Double, label: String, width: Double): Level = {
    val __obj = js.Dynamic.literal(bitrate = bitrate, height = height, label = label, width = width)
  
    __obj.asInstanceOf[Level]
  }
}

