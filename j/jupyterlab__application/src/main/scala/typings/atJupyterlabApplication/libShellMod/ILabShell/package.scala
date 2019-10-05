package typings.atJupyterlabApplication.libShellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ILabShell {
  import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget

  /**
    * The restorable description of an area within the main dock panel.
    */
  type AreaConfig = typings.atPhosphorWidgets.libDocklayoutMod.DockLayout.AreaConfig
  /**
    * An arguments object for the changed signals.
    */
  type IChangedArgs = typings.atPhosphorWidgets.libFocustrackerMod.FocusTracker.IChangedArgs[Widget]
}
