package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendExtendType extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
}

object ExtendExtendType {
  @scala.inline
  def apply(extend: ExtendType = null): ExtendExtendType = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendExtendType]
  }
}

