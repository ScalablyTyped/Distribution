package typings
package atJupyterlabExtensionmanagerLib.libWidgetMod.ListEntryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProperties extends js.Object {
  /**
    * The entry to visualize.
    */
  var entry: atJupyterlabExtensionmanagerLib.libModelMod.IEntry
  /**
    * Callback to use for performing an action on the entry.
    */
  def performAction(
    action: atJupyterlabExtensionmanagerLib.libModelMod.Action,
    entry: atJupyterlabExtensionmanagerLib.libModelMod.IEntry
  ): scala.Unit
}

object IProperties {
  @scala.inline
  def apply(
    entry: atJupyterlabExtensionmanagerLib.libModelMod.IEntry,
    performAction: (atJupyterlabExtensionmanagerLib.libModelMod.Action, atJupyterlabExtensionmanagerLib.libModelMod.IEntry) => scala.Unit
  ): IProperties = {
    val __obj = js.Dynamic.literal(entry = entry, performAction = js.Any.fromFunction2(performAction))
  
    __obj.asInstanceOf[IProperties]
  }
}

