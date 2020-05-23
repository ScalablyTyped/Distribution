package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDecoration extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var textDecoration: js.UndefOr[String] = js.undefined
}

object TextDecoration {
  @scala.inline
  def apply(extend: ExtendType = null, textDecoration: String = null): TextDecoration = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDecoration]
  }
}

