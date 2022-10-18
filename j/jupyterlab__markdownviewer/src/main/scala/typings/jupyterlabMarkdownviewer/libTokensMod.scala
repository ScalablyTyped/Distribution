package typings.jupyterlabMarkdownviewer

import typings.jupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.jupyterlabMarkdownviewer.libWidgetMod.MarkdownDocument
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  @JSImport("@jupyterlab/markdownviewer/lib/tokens", "IMarkdownViewerTracker")
  @js.native
  val IMarkdownViewerTracker: Token[typings.jupyterlabMarkdownviewer.libTokensMod.IMarkdownViewerTracker] = js.native
  type IMarkdownViewerTracker = IWidgetTracker[MarkdownDocument]
}
