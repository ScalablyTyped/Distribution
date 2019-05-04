package typings
package atJupyterlabMainmenuLib.libLabmenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMenuExtender[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */] extends js.Object {
  /**
    * An additional function that determines whether the extender
    * is enabled. By default it is considered enabled if the application
    * active widget is contained in the `tracker`. If this is also
    * provided, the criterion is equivalent to
    * `tracker.has(widget) && extender.isEnabled(widget)`
    */
  var isEnabled: js.UndefOr[js.Function1[/* widget */ T, scala.Boolean]] = js.undefined
  /**
    * A widget tracker for identifying the appropriate extender.
    */
  var tracker: atJupyterlabApputilsLib.libInstancetrackerMod.IInstanceTracker[T]
}

object IMenuExtender {
  @scala.inline
  def apply[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */](
    tracker: atJupyterlabApputilsLib.libInstancetrackerMod.IInstanceTracker[T],
    isEnabled: /* widget */ T => scala.Boolean = null
  ): IMenuExtender[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker)
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    __obj.asInstanceOf[IMenuExtender[T]]
  }
}

