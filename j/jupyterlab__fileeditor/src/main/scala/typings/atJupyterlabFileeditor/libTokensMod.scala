package typings.atJupyterlabFileeditor

import typings.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typings.atJupyterlabFileeditor.libWidgetMod.FileEditor
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/fileeditor/lib/tokens", JSImport.Namespace)
@js.native
object libTokensMod extends js.Object {
  val IEditorTracker: Token[typings.atJupyterlabFileeditor.libTokensMod.IEditorTracker] = js.native
  type IEditorTracker = IWidgetTracker[IDocumentWidget[FileEditor, IModel]]
}

