package typings.jupyterlabNotebook.mod

import typings.jupyterlabNotebook.widgetfactoryMod.NotebookWidgetFactory.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/notebook", "NotebookWidgetFactory")
@js.native
class NotebookWidgetFactory protected ()
  extends typings.jupyterlabNotebook.widgetfactoryMod.NotebookWidgetFactory {
  /**
    * Construct a new notebook widget factory.
    *
    * @param options - The options used to construct the factory.
    */
  def this(options: IOptions[typings.jupyterlabNotebook.panelMod.NotebookPanel]) = this()
}
