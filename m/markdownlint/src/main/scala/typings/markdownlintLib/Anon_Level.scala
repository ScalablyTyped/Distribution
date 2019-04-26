package typings
package markdownlintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Level extends js.Object {
  var level: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Level {
  @scala.inline
  def apply(level: scala.Int | scala.Double = null): Anon_Level = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Level]
  }
}

