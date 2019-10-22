package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtendExtendType extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
}

object Anon_ExtendExtendType {
  @scala.inline
  def apply(extend: ExtendType = null): Anon_ExtendExtendType = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExtendExtendType]
  }
}

