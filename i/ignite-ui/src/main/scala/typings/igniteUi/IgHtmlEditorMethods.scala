package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgHtmlEditorMethods extends StObject {
  
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit = js.native
  
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit = js.native
  
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.ightmleditor#options:language)
    *             Note that this method is for rare scenarios, use [language](ui.ightmleditor#options:language) or [locale](ui.ightmleditor#options:locale) option setter
    */
  def changeLocale(): Unit = js.native
  
  /**
    * Returns the document object associated with the Html Editor's content editable area
    */
  def contentDocument(): js.Object = js.native
  
  /**
    * Returns the content editable associated with this Html Editor
    */
  def contentEditable(): js.Object = js.native
  
  /**
    * Returns the window object associated with the Html Editor's content editable area
    */
  def contentWindow(): js.Object = js.native
  
  /**
    * Destroys the widget.
    */
  def destroy(): Unit = js.native
  
  /**
    * Executes htmleditor commands.
    *
    * @param actionName The command name.
    * @param args Additional parameter for the command.
    */
  def executeAction(actionName: String): Unit = js.native
  def executeAction(actionName: String, args: js.Object): Unit = js.native
  
  /**
    * Gets the content of the html editor.
    *
    * @param format Returns the content as html or plain text. Values can be "text" or "html".
    */
  def getContent(format: String): String = js.native
  
  /**
    * Inserts the provided content at the position of the caret.
    *
    * @param element Accepts html string, DOM element or a jQuery object.
    */
  def insertAtCaret(element: js.Object): Unit = js.native
  
  /**
    * Returns true/false if the editor contents were modified or not.
    */
  def isDirty(): js.Object = js.native
  
  /**
    * Returns Range object that represent the current range in the content editable
    */
  def range(): js.Object = js.native
  
  /**
    * Resizes the height of the workspace
    */
  def resizeWorkspace(): Unit = js.native
  
  /**
    * Returns Selection object that represent the current selection in the content editable
    */
  def selection(): js.Object = js.native
  
  /**
    * Sets the content of the html editor.
    *
    * @param content The content which will be set.
    * @param format The content type: "text" or "html".
    */
  def setContent(content: String, format: String): Unit = js.native
  
  /**
    * Returns the element on which the widget was instantiated
    */
  def widget(): Unit = js.native
}
