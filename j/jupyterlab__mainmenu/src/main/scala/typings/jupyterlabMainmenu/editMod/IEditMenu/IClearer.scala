package typings.jupyterlabMainmenu.editMod.IEditMenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an activity that wants to register a 'Clear...' menu item
  */
trait IClearer[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * A function to clear all of an activity.
    */
  var clearAll: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
  /**
    * A function to clear the currently portion of activity.
    */
  var clearCurrent: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
  /**
    * A name for the thing to be cleared, used for labeling `clearCurrent`.
    */
  var noun: js.UndefOr[String] = js.undefined
  /**
    * A plural name for the thing to be cleared, used for labeling `clearAll`.
    */
  var pluralNoun: js.UndefOr[String] = js.undefined
}

object IClearer {
  @scala.inline
  def apply[/* <: typings.luminoWidgets.mod.Widget */ T](
    tracker: IWidgetTracker[T],
    clearAll: /* widget */ T => Unit = null,
    clearCurrent: /* widget */ T => Unit = null,
    isEnabled: T => Boolean = null,
    noun: String = null,
    pluralNoun: String = null
  ): IClearer[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    if (clearAll != null) __obj.updateDynamic("clearAll")(js.Any.fromFunction1(clearAll))
    if (clearCurrent != null) __obj.updateDynamic("clearCurrent")(js.Any.fromFunction1(clearCurrent))
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    if (noun != null) __obj.updateDynamic("noun")(noun.asInstanceOf[js.Any])
    if (pluralNoun != null) __obj.updateDynamic("pluralNoun")(pluralNoun.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClearer[T]]
  }
}

