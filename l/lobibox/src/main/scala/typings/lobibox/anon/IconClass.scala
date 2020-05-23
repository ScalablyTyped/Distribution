package typings.lobibox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconClass extends js.Object {
  var iconClass: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object IconClass {
  @scala.inline
  def apply(iconClass: String = null, title: String = null): IconClass = {
    val __obj = js.Dynamic.literal()
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconClass]
  }
}

