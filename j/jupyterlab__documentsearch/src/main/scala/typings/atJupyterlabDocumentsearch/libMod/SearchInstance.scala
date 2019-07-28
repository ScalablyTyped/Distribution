package typings.atJupyterlabDocumentsearch.libMod

import typings.atJupyterlabDocumentsearch.libInterfacesMod.ISearchProvider
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/documentsearch/lib", "SearchInstance")
@js.native
class SearchInstance protected ()
  extends typings.atJupyterlabDocumentsearch.libSearchinstanceMod.SearchInstance {
  def this(widget: Widget, searchProvider: ISearchProvider[Widget]) = this()
}

