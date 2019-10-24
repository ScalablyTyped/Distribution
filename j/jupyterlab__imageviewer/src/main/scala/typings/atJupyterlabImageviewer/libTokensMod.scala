package typings.atJupyterlabImageviewer

import typings.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/imageviewer/lib/tokens", JSImport.Namespace)
@js.native
object libTokensMod extends js.Object {
  val IImageTracker: Token[typings.atJupyterlabImageviewer.libTokensMod.IImageTracker] = js.native
  type IImageTracker = IWidgetTracker[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IDocumentWidget<ImageViewer> */ js.Any
  ]
}

