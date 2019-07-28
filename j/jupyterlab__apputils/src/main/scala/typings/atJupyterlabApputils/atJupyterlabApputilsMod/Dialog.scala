package typings.atJupyterlabApputils.atJupyterlabApputilsMod

import typings.atJupyterlabApputils.libDialogMod.DialogNs.IOptions
import typings.std.Partial
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
  extends typings.atJupyterlabApputils.libDialogMod.Dialog[T] {
  def this(options: Partial[IOptions[T]]) = this()
}

