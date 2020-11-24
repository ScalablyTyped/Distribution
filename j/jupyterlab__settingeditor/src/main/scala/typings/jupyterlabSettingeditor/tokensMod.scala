package typings.jupyterlabSettingeditor

import typings.jupyterlabApputils.mod.MainAreaWidget
import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabSettingeditor.settingeditorMod.SettingEditor
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/settingeditor/lib/tokens", JSImport.Namespace)
@js.native
object tokensMod extends js.Object {
  
  val ISettingEditorTracker: Token[typings.jupyterlabSettingeditor.tokensMod.ISettingEditorTracker] = js.native
  type ISettingEditorTracker = IWidgetTracker[MainAreaWidget[SettingEditor]]
}
