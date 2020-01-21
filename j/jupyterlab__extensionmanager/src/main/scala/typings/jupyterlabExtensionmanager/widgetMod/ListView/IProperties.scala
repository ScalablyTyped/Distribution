package typings.jupyterlabExtensionmanager.widgetMod.ListView

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
    * The number of pages that can be viewed via pagination.
    */
  var numPages: Double
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
    numPages: Double,
    onPage: Double => Unit,
    performAction: (Action, IEntry) => Unit
  ): IProperties = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any], onPage = js.Any.fromFunction1(onPage), performAction = js.Any.fromFunction2(performAction))
  
    __obj.asInstanceOf[IProperties]
  }
}

