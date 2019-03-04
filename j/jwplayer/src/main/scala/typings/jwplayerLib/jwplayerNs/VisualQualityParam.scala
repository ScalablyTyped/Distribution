package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualQualityParam extends js.Object {
  var label: java.lang.String
  var mode: java.lang.String
  var reason: java.lang.String
}

object VisualQualityParam {
  @scala.inline
  def apply(label: java.lang.String, mode: java.lang.String, reason: java.lang.String): VisualQualityParam = {
    val __obj = js.Dynamic.literal(label = label, mode = mode, reason = reason)
  
    __obj.asInstanceOf[VisualQualityParam]
  }
}

