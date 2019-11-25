package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelsChangedParam extends js.Object {
  var currentQuality: Double
}

object LevelsChangedParam {
  @scala.inline
  def apply(currentQuality: Double): LevelsChangedParam = {
    val __obj = js.Dynamic.literal(currentQuality = currentQuality.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LevelsChangedParam]
  }
}

