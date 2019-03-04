package typings
package materialDashDesignDashLiteLib.MaterialDesignLiteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentConfigPublic extends js.Object {
  var classAsString: java.lang.String
  var cssClass: java.lang.String
  var widget: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
}

object ComponentConfigPublic {
  @scala.inline
  def apply(
    classAsString: java.lang.String,
    cssClass: java.lang.String,
    widget: java.lang.String | scala.Boolean = null
  ): ComponentConfigPublic = {
    val __obj = js.Dynamic.literal(classAsString = classAsString, cssClass = cssClass)
    if (widget != null) __obj.updateDynamic("widget")(widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfigPublic]
  }
}

