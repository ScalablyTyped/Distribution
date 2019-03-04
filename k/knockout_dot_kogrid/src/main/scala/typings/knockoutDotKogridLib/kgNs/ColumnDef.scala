package typings
package knockoutDotKogridLib.kgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDef extends js.Object {
  /** Appends a css class for the column cells */
  var cellClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A function which takes the value of the cell and returns the display value. Useful when your data model has an underlying value which you need to convert to a human readable format.
    * @param val 
    * @returns the display value
    * @example function(unixTimeTicks) { return new Date(unixTimeTicks); }
    */
  var cellFormatter: js.UndefOr[js.Function1[/* val */ js.Any, java.lang.String]] = js.undefined
  /**Sets the cell template for the column. See github wiki for more details.*/
  var cellTemplate: js.UndefOr[java.lang.String | jqueryLib.JQueryGenericPromise[java.lang.String]] = js.undefined
  /** Sets the pretty display name of the column. default is the field given */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The string name of the property in your data model you want that column to represent. Can also be a property path on your data model. 'foo.bar.myField', 'Name.First', etc.. */
  var field: java.lang.String
  /** Sets the template for the column header cell. See github wiki for more details. */
  var headerCellTemplate: js.UndefOr[java.lang.String | jqueryLib.JQueryGenericPromise[java.lang.String]] = js.undefined
  /** Appends a css class for the column header. */
  var headerClass: js.UndefOr[java.lang.String] = js.undefined
  /**Sets the maximum width of the column.*/
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /**Whether or not column is resizable. */
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the sort function for the column. Useful when you have data that is formatted in an unusal way or if you want to sort on an underlying data type. Example: function(a,b){return a > b} */
  var sortFn: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double]] = js.undefined
  /**Whether or not column is sortable. */
  var sortable: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the width of the column. Can be a fixed width in pixels as an int (42), string px('42px'), percentage string ('42%'), weighted asterisks (width divided by total number of *'s is all column definition widths) See github wiki for more details. */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object ColumnDef {
  @scala.inline
  def apply(
    field: java.lang.String,
    cellClass: java.lang.String = null,
    cellFormatter: js.Function1[/* val */ js.Any, java.lang.String] = null,
    cellTemplate: java.lang.String | jqueryLib.JQueryGenericPromise[java.lang.String] = null,
    displayName: java.lang.String = null,
    headerCellTemplate: java.lang.String | jqueryLib.JQueryGenericPromise[java.lang.String] = null,
    headerClass: java.lang.String = null,
    maxWidth: scala.Int | scala.Double = null,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    sortFn: js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double] = null,
    sortable: js.UndefOr[scala.Boolean] = js.undefined,
    width: java.lang.String = null
  ): ColumnDef = {
    val __obj = js.Dynamic.literal(field = field)
    if (cellClass != null) __obj.updateDynamic("cellClass")(cellClass)
    if (cellFormatter != null) __obj.updateDynamic("cellFormatter")(cellFormatter)
    if (cellTemplate != null) __obj.updateDynamic("cellTemplate")(cellTemplate.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (headerCellTemplate != null) __obj.updateDynamic("headerCellTemplate")(headerCellTemplate.asInstanceOf[js.Any])
    if (headerClass != null) __obj.updateDynamic("headerClass")(headerClass)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (sortFn != null) __obj.updateDynamic("sortFn")(sortFn)
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ColumnDef]
  }
}

