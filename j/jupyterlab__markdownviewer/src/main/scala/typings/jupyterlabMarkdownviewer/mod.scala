package typings.jupyterlabMarkdownviewer

import typings.jupyterlabDocregistry.libDefaultMod.DocumentWidget.IOptions
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.jupyterlabMarkdownviewer.libWidgetMod.MarkdownViewer.IConfig
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/markdownviewer", "IMarkdownViewerTracker")
  @js.native
  val IMarkdownViewerTracker: Token[typings.jupyterlabMarkdownviewer.libTokensMod.IMarkdownViewerTracker] = js.native
  
  @JSImport("@jupyterlab/markdownviewer", "MarkdownDocument")
  @js.native
  open class MarkdownDocument protected ()
    extends typings.jupyterlabMarkdownviewer.libWidgetMod.MarkdownDocument {
    def this(options: IOptions[typings.jupyterlabMarkdownviewer.libWidgetMod.MarkdownViewer, IModel]) = this()
  }
  
  @JSImport("@jupyterlab/markdownviewer", "MarkdownViewer")
  @js.native
  open class MarkdownViewer protected ()
    extends typings.jupyterlabMarkdownviewer.libWidgetMod.MarkdownViewer {
    /**
      * Construct a new markdown viewer widget.
      */
    def this(options: typings.jupyterlabMarkdownviewer.libWidgetMod.MarkdownViewer.IOptions) = this()
  }
  object MarkdownViewer {
    
    /**
      * The default configuration options for an editor.
      */
    @JSImport("@jupyterlab/markdownviewer", "MarkdownViewer.defaultConfig")
    @js.native
    val defaultConfig: IConfig = js.native
  }
  
  @JSImport("@jupyterlab/markdownviewer", "MarkdownViewerFactory")
  @js.native
  open class MarkdownViewerFactory protected ()
    extends typings.jupyterlabMarkdownviewer.libWidgetMod.MarkdownViewerFactory {
    /**
      * Construct a new markdown viewer widget factory.
      */
    def this(options: typings.jupyterlabMarkdownviewer.libWidgetMod.MarkdownViewerFactory.IOptions) = this()
  }
}
