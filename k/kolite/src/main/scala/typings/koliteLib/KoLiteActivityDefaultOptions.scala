package typings
package koliteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KoLiteActivityDefaultOptions extends js.Object {
  var activityClass: js.UndefOr[java.lang.String] = js.undefined
  var container: js.UndefOr[java.lang.String] = js.undefined
  var inactiveClass: js.UndefOr[java.lang.String] = js.undefined
}

object KoLiteActivityDefaultOptions {
  @scala.inline
  def apply(
    activityClass: java.lang.String = null,
    container: java.lang.String = null,
    inactiveClass: java.lang.String = null
  ): KoLiteActivityDefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (activityClass != null) __obj.updateDynamic("activityClass")(activityClass)
    if (container != null) __obj.updateDynamic("container")(container)
    if (inactiveClass != null) __obj.updateDynamic("inactiveClass")(inactiveClass)
    __obj.asInstanceOf[KoLiteActivityDefaultOptions]
  }
}

