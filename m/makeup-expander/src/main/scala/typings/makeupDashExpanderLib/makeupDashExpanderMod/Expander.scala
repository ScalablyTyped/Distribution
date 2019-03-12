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
    collapse: () => scala.Unit,
    collapseOnClickOut: scala.Boolean,
    collapseOnFocusOut: scala.Boolean,
    collapseOnMouseOut: scala.Boolean,
    expand: scala.Boolean => scala.Unit,
    expandOnClick: scala.Boolean,
    expandOnFocus: scala.Boolean,
    expandOnHover: scala.Boolean,
    isExpanded: () => scala.Boolean,
    toggle: () => scala.Unit
  ): Expander = {
    val __obj = js.Dynamic.literal(collapse = js.Any.fromFunction0(collapse), collapseOnClickOut = collapseOnClickOut, collapseOnFocusOut = collapseOnFocusOut, collapseOnMouseOut = collapseOnMouseOut, expand = js.Any.fromFunction1(expand), expandOnClick = expandOnClick, expandOnFocus = expandOnFocus, expandOnHover = expandOnHover, isExpanded = js.Any.fromFunction0(isExpanded), toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[Expander]
  }
}

