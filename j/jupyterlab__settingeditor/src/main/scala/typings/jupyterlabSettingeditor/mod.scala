package typings.jupyterlabSettingeditor

import typings.jupyterlabSettingeditor.libJsonsettingeditorMod.JsonSettingEditor.IOptions
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/settingeditor", "IJSONSettingEditorTracker")
  @js.native
  val IJSONSettingEditorTracker: Token[typings.jupyterlabSettingeditor.libTokensMod.IJSONSettingEditorTracker] = js.native
  
  @JSImport("@jupyterlab/settingeditor", "ISettingEditorTracker")
  @js.native
  val ISettingEditorTracker: Token[typings.jupyterlabSettingeditor.libTokensMod.ISettingEditorTracker] = js.native
  
  @JSImport("@jupyterlab/settingeditor", "JsonSettingEditor")
  @js.native
  open class JsonSettingEditor protected ()
    extends typings.jupyterlabSettingeditor.libJsonsettingeditorMod.JsonSettingEditor {
    /**
      * Create a new setting editor.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/settingeditor", "SettingsEditor")
  @js.native
  open class SettingsEditor protected ()
    extends typings.jupyterlabSettingeditor.libSettingseditorMod.SettingsEditor {
    def this(options: typings.jupyterlabSettingeditor.libSettingseditorMod.SettingsEditor.IOptions) = this()
  }
}
