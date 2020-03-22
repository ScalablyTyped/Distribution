package typings.grommet

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTextDecoration extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var textDecoration: js.UndefOr[String] = js.undefined
}

object AnonTextDecoration {
  @scala.inline
  def apply(extend: ExtendType = null, textDecoration: String = null): AnonTextDecoration = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTextDecoration]
  }
}

