package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Dialog //////////////////////////////////////////////////
trait DialogOptions extends DialogEvents {
  var appendTo: js.UndefOr[java.lang.String] = js.undefined
  var autoOpen: js.UndefOr[scala.Boolean] = js.undefined
  var buttons: js.UndefOr[
    (org.scalablytyped.runtime.StringDictionary[js.Function1[/* event */ js.UndefOr[stdLib.Event], scala.Unit]]) | js.Array[DialogButtonOptions]
  ] = js.undefined
  var classes: js.UndefOr[DialogClasses] = js.undefined
  var closeOnEscape: js.UndefOr[scala.Boolean] = js.undefined
  var closeText: js.UndefOr[java.lang.String] = js.undefined
  var dialogClass: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var hide: js.UndefOr[scala.Boolean | scala.Double | java.lang.String | DialogShowHideOptions] = js.undefined
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[js.Any] = js.undefined
   // object, string or []
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  var show: js.UndefOr[scala.Boolean | scala.Double | java.lang.String | DialogShowHideOptions] = js.undefined
  var stack: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[js.Any] = js.undefined
   // number or string
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object DialogOptions {
  @scala.inline
  def apply(
    appendTo: java.lang.String = null,
    autoOpen: js.UndefOr[scala.Boolean] = js.undefined,
    beforeClose: DialogEvent = null,
    buttons: (org.scalablytyped.runtime.StringDictionary[js.Function1[/* event */ js.UndefOr[stdLib.Event], scala.Unit]]) | js.Array[DialogButtonOptions] = null,
    classes: DialogClasses = null,
    close: DialogEvent = null,
    closeOnEscape: js.UndefOr[scala.Boolean] = js.undefined,
    closeText: java.lang.String = null,
    create: DialogEvent = null,
    dialogClass: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    drag: DialogEvent = null,
    dragStart: DialogEvent = null,
    dragStop: DialogEvent = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    focus: DialogEvent = null,
    height: scala.Double | java.lang.String = null,
    hide: scala.Boolean | scala.Double | java.lang.String | DialogShowHideOptions = null,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    open: DialogEvent = null,
    position: js.Any = null,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    resize: DialogEvent = null,
    resizeStart: DialogEvent = null,
    resizeStop: DialogEvent = null,
    show: scala.Boolean | scala.Double | java.lang.String | DialogShowHideOptions = null,
    stack: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    width: js.Any = null,
    zIndex: scala.Int | scala.Double = null
  ): DialogOptions = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen)
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(beforeClose)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (close != null) __obj.updateDynamic("close")(close)
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape)
    if (closeText != null) __obj.updateDynamic("closeText")(closeText)
    if (create != null) __obj.updateDynamic("create")(create)
    if (dialogClass != null) __obj.updateDynamic("dialogClass")(dialogClass)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (dragStart != null) __obj.updateDynamic("dragStart")(dragStart)
    if (dragStop != null) __obj.updateDynamic("dragStop")(dragStop)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (open != null) __obj.updateDynamic("open")(open)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (resizeStart != null) __obj.updateDynamic("resizeStart")(resizeStart)
    if (resizeStop != null) __obj.updateDynamic("resizeStop")(resizeStop)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(stack)) __obj.updateDynamic("stack")(stack)
    if (title != null) __obj.updateDynamic("title")(title)
    if (width != null) __obj.updateDynamic("width")(width)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogOptions]
  }
}

