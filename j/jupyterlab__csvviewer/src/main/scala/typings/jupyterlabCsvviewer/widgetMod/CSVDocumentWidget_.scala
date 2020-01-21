package typings.jupyterlabCsvviewer.widgetMod

import typings.jupyterlabCsvviewer.widgetMod.CSVDocumentWidget.IOptions
import typings.jupyterlabDocregistry.mod.DocumentWidget
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/csvviewer/lib/widget", "CSVDocumentWidget")
@js.native
class CSVDocumentWidget_ protected () extends DocumentWidget[CSVViewer, IModel] {
  def this(options: IOptions) = this()
}

