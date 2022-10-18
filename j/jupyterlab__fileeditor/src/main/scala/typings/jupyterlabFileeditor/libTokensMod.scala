package typings.jupyterlabFileeditor

import typings.jupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typings.jupyterlabFileeditor.libWidgetMod.FileEditor
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  @JSImport("@jupyterlab/fileeditor/lib/tokens", "IEditorTracker")
  @js.native
  val IEditorTracker: Token[typings.jupyterlabFileeditor.libTokensMod.IEditorTracker] = js.native
  type IEditorTracker = IWidgetTracker[IDocumentWidget[FileEditor, IModel]]
}
