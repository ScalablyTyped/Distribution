package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Open extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var open: js.UndefOr[String | js.Object] = js.undefined
}

object Open {
  @scala.inline
  def apply(extend: ExtendType = null, open: String | js.Object = null): Open = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[Open]
  }
}

