package typings.atJupyterlabExtensionmanager.libWidgetMod.ListEntry

import typings.atJupyterlabExtensionmanager.libModelMod.Action
import typings.atJupyterlabExtensionmanager.libModelMod.IEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProperties extends js.Object {
  /**
    * The entry to visualize.
    */
  var entry: IEntry
  /**
    * Callback to use for performing an action on the entry.
    */
  def performAction(action: Action, entry: IEntry): Unit
}

object IProperties {
  @scala.inline
  def apply(entry: IEntry, performAction: (Action, IEntry) => Unit): IProperties = {
    val __obj = js.Dynamic.literal(entry = entry, performAction = js.Any.fromFunction2(performAction))
  
    __obj.asInstanceOf[IProperties]
  }
}

