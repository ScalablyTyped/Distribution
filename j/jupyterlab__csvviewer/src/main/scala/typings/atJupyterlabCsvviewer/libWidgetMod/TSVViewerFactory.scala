package typings.atJupyterlabCsvviewer.libWidgetMod

import typings.atJupyterlabDocregistry.atJupyterlabDocregistryMod.ABCWidgetFactory
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/csvviewer/lib/widget", "TSVViewerFactory")
@js.native
class TSVViewerFactory () extends ABCWidgetFactory[IDocumentWidget[CSVViewer, IModel], IModel]

