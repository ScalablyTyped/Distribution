package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryEventObject
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Dialog //////////////////////////////////////////////////
trait DialogOptions extends DialogEvents {
  var appendTo: js.UndefOr[String] = js.undefined
  var autoOpen: js.UndefOr[Boolean] = js.undefined
  var buttons: js.UndefOr[
    (StringDictionary[js.Function1[/* event */ js.UndefOr[Event_], Unit]]) | js.Array[DialogButtonOptions]
  ] = js.undefined
  var classes: js.UndefOr[DialogClasses] = js.undefined
  var closeOnEscape: js.UndefOr[Boolean] = js.undefined
  var closeText: js.UndefOr[String] = js.undefined
  var dialogClass: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var hide: js.UndefOr[Boolean | Double | String | DialogShowHideOptions] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[js.Any] = js.undefined
   // object, string or []
  var resizable: js.UndefOr[Boolean] = js.undefined
  var show: js.UndefOr[Boolean | Double | String | DialogShowHideOptions] = js.undefined
  var stack: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[js.Any] = js.undefined
   // number or string
  var zIndex: js.UndefOr[Double] = js.undefined
}

object DialogOptions {
  @scala.inline
  def apply(
    appendTo: String = null,
    autoOpen: js.UndefOr[Boolean] = js.undefined,
    beforeClose: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null,
    buttons: (StringDictionary[js.Function1[/* event */ js.UndefOr[Event_], Unit]]) | js.Array[DialogButtonOptions] = null,
    classes: DialogClasses = null,
    close: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null,
    closeOnEscape: js.UndefOr[Boolean] = js.undefined,
    closeText: String = null,
    create: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null,
    dialogClass: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    drag: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null,
    dragStart: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null,
    dragStop: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    focus: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null,
    height: Double | String = null,
    hide: Boolean | Double | String | DialogShowHideOptions = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    open: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null,
    position: js.Any = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    resize: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null,
    resizeStart: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null,
    resizeStop: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit = null,
    show: Boolean | Double | String | DialogShowHideOptions = null,
    stack: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    width: js.Any = null,
    zIndex: Int | Double = null
  ): DialogOptions = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen.asInstanceOf[js.Any])
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction2(beforeClose))
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction2(close))
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape.asInstanceOf[js.Any])
    if (closeText != null) __obj.updateDynamic("closeText")(closeText.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (dialogClass != null) __obj.updateDynamic("dialogClass")(dialogClass.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction2(drag))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction2(dragStart))
    if (dragStop != null) __obj.updateDynamic("dragStop")(js.Any.fromFunction2(dragStop))
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2(focus))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction2(open))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction2(resize))
    if (resizeStart != null) __obj.updateDynamic("resizeStart")(js.Any.fromFunction2(resizeStart))
    if (resizeStop != null) __obj.updateDynamic("resizeStop")(js.Any.fromFunction2(resizeStop))
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(stack)) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogOptions]
  }
}

