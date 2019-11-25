package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtendLine extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var line: js.UndefOr[Anon_Accent1] = js.undefined
}

object Anon_ExtendLine {
  @scala.inline
  def apply(extend: ExtendType = null, line: Anon_Accent1 = null): Anon_ExtendLine = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExtendLine]
  }
}

