package typings.jsondiffpatch.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlFormatter extends Formatter {
  
  /**
    * An alias for showUnchanged(false, ...)
    * @param node The root element the diff is contained within (Default: body)
    * @param delay Transition time in ms. (Default: no transition)
    */
  def hideUnchanged(): Unit = js.native
  def hideUnchanged(node: js.UndefOr[scala.Nothing], delay: Double): Unit = js.native
  def hideUnchanged(node: Null, delay: Double): Unit = js.native
  def hideUnchanged(node: Element): Unit = js.native
  def hideUnchanged(node: Element, delay: Double): Unit = js.native
  
  /**
    * Set whether to show or hide unchanged parts of a diff.
    * @param show Whether to show unchanged parts
    * @param node The root element the diff is contained within. (Default: body)
    * @param delay Transition time in ms. (Default: no transition)
    */
  def showUnchanged(show: Boolean): Unit = js.native
  def showUnchanged(show: Boolean, node: js.UndefOr[scala.Nothing], delay: Double): Unit = js.native
  def showUnchanged(show: Boolean, node: Null, delay: Double): Unit = js.native
  def showUnchanged(show: Boolean, node: Element): Unit = js.native
  def showUnchanged(show: Boolean, node: Element, delay: Double): Unit = js.native
}
