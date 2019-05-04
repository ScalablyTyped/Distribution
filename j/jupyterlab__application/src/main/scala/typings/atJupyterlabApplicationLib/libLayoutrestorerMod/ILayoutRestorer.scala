package typings
package atJupyterlabApplicationLib.libLayoutrestorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILayoutRestorer extends js.Object {
  /**
    * A promise resolved when the layout restorer is ready to receive signals.
    */
  var restored: js.Promise[scala.Unit]
  /**
    * Add a widget to be tracked by the layout restorer.
    */
  def add(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, name: java.lang.String): scala.Unit
  /**
    * Restore the widgets of a particular instance tracker.
    *
    * @param tracker - The instance tracker whose widgets will be restored.
    *
    * @param options - The restoration options.
    */
  def restore(
    tracker: atJupyterlabApputilsLib.atJupyterlabApputilsMod.InstanceTracker[_],
    options: atJupyterlabApplicationLib.libLayoutrestorerMod.ILayoutRestorerNs.IRestoreOptions[_]
  ): scala.Unit
}

object ILayoutRestorer {
  @scala.inline
  def apply(
    add: (atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, java.lang.String) => scala.Unit,
    restore: (atJupyterlabApputilsLib.atJupyterlabApputilsMod.InstanceTracker[_], atJupyterlabApplicationLib.libLayoutrestorerMod.ILayoutRestorerNs.IRestoreOptions[_]) => scala.Unit,
    restored: js.Promise[scala.Unit]
  ): ILayoutRestorer = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), restore = js.Any.fromFunction2(restore), restored = restored)
  
    __obj.asInstanceOf[ILayoutRestorer]
  }
}

