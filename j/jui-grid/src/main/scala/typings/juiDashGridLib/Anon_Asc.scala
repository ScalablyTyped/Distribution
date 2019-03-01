package typings
package juiDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Asc extends js.Object {
  /**
    * @cfg {Boolean/Array} [colshow=false]
    * Sets a column index shown when the Show/Hide Column menu is enabled.
    */
  var colshow: js.UndefOr[scala.Boolean | js.Array[_]] = js.undefined
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
  var editEvent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @cfg {Boolean|Array} [editRow=false]
    * Determines whether to use a modified row area.
    */
  var editRow: js.UndefOr[scala.Boolean | js.Array[_]] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Boolean} [expand=false]
    * Determines whether to use an extended row area.
    */
  var expand: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @cfg {Boolean} [expandEvent=true]
    * Sets the Show/Hide state of an extended row area when clicking on a row.
    */
  var expandEvent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @cfg {Array} [fields=null]
    * Sets the name of columns in the order of being displayed on the table screen.
    */
  var fields: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @cfg {Boolean} [moveRow=false]
    * Determines whether to use the move function when you fire row draggable event.
    */
  var moveRow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @cfg {Boolean} [resize=false]
    * Determines whether to use the column resizing function.
    */
  var resize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @cfg {Boolean} [scroll=false]
    * Determines whether to use a table scroll.
    */
  var scroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @cfg {Integer} [scrollHeight=200]
    * Sets the reference height of a body area when using a table scroll.
    */
  var scrollHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * @cfg {Boolean/Array} [sort=false]
    * Determines whether to use the table sort function.
    */
  var sort: js.UndefOr[scala.Boolean | js.Array[_]] = js.undefined
  /**
    * @cfg {Boolean} [sortEvent=true]
    * Determines whether to use the sort function when you click on a column.
    */
  var sortEvent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @cfg {Integer} [sortIndex=null]
    * Determines whether to use the table sort function.
    */
  var sortIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * @cfg {String} [sortOrder="asc"]
    * Determines whether to use the table sort function.
    */
  var sortOrder: js.UndefOr[
    juiDashGridLib.juiDashGridLibStrings.asc | juiDashGridLib.juiDashGridLibStrings.desc
  ] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Integer} [width=0]
    * Sets the area of a table.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Asc {
  @scala.inline
  def apply(
    colshow: scala.Boolean | js.Array[_] = null,
    csv: js.Array[_] = null,
    csvNames: js.Array[_] = null,
    csvNumber: js.Array[_] = null,
    data: js.Array[_] = null,
    editEvent: js.UndefOr[scala.Boolean] = js.undefined,
    editRow: scala.Boolean | js.Array[_] = null,
    event: js.Any = null,
    expand: js.UndefOr[scala.Boolean] = js.undefined,
    expandEvent: js.UndefOr[scala.Boolean] = js.undefined,
    fields: js.Array[_] = null,
    moveRow: js.UndefOr[scala.Boolean] = js.undefined,
    resize: js.UndefOr[scala.Boolean] = js.undefined,
    scroll: js.UndefOr[scala.Boolean] = js.undefined,
    scrollHeight: scala.Int | scala.Double = null,
    sort: scala.Boolean | js.Array[_] = null,
    sortEvent: js.UndefOr[scala.Boolean] = js.undefined,
    sortIndex: scala.Int | scala.Double = null,
    sortOrder: juiDashGridLib.juiDashGridLibStrings.asc | juiDashGridLib.juiDashGridLibStrings.desc = null,
    tpl: js.Any = null,
    width: scala.Int | scala.Double = null
  ): Anon_Asc = {
    val __obj = js.Dynamic.literal()
    if (colshow != null) __obj.updateDynamic("colshow")(colshow.asInstanceOf[js.Any])
    if (csv != null) __obj.updateDynamic("csv")(csv)
    if (csvNames != null) __obj.updateDynamic("csvNames")(csvNames)
    if (csvNumber != null) __obj.updateDynamic("csvNumber")(csvNumber)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(editEvent)) __obj.updateDynamic("editEvent")(editEvent)
    if (editRow != null) __obj.updateDynamic("editRow")(editRow.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event)
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand)
    if (!js.isUndefined(expandEvent)) __obj.updateDynamic("expandEvent")(expandEvent)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(moveRow)) __obj.updateDynamic("moveRow")(moveRow)
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize)
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(sortEvent)) __obj.updateDynamic("sortEvent")(sortEvent)
    if (sortIndex != null) __obj.updateDynamic("sortIndex")(sortIndex.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Asc]
  }
}

