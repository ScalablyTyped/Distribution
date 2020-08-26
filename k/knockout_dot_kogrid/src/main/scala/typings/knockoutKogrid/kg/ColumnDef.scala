package typings.knockoutKogrid.kg

import typings.jquery.JQueryGenericPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnDef extends js.Object {
  /** Appends a css class for the column cells */
  var cellClass: js.UndefOr[String] = js.native
  /**
    * A function which takes the value of the cell and returns the display value. Useful when your data model has an underlying value which you need to convert to a human readable format.
    * @param val 
    * @returns the display value
    * @example function(unixTimeTicks) { return new Date(unixTimeTicks); }
    */
  var cellFormatter: js.UndefOr[js.Function1[/* val */ js.Any, String]] = js.native
  /**Sets the cell template for the column. See github wiki for more details.*/
  var cellTemplate: js.UndefOr[String | JQueryGenericPromise[String]] = js.native
  /** Sets the pretty display name of the column. default is the field given */
  var displayName: js.UndefOr[String] = js.native
  /** The string name of the property in your data model you want that column to represent. Can also be a property path on your data model. 'foo.bar.myField', 'Name.First', etc.. */
  var field: String = js.native
  /** Sets the template for the column header cell. See github wiki for more details. */
  var headerCellTemplate: js.UndefOr[String | JQueryGenericPromise[String]] = js.native
  /** Appends a css class for the column header. */
  var headerClass: js.UndefOr[String] = js.native
  /**Sets the maximum width of the column.*/
  var maxWidth: js.UndefOr[Double] = js.native
  /**Whether or not column is resizable. */
  var resizable: js.UndefOr[Boolean] = js.native
  /** Sets the sort function for the column. Useful when you have data that is formatted in an unusal way or if you want to sort on an underlying data type. Example: function(a,b){return a > b} */
  var sortFn: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]] = js.native
  /**Whether or not column is sortable. */
  var sortable: js.UndefOr[Boolean] = js.native
  /** Sets the width of the column. Can be a fixed width in pixels as an int (42), string px('42px'), percentage string ('42%'), weighted asterisks (width divided by total number of *'s is all column definition widths) See github wiki for more details. */
  var width: js.UndefOr[String] = js.native
}

object ColumnDef {
  @scala.inline
  def apply(field: String): ColumnDef = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDef]
  }
  @scala.inline
  implicit class ColumnDefOps[Self <: ColumnDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellClass(value: String): Self = this.set("cellClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellClass: Self = this.set("cellClass", js.undefined)
    @scala.inline
    def setCellFormatter(value: /* val */ js.Any => String): Self = this.set("cellFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellFormatter: Self = this.set("cellFormatter", js.undefined)
    @scala.inline
    def setCellTemplate(value: String | JQueryGenericPromise[String]): Self = this.set("cellTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellTemplate: Self = this.set("cellTemplate", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setHeaderCellTemplate(value: String | JQueryGenericPromise[String]): Self = this.set("headerCellTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderCellTemplate: Self = this.set("headerCellTemplate", js.undefined)
    @scala.inline
    def setHeaderClass(value: String): Self = this.set("headerClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderClass: Self = this.set("headerClass", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    @scala.inline
    def setSortFn(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = this.set("sortFn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSortFn: Self = this.set("sortFn", js.undefined)
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

