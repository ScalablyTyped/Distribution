package typings
package atJupyterlabMainmenuLib.libEditMod.IEditMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an activity that wants to register a 'Clear...' menu item
  */
trait IClearer[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */]
  extends atJupyterlabMainmenuLib.libLabmenuMod.IMenuExtender[T] {
  /**
    * A function to clear all of an activity.
    */
  var clearAll: js.UndefOr[js.Function1[/* widget */ T, scala.Unit]] = js.undefined
  /**
    * A function to clear the currently portion of activity.
    */
  var clearCurrent: js.UndefOr[js.Function1[/* widget */ T, scala.Unit]] = js.undefined
  /**
    * A name for the thing to be cleared, used for labeling `clearCurrent`.
    */
  var noun: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A plural name for the thing to be cleared, used for labeling `clearAll`.
    */
  var pluralNoun: js.UndefOr[java.lang.String] = js.undefined
}

object IClearer {
  @scala.inline
  def apply[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */](
    tracker: atJupyterlabApputilsLib.libInstancetrackerMod.IInstanceTracker[T],
    clearAll: /* widget */ T => scala.Unit = null,
    clearCurrent: /* widget */ T => scala.Unit = null,
    isEnabled: T => scala.Boolean = null,
    noun: java.lang.String = null,
    pluralNoun: java.lang.String = null
  ): IClearer[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker)
    if (clearAll != null) __obj.updateDynamic("clearAll")(js.Any.fromFunction1(clearAll))
    if (clearCurrent != null) __obj.updateDynamic("clearCurrent")(js.Any.fromFunction1(clearCurrent))
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    if (noun != null) __obj.updateDynamic("noun")(noun)
    if (pluralNoun != null) __obj.updateDynamic("pluralNoun")(pluralNoun)
    __obj.asInstanceOf[IClearer[T]]
  }
}

