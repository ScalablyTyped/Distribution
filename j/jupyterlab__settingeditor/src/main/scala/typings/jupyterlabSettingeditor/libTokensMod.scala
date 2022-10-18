package typings.jupyterlabSettingeditor

import typings.jupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.jupyterlabApputils.mod.MainAreaWidget
import typings.jupyterlabSettingeditor.libJsonsettingeditorMod.JsonSettingEditor
import typings.jupyterlabSettingeditor.libSettingseditorMod.SettingsEditor
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  @JSImport("@jupyterlab/settingeditor/lib/tokens", "IJSONSettingEditorTracker")
  @js.native
  val IJSONSettingEditorTracker: Token[typings.jupyterlabSettingeditor.libTokensMod.IJSONSettingEditorTracker] = js.native
  type IJSONSettingEditorTracker = IWidgetTracker[MainAreaWidget[JsonSettingEditor]]
  
  @JSImport("@jupyterlab/settingeditor/lib/tokens", "ISettingEditorTracker")
  @js.native
  val ISettingEditorTracker: Token[typings.jupyterlabSettingeditor.libTokensMod.ISettingEditorTracker] = js.native
  type ISettingEditorTracker = IWidgetTracker[MainAreaWidget[SettingsEditor]]
}
