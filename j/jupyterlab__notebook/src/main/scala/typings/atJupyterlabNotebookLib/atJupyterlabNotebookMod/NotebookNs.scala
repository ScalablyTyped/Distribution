package typings
package atJupyterlabNotebookLib.atJupyterlabNotebookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook", "Notebook")
@js.native
object NotebookNs extends js.Object {
  /**
    * The default implementation of a notebook content factory..
    *
    * #### Notes
    * Override methods on this class to customize the default notebook factory
    * methods that create notebook content.
    */
  @js.native
  class ContentFactory ()
    extends atJupyterlabNotebookLib.libWidgetMod.NotebookNs.ContentFactory
  
  val defaultContentFactory: atJupyterlabNotebookLib.libWidgetMod.NotebookNs.IContentFactory = js.native
  /**
    * A namespace for the notebook content factory.
    */
  @JSName("ContentFactory")
  @js.native
  object ContentFactoryNs extends js.Object
  
}

