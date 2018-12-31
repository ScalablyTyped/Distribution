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

