package typings.atJupyterlabSettingeditor

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.MainAreaWidget
import typings.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.atJupyterlabSettingeditor.libSettingeditorMod.SettingEditor
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/settingeditor/lib/tokens", JSImport.Namespace)
@js.native
object libTokensMod extends js.Object {
  val ISettingEditorTracker: Token[typings.atJupyterlabSettingeditor.libTokensMod.ISettingEditorTracker] = js.native
  type ISettingEditorTracker = IWidgetTracker[MainAreaWidget[SettingEditor]]
}

