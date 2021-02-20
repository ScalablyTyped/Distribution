package typings.jupyterlabMarkdownviewer

import typings.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptions
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabMarkdownviewer.widgetMod.MarkdownViewer.IConfig
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/markdownviewer", "IMarkdownViewerTracker")
  @js.native
  val IMarkdownViewerTracker: Token[typings.jupyterlabMarkdownviewer.tokensMod.IMarkdownViewerTracker] = js.native
  
  @JSImport("@jupyterlab/markdownviewer", "MarkdownDocument")
  @js.native
  class MarkdownDocument protected ()
    extends typings.jupyterlabMarkdownviewer.widgetMod.MarkdownDocument {
    def this(options: IOptions[typings.jupyterlabMarkdownviewer.widgetMod.MarkdownViewer, IModel]) = this()
  }
  
  @JSImport("@jupyterlab/markdownviewer", "MarkdownViewer")
  @js.native
  class MarkdownViewer protected ()
    extends typings.jupyterlabMarkdownviewer.widgetMod.MarkdownViewer {
    /**
      * Construct a new markdown viewer widget.
      */
    def this(options: typings.jupyterlabMarkdownviewer.widgetMod.MarkdownViewer.IOptions) = this()
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
  class MarkdownViewerFactory protected ()
    extends typings.jupyterlabMarkdownviewer.widgetMod.MarkdownViewerFactory {
    /**
      * Construct a new markdown viewer widget factory.
      */
    def this(options: typings.jupyterlabMarkdownviewer.widgetMod.MarkdownViewerFactory.IOptions) = this()
  }
}
