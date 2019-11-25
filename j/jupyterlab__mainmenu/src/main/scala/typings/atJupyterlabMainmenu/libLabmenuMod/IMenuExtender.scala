package typings.atJupyterlabMainmenu.libLabmenuMod

import typings.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMenuExtender[T /* <: Widget */] extends js.Object {
  /**
    * An additional function that determines whether the extender
    * is enabled. By default it is considered enabled if the application
    * active widget is contained in the `tracker`. If this is also
    * provided, the criterion is equivalent to
    * `tracker.has(widget) && extender.isEnabled(widget)`
    */
  var isEnabled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.undefined
  /**
    * A widget tracker for identifying the appropriate extender.
    */
  var tracker: IWidgetTracker[T]
}

object IMenuExtender {
  @scala.inline
  def apply[T /* <: Widget */](tracker: IWidgetTracker[T], isEnabled: /* widget */ T => Boolean = null): IMenuExtender[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    __obj.asInstanceOf[IMenuExtender[T]]
  }
}

