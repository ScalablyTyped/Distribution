package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridGroupByMethods extends StObject {
  
  def changeGlobalLanguage(): Unit = js.native
  
  def changeGlobalRegional(): Unit = js.native
  
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridgroupby#options:language)
    * Note that this method is for rare scenarios, see [language](ui.iggridgroupby#options:language) or [locale](ui.iggridgroupby#options:locale) option setter
    */
  def changeLocale(): Unit = js.native
  
  /**
    * Changes the the regional settings of widget element to the language specified in [options.regional](ui.iggridgroupby#options:regional)
    * Note that this method is for rare scenarios, use [regional](ui.iggridgroupby#options:regional) option setter
    */
  def changeRegional(): Unit = js.native
  
  /**
    * Check whether column with specified key and layout is grouped
    *
    * @param key key of the column
    * @param layout layout name
    */
  def checkColumnIsGrouped(key: String, layout: String): Unit = js.native
  
  /**
    * Close layouts dropdown
    */
  def closeDropDown(): Unit = js.native
  
  /**
    * Close groupby modal dialog
    */
  def closeGroupByDialog(): Unit = js.native
  
  /**
    * Expand group row with specified id
    *
    * @param rowId data-id attribute of the group row in the DOM
    */
  def collapse(rowId: String): Unit = js.native
  
  /**
    * Destroys the group by feature object.
    */
  def destroy(): Unit = js.native
  
  /**
    * Expand group row with specified id
    *
    * @param rowId data-id attribute of the group row in the DOM
    */
  def expand(rowId: String): Unit = js.native
  
  /**
    * Get grouped data by value for the specific column. NOTE: Before calling this function the data(that is passed as an argument) should be sorted by colKey.
    *
    * @param data data (sorted by colKey) that is used to get the records from.
    * @param colKey key of the column for which grouping will be applied.
    * @param idval value of the column by which grouping will be applied.
    */
  def getGroupedData(data: js.Array[js.Any], colKey: String): js.Array[js.Any] = js.native
  def getGroupedData(data: js.Array[js.Any], colKey: String, idval: String): js.Array[js.Any] = js.native
  
  /**
    * Groups by a column
    *
    * @param key Column Key - group by the column with the specified key
    * @param layout layout is an optional parameter. if set it means the grouped column is not in the root level but is a child layout column
    * @param sortingDirection if not set it is taken from option defaultSortingDirection
    */
  def groupByColumn(key: String): Unit = js.native
  def groupByColumn(key: String, layout: String): Unit = js.native
  def groupByColumn(key: String, layout: String, sortingDirection: js.Object): Unit = js.native
  def groupByColumn(key: String, layout: Unit, sortingDirection: js.Object): Unit = js.native
  
  /**
    * Adds a column to the group by columns list, executes the group by operation and updates the view.
    */
  def groupByColumns(): js.Object = js.native
  
  /**
    * Open layouts dropdown
    */
  def openDropDown(): Unit = js.native
  
  /**
    * Open groupby modal dialog
    */
  def openGroupByDialog(): Unit = js.native
  
  /**
    * Render groupby modal dialog and its content
    */
  def renderGroupByModalDialog(): Unit = js.native
  
  /**
    * Clears the group by columns list and updates the view.
    */
  def ungroupAll(): Unit = js.native
  
  /**
    * Removes the specified column from the group by columns list, executes the group by operation and updates the view.
    *
    * @param key Column Key - ungroup by the column with the specified key
    * @param layout Layout is an optional parameter. If set it means the grouped column is not in the root level but is a child layout column.
    */
  def ungroupByColumn(key: String): Unit = js.native
  def ungroupByColumn(key: String, layout: String): Unit = js.native
}
