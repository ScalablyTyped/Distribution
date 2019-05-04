package typings
package atJupyterlabNotebookLib.libActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions")
@js.native
/**
  * A private constructor for the `NotebookActions` class.
  *
  * #### Notes
  * This class can never be instantiated. Its static member `executed` will be
  * merged with the `NotebookActions` namespace. The reason it exists as a
  * standalone class is because at run time, the `Private.executed` variable
  * does not yet exist, so it needs to be referenced via a getter.
  */
class NotebookActions protected () extends js.Object

/* static members */
@JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions")
@js.native
object NotebookActions extends js.Object {
  /**
    * A signal that emits whenever a cell is run.
    */
  val executed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[_, atJupyterlabNotebookLib.Anon_Cell] = js.native
}

