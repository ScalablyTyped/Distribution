package typings
package atJupyterlabNotebookLib.atJupyterlabNotebookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook", "StaticNotebook")
@js.native
object StaticNotebookNs extends js.Object {
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory ()
    extends atJupyterlabNotebookLib.libWidgetMod.StaticNotebookNs.ContentFactory
  
  /**
    * Default content factory for the static notebook widget.
    */
  val defaultContentFactory: atJupyterlabNotebookLib.libWidgetMod.StaticNotebookNs.IContentFactory = js.native
  /**
    * Default configuration options for cell editors.
    */
  val defaultEditorConfig: atJupyterlabNotebookLib.libWidgetMod.StaticNotebookNs.IEditorConfig = js.native
  /**
    * A namespace for the staic notebook content factory.
    */
  @JSName("ContentFactory")
  @js.native
  object ContentFactoryNs extends js.Object
  
}

