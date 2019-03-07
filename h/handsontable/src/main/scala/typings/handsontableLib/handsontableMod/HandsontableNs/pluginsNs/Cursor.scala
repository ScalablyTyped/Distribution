package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cursor extends js.Object {
  var cellHeight: scala.Double = js.native
  var cellWidth: scala.Double = js.native
  var left: scala.Double = js.native
  var leftRelative: scala.Double = js.native
  var rootWindow: stdLib.Window = js.native
  var scrollLeft: scala.Double = js.native
  var scrollTop: scala.Double = js.native
  var top: scala.Double = js.native
  var topRelative: scala.Double = js.native
  var `type`: java.lang.String = js.native
  def fitsAbove(element: stdLib.HTMLElement): scala.Boolean = js.native
  def fitsBelow(element: stdLib.HTMLElement): scala.Boolean = js.native
  def fitsBelow(element: stdLib.HTMLElement, viewportHeight: scala.Double): scala.Boolean = js.native
  def fitsOnLeft(element: stdLib.HTMLElement): scala.Boolean = js.native
  def fitsOnRight(element: stdLib.HTMLElement): scala.Boolean = js.native
  def fitsOnRight(element: stdLib.HTMLElement, viewportHeight: scala.Double): scala.Boolean = js.native
  def getSourceType(`object`: js.Any): java.lang.String = js.native
}

