package typings.handsontable.handsontableMod.Handsontable.plugins

import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cursor extends js.Object {
  var cellHeight: Double = js.native
  var cellWidth: Double = js.native
  var left: Double = js.native
  var leftRelative: Double = js.native
  var rootWindow: Window = js.native
  var scrollLeft: Double = js.native
  var scrollTop: Double = js.native
  var top: Double = js.native
  var topRelative: Double = js.native
  var `type`: String = js.native
  def fitsAbove(element: HTMLElement): Boolean = js.native
  def fitsBelow(element: HTMLElement): Boolean = js.native
  def fitsBelow(element: HTMLElement, viewportHeight: Double): Boolean = js.native
  def fitsOnLeft(element: HTMLElement): Boolean = js.native
  def fitsOnRight(element: HTMLElement): Boolean = js.native
  def fitsOnRight(element: HTMLElement, viewportHeight: Double): Boolean = js.native
  def getSourceType(`object`: js.Any): String = js.native
}

