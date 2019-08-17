package typings.atJupyterlabImageviewer.libWidgetMod

import typings.atJupyterlabDocregistry.libMod.ABCWidgetFactory
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IModel
import typings.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/imageviewer/lib/widget", "ImageViewerFactory")
@js.native
class ImageViewerFactory () extends ABCWidgetFactory[IDocumentWidget[ImageViewer, IModel], IModel]

