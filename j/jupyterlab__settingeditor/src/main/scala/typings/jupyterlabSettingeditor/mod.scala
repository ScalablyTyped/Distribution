package typings.jupyterlabSettingeditor

import typings.jupyterlabSettingeditor.settingeditorMod.SettingEditor.IOptions
import typings.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/settingeditor", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class SettingEditor protected ()
    extends typings.jupyterlabSettingeditor.settingeditorMod.SettingEditor {
    /**
      * Create a new setting editor.
      */
    def this(options: IOptions) = this()
  }
  
  val ISettingEditorTracker: Token[typings.jupyterlabSettingeditor.tokensMod.ISettingEditorTracker] = js.native
}

