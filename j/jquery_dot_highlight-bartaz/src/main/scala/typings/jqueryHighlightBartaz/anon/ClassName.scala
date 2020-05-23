package typings.jqueryHighlightBartaz.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassName extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var element: js.UndefOr[String] = js.undefined
}

object ClassName {
  @scala.inline
  def apply(className: String = null, element: String = null): ClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
}

