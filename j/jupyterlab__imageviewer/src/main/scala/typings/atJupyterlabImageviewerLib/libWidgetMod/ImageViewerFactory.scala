package typings
package atJupyterlabImageviewerLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/imageviewer/lib/widget", "ImageViewerFactory")
@js.native
class ImageViewerFactory ()
  extends atJupyterlabDocregistryLib.atJupyterlabDocregistryMod.ABCWidgetFactory[
      atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[ImageViewer, atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel], 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IModel */ js.Any
    ] {
  /**
    * Create a new widget given a context.
    */
  /* protected */ def createNewWidget(
    context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IContext[atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel]
  ): atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[ImageViewer, atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel] = js.native
}

