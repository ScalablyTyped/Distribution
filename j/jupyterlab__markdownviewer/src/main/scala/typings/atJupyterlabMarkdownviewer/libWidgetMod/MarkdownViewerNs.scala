package typings.atJupyterlabMarkdownviewer.libWidgetMod

import typings.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownViewerNs.IConfig
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/markdownviewer/lib/widget", "MarkdownViewer")
@js.native
object MarkdownViewerNs extends js.Object {
  trait IConfig extends js.Object {
    /**
      * User preferred font family for markdown viewer.
      */
    var fontFamily: String | Null
    /**
      * User preferred size in pixel of the font used in markdown viewer.
      */
    var fontSize: Double | Null
    /**
      * Whether to hide the YALM front matter.
      */
    var hideFrontMatter: Boolean
    /**
      * User preferred text line height, as a multiplier of font size.
      */
    var lineHeight: Double | Null
    /**
      * User preferred text line width expressed in CSS ch units.
      */
    var lineWidth: Double | Null
    /**
      * The render timeout.
      */
    var renderTimeout: Double
  }
  
  /**
    * The options used to initialize a MarkdownViewer.
    */
  trait IOptions extends js.Object {
    /**
      * Context
      */
    var context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IContext<DocumentRegistry.IModel> */ js.Any
    /**
      * The renderer instance.
      */
    var renderer: IRenderer
  }
  
  /**
    * The default configuration options for an editor.
    */
  val defaultConfig: IConfig = js.native
}

