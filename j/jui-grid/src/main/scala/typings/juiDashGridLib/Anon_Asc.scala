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

