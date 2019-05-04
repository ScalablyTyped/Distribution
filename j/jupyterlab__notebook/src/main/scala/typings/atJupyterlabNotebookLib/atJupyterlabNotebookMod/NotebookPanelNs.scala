package typings
package atJupyterlabNotebookLib.atJupyterlabNotebookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook", "NotebookPanel")
@js.native
object NotebookPanelNs extends js.Object {
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory ()
    extends atJupyterlabNotebookLib.libPanelMod.NotebookPanelNs.ContentFactory
  
  /**
    * The notebook renderer token.
    */
  val IContentFactory: atPhosphorCoreutilsLib.atPhosphorCoreutilsMod.Token[atJupyterlabNotebookLib.libPanelMod.NotebookPanelNs.IContentFactory] = js.native
  /**
    * Default content factory for the notebook panel.
    */
  val defaultContentFactory: atJupyterlabNotebookLib.libPanelMod.NotebookPanelNs.ContentFactory = js.native
}

