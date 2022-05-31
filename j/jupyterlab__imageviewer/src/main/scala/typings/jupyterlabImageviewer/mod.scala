package typings.jupyterlabImageviewer

import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabDocregistry.registryMod.IDocumentWidget
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/imageviewer", "IImageTracker")
  @js.native
  val IImageTracker: Token[typings.jupyterlabImageviewer.tokensMod.IImageTracker] = js.native
  
  @JSImport("@jupyterlab/imageviewer", "ImageViewer")
  @js.native
  class ImageViewer protected ()
    extends typings.jupyterlabImageviewer.widgetMod.ImageViewer {
    /**
      * Construct a new image widget.
      */
    def this(context: Context) = this()
  }
  
  @JSImport("@jupyterlab/imageviewer", "ImageViewerFactory")
  @js.native
  class ImageViewerFactory protected ()
    extends typings.jupyterlabImageviewer.widgetMod.ImageViewerFactory {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[IDocumentWidget[typings.jupyterlabImageviewer.widgetMod.ImageViewer, IModel]]) = this()
  }
}
