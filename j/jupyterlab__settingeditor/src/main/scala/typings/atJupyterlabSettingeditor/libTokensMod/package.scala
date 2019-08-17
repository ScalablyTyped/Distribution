package typings.atJupyterlabSettingeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTokensMod {
  import typings.atJupyterlabApputils.atJupyterlabApputilsMod.MainAreaWidget
  import typings.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
  import typings.atJupyterlabSettingeditor.libSettingeditorMod.SettingEditor

  type ISettingEditorTracker = IWidgetTracker[MainAreaWidget[SettingEditor]]
}
