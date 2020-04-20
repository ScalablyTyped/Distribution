package typings.jupyterlabExtensionmanager.widgetMod.ListEntry

import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.black
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.default
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.installed
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.invalid
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.searchResult
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.white
import typings.jupyterlabExtensionmanager.modelMod.Action
import typings.jupyterlabExtensionmanager.modelMod.IEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProperties extends js.Object {
  /**
    * The entry to visualize.
    */
  var entry: IEntry
  /**
    * The list mode to apply.
    */
  var listMode: black | white | default | invalid
  /**
    * The requested view type.
    */
  var viewType: installed | searchResult
  /**
    * Callback to use for performing an action on the entry.
    */
  def performAction(action: Action, entry: IEntry): Unit
}

object IProperties {
  @scala.inline
  def apply(
    entry: IEntry,
    listMode: black | white | default | invalid,
    performAction: (Action, IEntry) => Unit,
    viewType: installed | searchResult
  ): IProperties = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], listMode = listMode.asInstanceOf[js.Any], performAction = js.Any.fromFunction2(performAction), viewType = viewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProperties]
  }
}

