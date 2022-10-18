package typings.jupyterlabImageviewer

import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.Context
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/imageviewer", "IImageTracker")
  @js.native
  val IImageTracker: Token[typings.jupyterlabImageviewer.libTokensMod.IImageTracker] = js.native
  
  @JSImport("@jupyterlab/imageviewer", "ImageViewer")
  @js.native
  open class ImageViewer protected ()
    extends typings.jupyterlabImageviewer.libWidgetMod.ImageViewer {
    /**
      * Construct a new image widget.
      */
    def this(context: Context) = this()
  }
  
  @JSImport("@jupyterlab/imageviewer", "ImageViewerFactory")
  @js.native
  open class ImageViewerFactory protected ()
    extends typings.jupyterlabImageviewer.libWidgetMod.ImageViewerFactory {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[IDocumentWidget[typings.jupyterlabImageviewer.libWidgetMod.ImageViewer, IModel]]) = this()
  }
}
