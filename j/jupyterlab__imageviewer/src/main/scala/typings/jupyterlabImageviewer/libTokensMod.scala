package typings.jupyterlabImageviewer

import typings.jupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typings.jupyterlabImageviewer.libWidgetMod.ImageViewer
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  @JSImport("@jupyterlab/imageviewer/lib/tokens", "IImageTracker")
  @js.native
  val IImageTracker: Token[typings.jupyterlabImageviewer.libTokensMod.IImageTracker] = js.native
  type IImageTracker = IWidgetTracker[IDocumentWidget[ImageViewer, IModel]]
}
