package typings.atJupyterlabTerminal

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.MainAreaWidget
import typings.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.atJupyterlabTerminal.libTokensMod.ITerminalNs.ITerminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTokensMod {
  type ITerminalTracker = IWidgetTracker[MainAreaWidget[ITerminal]]
}
