package typings
package jqueryDotGridsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gridster extends js.Object {
  /**
      * Returns the options used to initialize the grid
      * @return Returns the options used to initialize the grid
      **/
  var options: GridsterOptions = js.native
  /**
  	* Create a new widget with the given html and add it to the grid.
  	* @param html The string representing the HTML of the widget or the HTMLElement.
  	* @param size_x The number of rows the widget occupies horizontally.  Defaults to 1.
  	* @param size_y The number of columns the widget occupies vertically.  Defaults to 1.
  	* @param col The column the widget should start in.
  	* @param row The row the widget should start in.
  	* @return Returns the jQuery wrapped HTMLElement representing the widget that was just created.
  	**/
  def add_widget(html: java.lang.String): JQuery = js.native
  /**
  	* Create a new widget with the given html and add it to the grid.
  	* @param html The string representing the HTML of the widget or the HTMLElement.
  	* @param size_x The number of rows the widget occupies horizontally.  Defaults to 1.
  	* @param size_y The number of columns the widget occupies vertically.  Defaults to 1.
  	* @param col The column the widget should start in.
  	* @param row The row the widget should start in.
  	* @return Returns the jQuery wrapped HTMLElement representing the widget that was just created.
  	**/
  def add_widget(html: java.lang.String, size_x: scala.Double): JQuery = js.native
  /**
  	* Create a new widget with the given html and add it to the grid.
  	* @param html The string representing the HTML of the widget or the HTMLElement.
  	* @param size_x The number of rows the widget occupies horizontally.  Defaults to 1.
  	* @param size_y The number of columns the widget occupies vertically.  Defaults to 1.
  	* @param col The column the widget should start in.
  	* @param row The row the widget should start in.
  	* @return Returns the jQuery wrapped HTMLElement representing the widget that was just created.
  	**/
  def add_widget(html: java.lang.String, size_x: scala.Double, size_y: scala.Double): JQuery = js.native
  /**
  	* Create a new widget with the given html and add it to the grid.
  	* @param html The string representing the HTML of the widget or the HTMLElement.
  	* @param size_x The number of rows the widget occupies horizontally.  Defaults to 1.
  	* @param size_y The number of columns the widget occupies vertically.  Defaults to 1.
  	* @param col The column the widget should start in.
  	* @param row The row the widget should start in.
  	* @return Returns the jQuery wrapped HTMLElement representing the widget that was just created.
  	**/
  def add_widget(html: java.lang.String, size_x: scala.Double, size_y: scala.Double, col: scala.Double): JQuery = js.native
  /**
  	* Create a new widget with the given html and add it to the grid.
  	* @param html The string representing the HTML of the widget or the HTMLElement.
  	* @param size_x The number of rows the widget occupies horizontally.  Defaults to 1.
  	* @param size_y The number of columns the widget occupies vertically.  Defaults to 1.
  	* @param col The column the widget should start in.
  	* @param row The row the widget should start in.
  	* @return Returns the jQuery wrapped HTMLElement representing the widget that was just created.
  	**/
  def add_widget(
    html: java.lang.String,
    size_x: scala.Double,
    size_y: scala.Double,
    col: scala.Double,
    row: scala.Double
  ): JQuery = js.native
  /**
  	* @see add_widget
  	**/
  def add_widget(html: JQuery): JQuery = js.native
  /**
  	* @see add_widget
  	**/
  def add_widget(html: JQuery, size_x: scala.Double): JQuery = js.native
  /**
  	* @see add_widget
  	**/
  def add_widget(html: JQuery, size_x: scala.Double, size_y: scala.Double): JQuery = js.native
  /**
  	* @see add_widget
  	**/
  def add_widget(html: JQuery, size_x: scala.Double, size_y: scala.Double, col: scala.Double): JQuery = js.native
  /**
  	* @see add_widget
  	**/
  def add_widget(html: JQuery, size_x: scala.Double, size_y: scala.Double, col: scala.Double, row: scala.Double): JQuery = js.native
  /**
  	* @see add_widget
  	**/
  def add_widget(html: stdLib.HTMLElement): JQuery = js.native
  /**
  	* @see add_widget
  	**/
  def add_widget(html: stdLib.HTMLElement, size_x: scala.Double): JQuery = js.native
  /**
  	* @see add_widget
  	**/
  def add_widget(html: stdLib.HTMLElement, size_x: scala.Double, size_y: scala.Double): JQuery = js.native
  /**
  	* @see add_widget
  	**/
  def add_widget(html: stdLib.HTMLElement, size_x: scala.Double, size_y: scala.Double, col: scala.Double): JQuery = js.native
  /**
  	* @see add_widget
  	**/
  def add_widget(
    html: stdLib.HTMLElement,
    size_x: scala.Double,
    size_y: scala.Double,
    col: scala.Double,
    row: scala.Double
  ): JQuery = js.native
  /**
  	* Disables dragging.
  	* @return Returns the instance of the Gridster class.
  	**/
  def disable(): Gridster = js.native
  /**
  	* Enables dragging.
  	* @return Returns the instance of the Gridster class.
  	**/
  def enable(): Gridster = js.native
  /**
       * Get the highest occupied cell.
       * @return Returns the farthest position {row: number, col: number} occupied in the grid.
       **/
  def get_highest_occupied_cell(): GridsterCoords = js.native
  /**
  	* @see remove_widget
  	**/
  def remove_widget(el: JQuery): Gridster = js.native
  /**
  	* @see remove_widget
  	**/
  def remove_widget(el: JQuery, callback: js.Function1[/* el */ stdLib.HTMLElement, scala.Unit]): Gridster = js.native
  /**
  	* @see remove_widget
  	**/
  def remove_widget(el: JQuery, silent: scala.Boolean): Gridster = js.native
  /**
  	* @see remove_widget
  	**/
  def remove_widget(el: JQuery, silent: scala.Boolean, callback: js.Function1[/* el */ stdLib.HTMLElement, scala.Unit]): Gridster = js.native
  /**
  	* Remove a widget from the grid.
  	* @param el The jQuery wrapped HTMLElement you want to remove.
  	* @param silent Boolean If true widgets below the removed one will not move up.
  	* @param callback Callback function executed when the widget is removed.
  	* @return Returns the instance of the Gridster class.
  	**/
  def remove_widget(el: stdLib.HTMLElement): Gridster = js.native
  /**
  	* @see remove_widget
  	**/
  def remove_widget(el: stdLib.HTMLElement, callback: js.Function1[/* el */ stdLib.HTMLElement, scala.Unit]): Gridster = js.native
  /**
  	* Remove a widget from the grid.
  	* @param el The jQuery wrapped HTMLElement you want to remove.
  	* @param silent Boolean If true widgets below the removed one will not move up.
  	* @param callback Callback function executed when the widget is removed.
  	* @return Returns the instance of the Gridster class.
  	**/
  def remove_widget(el: stdLib.HTMLElement, silent: scala.Boolean): Gridster = js.native
  /**
  	* Remove a widget from the grid.
  	* @param el The jQuery wrapped HTMLElement you want to remove.
  	* @param silent Boolean If true widgets below the removed one will not move up.
  	* @param callback Callback function executed when the widget is removed.
  	* @return Returns the instance of the Gridster class.
  	**/
  def remove_widget(
    el: stdLib.HTMLElement,
    silent: scala.Boolean,
    callback: js.Function1[/* el */ stdLib.HTMLElement, scala.Unit]
  ): Gridster = js.native
  /**
  	* Change the size of a widget.
  	* @param $widget The jQuery wrapped HTMLElement that represents the widget is going to be resized.
  	* @param size_x The number of rows that the widget is going to span.  Defaults to current size_x.
  	* @param size_y The number of columns that the widget is going to span.  Defaults to current size_y.
  	* @param callback Callback function wehn the widget is finished resizing.
  	* @return Returns $widget.
  	**/
  def resize_widget($widget: JQuery): JQuery = js.native
  /**
  	* Change the size of a widget.
  	* @param $widget The jQuery wrapped HTMLElement that represents the widget is going to be resized.
  	* @param size_x The number of rows that the widget is going to span.  Defaults to current size_x.
  	* @param size_y The number of columns that the widget is going to span.  Defaults to current size_y.
  	* @param callback Callback function wehn the widget is finished resizing.
  	* @return Returns $widget.
  	**/
  def resize_widget($widget: JQuery, size_x: scala.Double): JQuery = js.native
  /**
  	* Change the size of a widget.
  	* @param $widget The jQuery wrapped HTMLElement that represents the widget is going to be resized.
  	* @param size_x The number of rows that the widget is going to span.  Defaults to current size_x.
  	* @param size_y The number of columns that the widget is going to span.  Defaults to current size_y.
  	* @param callback Callback function wehn the widget is finished resizing.
  	* @return Returns $widget.
  	**/
  def resize_widget($widget: JQuery, size_x: scala.Double, size_y: scala.Double): JQuery = js.native
  /**
  	* Change the size of a widget.
  	* @param $widget The jQuery wrapped HTMLElement that represents the widget is going to be resized.
  	* @param size_x The number of rows that the widget is going to span.  Defaults to current size_x.
  	* @param size_y The number of columns that the widget is going to span.  Defaults to current size_y.
  	* @param callback Callback function wehn the widget is finished resizing.
  	* @return Returns $widget.
  	**/
  def resize_widget(
    $widget: JQuery,
    size_x: scala.Double,
    size_y: scala.Double,
    callback: js.Function2[/* size_x */ scala.Double, /* size_y */ scala.Double, scala.Unit]
  ): JQuery = js.native
  /**
       * Resize all the widgets in the grid.
       * @param options The options to use to resize the widgets.
       * @return Returns the instance of the Gridster class.
       **/
  def resize_widget_dimensions(options: GridsterOptions): Gridster = js.native
  /**
  	* Returns a serialized array of the widgets in the grid.
  	* @param $widgets The collection of jQuery wrap ed HTMLElements you want to serialize.  If no argument is passed a l widgets will be serialized.
  	* @return Returns an array of objects with the data specified in the serialized_params option.
  	**/
  def serialize[T](): js.Array[T] = js.native
  /**
  	* Returns a serialized array of the widgets in the grid.
  	* @param $widgets The collection of jQuery wrap ed HTMLElements you want to serialize.  If no argument is passed a l widgets will be serialized.
  	* @return Returns an array of objects with the data specified in the serialized_params option.
  	**/
  def serialize[T]($widgets: js.Array[stdLib.HTMLElement]): js.Array[T] = js.native
  /**
  	* Returns a serialized array of the widgets that have changed their position.
  	* @return Returns an array of objects with the data specified in the serialized_params option.
  	**/
  def serialize_changed[T](): js.Array[T] = js.native
  /**
       * Resize a widget in the grid.
       * @param widget The index of the widget to be resized.
       * @param size An array representing the size (x, y) to set on the widget.
       * @return Returns the instance of the Gridster class.
       **/
  def set_widget_min_size(widget: scala.Double, size: js.Array[scala.Double]): Gridster = js.native
}

