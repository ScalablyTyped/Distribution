package typings.grommet

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLine extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var line: js.UndefOr[Anon0] = js.undefined
}

object AnonLine {
  @scala.inline
  def apply(extend: ExtendType = null, line: Anon0 = null): AnonLine = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLine]
  }
}

