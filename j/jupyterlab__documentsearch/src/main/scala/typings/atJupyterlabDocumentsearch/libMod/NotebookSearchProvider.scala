package typings.atJupyterlabDocumentsearch.libMod

import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/documentsearch/lib", "NotebookSearchProvider")
@js.native
class NotebookSearchProvider ()
  extends typings.atJupyterlabDocumentsearch.libProvidersNotebooksearchproviderMod.NotebookSearchProvider

/* static members */
@JSImport("@jupyterlab/documentsearch/lib", "NotebookSearchProvider")
@js.native
object NotebookSearchProvider extends js.Object {
  /**
    * Report whether or not this provider has the ability to search on the given object
    */
  def canSearchOn(domain: Widget): /* is any */ Boolean = js.native
}

