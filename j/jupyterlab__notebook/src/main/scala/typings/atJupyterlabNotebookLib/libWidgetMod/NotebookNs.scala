package typings
package atJupyterlabNotebookLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/widget", "Notebook")
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
    extends atJupyterlabNotebookLib.libWidgetMod.StaticNotebookNs.ContentFactory
  
  val defaultContentFactory: IContentFactory = js.native
  /**
    * A namespace for the notebook content factory.
    */
  @JSName("ContentFactory")
  @js.native
  object ContentFactoryNs extends js.Object {
    /**
      * An options object for initializing a notebook content factory.
      */
    type IOptions = atJupyterlabNotebookLib.libWidgetMod.StaticNotebookNs.ContentFactoryNs.IOptions
  }
  
  /**
    * The content factory for the notebook widget.
    */
  type IContentFactory = atJupyterlabNotebookLib.libWidgetMod.StaticNotebookNs.IContentFactory
  /**
    * An options object for initializing a notebook widget.
    */
  type IOptions = atJupyterlabNotebookLib.libWidgetMod.StaticNotebookNs.IOptions
}

