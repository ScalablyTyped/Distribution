package typings.jqueryDotUiDotLayout.JQueryUILayoutNs

import typings.jquery.JQueryAnimationOptions
import typings.jqueryDotUiDotLayout.Fn_Layoutname
import typings.jqueryDotUiDotLayout.Fn_LayoutnameName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneOptions extends js.Object {
  var applyDefaultStyles: js.UndefOr[Boolean] = js.undefined
  var buttonClass: js.UndefOr[String] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var contentIgnoreSelector: js.UndefOr[String] = js.undefined
  var contentSelector: js.UndefOr[String] = js.undefined
  var customHotkey: js.UndefOr[String | Double] = js.undefined
  var customHotkeyModifier: js.UndefOr[String] = js.undefined
  var enableCursorHotkey: js.UndefOr[Boolean] = js.undefined
  var fxName: js.UndefOr[String] = js.undefined
  var fxSettings: js.UndefOr[JQueryAnimationOptions] = js.undefined
  var fxSpeed: js.UndefOr[String | Double] = js.undefined
  var hideTogglerOnSlide: js.UndefOr[Boolean] = js.undefined
  var initClosed: js.UndefOr[Boolean] = js.undefined
  var initHidden: js.UndefOr[Boolean] = js.undefined
  var maskIframesOnResize: js.UndefOr[Boolean | String] = js.undefined
  var maxSize: js.UndefOr[Double] = js.undefined
  var minSize: js.UndefOr[Double] = js.undefined
  var onclose: js.UndefOr[String | Fn_LayoutnameName] = js.undefined
  var onclose_end: js.UndefOr[String | Fn_LayoutnameName] = js.undefined
  var onclose_start: js.UndefOr[String | Fn_Layoutname] = js.undefined
  var onhide: js.UndefOr[String | Fn_LayoutnameName] = js.undefined
  var onhide_end: js.UndefOr[String | Fn_LayoutnameName] = js.undefined
  var onhide_start: js.UndefOr[String | Fn_Layoutname] = js.undefined
  var onopen: js.UndefOr[String | Fn_LayoutnameName] = js.undefined
  var onopen_end: js.UndefOr[String | Fn_LayoutnameName] = js.undefined
  var onopen_start: js.UndefOr[String | Fn_Layoutname] = js.undefined
  var onresize: js.UndefOr[String | Fn_LayoutnameName] = js.undefined
  var onresize_end: js.UndefOr[String | Fn_LayoutnameName] = js.undefined
  var onresize_start: js.UndefOr[String | Fn_Layoutname] = js.undefined
  var onshow: js.UndefOr[String | Fn_LayoutnameName] = js.undefined
  var onshow_end: js.UndefOr[String | Fn_LayoutnameName] = js.undefined
  var onshow_start: js.UndefOr[String | Fn_Layoutname] = js.undefined
  var paneClass: js.UndefOr[String] = js.undefined
  var paneSelector: js.UndefOr[String] = js.undefined
  var resizable: js.UndefOr[Boolean] = js.undefined
  var resizerClass: js.UndefOr[String] = js.undefined
  var resizerCursor: js.UndefOr[String] = js.undefined
  var resizerDragOpacity: js.UndefOr[Double] = js.undefined
  var resizerTip: js.UndefOr[String] = js.undefined
  var scrollToBookmarkOnLoad: js.UndefOr[Boolean] = js.undefined
  var showOverflowOnHover: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[String | Double] = js.undefined
  var slidable: js.UndefOr[Boolean] = js.undefined
  var slideTrigger_close: js.UndefOr[String] = js.undefined
  var slideTrigger_open: js.UndefOr[String] = js.undefined
  var sliderCursor: js.UndefOr[String] = js.undefined
  var sliderTip: js.UndefOr[String] = js.undefined
  var spacing_closed: js.UndefOr[Double] = js.undefined
  var spacing_open: js.UndefOr[Double] = js.undefined
  var togglerAlign_closed: js.UndefOr[String | Double] = js.undefined
  var togglerAlign_open: js.UndefOr[String | Double] = js.undefined
  var togglerClass: js.UndefOr[String] = js.undefined
  var togglerContent_closed: js.UndefOr[String] = js.undefined
  var togglerContent_open: js.UndefOr[String] = js.undefined
  var togglerLength_closed: js.UndefOr[Double | String] = js.undefined
  var togglerLength_open: js.UndefOr[Double | String] = js.undefined
  var togglerTip_closed: js.UndefOr[String] = js.undefined
  var togglerTip_open: js.UndefOr[String] = js.undefined
}

object PaneOptions {
  @scala.inline
  def apply(
    applyDefaultStyles: js.UndefOr[Boolean] = js.undefined,
    buttonClass: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    contentIgnoreSelector: String = null,
    contentSelector: String = null,
    customHotkey: String | Double = null,
    customHotkeyModifier: String = null,
    enableCursorHotkey: js.UndefOr[Boolean] = js.undefined,
    fxName: String = null,
    fxSettings: JQueryAnimationOptions = null,
    fxSpeed: String | Double = null,
    hideTogglerOnSlide: js.UndefOr[Boolean] = js.undefined,
    initClosed: js.UndefOr[Boolean] = js.undefined,
    initHidden: js.UndefOr[Boolean] = js.undefined,
    maskIframesOnResize: Boolean | String = null,
    maxSize: Int | Double = null,
    minSize: Int | Double = null,
    onclose: String | Fn_LayoutnameName = null,
    onclose_end: String | Fn_LayoutnameName = null,
    onclose_start: String | Fn_Layoutname = null,
    onhide: String | Fn_LayoutnameName = null,
    onhide_end: String | Fn_LayoutnameName = null,
    onhide_start: String | Fn_Layoutname = null,
    onopen: String | Fn_LayoutnameName = null,
    onopen_end: String | Fn_LayoutnameName = null,
    onopen_start: String | Fn_Layoutname = null,
    onresize: String | Fn_LayoutnameName = null,
    onresize_end: String | Fn_LayoutnameName = null,
    onresize_start: String | Fn_Layoutname = null,
    onshow: String | Fn_LayoutnameName = null,
    onshow_end: String | Fn_LayoutnameName = null,
    onshow_start: String | Fn_Layoutname = null,
    paneClass: String = null,
    paneSelector: String = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    resizerClass: String = null,
    resizerCursor: String = null,
    resizerDragOpacity: Int | Double = null,
    resizerTip: String = null,
    scrollToBookmarkOnLoad: js.UndefOr[Boolean] = js.undefined,
    showOverflowOnHover: js.UndefOr[Boolean] = js.undefined,
    size: String | Double = null,
    slidable: js.UndefOr[Boolean] = js.undefined,
    slideTrigger_close: String = null,
    slideTrigger_open: String = null,
    sliderCursor: String = null,
    sliderTip: String = null,
    spacing_closed: Int | Double = null,
    spacing_open: Int | Double = null,
    togglerAlign_closed: String | Double = null,
    togglerAlign_open: String | Double = null,
    togglerClass: String = null,
    togglerContent_closed: String = null,
    togglerContent_open: String = null,
    togglerLength_closed: Double | String = null,
    togglerLength_open: Double | String = null,
    togglerTip_closed: String = null,
    togglerTip_open: String = null
  ): PaneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applyDefaultStyles)) __obj.updateDynamic("applyDefaultStyles")(applyDefaultStyles)
    if (buttonClass != null) __obj.updateDynamic("buttonClass")(buttonClass)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (contentIgnoreSelector != null) __obj.updateDynamic("contentIgnoreSelector")(contentIgnoreSelector)
    if (contentSelector != null) __obj.updateDynamic("contentSelector")(contentSelector)
    if (customHotkey != null) __obj.updateDynamic("customHotkey")(customHotkey.asInstanceOf[js.Any])
    if (customHotkeyModifier != null) __obj.updateDynamic("customHotkeyModifier")(customHotkeyModifier)
    if (!js.isUndefined(enableCursorHotkey)) __obj.updateDynamic("enableCursorHotkey")(enableCursorHotkey)
    if (fxName != null) __obj.updateDynamic("fxName")(fxName)
    if (fxSettings != null) __obj.updateDynamic("fxSettings")(fxSettings)
    if (fxSpeed != null) __obj.updateDynamic("fxSpeed")(fxSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTogglerOnSlide)) __obj.updateDynamic("hideTogglerOnSlide")(hideTogglerOnSlide)
    if (!js.isUndefined(initClosed)) __obj.updateDynamic("initClosed")(initClosed)
    if (!js.isUndefined(initHidden)) __obj.updateDynamic("initHidden")(initHidden)
    if (maskIframesOnResize != null) __obj.updateDynamic("maskIframesOnResize")(maskIframesOnResize.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (onclose != null) __obj.updateDynamic("onclose")(onclose.asInstanceOf[js.Any])
    if (onclose_end != null) __obj.updateDynamic("onclose_end")(onclose_end.asInstanceOf[js.Any])
    if (onclose_start != null) __obj.updateDynamic("onclose_start")(onclose_start.asInstanceOf[js.Any])
    if (onhide != null) __obj.updateDynamic("onhide")(onhide.asInstanceOf[js.Any])
    if (onhide_end != null) __obj.updateDynamic("onhide_end")(onhide_end.asInstanceOf[js.Any])
    if (onhide_start != null) __obj.updateDynamic("onhide_start")(onhide_start.asInstanceOf[js.Any])
    if (onopen != null) __obj.updateDynamic("onopen")(onopen.asInstanceOf[js.Any])
    if (onopen_end != null) __obj.updateDynamic("onopen_end")(onopen_end.asInstanceOf[js.Any])
    if (onopen_start != null) __obj.updateDynamic("onopen_start")(onopen_start.asInstanceOf[js.Any])
    if (onresize != null) __obj.updateDynamic("onresize")(onresize.asInstanceOf[js.Any])
    if (onresize_end != null) __obj.updateDynamic("onresize_end")(onresize_end.asInstanceOf[js.Any])
    if (onresize_start != null) __obj.updateDynamic("onresize_start")(onresize_start.asInstanceOf[js.Any])
    if (onshow != null) __obj.updateDynamic("onshow")(onshow.asInstanceOf[js.Any])
    if (onshow_end != null) __obj.updateDynamic("onshow_end")(onshow_end.asInstanceOf[js.Any])
    if (onshow_start != null) __obj.updateDynamic("onshow_start")(onshow_start.asInstanceOf[js.Any])
    if (paneClass != null) __obj.updateDynamic("paneClass")(paneClass)
    if (paneSelector != null) __obj.updateDynamic("paneSelector")(paneSelector)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (resizerClass != null) __obj.updateDynamic("resizerClass")(resizerClass)
    if (resizerCursor != null) __obj.updateDynamic("resizerCursor")(resizerCursor)
    if (resizerDragOpacity != null) __obj.updateDynamic("resizerDragOpacity")(resizerDragOpacity.asInstanceOf[js.Any])
    if (resizerTip != null) __obj.updateDynamic("resizerTip")(resizerTip)
    if (!js.isUndefined(scrollToBookmarkOnLoad)) __obj.updateDynamic("scrollToBookmarkOnLoad")(scrollToBookmarkOnLoad)
    if (!js.isUndefined(showOverflowOnHover)) __obj.updateDynamic("showOverflowOnHover")(showOverflowOnHover)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(slidable)) __obj.updateDynamic("slidable")(slidable)
    if (slideTrigger_close != null) __obj.updateDynamic("slideTrigger_close")(slideTrigger_close)
    if (slideTrigger_open != null) __obj.updateDynamic("slideTrigger_open")(slideTrigger_open)
    if (sliderCursor != null) __obj.updateDynamic("sliderCursor")(sliderCursor)
    if (sliderTip != null) __obj.updateDynamic("sliderTip")(sliderTip)
    if (spacing_closed != null) __obj.updateDynamic("spacing_closed")(spacing_closed.asInstanceOf[js.Any])
    if (spacing_open != null) __obj.updateDynamic("spacing_open")(spacing_open.asInstanceOf[js.Any])
    if (togglerAlign_closed != null) __obj.updateDynamic("togglerAlign_closed")(togglerAlign_closed.asInstanceOf[js.Any])
    if (togglerAlign_open != null) __obj.updateDynamic("togglerAlign_open")(togglerAlign_open.asInstanceOf[js.Any])
    if (togglerClass != null) __obj.updateDynamic("togglerClass")(togglerClass)
    if (togglerContent_closed != null) __obj.updateDynamic("togglerContent_closed")(togglerContent_closed)
    if (togglerContent_open != null) __obj.updateDynamic("togglerContent_open")(togglerContent_open)
    if (togglerLength_closed != null) __obj.updateDynamic("togglerLength_closed")(togglerLength_closed.asInstanceOf[js.Any])
    if (togglerLength_open != null) __obj.updateDynamic("togglerLength_open")(togglerLength_open.asInstanceOf[js.Any])
    if (togglerTip_closed != null) __obj.updateDynamic("togglerTip_closed")(togglerTip_closed)
    if (togglerTip_open != null) __obj.updateDynamic("togglerTip_open")(togglerTip_open)
    __obj.asInstanceOf[PaneOptions]
  }
}

