package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  var bitrate: scala.Double
  var height: scala.Double
  var label: java.lang.String
  var width: scala.Double
}

object Level {
  @scala.inline
  def apply(bitrate: scala.Double, height: scala.Double, label: java.lang.String, width: scala.Double): Level = {
    val __obj = js.Dynamic.literal(bitrate = bitrate, height = height, label = label, width = width)
  
    __obj.asInstanceOf[Level]
  }
}

