package typings
package atJupyterlabMainmenuLib.libFileMod.IFileMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an activity that has some persistence action
  * before saving.
  */
trait IPersistAndSave[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */]
  extends atJupyterlabMainmenuLib.libLabmenuMod.IMenuExtender[T] {
  /**
    * A label to describe what is being persisted before saving.
    */
  var action: java.lang.String
  /**
    * A label to use for the activity that is being saved.
    */
  var name: java.lang.String
  /**
    * A function to perform the persistence.
    */
  def persistAndSave(widget: T): js.Promise[scala.Unit]
}

object IPersistAndSave {
  @scala.inline
  def apply[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */](
    action: java.lang.String,
    name: java.lang.String,
    persistAndSave: T => js.Promise[scala.Unit],
    tracker: atJupyterlabApputilsLib.libInstancetrackerMod.IInstanceTracker[T],
    isEnabled: T => scala.Boolean = null
  ): IPersistAndSave[T] = {
    val __obj = js.Dynamic.literal(action = action, name = name, persistAndSave = js.Any.fromFunction1(persistAndSave), tracker = tracker)
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    __obj.asInstanceOf[IPersistAndSave[T]]
  }
}

