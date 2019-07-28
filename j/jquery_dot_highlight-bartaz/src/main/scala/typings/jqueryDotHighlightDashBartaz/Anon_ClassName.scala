package typings.jqueryDotHighlightDashBartaz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var element: js.UndefOr[String] = js.undefined
}

object Anon_ClassName {
  @scala.inline
  def apply(className: String = null, element: String = null): Anon_ClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[Anon_ClassName]
  }
}

