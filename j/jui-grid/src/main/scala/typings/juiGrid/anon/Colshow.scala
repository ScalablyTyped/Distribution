package typings.juiGrid.anon

import typings.juiGrid.juiGridStrings.asc
import typings.juiGrid.juiGridStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colshow extends js.Object {
  /**
    * @cfg {Boolean/Array} [colshow=false]
    * Sets a column index shown when the Show/Hide Column menu is enabled.
    */
  var colshow: js.UndefOr[Boolean | js.Array[_]] = js.undefined
  /**
    * @cfg {Array} [csv=null]
    * Sets the column key shown when converted to a CSV string.
    */
  var csv: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @cfg {Array} [csvNames=null]
    * Sets the name of a column shown when converting to a CSV string, which must be defined in the same order as the CSV option.
    */
  var csvNames: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @cfg {Array} [csvNumber=null]
    * Sets the column key to be changed to a number form when converted to a CSV string.
    */
  var csvNumber: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @cfg {Array} data
    * Sets the initial row list of a table.
    */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @cfg {Boolean} [editEvent=true]
    * Sets the Show/Hide state of an extended row area when doubleclicking on a row/cell.
    */
  var editEvent: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {Boolean|Array} [editRow=false]
    * Determines whether to use a modified row area.
    */
  var editRow: js.UndefOr[Boolean | js.Array[_]] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Boolean} [expand=false]
    * Determines whether to use an extended row area.
    */
  var expand: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {Boolean} [expandEvent=true]
    * Sets the Show/Hide state of an extended row area when clicking on a row.
    */
  var expandEvent: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {Array} [fields=null]
    * Sets the name of columns in the order of being displayed on the table screen.
    */
  var fields: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @cfg {Boolean} [moveRow=false]
    * Determines whether to use the move function when you fire row draggable event.
    */
  var moveRow: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {Boolean} [resize=false]
    * Determines whether to use the column resizing function.
    */
  var resize: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {Boolean} [scroll=false]
    * Determines whether to use a table scroll.
    */
  var scroll: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {Integer} [scrollHeight=200]
    * Sets the reference height of a body area when using a table scroll.
    */
  var scrollHeight: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {Boolean/Array} [sort=false]
    * Determines whether to use the table sort function.
    */
  var sort: js.UndefOr[Boolean | js.Array[_]] = js.undefined
  /**
    * @cfg {Boolean} [sortEvent=true]
    * Determines whether to use the sort function when you click on a column.
    */
  var sortEvent: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {Integer} [sortIndex=null]
    * Determines whether to use the table sort function.
    */
  var sortIndex: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {String} [sortOrder="asc"]
    * Determines whether to use the table sort function.
    */
  var sortOrder: js.UndefOr[asc | desc] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Integer} [width=0]
    * Sets the area of a table.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Colshow {
  @scala.inline
  def apply(
    colshow: Boolean | js.Array[_] = null,
    csv: js.Array[_] = null,
    csvNames: js.Array[_] = null,
    csvNumber: js.Array[_] = null,
    data: js.Array[_] = null,
    editEvent: js.UndefOr[Boolean] = js.undefined,
    editRow: Boolean | js.Array[_] = null,
    event: js.Any = null,
    expand: js.UndefOr[Boolean] = js.undefined,
    expandEvent: js.UndefOr[Boolean] = js.undefined,
    fields: js.Array[_] = null,
    moveRow: js.UndefOr[Boolean] = js.undefined,
    resize: js.UndefOr[Boolean] = js.undefined,
    scroll: js.UndefOr[Boolean] = js.undefined,
    scrollHeight: js.UndefOr[Double] = js.undefined,
    sort: Boolean | js.Array[_] = null,
    sortEvent: js.UndefOr[Boolean] = js.undefined,
    sortIndex: js.UndefOr[Double] = js.undefined,
    sortOrder: asc | desc = null,
    tpl: js.Any = null,
    width: js.UndefOr[Double] = js.undefined
  ): Colshow = {
    val __obj = js.Dynamic.literal()
    if (colshow != null) __obj.updateDynamic("colshow")(colshow.asInstanceOf[js.Any])
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    if (csvNames != null) __obj.updateDynamic("csvNames")(csvNames.asInstanceOf[js.Any])
    if (csvNumber != null) __obj.updateDynamic("csvNumber")(csvNumber.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(editEvent)) __obj.updateDynamic("editEvent")(editEvent.get.asInstanceOf[js.Any])
    if (editRow != null) __obj.updateDynamic("editRow")(editRow.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expandEvent)) __obj.updateDynamic("expandEvent")(expandEvent.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(moveRow)) __obj.updateDynamic("moveRow")(moveRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollHeight)) __obj.updateDynamic("scrollHeight")(scrollHeight.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(sortEvent)) __obj.updateDynamic("sortEvent")(sortEvent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sortIndex)) __obj.updateDynamic("sortIndex")(sortIndex.get.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colshow]
  }
}

