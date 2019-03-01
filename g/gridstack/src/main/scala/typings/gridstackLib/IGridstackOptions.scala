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

object IGridstackOptions {
  @scala.inline
  def apply(
    acceptWidgets: js.UndefOr[scala.Boolean] = js.undefined,
    alwaysShowResizeHandle: js.UndefOr[scala.Boolean] = js.undefined,
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    auto: js.UndefOr[scala.Boolean] = js.undefined,
    cellHeight: scala.Int | scala.Double = null,
    ddPlugin: js.Any = null,
    disableDrag: js.UndefOr[scala.Boolean] = js.undefined,
    disableOneColumnMode: js.UndefOr[scala.Boolean] = js.undefined,
    disableResize: js.UndefOr[scala.Boolean] = js.undefined,
    draggable: js.Object = null,
    float: js.UndefOr[scala.Boolean] = js.undefined,
    handle: java.lang.String = null,
    handleClass: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    itemClass: java.lang.String = null,
    minWidth: scala.Int | scala.Double = null,
    oneColumnModeClass: java.lang.String = null,
    placeholderClass: java.lang.String = null,
    placeholderText: java.lang.String = null,
    removable: scala.Boolean | java.lang.String = null,
    removeTimeout: scala.Int | scala.Double = null,
    resizable: js.Object = null,
    rtl: scala.Boolean | gridstackLib.gridstackLibStrings.auto = null,
    staticGrid: js.UndefOr[scala.Boolean] = js.undefined,
    verticalMargin: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): IGridstackOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptWidgets)) __obj.updateDynamic("acceptWidgets")(acceptWidgets)
    if (!js.isUndefined(alwaysShowResizeHandle)) __obj.updateDynamic("alwaysShowResizeHandle")(alwaysShowResizeHandle)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto)
    if (cellHeight != null) __obj.updateDynamic("cellHeight")(cellHeight.asInstanceOf[js.Any])
    if (ddPlugin != null) __obj.updateDynamic("ddPlugin")(ddPlugin)
    if (!js.isUndefined(disableDrag)) __obj.updateDynamic("disableDrag")(disableDrag)
    if (!js.isUndefined(disableOneColumnMode)) __obj.updateDynamic("disableOneColumnMode")(disableOneColumnMode)
    if (!js.isUndefined(disableResize)) __obj.updateDynamic("disableResize")(disableResize)
    if (draggable != null) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(float)) __obj.updateDynamic("float")(float)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (handleClass != null) __obj.updateDynamic("handleClass")(handleClass)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (itemClass != null) __obj.updateDynamic("itemClass")(itemClass)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (oneColumnModeClass != null) __obj.updateDynamic("oneColumnModeClass")(oneColumnModeClass)
    if (placeholderClass != null) __obj.updateDynamic("placeholderClass")(placeholderClass)
    if (placeholderText != null) __obj.updateDynamic("placeholderText")(placeholderText)
    if (removable != null) __obj.updateDynamic("removable")(removable.asInstanceOf[js.Any])
    if (removeTimeout != null) __obj.updateDynamic("removeTimeout")(removeTimeout.asInstanceOf[js.Any])
    if (resizable != null) __obj.updateDynamic("resizable")(resizable)
    if (rtl != null) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (!js.isUndefined(staticGrid)) __obj.updateDynamic("staticGrid")(staticGrid)
    if (verticalMargin != null) __obj.updateDynamic("verticalMargin")(verticalMargin.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridstackOptions]
  }
}

