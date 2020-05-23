package typings.keymaster

import typings.keymaster.anon.TagName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterEvent extends js.Object {
  var srcElement: js.UndefOr[TagName] = js.undefined
  var target: js.UndefOr[TagName] = js.undefined
}

object FilterEvent {
  @scala.inline
  def apply(srcElement: TagName = null, target: TagName = null): FilterEvent = {
    val __obj = js.Dynamic.literal()
    if (srcElement != null) __obj.updateDynamic("srcElement")(srcElement.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterEvent]
  }
}

