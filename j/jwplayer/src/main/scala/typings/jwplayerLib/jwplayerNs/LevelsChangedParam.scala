package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelsChangedParam extends js.Object {
  var currentQuality: scala.Double
}

object LevelsChangedParam {
  @scala.inline
  def apply(currentQuality: scala.Double): LevelsChangedParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentQuality")(currentQuality)
    __obj.asInstanceOf[LevelsChangedParam]
  }
}

