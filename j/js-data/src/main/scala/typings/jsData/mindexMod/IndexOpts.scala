package typings.jsData.mindexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexOpts extends js.Object {
  var fieldGetter: js.UndefOr[js.Any] = js.undefined
  @JSName("hashCode")
  var hashCode_FIndexOpts: js.UndefOr[js.Any] = js.undefined
}

object IndexOpts {
  @scala.inline
  def apply(fieldGetter: js.Any = null, hashCode: js.Any = null): IndexOpts = {
    val __obj = js.Dynamic.literal()
    if (fieldGetter != null) __obj.updateDynamic("fieldGetter")(fieldGetter.asInstanceOf[js.Any])
    if (hashCode != null) __obj.updateDynamic("hashCode")(hashCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexOpts]
  }
}

