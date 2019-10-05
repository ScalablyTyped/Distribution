package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowOptions extends js.Object {
  var actions: js.UndefOr[js.Any] = js.undefined
  var activate: js.UndefOr[js.Function1[/* e */ WindowEvent, Unit]] = js.undefined
  var animation: js.UndefOr[Boolean | WindowAnimation] = js.undefined
  var appendTo: js.UndefOr[js.Any | String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ WindowCloseEvent, Unit]] = js.undefined
  var content: js.UndefOr[String | WindowContent] = js.undefined
  var deactivate: js.UndefOr[js.Function1[/* e */ WindowEvent, Unit]] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* e */ WindowEvent, Unit]] = js.undefined
  var draggable: js.UndefOr[Boolean | WindowDraggable] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* e */ WindowEvent, Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* e */ WindowErrorEvent, Unit]] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var iframe: js.UndefOr[Boolean] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var maximize: js.UndefOr[js.Function1[/* e */ WindowEvent, Unit]] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var minimize: js.UndefOr[js.Function1[/* e */ WindowEvent, Unit]] = js.undefined
  var modal: js.UndefOr[Boolean | WindowModal] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ WindowEvent, Unit]] = js.undefined
  var pinned: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[WindowPosition] = js.undefined
  var refresh: js.UndefOr[js.Function1[/* e */ WindowEvent, Unit]] = js.undefined
  var resizable: js.UndefOr[Boolean] = js.undefined
  var resize: js.UndefOr[js.Function1[/* e */ WindowEvent, Unit]] = js.undefined
  var scrollable: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String | Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object WindowOptions {
  @scala.inline
  def apply(
    actions: js.Any = null,
    activate: /* e */ WindowEvent => Unit = null,
    animation: Boolean | WindowAnimation = null,
    appendTo: js.Any | String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    close: /* e */ WindowCloseEvent => Unit = null,
    content: String | WindowContent = null,
    deactivate: /* e */ WindowEvent => Unit = null,
    dragend: /* e */ WindowEvent => Unit = null,
    draggable: Boolean | WindowDraggable = null,
    dragstart: /* e */ WindowEvent => Unit = null,
    error: /* e */ WindowErrorEvent => Unit = null,
    height: Double | String = null,
    iframe: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    maximize: /* e */ WindowEvent => Unit = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    minimize: /* e */ WindowEvent => Unit = null,
    modal: Boolean | WindowModal = null,
    name: String = null,
    open: /* e */ WindowEvent => Unit = null,
    pinned: js.UndefOr[Boolean] = js.undefined,
    position: WindowPosition = null,
    refresh: /* e */ WindowEvent => Unit = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    resize: /* e */ WindowEvent => Unit = null,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    title: String | Boolean = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null
  ): WindowOptions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction1(activate))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction1(deactivate))
    if (dragend != null) __obj.updateDynamic("dragend")(js.Any.fromFunction1(dragend))
    if (draggable != null) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (dragstart != null) __obj.updateDynamic("dragstart")(js.Any.fromFunction1(dragstart))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(iframe)) __obj.updateDynamic("iframe")(iframe)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (maximize != null) __obj.updateDynamic("maximize")(js.Any.fromFunction1(maximize))
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (minimize != null) __obj.updateDynamic("minimize")(js.Any.fromFunction1(minimize))
    if (modal != null) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned)
    if (position != null) __obj.updateDynamic("position")(position)
    if (refresh != null) __obj.updateDynamic("refresh")(js.Any.fromFunction1(refresh))
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1(resize))
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable)
    if (size != null) __obj.updateDynamic("size")(size)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOptions]
  }
}

