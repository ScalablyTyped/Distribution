package typings.keymaster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterEvent extends js.Object {
  var srcElement: js.UndefOr[Anon_TagName] = js.undefined
  var target: js.UndefOr[Anon_TagName] = js.undefined
}

object FilterEvent {
  @scala.inline
  def apply(srcElement: Anon_TagName = null, target: Anon_TagName = null): FilterEvent = {
    val __obj = js.Dynamic.literal()
    if (srcElement != null) __obj.updateDynamic("srcElement")(srcElement.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterEvent]
  }
}

