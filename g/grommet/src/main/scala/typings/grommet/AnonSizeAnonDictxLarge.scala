package typings.grommet

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSizeAnonDictxLarge extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var size: js.UndefOr[AnonDictxLarge] = js.undefined
}

object AnonSizeAnonDictxLarge {
  @scala.inline
  def apply(extend: ExtendType = null, size: AnonDictxLarge = null): AnonSizeAnonDictxLarge = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSizeAnonDictxLarge]
  }
}

