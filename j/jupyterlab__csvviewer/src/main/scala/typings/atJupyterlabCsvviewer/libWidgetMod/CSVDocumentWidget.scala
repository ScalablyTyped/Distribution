package typings.atJupyterlabCsvviewer.libWidgetMod

import typings.atJupyterlabCsvviewer.libWidgetMod.CSVDocumentWidgetNs.IOptions
import typings.atJupyterlabDocregistry.libMod.DocumentWidget
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/csvviewer/lib/widget", "CSVDocumentWidget")
@js.native
class CSVDocumentWidget protected () extends DocumentWidget[CSVViewer, IModel] {
  def this(options: IOptions) = this()
}

