package typings.grommet.anon

import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelMargin extends js.Object {
  var level: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
}

object LevelMargin {
  @scala.inline
  def apply(level: String = null, margin: MarginType = null): LevelMargin = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelMargin]
  }
}

