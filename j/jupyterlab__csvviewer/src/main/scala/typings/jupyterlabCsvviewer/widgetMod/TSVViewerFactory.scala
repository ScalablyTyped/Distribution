package typings.jupyterlabCsvviewer.widgetMod

import typings.jupyterlabDocregistry.mod.ABCWidgetFactory
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.IDocumentWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/csvviewer/lib/widget", "TSVViewerFactory")
@js.native
class TSVViewerFactory () extends ABCWidgetFactory[IDocumentWidget[CSVViewer, IModel], IModel]

