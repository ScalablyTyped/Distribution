package typings.atJupyterlabNotebook.atJupyterlabNotebookMod

import typings.atJupyterlabNotebook.libWidgetMod.StaticNotebook.IContentFactory
import typings.atJupyterlabNotebook.libWidgetMod.StaticNotebook.IEditorConfig
import typings.atJupyterlabNotebook.libWidgetMod.StaticNotebook.INotebookConfig
import typings.atJupyterlabNotebook.libWidgetMod.StaticNotebook.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook", "StaticNotebook")
@js.native
class StaticNotebook protected ()
  extends typings.atJupyterlabNotebook.libWidgetMod.StaticNotebook {
  /**
    * Construct a notebook widget.
    */
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/notebook", "StaticNotebook")
@js.native
object StaticNotebook extends js.Object {
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory ()
    extends typings.atJupyterlabNotebook.libWidgetMod.StaticNotebook.ContentFactory
  
  /**
    * Default content factory for the static notebook widget.
    */
  val defaultContentFactory: IContentFactory = js.native
  /**
    * Default configuration options for cell editors.
    */
  val defaultEditorConfig: IEditorConfig = js.native
  /**
    * Default configuration options for notebooks.
    */
  val defaultNotebookConfig: INotebookConfig = js.native
  /**
    * A namespace for the staic notebook content factory.
    */
  @js.native
  object ContentFactory extends js.Object
  
}

