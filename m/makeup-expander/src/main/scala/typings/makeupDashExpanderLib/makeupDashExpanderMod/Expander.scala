package typings
package makeupDashExpanderLib.makeupDashExpanderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expander extends js.Object {
  var collapseOnClickOut: scala.Boolean
  var collapseOnFocusOut: scala.Boolean
  var collapseOnMouseOut: scala.Boolean
  var expandOnClick: scala.Boolean
  var expandOnFocus: scala.Boolean
  var expandOnHover: scala.Boolean
  def collapse(): scala.Unit
  def expand(isKeyboard: scala.Boolean): scala.Unit
  def isExpanded(): scala.Boolean
  def toggle(): scala.Unit
}

object Expander {
  @scala.inline
  def apply(
    collapse: js.Function0[scala.Unit],
    collapseOnClickOut: scala.Boolean,
    collapseOnFocusOut: scala.Boolean,
    collapseOnMouseOut: scala.Boolean,
    expand: js.Function1[scala.Boolean, scala.Unit],
    expandOnClick: scala.Boolean,
    expandOnFocus: scala.Boolean,
    expandOnHover: scala.Boolean,
    isExpanded: js.Function0[scala.Boolean],
    toggle: js.Function0[scala.Unit]
  ): Expander = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collapse")(collapse)
    __obj.updateDynamic("collapseOnClickOut")(collapseOnClickOut)
    __obj.updateDynamic("collapseOnFocusOut")(collapseOnFocusOut)
    __obj.updateDynamic("collapseOnMouseOut")(collapseOnMouseOut)
    __obj.updateDynamic("expand")(expand)
    __obj.updateDynamic("expandOnClick")(expandOnClick)
    __obj.updateDynamic("expandOnFocus")(expandOnFocus)
    __obj.updateDynamic("expandOnHover")(expandOnHover)
    __obj.updateDynamic("isExpanded")(isExpanded)
    __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[Expander]
  }
}

