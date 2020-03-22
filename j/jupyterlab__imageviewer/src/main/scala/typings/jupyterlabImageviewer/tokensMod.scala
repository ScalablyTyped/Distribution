package typings.jupyterlabImageviewer

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.IDocumentWidget
import typings.jupyterlabImageviewer.widgetMod.ImageViewer
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/imageviewer/lib/tokens", JSImport.Namespace)
@js.native
object tokensMod extends js.Object {
  val IImageTracker: Token[typings.jupyterlabImageviewer.tokensMod.IImageTracker] = js.native
  type IImageTracker = IWidgetTracker[IDocumentWidget[ImageViewer, IModel]]
}

