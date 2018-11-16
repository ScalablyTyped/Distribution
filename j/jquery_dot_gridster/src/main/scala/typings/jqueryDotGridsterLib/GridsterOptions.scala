package typings
package jqueryDotGridsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GridsterOptions extends js.Object {
  /**
       * A boolean to specify if the stylesheet should be generated or not
       **/
  var autogenerate_stylesheet: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	* If true, all the CSS required to  osition  	l widgets in their respective col umns and rows will be generated automatically and injectedt the<head> of thed cument.You can set this to false, and write your own CSS targeting rows and cols via data - attributes like so: [data - col = "1"] { left: 10px; }
  	* Default = true
  	**/
  var autogenerate_sytesheet: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	* Avoid that widgets loaded from the DOM can be overlapped.  It is helpful if the positions were bad stored in the database or if there was any conflict.
  	* Default = true
  	**/
  var avoid_overlapped_widgets: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	* An object with all options for Collision class you want to overwrite.  @see GridsterCollision or docs for more info.
  	**/
  var collision: js.UndefOr[GridsterCollision] = js.undefined
  /**
  	* An object with all options for Draggable class you want to overwrite.  @see GridsterDraggable or docs for more info.
  	**/
  var draggable: js.UndefOr[GridsterDraggable] = js.undefined
  /**
  	* Add more columns in addition to those that have been calculated.
  	* Default = 0
  	**/
  var extra_cols: js.UndefOr[scala.Double] = js.undefined
  /**
  	* Add more rows in addition to those that have been calculated.
  	* Default = 0
  	**/
  var extra_rows: js.UndefOr[scala.Double] = js.undefined
  /**
  	* The maximum columns possible (set to null for no maximum).
  	* Default = null
  	**/
  var max_cols: js.UndefOr[scala.Double] = js.undefined
  /**
  	* The maximum number of columns that a widget can span.
  	* Default = 6
  	**/
  var max_size_x: js.UndefOr[scala.Double] = js.undefined
  /**
  	* The minimum required columns.
  	* Default = 1
  	**/
  var min_cols: js.UndefOr[scala.Double] = js.undefined
  /**
  	* The minimum required rows.
  	* Default = 15
  	**/
  var min_rows: js.UndefOr[scala.Double] = js.undefined
  /**
  	* A string to differentiate one gridster from another
  	**/
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  /**
       * An object with all options for Resizable class you want to overwrite.  @see GridsterResizable or docs for more info.
       **/
  var resize: js.UndefOr[GridsterResizable] = js.undefined
  /**
  	* Return the data you want for each widget in the serialization.
  	**/
  var serialize_params: js.UndefOr[js.Function2[/* $w */ JQuery, /* wgd */ GridsterCoords, _]] = js.undefined
  /**
  	* Base widget dimensions in pixels.  The first index for the width and the second for the height.
  	* Default = [400, 225]
  	**/
  var widget_base_dimensions: js.UndefOr[js.Array[jqueryDotGridsterLib.jqueryDotGridsterLibStrings.auto | scala.Double]] = js.undefined
  /**
  	* Margin between widgets.  The first index for the horizontal margin (left, right) and the second for the vertical margin (top, bottom).
  	* Default = [10, 10]
  	**/
  var widget_margins: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
  	* Define who will be the draggable widgets.  Can be a CSS Selector String or a collection of HTMLElements.
  	* Type => string css selector
  	* Type => HTMLElement[]
  	* Default = 'li'
  	**/
  var widget_selector: js.UndefOr[java.lang.String | js.Array[stdLib.HTMLElement]] = js.undefined
}

