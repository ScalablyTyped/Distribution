package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeParam extends js.Object {
  var duration: scala.Double
  var position: scala.Double
  var viewable: jwplayerLib.jwplayerLibNumbers.`0` | jwplayerLib.jwplayerLibNumbers.`1`
}

object TimeParam {
  @scala.inline
  def apply(
    duration: scala.Double,
    position: scala.Double,
    viewable: jwplayerLib.jwplayerLibNumbers.`0` | jwplayerLib.jwplayerLibNumbers.`1`
  ): TimeParam = {
    val __obj = js.Dynamic.literal(duration = duration, position = position, viewable = viewable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimeParam]
  }
}

