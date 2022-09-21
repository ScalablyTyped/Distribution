package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridMultiColumnHeadersMethods extends StObject {
  
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridmulticolumnheader#options:language)
    * Note that this method is for rare scenarios, see [language](ui.iggridmulticolumnheader#options:language) or [locale](ui.iggridmulticolumnheader#options:locale) option setter
    */
  def changeLocale(): Unit = js.native
  
  /**
    * Collapses an expanded group. If the group is collapsed, the method does nothing.
    * Note: This method is asynchronous which means that it returns immediately and any subsequent code will execute in parallel. This may lead to runtime errors. To avoid them put the subsequent code in the callback parameter provided by the method.
    *
    * @param groupKey Group key.
    * @param callback Specifies a custom function to be called when the group is collapsed.
    */
  def collapseGroup(groupKey: String): Unit = js.native
  def collapseGroup(groupKey: String, callback: js.Function): Unit = js.native
  
  /**
    * Destroys the multicolumn widget
    */
  def destroy(): Unit = js.native
  
  /**
    * Expands a collapsed group. If the group is expanded, the method does nothing.
    * Note: This method is asynchronous which means that it returns immediately and any subsequent code will execute in parallel. This may lead to runtime errors. To avoid them put the subsequent code in the callback parameter provided by the method.
    *
    * @param groupKey Group key.
    * @param callback Specifies a custom function to be called when the group is expanded.
    */
  def expandGroup(groupKey: String): Unit = js.native
  def expandGroup(groupKey: String, callback: js.Function): Unit = js.native
  
  /**
    * Returns multicolumn headers array. if there aren"t multicolumn headers returns undefined
    */
  def getMultiColumnHeaders(): js.Array[Any] = js.native
  
  /**
    * Toggles a collapsible group.
    * Note: This method is asynchronous which means that it returns immediately and any subsequent code will execute in parallel. This may lead to runtime errors. To avoid them put the subsequent code in the callback parameter provided by the method.
    *
    * @param groupKey Group key.
    * @param callback Specifies a custom function to be called when the group is toggled.
    */
  def toggleGroup(groupKey: String): Unit = js.native
  def toggleGroup(groupKey: String, callback: js.Function): Unit = js.native
}
