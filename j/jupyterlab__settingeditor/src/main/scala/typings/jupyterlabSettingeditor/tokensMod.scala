package typings.jupyterlabSettingeditor

import typings.jupyterlabApputils.mod.MainAreaWidget
import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabSettingeditor.settingeditorMod.SettingEditor
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
  @JSImport("@jupyterlab/settingeditor/lib/tokens", "ISettingEditorTracker")
  @js.native
  val ISettingEditorTracker: Token[typings.jupyterlabSettingeditor.tokensMod.ISettingEditorTracker] = js.native
  type ISettingEditorTracker = IWidgetTracker[MainAreaWidget[SettingEditor]]
}
