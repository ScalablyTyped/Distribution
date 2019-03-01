package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  var height: scala.Double
  var width: scala.Double
  var x: jwplayerLib.jwplayerLibNumbers.`0`
   // x and y will always be 0 according to https://developer.jwplayer.com/jw-player/docs/javascript-api-reference/#jwplayergetsaferegion
  var y: jwplayerLib.jwplayerLibNumbers.`0`
}

object Region {
  @scala.inline
  def apply(
    height: scala.Double,
    width: scala.Double,
    x: jwplayerLib.jwplayerLibNumbers.`0`,
    y: jwplayerLib.jwplayerLibNumbers.`0`
  ): Region = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Region]
  }
}

