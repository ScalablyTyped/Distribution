package typings
package atJupyterlabExtensionmanagerLib.libWidgetMod.ListViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProperties extends js.Object {
  /**
    * The extension entries to display.
    */
  var entries: js.Array[atJupyterlabExtensionmanagerLib.libModelMod.IEntry]
  /**
    * The number of pages that can be viewed via pagination.
    */
  var numPages: scala.Double
  /**
    * The callback to use for changing the page
    */
  def onPage(page: scala.Double): scala.Unit
  /**
    * Callback to use for performing an action on an entry.
    */
  def performAction(
    action: atJupyterlabExtensionmanagerLib.libModelMod.Action,
    entry: atJupyterlabExtensionmanagerLib.libModelMod.IEntry
  ): scala.Unit
}

object IProperties {
  @scala.inline
  def apply(
    entries: js.Array[atJupyterlabExtensionmanagerLib.libModelMod.IEntry],
    numPages: scala.Double,
    onPage: scala.Double => scala.Unit,
    performAction: (atJupyterlabExtensionmanagerLib.libModelMod.Action, atJupyterlabExtensionmanagerLib.libModelMod.IEntry) => scala.Unit
  ): IProperties = {
    val __obj = js.Dynamic.literal(entries = entries, numPages = numPages, onPage = js.Any.fromFunction1(onPage), performAction = js.Any.fromFunction2(performAction))
  
    __obj.asInstanceOf[IProperties]
  }
}

