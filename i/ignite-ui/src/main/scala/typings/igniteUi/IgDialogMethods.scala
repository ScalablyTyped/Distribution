package typings.igniteUi

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgDialogMethods extends js.Object {
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit = js.native
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit = js.native
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.igdialog#options:language)
    * Note that this method is for rare scenarios, see [language](ui.igdialog#options:language) or [locale](ui.igdialog#options:locale) option setter
    */
  def changeLocale(): Unit = js.native
  /**
    * Closes the dialog if it is opened.
    * Notes:
    * 1. If the state of the dialog changes, then stateChanging and stateChanged events are raised.
    * 2. That method does not change minimized or maximized state of the dialog.
    * It means that method "open" will open the dialog and keep previous minimized or maximized state.
    *
    * @param e Browser event: internal use only.
    */
  def close(): js.Object = js.native
  def close(e: js.Object): js.Object = js.native
  /**
    * Retrieves the igDialog content container or sets its content to be the new content provided.
    *
    * @param newContent The new html content provided as a string. If the parameter is provided then the method acts as a setter.
    */
  def content(): js.Object = js.native
  def content(newContent: String): js.Object = js.native
  /**
    * Destroys the igDialog and moves the target element to its original parent.
    */
  def destroy(): js.Object = js.native
  /**
    * Gets a reference to the top modal dialog.
    */
  def getTopModal(): js.Object = js.native
  /**
    * Checks if the dialog is modal and if it is currently active.
    */
  def isTopModal(): Boolean = js.native
  /**
    * Gets reference to the dynamically created DIV element which represents the dialog.
    */
  def mainElement(): Element = js.native
  /**
    * Maximizes the dialog if it is not maximized.
    * Note: If the state of the dialog changes, then stateChanging and stateChanged events are raised.
    */
  def maximize(): js.Object = js.native
  /**
    * Minimizes the dialog if it is not minimized.
    * Note: If the state of the dialog changes, then stateChanging and stateChanged events are raised.
    */
  def minimize(): js.Object = js.native
  /**
    * Moves a not modal dialog to the top.
    *
    * @param e Original event of browser.
    */
  def moveToTop(): js.Object = js.native
  def moveToTop(e: js.Object): js.Object = js.native
  /**
    * Opens the dialog if it is closed. Notes:
    * 1. If the state of the dialog changes, then stateChanging and stateChanged events are raised.
    * 2. That method does not change minimized or maximized state of the dialog. It means that if the dialog was in minimized or maximized stated when closed by "close" method, then the dialog will open in minimized or maximized state respectively.
    */
  def open(): js.Object = js.native
  /**
    * Pins the dialog if it is not pinned.
    * When the dialog is pinned, then the html element of the dialog is moved to the original container where the target element was located and position:absolute is removed.
    * The pinned dialog does not support modal state, maximized state and it can not be moved.
    * Notes:
    * 1. If the parent element of the original target-element is invisible, then the pinned dialog becomes invisible as well.
    * 2. If the state of the dialog changes, then stateChanging and stateChanged events are raised.
    */
  def pin(): js.Object = js.native
  /**
    * Sets the normal state for the dialog if it was maximized or minimized.
    * Note: If the state of the dialog changes, then stateChanging and stateChanged events are raised.
    */
  def restore(): js.Object = js.native
  /**
    * Gets/Sets the state of the editor.
    * Note: If the state of the dialog changes, then stateChanging and stateChanged events are raised.
    *
    * @param state New state.
    */
  def state(): String = js.native
  def state(state: String): String = js.native
  /**
    * Unpins the dialog if it is pinned.
    * Note: If the state of the dialog changes, then stateChanging and stateChanged events are raised.
    */
  def unpin(): js.Object = js.native
}

