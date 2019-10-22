package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtendSizeExtendType extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object Anon_ExtendSizeExtendType {
  @scala.inline
  def apply(extend: ExtendType = null, size: String = null): Anon_ExtendSizeExtendType = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_ExtendSizeExtendType]
  }
}

