package typings.atJupyterlabMarkdownviewer

import typings.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownDocument
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/markdownviewer/lib/tokens", JSImport.Namespace)
@js.native
object libTokensMod extends js.Object {
  val IMarkdownViewerTracker: Token[typings.atJupyterlabMarkdownviewer.libTokensMod.IMarkdownViewerTracker] = js.native
  type IMarkdownViewerTracker = IWidgetTracker[MarkdownDocument]
}

