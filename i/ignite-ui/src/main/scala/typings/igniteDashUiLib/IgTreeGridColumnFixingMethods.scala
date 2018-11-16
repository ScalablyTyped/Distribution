package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTreeGridColumnFixingMethods extends js.Object {
  def changeGlobalLanguage(): scala.Unit = js.native
  def changeGlobalRegional(): scala.Unit = js.native
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridcolumnfixing#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.iggridcolumnfixing#options:language) or [locale](ui.iggridcolumnfixing#options:locale) option setter
  	 */
  def changeLocale(): scala.Unit = js.native
  /**
  	 * Checks whether the heights of fixed and unfixed tables are equal - if not sync them. Similar check is made for heights of table rows.
  	 */
  def checkAndSyncHeights(): scala.Unit = js.native
  /**
  	 * Checks whether column fixing is allowed for the specified columns. It should not be allowed if there is only one visible column in the unfixed area.
  	 *
  	 * @param columns Array of columns and/or column identifiers - could be column indexes, column keys, column object or mixed.
  	 */
  def checkFixingAllowed(columns: js.Array[_]): scala.Boolean = js.native
  /**
  	 * Checks whether unfixing is allowed for the specified columns. It should not be allowed if there is only one visible column in the fixed area.
  	 *
  	 * @param columns Array of columns and/or column identifiers - could be column indexes, column keys, column object or mixed.
  	 */
  def checkUnfixingAllowed(columns: js.Array[_]): scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  /**
  	 * Fixes a column by specified column identifier - column index or column key.
  	 *
  	 * @param colIdentifier An identifier of the column to be fixed - column index or column key.
  	 * @param target Key of the column where the fixed column should move to.
  	 * @param after Specifies where the fixed column should be moved after or before the target column. This parameter is disregarded if there is no target column specified.
  	 */
  def fixColumn(colIdentifier: js.Object): js.Object = js.native
  /**
  	 * Fixes a column by specified column identifier - column index or column key.
  	 *
  	 * @param colIdentifier An identifier of the column to be fixed - column index or column key.
  	 * @param target Key of the column where the fixed column should move to.
  	 * @param after Specifies where the fixed column should be moved after or before the target column. This parameter is disregarded if there is no target column specified.
  	 */
  def fixColumn(colIdentifier: js.Object, target: java.lang.String): js.Object = js.native
  /**
  	 * Fixes a column by specified column identifier - column index or column key.
  	 *
  	 * @param colIdentifier An identifier of the column to be fixed - column index or column key.
  	 * @param target Key of the column where the fixed column should move to.
  	 * @param after Specifies where the fixed column should be moved after or before the target column. This parameter is disregarded if there is no target column specified.
  	 */
  def fixColumn(colIdentifier: js.Object, target: java.lang.String, after: scala.Boolean): js.Object = js.native
  /**
  	 * This function is deprecated - use function fixNonDataColumns.
  	 */
  def fixDataSkippedColumns(): scala.Unit = js.native
  /**
  	 * Fixes non-data columns (such as the row numbering column of row selectors) if any and if [fixingDirection](ui.iggridcolumnfixing#options:fixingDirection) is left. Does nothing if the non-data columns are already fixed.
  	 */
  def fixNonDataColumns(): scala.Unit = js.native
  /**
  	 * Calculates widths of the fixed columns.
  	 *
  	 * @param fCols Array of grid columns. If not set then the total width of the fixed columns are returned.
  	 * @param excludeNonDataColumns If set to true do not calculate the width of non-data fixed columns (like the row selector row numbering column).
  	 * @param includeHidden If set to true calculates width of the hidden fixed columns (their initial width before hiding).
  	 */
  def getWidthOfFixedColumns(): scala.Double = js.native
  /**
  	 * Calculates widths of the fixed columns.
  	 *
  	 * @param fCols Array of grid columns. If not set then the total width of the fixed columns are returned.
  	 * @param excludeNonDataColumns If set to true do not calculate the width of non-data fixed columns (like the row selector row numbering column).
  	 * @param includeHidden If set to true calculates width of the hidden fixed columns (their initial width before hiding).
  	 */
  def getWidthOfFixedColumns(fCols: js.Array[_]): scala.Double = js.native
  /**
  	 * Calculates widths of the fixed columns.
  	 *
  	 * @param fCols Array of grid columns. If not set then the total width of the fixed columns are returned.
  	 * @param excludeNonDataColumns If set to true do not calculate the width of non-data fixed columns (like the row selector row numbering column).
  	 * @param includeHidden If set to true calculates width of the hidden fixed columns (their initial width before hiding).
  	 */
  def getWidthOfFixedColumns(fCols: js.Array[_], excludeNonDataColumns: scala.Boolean): scala.Double = js.native
  /**
  	 * Calculates widths of the fixed columns.
  	 *
  	 * @param fCols Array of grid columns. If not set then the total width of the fixed columns are returned.
  	 * @param excludeNonDataColumns If set to true do not calculate the width of non-data fixed columns (like the row selector row numbering column).
  	 * @param includeHidden If set to true calculates width of the hidden fixed columns (their initial width before hiding).
  	 */
  def getWidthOfFixedColumns(fCols: js.Array[_], excludeNonDataColumns: scala.Boolean, includeHidden: scala.Boolean): scala.Double = js.native
  /**
  	 * Returns whether the column with the specified key is a column group header, when the [multi-column headers](http://www.igniteui.com/help/iggrid-multicolumnheaders-landingpage) feature is used.
  	 *
  	 * @param colKey The key of the column to perform the check for.
  	 */
  def isGroupHeader(colKey: java.lang.String): scala.Boolean = js.native
  /**
  	 * If the 'check' argument is set to true, checks whether the heights of fixed and unfixed tables are equal, if not sync them. Similar check is made for heights of table rows. If the clearRowsHeights argument is set to true, clears rows heights before syncing them.
  	 *
  	 * @param check If set to true, checks whether the heights of fixed and unfixed tables are equal, if not sync them. If this argument is set to false sync is performed regardless of the current heights.
  	 * @param clearRowsHeights Clears row heigths for all visible rows.
  	 */
  def syncHeights(): scala.Unit = js.native
  /**
  	 * If the 'check' argument is set to true, checks whether the heights of fixed and unfixed tables are equal, if not sync them. Similar check is made for heights of table rows. If the clearRowsHeights argument is set to true, clears rows heights before syncing them.
  	 *
  	 * @param check If set to true, checks whether the heights of fixed and unfixed tables are equal, if not sync them. If this argument is set to false sync is performed regardless of the current heights.
  	 * @param clearRowsHeights Clears row heigths for all visible rows.
  	 */
  def syncHeights(check: scala.Boolean): scala.Unit = js.native
  /**
  	 * If the 'check' argument is set to true, checks whether the heights of fixed and unfixed tables are equal, if not sync them. Similar check is made for heights of table rows. If the clearRowsHeights argument is set to true, clears rows heights before syncing them.
  	 *
  	 * @param check If set to true, checks whether the heights of fixed and unfixed tables are equal, if not sync them. If this argument is set to false sync is performed regardless of the current heights.
  	 * @param clearRowsHeights Clears row heigths for all visible rows.
  	 */
  def syncHeights(check: scala.Boolean, clearRowsHeights: scala.Boolean): scala.Unit = js.native
  /**
  	 * Syncs rows heights between two collections of rows.
  	 *
  	 * @param $trs An array of rows of the first(fixed/unfixed) container.
  	 * @param $anotherRows An array of rows of the second(fixed/unfixed) container.
  	 */
  def syncRowsHeights($trs: js.Array[_], $anotherRows: js.Array[_]): scala.Unit = js.native
  /**
  	 * Unfixes all fixed columns.
  	 */
  def unfixAllColumns(): scala.Unit = js.native
  /**
  	 * Unfixes a column by specified column identifier - column key or column index.
  	 *
  	 * @param colIdentifier An identifier of the column to be unfixed - column index or column key.
  	 * @param target Key of the column where the unfixed column should move to.
  	 * @param after Specifies where the unfixed column should be rendered after or before the target column. This parameter is disregarded if there is no target column specified.
  	 */
  def unfixColumn(colIdentifier: js.Object): js.Object = js.native
  /**
  	 * Unfixes a column by specified column identifier - column key or column index.
  	 *
  	 * @param colIdentifier An identifier of the column to be unfixed - column index or column key.
  	 * @param target Key of the column where the unfixed column should move to.
  	 * @param after Specifies where the unfixed column should be rendered after or before the target column. This parameter is disregarded if there is no target column specified.
  	 */
  def unfixColumn(colIdentifier: js.Object, target: java.lang.String): js.Object = js.native
  /**
  	 * Unfixes a column by specified column identifier - column key or column index.
  	 *
  	 * @param colIdentifier An identifier of the column to be unfixed - column index or column key.
  	 * @param target Key of the column where the unfixed column should move to.
  	 * @param after Specifies where the unfixed column should be rendered after or before the target column. This parameter is disregarded if there is no target column specified.
  	 */
  def unfixColumn(colIdentifier: js.Object, target: java.lang.String, after: scala.Boolean): js.Object = js.native
  /**
  	 * This function is deprecated - use function unfixNonDataColumns.
  	 */
  def unfixDataSkippedColumns(): scala.Unit = js.native
  /**
  	 * Unfixes non-data columns (such as the row numbering column of row selectors) if any and if [fixingDirection](ui.iggridcolumnfixing#options:fixingDirection) is left. Does nothing if the non-data columns are already fixed.
  	 */
  def unfixNonDataColumns(): scala.Unit = js.native
}

