package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualQualityParam extends js.Object {
  var label: String
  var mode: String
  var reason: String
}

object VisualQualityParam {
  @scala.inline
  def apply(label: String, mode: String, reason: String): VisualQualityParam = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VisualQualityParam]
  }
}

