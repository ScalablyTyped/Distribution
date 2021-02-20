package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridHidingMethods extends StObject {
  
  def changeGlobalLanguage(): Unit = js.native
  
  def changeGlobalRegional(): Unit = js.native
  
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridhiding#options:language)
    * Note that this method is for rare scenarios, see [language](ui.iggridhiding#options:language) or [locale](ui.iggridhiding#options:locale) option setter
    */
  def changeLocale(): Unit = js.native
  
  /**
    * Destroys the hiding widget
    */
  def destroy(): Unit = js.native
  
  /**
    * Hides a visible column. If the column is hidden the method does nothing.
    * Note: This method is asynchronous, which means that it returns immediately, and any subsequent code will execute in parallel. This may lead to runtime errors. To avoid them put the subsequent code in the callback parameter provided by the method.
    *
    * @param column An identifier for the column. If a number is provided it will be used as a column index; else if a string is provided, it will be used as a column key.
    * @param callback Specifies a custom function to be called after the column gets hidden(optional)
    */
  def hideColumn(column: js.Object): Unit = js.native
  def hideColumn(column: js.Object, callback: js.Function): Unit = js.native
  
  /**
    * Hides the Column Chooser dialog. If it is not visible the method does nothing.
    */
  def hideColumnChooser(): Unit = js.native
  
  /**
    * Hides visible columns specified by the array. If the column is hidden the method does nothing.
    * Note: This method is asynchronous which means that it returns immediately and any subsequent code will execute in parallel. This may lead to runtime errors. To avoid them put the subsequent code in the callback parameter provided by the method.
    *
    * @param columns An array of identifiers for the columns. If a number is provided it will be used as a column index else if a strings is provided it will be used as a column key.
    * @param callback Specifies a custom function to be called when all columns are hidden(optional)
    */
  def hideMultiColumns(columns: js.Array[_]): Unit = js.native
  def hideMultiColumns(columns: js.Array[_], callback: js.Function): Unit = js.native
  
  /**
    * Gets whether the reset button in the column chooser dialog is to be rendered or not.
    */
  def isToRenderButtonReset(): Unit = js.native
  
  /**
    * Remove Reset button in column chooser modal dialog
    */
  def removeColumnChooserResetButton(): Unit = js.native
  
  /**
    * Renders the Reset button in the Column Chooser dialog.
    */
  def renderColumnChooserResetButton(): Unit = js.native
  
  /**
    * Reset hidden/shown column to initial state of dialog(when it is opened)
    */
  def resetHidingColumnChooser(): Unit = js.native
  
  /**
    * Shows a hidden column. If the column is not hidden the method does nothing.
    * Note: This method is asynchronous, which means that it returns immediately, and any subsequent code will execute in parallel. This may lead to runtime errors. To avoid them put the subsequent code in the callback parameter provided by the method.
    *
    * @param column An identifier for the column. If a number is provided it will be used as a column index; else if a string is provided, it will be used as a column key.
    * @param callback Specifies a custom function to be called after the column gets shown(optional)
    */
  def showColumn(column: js.Object): Unit = js.native
  def showColumn(column: js.Object, callback: js.Function): Unit = js.native
  
  /**
    * Shows the Column Chooser dialog. If it is visible the method does nothing.
    */
  def showColumnChooser(): Unit = js.native
  
  /**
    * Show visible columns specified by the array. If the column is shown the method does nothing.
    * Note: This method is asynchronous which means that it returns immediately and any subsequent code will execute in parallel. This may lead to runtime errors. To avoid them put the subsequent code in the callback parameter provided by the method.
    *
    * @param columns An array of identifiers for the columns. If a number is provided it will be used as a column index else if a strings is provided it will be used as a column key.
    * @param callback Specifies a custom function to be called when all columns are shown(optional)
    */
  def showMultiColumns(columns: js.Array[_]): Unit = js.native
  def showMultiColumns(columns: js.Array[_], callback: js.Function): Unit = js.native
}
