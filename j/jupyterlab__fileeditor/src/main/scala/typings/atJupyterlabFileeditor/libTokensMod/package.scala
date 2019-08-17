package typings.atJupyterlabFileeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTokensMod {
  import typings.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
  import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IModel
  import typings.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget
  import typings.atJupyterlabFileeditor.libWidgetMod.FileEditor

  type IEditorTracker = IWidgetTracker[IDocumentWidget[FileEditor, IModel]]
}
