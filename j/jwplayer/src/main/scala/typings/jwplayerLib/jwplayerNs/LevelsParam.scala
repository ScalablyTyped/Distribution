package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelsParam extends js.Object {
  var levels: js.Array[_]
  var width: scala.Double
}

object LevelsParam {
  @scala.inline
  def apply(levels: js.Array[_], width: scala.Double): LevelsParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("levels")(levels)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[LevelsParam]
  }
}

