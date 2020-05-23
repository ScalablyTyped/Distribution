package typings.knockoutKogrid.kg

import typings.jquery.JQueryGenericPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDef extends js.Object {
  /** Appends a css class for the column cells */
  var cellClass: js.UndefOr[String] = js.undefined
  /**
    * A function which takes the value of the cell and returns the display value. Useful when your data model has an underlying value which you need to convert to a human readable format.
    * @param val 
    * @returns the display value
    * @example function(unixTimeTicks) { return new Date(unixTimeTicks); }
    */
  var cellFormatter: js.UndefOr[js.Function1[/* val */ js.Any, String]] = js.undefined
  /**Sets the cell template for the column. See github wiki for more details.*/
  var cellTemplate: js.UndefOr[String | JQueryGenericPromise[String]] = js.undefined
  /** Sets the pretty display name of the column. default is the field given */
  var displayName: js.UndefOr[String] = js.undefined
  /** The string name of the property in your data model you want that column to represent. Can also be a property path on your data model. 'foo.bar.myField', 'Name.First', etc.. */
  var field: String
  /** Sets the template for the column header cell. See github wiki for more details. */
  var headerCellTemplate: js.UndefOr[String | JQueryGenericPromise[String]] = js.undefined
  /** Appends a css class for the column header. */
  var headerClass: js.UndefOr[String] = js.undefined
  /**Sets the maximum width of the column.*/
  var maxWidth: js.UndefOr[Double] = js.undefined
  /**Whether or not column is resizable. */
  var resizable: js.UndefOr[Boolean] = js.undefined
  /** Sets the sort function for the column. Useful when you have data that is formatted in an unusal way or if you want to sort on an underlying data type. Example: function(a,b){return a > b} */
  var sortFn: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]] = js.undefined
  /**Whether or not column is sortable. */
  var sortable: js.UndefOr[Boolean] = js.undefined
  /** Sets the width of the column. Can be a fixed width in pixels as an int (42), string px('42px'), percentage string ('42%'), weighted asterisks (width divided by total number of *'s is all column definition widths) See github wiki for more details. */
  var width: js.UndefOr[String] = js.undefined
}

object ColumnDef {
  @scala.inline
  def apply(
    field: String,
    cellClass: String = null,
    cellFormatter: /* val */ js.Any => String = null,
    cellTemplate: String | JQueryGenericPromise[String] = null,
    displayName: String = null,
    headerCellTemplate: String | JQueryGenericPromise[String] = null,
    headerClass: String = null,
    maxWidth: js.UndefOr[Double] = js.undefined,
    resizable: js.UndefOr[Boolean] = js.undefined,
    sortFn: (/* a */ js.Any, /* b */ js.Any) => Double = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    width: String = null
  ): ColumnDef = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (cellClass != null) __obj.updateDynamic("cellClass")(cellClass.asInstanceOf[js.Any])
    if (cellFormatter != null) __obj.updateDynamic("cellFormatter")(js.Any.fromFunction1(cellFormatter))
    if (cellTemplate != null) __obj.updateDynamic("cellTemplate")(cellTemplate.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (headerCellTemplate != null) __obj.updateDynamic("headerCellTemplate")(headerCellTemplate.asInstanceOf[js.Any])
    if (headerClass != null) __obj.updateDynamic("headerClass")(headerClass.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (sortFn != null) __obj.updateDynamic("sortFn")(js.Any.fromFunction2(sortFn))
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDef]
  }
}

