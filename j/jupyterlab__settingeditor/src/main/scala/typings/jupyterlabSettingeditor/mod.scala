package typings.jupyterlabSettingeditor

import typings.jupyterlabSettingeditor.settingeditorMod.SettingEditor.IOptions
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/settingeditor", "ISettingEditorTracker")
  @js.native
  val ISettingEditorTracker: Token[typings.jupyterlabSettingeditor.tokensMod.ISettingEditorTracker] = js.native
  
  @JSImport("@jupyterlab/settingeditor", "SettingEditor")
  @js.native
  class SettingEditor protected ()
    extends typings.jupyterlabSettingeditor.settingeditorMod.SettingEditor {
    /**
      * Create a new setting editor.
      */
    def this(options: IOptions) = this()
  }
}
