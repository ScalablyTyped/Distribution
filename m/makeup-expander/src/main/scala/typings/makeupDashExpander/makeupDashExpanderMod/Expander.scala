package typings.makeupDashExpander.makeupDashExpanderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expander extends js.Object {
  var collapseOnClickOut: Boolean
  var collapseOnFocusOut: Boolean
  var collapseOnMouseOut: Boolean
  var expandOnClick: Boolean
  var expandOnFocus: Boolean
  var expandOnHover: Boolean
  def collapse(): Unit
  def expand(isKeyboard: Boolean): Unit
  def isExpanded(): Boolean
  def toggle(): Unit
}

object Expander {
  @scala.inline
  def apply(
    collapse: () => Unit,
    collapseOnClickOut: Boolean,
    collapseOnFocusOut: Boolean,
    collapseOnMouseOut: Boolean,
    expand: Boolean => Unit,
    expandOnClick: Boolean,
    expandOnFocus: Boolean,
    expandOnHover: Boolean,
    isExpanded: () => Boolean,
    toggle: () => Unit
  ): Expander = {
    val __obj = js.Dynamic.literal(collapse = js.Any.fromFunction0(collapse), collapseOnClickOut = collapseOnClickOut, collapseOnFocusOut = collapseOnFocusOut, collapseOnMouseOut = collapseOnMouseOut, expand = js.Any.fromFunction1(expand), expandOnClick = expandOnClick, expandOnFocus = expandOnFocus, expandOnHover = expandOnHover, isExpanded = js.Any.fromFunction0(isExpanded), toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[Expander]
  }
}

