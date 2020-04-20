package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelsParam extends js.Object {
  var levels: js.Array[_]
  var width: Double
}

object LevelsParam {
  @scala.inline
  def apply(levels: js.Array[_], width: Double): LevelsParam = {
    val __obj = js.Dynamic.literal(levels = levels.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelsParam]
  }
}

