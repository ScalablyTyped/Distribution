package typings.atJupyterlabCsvviewer.libWidgetMod

import typings.atJupyterlabDocregistry.libMod.ABCWidgetFactory
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IModel
import typings.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/csvviewer/lib/widget", "CSVViewerFactory")
@js.native
class CSVViewerFactory () extends ABCWidgetFactory[IDocumentWidget[CSVViewer, IModel], IModel]

