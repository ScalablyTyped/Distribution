package typings.jupyterlabExtensionmanager.widgetMod.ListView

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
    * The extension entries to display.
    */
  var entries: js.Array[IEntry]
  /**
    * The list mode to apply.
    */
  var listMode: black | white | default | invalid
  /**
    * The number of pages that can be viewed via pagination.
    */
  var numPages: Double
  /**
    * The requested view type.
    */
  var viewType: installed | searchResult
  /**
    * The callback to use for changing the page
    */
  def onPage(page: Double): Unit
  /**
    * Callback to use for performing an action on an entry.
    */
  def performAction(action: Action, entry: IEntry): Unit
}

object IProperties {
  @scala.inline
  def apply(
    entries: js.Array[IEntry],
    listMode: black | white | default | invalid,
    numPages: Double,
    onPage: Double => Unit,
    performAction: (Action, IEntry) => Unit,
    viewType: installed | searchResult
  ): IProperties = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], listMode = listMode.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any], onPage = js.Any.fromFunction1(onPage), performAction = js.Any.fromFunction2(performAction), viewType = viewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProperties]
  }
}

