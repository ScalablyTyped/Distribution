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
    val __obj = js.Dynamic.literal(collapse = collapse, collapseOnClickOut = collapseOnClickOut, collapseOnFocusOut = collapseOnFocusOut, collapseOnMouseOut = collapseOnMouseOut, expand = expand, expandOnClick = expandOnClick, expandOnFocus = expandOnFocus, expandOnHover = expandOnHover, isExpanded = isExpanded, toggle = toggle)
  
    __obj.asInstanceOf[Expander]
  }
}

