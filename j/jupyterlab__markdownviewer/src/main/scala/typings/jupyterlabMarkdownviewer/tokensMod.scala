package typings.jupyterlabMarkdownviewer

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMarkdownviewer.widgetMod.MarkdownDocument
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/markdownviewer/lib/tokens", JSImport.Namespace)
@js.native
object tokensMod extends js.Object {
  val IMarkdownViewerTracker: Token[typings.jupyterlabMarkdownviewer.tokensMod.IMarkdownViewerTracker] = js.native
  type IMarkdownViewerTracker = IWidgetTracker[MarkdownDocument]
}

