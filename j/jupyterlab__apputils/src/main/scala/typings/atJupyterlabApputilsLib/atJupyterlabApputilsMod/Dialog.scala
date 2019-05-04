package typings
package atJupyterlabApputilsLib.atJupyterlabApputilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "Dialog")
@js.native
/**
  * Create a dialog panel instance.
  *
  * @param options - The dialog setup options.
  */
class Dialog[T] ()
  extends atJupyterlabApputilsLib.libDialogMod.Dialog[T] {
  def this(options: stdLib.Partial[atJupyterlabApputilsLib.libDialogMod.DialogNs.IOptions[T]]) = this()
}

