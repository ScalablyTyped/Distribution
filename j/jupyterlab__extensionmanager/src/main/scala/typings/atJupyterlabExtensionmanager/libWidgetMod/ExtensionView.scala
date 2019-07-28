package typings.atJupyterlabExtensionmanager.libWidgetMod

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.VDomRenderer
import typings.atJupyterlabExtensionmanager.libModelMod.Action
import typings.atJupyterlabExtensionmanager.libModelMod.IEntry
import typings.atJupyterlabExtensionmanager.libModelMod.ListModel
import typings.atJupyterlabServices.atJupyterlabServicesMod.ServiceManager
import typings.std.Event
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/extensionmanager/lib/widget", "ExtensionView")
@js.native
class ExtensionView protected () extends VDomRenderer[ListModel] {
  def this(serviceManager: ServiceManager) = this()
  /**
    * Toggle the focused modifier based on the input node focus state.
    */
  var _toggleFocused: js.Any = js.native
  /**
    * The search input node.
    */
  val inputNode: HTMLInputElement = js.native
  /**
    * Handle the DOM events for the command palette.
    *
    * @param event - The DOM event sent to the command palette.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the command palette's DOM node.
    * It should not be called directly by user code.
    */
  def handleEvent(event: Event): Unit = js.native
  /**
    * Callback handler for when the user wants to perform an action on an extension.
    *
    * @param action The action to perform.
    * @param entry The entry to perform the action on.
    */
  def onAction(action: Action, entry: IEntry): js.Promise[Unit] = js.native
  /**
    * Callback handler for the user changes the page of the search result pagination.
    *
    * @param value The pagination page number.
    */
  def onPage(value: Double): Unit = js.native
  /**
    * Callback handler for the user specifies a new search query.
    *
    * @param value The new query.
    */
  def onSearch(value: String): Unit = js.native
}

