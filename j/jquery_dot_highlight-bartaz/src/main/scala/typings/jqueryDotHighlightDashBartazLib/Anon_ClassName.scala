package typings
package jqueryDotHighlightDashBartazLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var element: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ClassName {
  @scala.inline
  def apply(className: java.lang.String = null, element: java.lang.String = null): Anon_ClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[Anon_ClassName]
  }
}

