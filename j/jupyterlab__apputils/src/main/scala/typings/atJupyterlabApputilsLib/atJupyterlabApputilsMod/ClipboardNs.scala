package typings
package atJupyterlabApputilsLib.atJupyterlabApputilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "Clipboard")
@js.native
object ClipboardNs extends js.Object {
  /**
    * Copy text to the system clipboard.
    *
    * #### Notes
    * This can only be called in response to a user input event.
    */
  def copyToSystem(text: java.lang.String): scala.Unit = js.native
  /**
    * Generate a clipboard event on a node.
    *
    * @param node - The element on which to generate the event.
    *
    * @param type - The type of event to generate.
    *   `'paste'` events cannot be programmatically generated.
    *
    * #### Notes
    * This can only be called in response to a user input event.
    */
  def generateEvent(node: stdLib.HTMLElement): scala.Unit = js.native
  @JSName("generateEvent")
  def generateEvent_copy(node: stdLib.HTMLElement, `type`: atJupyterlabApputilsLib.atJupyterlabApputilsLibStrings.copy): scala.Unit = js.native
  @JSName("generateEvent")
  def generateEvent_cut(node: stdLib.HTMLElement, `type`: atJupyterlabApputilsLib.atJupyterlabApputilsLibStrings.cut): scala.Unit = js.native
  /**
    * Get the application clipboard instance.
    */
  def getInstance(): atPhosphorCoreutilsLib.atPhosphorCoreutilsMod.MimeData = js.native
  /**
    * Set the application clipboard instance.
    */
  def setInstance(value: atPhosphorCoreutilsLib.atPhosphorCoreutilsMod.MimeData): scala.Unit = js.native
}

