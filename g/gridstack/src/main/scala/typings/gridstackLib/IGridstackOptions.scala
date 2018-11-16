package typings
package gridstackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* Gridstack Options
* Defines the options for a Gridstack
*/

trait IGridstackOptions extends js.Object {
  /**
       *  if true of jquery selector the grid will accept widgets dragged from other grids or from outside (default: false)
       */
  var acceptWidgets: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * if true the resizing handles are shown even if the user is not hovering over the widget (default: false)
       */
  var alwaysShowResizeHandle: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * turns animation on (default: true)
       */
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * if false gridstack will not initialize existing items (default: true)
       */
  var auto: js.UndefOr[scala.Boolean] = js.undefined
  /**
       *  one cell height (default: 60)
       */
  var cellHeight: js.UndefOr[scala.Double] = js.undefined
  /**
       * class that implement drag'n'drop functionallity for gridstack. 
       * If false grid will be static. (default: null - first available plugin will be used)
       */
  var ddPlugin: js.UndefOr[js.Any] = js.undefined
  /**
       * disallows dragging of widgets (default: false).
       */
  var disableDrag: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * disables the onColumnMode when the window width is less than minWidth (default: 'false')
       */
  var disableOneColumnMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * disallows resizing of widgets (default: false).
       */
  var disableResize: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * allows to override jQuery UI draggable options. (default: { handle: '.grid-stack-item-content', scroll: true, appendTo: 'body' })
       */
  var draggable: js.UndefOr[js.Object] = js.undefined
  /**
      * enable floating widgets (default: false) See example
      */
  var float: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * draggable handle selector (default: '.grid-stack-item-content')
      */
  var handle: js.UndefOr[java.lang.String] = js.undefined
  /**
       * draggable handle class (e.g. 'grid-stack-item-content'). If set handle is ignored (default: null)
       */
  var handleClass: js.UndefOr[java.lang.String] = js.undefined
  /**
      * maximum rows amount.Default is 0 which means no maximum rows
      */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
      * widget class (default: 'grid-stack-item')
      */
  var itemClass: js.UndefOr[java.lang.String] = js.undefined
  /**
      * minimal width.If window width is less, grid will be shown in one - column mode (default: 768)
      */
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /**
       * class set on grid when in one column mode (default: 'grid-stack-one-column-mode')
       */
  var oneColumnModeClass: js.UndefOr[java.lang.String] = js.undefined
  /**
      * class for placeholder (default: 'grid-stack-placeholder')
      */
  var placeholderClass: js.UndefOr[java.lang.String] = js.undefined
  /**
       * placeholder default content (default: '')
       */
  var placeholderText: js.UndefOr[java.lang.String] = js.undefined
  /**
       * if true widgets could be removed by dragging outside of the grid. It could also be a jQuery selector string, 
       */
  var removable: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
       * time in milliseconds before widget is being removed while dragging outside of the grid. (default: 2000)
       */
  var removeTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
      * allows to override jQuery UI resizable options. (default: { autoHide: true, handles: 'se' })
      */
  var resizable: js.UndefOr[js.Object] = js.undefined
  /**
       *  if true turns grid to RTL. Possible values are true, false, 'auto' (default: 'auto')
       */
  var rtl: js.UndefOr[scala.Boolean | gridstackLib.gridstackLibStrings.auto] = js.undefined
  /**
      * makes grid static (default false).If true widgets are not movable/ resizable.You don't even need jQueryUI draggable/resizable. A CSS class grid-stack-static is also added to the container.
      */
  var staticGrid: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * vertical gap size (default: 20)
      */
  var verticalMargin: js.UndefOr[scala.Double] = js.undefined
  /**
      * amount of columns (default: 12)
      */
  var width: js.UndefOr[scala.Double] = js.undefined
}

