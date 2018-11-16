package typings
package atMaterialDashUiCoreLib.stylesCreateBreakpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Breakpoints extends js.Object {
  var keys: js.Array[Breakpoint] = js.native
  var values: BreakpointValues = js.native
  def between(start: Breakpoint, end: Breakpoint): java.lang.String = js.native
  def down(key: Breakpoint): java.lang.String = js.native
  def down(key: scala.Double): java.lang.String = js.native
  def only(key: Breakpoint): java.lang.String = js.native
  def up(key: Breakpoint): java.lang.String = js.native
  def up(key: scala.Double): java.lang.String = js.native
  def width(key: Breakpoint): scala.Double = js.native
}

