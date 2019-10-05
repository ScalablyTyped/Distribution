package typings.atJupyterlabSettingeditor

import typings.atJupyterlabSettingeditor.libSettingeditorMod.SettingEditor.IOptions
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/settingeditor", JSImport.Namespace)
@js.native
object atJupyterlabSettingeditorMod extends js.Object {
  @js.native
  class SettingEditor protected ()
    extends typings.atJupyterlabSettingeditor.libSettingeditorMod.SettingEditor {
    /**
      * Create a new setting editor.
      */
    def this(options: IOptions) = this()
  }
  
  val ISettingEditorTracker: Token[typings.atJupyterlabSettingeditor.libTokensMod.ISettingEditorTracker] = js.native
}

