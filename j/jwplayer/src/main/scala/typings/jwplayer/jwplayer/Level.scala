package typings.jwplayer.jwplayer

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
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
}

