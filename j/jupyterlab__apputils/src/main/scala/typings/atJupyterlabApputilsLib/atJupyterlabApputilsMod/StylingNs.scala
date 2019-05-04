package typings
package atJupyterlabApputilsLib.atJupyterlabApputilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "Styling")
@js.native
object StylingNs extends js.Object {
  /**
    * Style a node and its child elements with the default tag names.
    *
    * @param node - The base node.
    *
    * @param className - The optional CSS class to add to styled nodes.
    */
  def styleNode(node: stdLib.HTMLElement): scala.Unit = js.native
  def styleNode(node: stdLib.HTMLElement, className: java.lang.String): scala.Unit = js.native
  /**
    * Style a node and its elements that have a given tag name.
    *
    * @param node - The base node.
    *
    * @param tagName - The html tag name to style.
    *
    * @param className - The optional CSS class to add to styled nodes.
    */
  def styleNodeByTag(node: stdLib.HTMLElement, tagName: java.lang.String): scala.Unit = js.native
  def styleNodeByTag(node: stdLib.HTMLElement, tagName: java.lang.String, className: java.lang.String): scala.Unit = js.native
  /**
    * Wrap a select node.
    */
  def wrapSelect(node: stdLib.HTMLSelectElement): stdLib.HTMLElement = js.native
}

