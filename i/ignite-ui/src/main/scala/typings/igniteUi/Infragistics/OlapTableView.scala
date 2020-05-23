package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlapTableView extends js.Object {
  /**
    * Returns the column sort direction items, which were applied during the $.ig.OlapTableView initialization.
    */
  def appliedColumnSortDirections(): js.Array[_] = js.native
  /**
    * Returns the level sort direction items, which were applied during the $.ig.OlapTableView initialization.
    */
  def appliedLevelSortDirections(): js.Array[_] = js.native
  /**
    * Returns a javascript object, which maps the applied level sort directions to the axis name, hierarchy index in the axis and the level depth.
    *             It is used internally to determine, which $.ig.OlapTableViewHeaderCell needs to display a sorting indicator in the user interface.
    */
  def appliedSortDirectionsMap(): js.Object = js.native
  /**
    * Returns the table column headers.
    */
  def columnHeaders(): js.Array[_] = js.native
  /**
    * Gets or sets the column sort direction items, which will be applied when the $.ig.OlapTableView is initialized.
    *             - tupleIndex (number): specifies the index of the tuple, which corresponds to a column in the column axis.
    *             - sortDirection (string: ascending|descending): indicates the sort direction for the column. The allowed values are 'ascending' (default) and 'descending'.
    *             - comparer (function): an optional function, which will be used to compare the cells from the column. The function should return a number:
    *             1. If Cell1 <  Cell2, return a value lower than 0.
    *             2. If Cell1 == Cell2, return 0.
    *             3. If Cell1 > Cell2, return a value greater than 0.
    *
    * @param columnSortDirections an array of objects, which have the following properties:
    */
  def columnSortDirections(): js.Array[_] = js.native
  def columnSortDirections(columnSortDirections: js.Array[_]): js.Array[_] = js.native
  /**
    * Initializes the table view object as its rowHeaders, columnHeaders and resultCells are created for the result object the table view is related to.
    *             Applies the items from the columnSortDirections and levelDortDirections to produce the sorted result.
    */
  def initialize(): Unit = js.native
  /**
    * Gets or sets the level sort direction items, which will be applied when the $.ig.OlapTableView is
    *             - levelUniqueName (string): the name of the level to be sorted.
    *             - sortDirection (string: ascending|descending): indicates the sort direction for the level. The allowed values are 'ascending' (default) and 'descending'.
    *             - sortBehavior (string:alphabetical|system): indicates the type of sorting to be applied. The allowed values are 'alphabetical' (default) and 'system'.
    *
    * @param levelSortDirections an array of objects, which have the following properties:
    */
  def levelSortDirections(): js.Array[_] = js.native
  def levelSortDirections(levelSortDirections: js.Array[_]): js.Array[_] = js.native
  /**
    * Returns the sorted $.ig.OlapResult object.
    */
  def result(): js.Object = js.native
  /**
    * Returns the table result cells ordered as if the grid is iterated row by row.
    */
  def resultCells(): js.Array[_] = js.native
  /**
    * Returns the table row headers.
    */
  def rowHeaders(): js.Array[_] = js.native
  /**
    * Returns the configuration object this table view is created with.
    */
  def viewSettings(): js.Object = js.native
}

