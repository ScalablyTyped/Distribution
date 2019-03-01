package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowOptions extends js.Object {
  var actions: js.UndefOr[js.Any] = js.undefined
  var activate: js.UndefOr[js.Function1[/* e */ WindowEvent, scala.Unit]] = js.undefined
  var animation: js.UndefOr[scala.Boolean | WindowAnimation] = js.undefined
  var appendTo: js.UndefOr[js.Any | java.lang.String] = js.undefined
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ WindowCloseEvent, scala.Unit]] = js.undefined
  var content: js.UndefOr[java.lang.String | WindowContent] = js.undefined
  var deactivate: js.UndefOr[js.Function1[/* e */ WindowEvent, scala.Unit]] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* e */ WindowEvent, scala.Unit]] = js.undefined
  var draggable: js.UndefOr[scala.Boolean | WindowDraggable] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* e */ WindowEvent, scala.Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* e */ WindowErrorEvent, scala.Unit]] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var iframe: js.UndefOr[scala.Boolean] = js.undefined
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var maximize: js.UndefOr[js.Function1[/* e */ WindowEvent, scala.Unit]] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var minimize: js.UndefOr[js.Function1[/* e */ WindowEvent, scala.Unit]] = js.undefined
  var modal: js.UndefOr[scala.Boolean | WindowModal] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ WindowEvent, scala.Unit]] = js.undefined
  var pinned: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[WindowPosition] = js.undefined
  var refresh: js.UndefOr[js.Function1[/* e */ WindowEvent, scala.Unit]] = js.undefined
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  var resize: js.UndefOr[js.Function1[/* e */ WindowEvent, scala.Unit]] = js.undefined
  var scrollable: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object WindowOptions {
  @scala.inline
  def apply(
    actions: js.Any = null,
    activate: js.Function1[/* e */ WindowEvent, scala.Unit] = null,
    animation: scala.Boolean | WindowAnimation = null,
    appendTo: js.Any | java.lang.String = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    close: js.Function1[/* e */ WindowCloseEvent, scala.Unit] = null,
    content: java.lang.String | WindowContent = null,
    deactivate: js.Function1[/* e */ WindowEvent, scala.Unit] = null,
    dragend: js.Function1[/* e */ WindowEvent, scala.Unit] = null,
    draggable: scala.Boolean | WindowDraggable = null,
    dragstart: js.Function1[/* e */ WindowEvent, scala.Unit] = null,
    error: js.Function1[/* e */ WindowErrorEvent, scala.Unit] = null,
    height: scala.Double | java.lang.String = null,
    iframe: js.UndefOr[scala.Boolean] = js.undefined,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    maximize: js.Function1[/* e */ WindowEvent, scala.Unit] = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    minimize: js.Function1[/* e */ WindowEvent, scala.Unit] = null,
    modal: scala.Boolean | WindowModal = null,
    name: java.lang.String = null,
    open: js.Function1[/* e */ WindowEvent, scala.Unit] = null,
    pinned: js.UndefOr[scala.Boolean] = js.undefined,
    position: WindowPosition = null,
    refresh: js.Function1[/* e */ WindowEvent, scala.Unit] = null,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    resize: js.Function1[/* e */ WindowEvent, scala.Unit] = null,
    scrollable: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String = null,
    title: java.lang.String | scala.Boolean = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Double | java.lang.String = null
  ): WindowOptions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (activate != null) __obj.updateDynamic("activate")(activate)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (close != null) __obj.updateDynamic("close")(close)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (deactivate != null) __obj.updateDynamic("deactivate")(deactivate)
    if (dragend != null) __obj.updateDynamic("dragend")(dragend)
    if (draggable != null) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (dragstart != null) __obj.updateDynamic("dragstart")(dragstart)
    if (error != null) __obj.updateDynamic("error")(error)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(iframe)) __obj.updateDynamic("iframe")(iframe)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (maximize != null) __obj.updateDynamic("maximize")(maximize)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (minimize != null) __obj.updateDynamic("minimize")(minimize)
    if (modal != null) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (open != null) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned)
    if (position != null) __obj.updateDynamic("position")(position)
    if (refresh != null) __obj.updateDynamic("refresh")(refresh)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable)
    if (size != null) __obj.updateDynamic("size")(size)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOptions]
  }
}

