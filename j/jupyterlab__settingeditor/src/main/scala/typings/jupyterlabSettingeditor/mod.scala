package typings.jupyterlabSettingeditor

import typings.jupyterlabSettingeditor.settingeditorMod.SettingEditor.IOptions
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/settingeditor", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ISettingEditorTracker: Token[typings.jupyterlabSettingeditor.tokensMod.ISettingEditorTracker] = js.native
  
  @js.native
  class SettingEditor protected ()
    extends typings.jupyterlabSettingeditor.settingeditorMod.SettingEditor {
    /**
      * Create a new setting editor.
      */
    def this(options: IOptions) = this()
  }
}
