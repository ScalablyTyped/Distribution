package typings
package atJupyterlabApputilsLib.atJupyterlabApputilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "Dialog")
@js.native
object DialogNs extends js.Object {
  /**
    * The default implementation of a dialog renderer.
    */
  @js.native
  class Renderer ()
    extends atJupyterlabApputilsLib.libDialogMod.DialogNs.Renderer
  
  /**
    * The default renderer instance.
    */
  val defaultRenderer: atJupyterlabApputilsLib.libDialogMod.DialogNs.Renderer = js.native
  /**
    * Create a reject button.
    */
  def cancelButton(): atJupyterlabApputilsLib.libDialogMod.DialogNs.IButton = js.native
  def cancelButton(options: atJupyterlabApputilsLib.libDialogMod.DialogNs.ButtonOptions): atJupyterlabApputilsLib.libDialogMod.DialogNs.IButton = js.native
  /**
    * Create a button item.
    */
  def createButton(value: atJupyterlabApputilsLib.libDialogMod.DialogNs.ButtonOptions): atJupyterlabApputilsLib.libDialogMod.DialogNs.IButton = js.native
  /**
    * Create an accept button.
    */
  def okButton(): atJupyterlabApputilsLib.libDialogMod.DialogNs.IButton = js.native
  def okButton(options: atJupyterlabApputilsLib.libDialogMod.DialogNs.ButtonOptions): atJupyterlabApputilsLib.libDialogMod.DialogNs.IButton = js.native
  /**
    * Create a warn button.
    */
  def warnButton(): atJupyterlabApputilsLib.libDialogMod.DialogNs.IButton = js.native
  def warnButton(options: atJupyterlabApputilsLib.libDialogMod.DialogNs.ButtonOptions): atJupyterlabApputilsLib.libDialogMod.DialogNs.IButton = js.native
}

