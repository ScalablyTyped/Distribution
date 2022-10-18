package typings.jupyterlabVdom

import typings.jupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IContext
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.mod.MimeDocument
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRenderer
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererOptions
import typings.luminoCoreutils.mod.Token
import typings.nteractTransformVdom.libEventToObjectMod.SerializedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/vdom", "IVDOMTracker")
  @js.native
  val IVDOMTracker: Token[typings.jupyterlabVdom.mod.IVDOMTracker] = js.native
  type IVDOMTracker = IWidgetTracker[MimeDocument]
  
  @JSImport("@jupyterlab/vdom", "RenderedVDOM")
  @js.native
  open class RenderedVDOM protected () extends IRenderer {
    /**
      * Create a new widget for rendering DOM.
      */
    def this(options: IRendererOptions) = this()
    def this(options: IRendererOptions, context: IContext[IModel]) = this()
    
    /* private */ var _comms: Any = js.native
    
    /* private */ var _mimeType: Any = js.native
    
    /* private */ var _sessionContext: Any = js.native
    
    /* private */ var _timer: Any = js.native
    
    /**
      * Handle events for VDOM element.
      */
    def handleVDOMEvent(targetName: String, event: SerializedEvent[Any]): Unit = js.native
  }
}
