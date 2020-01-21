package typings.grommet

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtendLine extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var line: js.UndefOr[AnonColorColorType] = js.undefined
}

object AnonExtendLine {
  @scala.inline
  def apply(extend: ExtendType = null, line: AnonColorColorType = null): AnonExtendLine = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtendLine]
  }
}

