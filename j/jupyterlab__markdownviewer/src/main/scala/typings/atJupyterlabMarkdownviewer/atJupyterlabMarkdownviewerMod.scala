package typings.atJupyterlabMarkdownviewer

import typings.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownViewer.IConfig
import typings.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownViewer.IOptions
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/markdownviewer", JSImport.Namespace)
@js.native
object atJupyterlabMarkdownviewerMod extends js.Object {
  @js.native
  class MarkdownDocument ()
    extends typings.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownDocument
  
  @js.native
  class MarkdownViewer protected ()
    extends typings.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownViewer {
    /**
      * Construct a new markdown viewer widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class MarkdownViewerFactory protected ()
    extends typings.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownViewerFactory {
    /**
      * Construct a new mimetype widget factory.
      */
    def this(options: typings.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownViewerFactory.IOptions) = this()
  }
  
  val IMarkdownViewerTracker: Token[typings.atJupyterlabMarkdownviewer.libTokensMod.IMarkdownViewerTracker] = js.native
  @js.native
  object MarkdownViewer extends js.Object {
    /**
      * The default configuration options for an editor.
      */
    val defaultConfig: IConfig = js.native
  }
  
}

