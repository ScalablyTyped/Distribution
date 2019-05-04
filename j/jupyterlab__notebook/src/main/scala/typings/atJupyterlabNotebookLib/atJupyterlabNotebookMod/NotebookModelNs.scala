package typings
package atJupyterlabNotebookLib.atJupyterlabNotebookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook", "NotebookModel")
@js.native
object NotebookModelNs extends js.Object {
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory protected ()
    extends atJupyterlabNotebookLib.libModelMod.NotebookModelNs.ContentFactory {
    /**
      * Create a new cell model factory.
      */
    def this(options: atJupyterlabNotebookLib.libModelMod.NotebookModelNs.ContentFactoryNs.IOptions) = this()
  }
  
  /**
    * The default `ContentFactory` instance.
    */
  val defaultContentFactory: atJupyterlabNotebookLib.libModelMod.NotebookModelNs.ContentFactory = js.native
  /**
    * A namespace for the notebook model content factory.
    */
  @JSName("ContentFactory")
  @js.native
  object ContentFactoryNs extends js.Object
  
}

