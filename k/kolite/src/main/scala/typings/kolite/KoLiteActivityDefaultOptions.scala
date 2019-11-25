package typings.kolite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KoLiteActivityDefaultOptions extends js.Object {
  var activityClass: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  var inactiveClass: js.UndefOr[String] = js.undefined
}

object KoLiteActivityDefaultOptions {
  @scala.inline
  def apply(activityClass: String = null, container: String = null, inactiveClass: String = null): KoLiteActivityDefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (activityClass != null) __obj.updateDynamic("activityClass")(activityClass.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (inactiveClass != null) __obj.updateDynamic("inactiveClass")(inactiveClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[KoLiteActivityDefaultOptions]
  }
}

