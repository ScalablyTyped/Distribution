package typings.materialDesignLite.MaterialDesignLite

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentConfigPublic extends js.Object {
  var classAsString: String
  var cssClass: String
  var widget: js.UndefOr[String | Boolean] = js.undefined
}

object ComponentConfigPublic {
  @scala.inline
  def apply(classAsString: String, cssClass: String, widget: String | Boolean = null): ComponentConfigPublic = {
    val __obj = js.Dynamic.literal(classAsString = classAsString.asInstanceOf[js.Any], cssClass = cssClass.asInstanceOf[js.Any])
    if (widget != null) __obj.updateDynamic("widget")(widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfigPublic]
  }
}

