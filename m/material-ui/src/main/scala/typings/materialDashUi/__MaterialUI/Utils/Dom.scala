package typings.materialDashUi.__MaterialUI.Utils

import org.scalablytyped.runtime.TopLevel
import typings.materialDashUi.Anon_Left
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dom extends js.Object {
  def addClass(el: Element, className: String): Unit
  def forceRedraw(el: HTMLElement): Unit
  def getStyleAttributeAsNumber(el: HTMLElement, attr: String): Double
  def hasClass(el: Element, className: String): Boolean
  def isDescendant(parent: Node, child: Node): Boolean
  def offset(el: Element): Anon_Left
  def removeClass(el: Element, className: String): Unit
  def toggleClass(el: Element, className: String): Unit
  def withoutTransition(el: HTMLElement, callback: js.Function0[Unit]): Unit
}

@JSGlobal("__MaterialUI.Utils.Dom")
@js.native
object Dom extends TopLevel[Dom]

