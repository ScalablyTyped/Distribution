package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var line: js.UndefOr[`1`] = js.undefined
}

object Line {
  @scala.inline
  def apply(extend: ExtendType = null, line: `1` = null): Line = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
}

