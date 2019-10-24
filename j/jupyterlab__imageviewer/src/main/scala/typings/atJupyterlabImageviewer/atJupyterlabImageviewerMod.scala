package typings.atJupyterlabImageviewer

import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/imageviewer", JSImport.Namespace)
@js.native
object atJupyterlabImageviewerMod extends js.Object {
  @js.native
  class ImageViewer protected ()
    extends typings.atJupyterlabImageviewer.libWidgetMod.ImageViewer {
    /**
      * Construct a new image widget.
      */
    def this(context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.Context */ js.Any) = this()
  }
  
  @js.native
  class ImageViewerFactory ()
    extends typings.atJupyterlabImageviewer.libWidgetMod.ImageViewerFactory
  
  val IImageTracker: Token[typings.atJupyterlabImageviewer.libTokensMod.IImageTracker] = js.native
}

