package typings.jwplayer.jwplayerNs

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
    val __obj = js.Dynamic.literal(label = label, mode = mode, reason = reason)
  
    __obj.asInstanceOf[VisualQualityParam]
  }
}

