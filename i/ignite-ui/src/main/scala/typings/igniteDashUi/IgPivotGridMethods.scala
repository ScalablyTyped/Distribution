package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotGridMethods extends js.Object {
  /**
  	 * Returns an array with the applied sort directions on the igPivotGrid's columns. The returned array contains objects with the following properties:
  	 *
  	 * memberNames: The names of the members in the tuple.
  	 * tupleIndex: The index of the tuple on the column axis in the original unsorted result.
  	 * sortDirection: The direction of the sort - ascending or descending.
  	 */
  def appliedColumnSortDirections(): js.Array[_] = js.native
  /**
  	 * Returns an array with the applied level sort direction items, which were used for the sorting of the header cells. The returned array contains objects with the following properties:
  	 *
  	 * levelUniqueName: Specifies the unique name of the level, which was sorted.
  	 * sortDirection: The direction of the header sort - ascending or descending.
  	 */
  def appliedLevelSortDirections(): js.Array[_] = js.native
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): Unit = js.native
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): Unit = js.native
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.igpivotgrid#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.igpivotgrid#options:language) or [locale](ui.igpivotgrid#options:locale) option setter
  	 */
  def changeLocale(): Unit = js.native
  /**
  	 * Changes the the regional settings of widget element to the language specified in [options.regional](ui.igpivotgrid#options:regional)
  	 * Note that this method is for rare scenarios, use [regional](ui.igpivotgrid#options:regional) option setter
  	 */
  def changeRegional(): Unit = js.native
  /**
  	 * Collapses a member from the data source and returns true if the collapse succeeds. If the data source has a pending update, the method will return false. Note that igPivotGrid to will display the expanded result after the data source is updated.
  	 *
  	 * @param tupleLocation The name of the parent axis - 'columnAxis' or 'rowAxis'.
  	 * @param tupleIndex The index of the containing tuple. This index should correspond to the position of the tuple in the original unsorted result of the data source.
  	 * @param memberIndex The index of the member in the tuple. This index should correspond to the position of the member in the original unsorted result of the data source.
  	 * @param shouldUpdate A flag indicating whether the data source should be updated after the expand.
  	 */
  def collapseTupleMember(tupleLocation: String, tupleIndex: Double, memberIndex: Double): Boolean = js.native
  def collapseTupleMember(tupleLocation: String, tupleIndex: Double, memberIndex: Double, shouldUpdate: Boolean): Boolean = js.native
  /**
  	 * Destroy is part of the jQuery UI widget API and does the following:
  	 * 1. Remove custom CSS classes that were added.
  	 * 2. Unwrap any wrapping elements such as scrolling divs and other containers.
  	 * 3. Unbind all events that were bound.
  	 */
  def destroy(): Unit = js.native
  /**
  	 * Expands a member from the data source and returns true if the expand succeeds. If the data source has a pending update, the method will return false. Note that igPivotGrid to will display the expanded result after the data source is updated.
  	 *
  	 * @param tupleLocation The name of the parent axis - 'columnAxis' or 'rowAxis'.
  	 * @param tupleIndex The index of the containing tuple. This index should correspond to the position of the tuple in the original unsorted result of the data source.
  	 * @param memberIndex The index of the member in the tuple. This index should correspond to the position of the member in the original unsorted result of the data source.
  	 * @param shouldUpdate A flag indicating whether the data source should be updated after the expand.
  	 */
  def expandTupleMember(tupleLocation: String, tupleIndex: Double, memberIndex: Double): Boolean = js.native
  def expandTupleMember(tupleLocation: String, tupleIndex: Double, memberIndex: Double, shouldUpdate: Boolean): Boolean = js.native
  /**
  	 * Returns the igGrid instance used to render the OLAP data.
  	 */
  def grid(): js.Object = js.native
  /**
  	 * Triggers an update on the data source and the igPivotGrid.
  	 */
  def updateGrid(): Unit = js.native
}

