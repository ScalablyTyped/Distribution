package typings.jupyterlabImageviewer

import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/imageviewer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ImageViewer protected ()
    extends typings.jupyterlabImageviewer.widgetMod.ImageViewer {
    /**
      * Construct a new image widget.
      */
    def this(context: Context) = this()
  }
  
  @js.native
  class ImageViewerFactory ()
    extends typings.jupyterlabImageviewer.widgetMod.ImageViewerFactory
  
  val IImageTracker: Token[typings.jupyterlabImageviewer.tokensMod.IImageTracker] = js.native
}

