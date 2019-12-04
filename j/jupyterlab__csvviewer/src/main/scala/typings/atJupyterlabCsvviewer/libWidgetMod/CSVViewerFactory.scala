package typings.atJupyterlabCsvviewer.libWidgetMod

import typings.atJupyterlabDocregistry.atJupyterlabDocregistryMod.ABCWidgetFactory
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/csvviewer/lib/widget", "CSVViewerFactory")
@js.native
class CSVViewerFactory () extends ABCWidgetFactory[IDocumentWidget[CSVViewer, IModel], IModel]

