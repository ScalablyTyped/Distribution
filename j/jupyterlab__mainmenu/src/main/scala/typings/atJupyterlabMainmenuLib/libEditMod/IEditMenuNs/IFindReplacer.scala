package typings
package atJupyterlabMainmenuLib.libEditMod.IEditMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an activity that uses Find/Find+Replace.
  */
trait IFindReplacer[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */]
  extends atJupyterlabMainmenuLib.libLabmenuMod.IMenuExtender[T] {
  /**
    * Execute a find command for the activity.
    */
  var find: js.UndefOr[js.Function1[/* widget */ T, scala.Unit]] = js.undefined
  /**
    * Execute a find/replace command for the activity.
    */
  var findAndReplace: js.UndefOr[js.Function1[/* widget */ T, scala.Unit]] = js.undefined
}

object IFindReplacer {
  @scala.inline
  def apply[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */](
    tracker: atJupyterlabApputilsLib.libInstancetrackerMod.IInstanceTracker[T],
    find: /* widget */ T => scala.Unit = null,
    findAndReplace: /* widget */ T => scala.Unit = null,
    isEnabled: T => scala.Boolean = null
  ): IFindReplacer[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker)
    if (find != null) __obj.updateDynamic("find")(js.Any.fromFunction1(find))
    if (findAndReplace != null) __obj.updateDynamic("findAndReplace")(js.Any.fromFunction1(findAndReplace))
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    __obj.asInstanceOf[IFindReplacer[T]]
  }
}

