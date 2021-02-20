package typings.jupyterlabMarkdownviewer

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMarkdownviewer.widgetMod.MarkdownDocument
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
  @JSImport("@jupyterlab/markdownviewer/lib/tokens", "IMarkdownViewerTracker")
  @js.native
  val IMarkdownViewerTracker: Token[typings.jupyterlabMarkdownviewer.tokensMod.IMarkdownViewerTracker] = js.native
  type IMarkdownViewerTracker = IWidgetTracker[MarkdownDocument]
}
