package typings.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Level extends js.Object {
  var level: js.UndefOr[Double] = js.undefined
}

object Anon_Level {
  @scala.inline
  def apply(level: Int | Double = null): Anon_Level = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Level]
  }
}

