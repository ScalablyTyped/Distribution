package typings.atJupyterlabFileeditor

import typings.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/fileeditor/lib/tokens", JSImport.Namespace)
@js.native
object libTokensMod extends js.Object {
  val IEditorTracker: Token[typings.atJupyterlabFileeditor.libTokensMod.IEditorTracker] = js.native
  type IEditorTracker = IWidgetTracker[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IDocumentWidget<FileEditor> */ js.Any
  ]
}

