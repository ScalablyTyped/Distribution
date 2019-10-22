package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extend extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var textDecoration: js.UndefOr[String] = js.undefined
}

object Anon_Extend {
  @scala.inline
  def apply(extend: ExtendType = null, textDecoration: String = null): Anon_Extend = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration)
    __obj.asInstanceOf[Anon_Extend]
  }
}

