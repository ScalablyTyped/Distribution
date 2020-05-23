package typings.jqueryUiLayout.JQueryUILayout

import typings.jquery.JQueryAnimationOptions
import typings.jqueryUiLayout.JQuery
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
  var onclose: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var onclose_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var onclose_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var onhide: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var onhide_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var onhide_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var onopen: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var onopen_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var onopen_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var onresize: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var onresize_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var onresize_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var onshow: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var onshow_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var onshow_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ this.type, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
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
    maxSize: js.UndefOr[Double] = js.undefined,
    minSize: js.UndefOr[Double] = js.undefined,
    onclose: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    onclose_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    onclose_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    onhide: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    onhide_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    onhide_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    onopen: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    onopen_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    onopen_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    onresize: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    onresize_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    onresize_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    onshow: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    onshow_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    onshow_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    paneClass: String = null,
    paneSelector: String = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    resizerClass: String = null,
    resizerCursor: String = null,
    resizerDragOpacity: js.UndefOr[Double] = js.undefined,
    resizerTip: String = null,
    scrollToBookmarkOnLoad: js.UndefOr[Boolean] = js.undefined,
    showOverflowOnHover: js.UndefOr[Boolean] = js.undefined,
    size: String | Double = null,
    slidable: js.UndefOr[Boolean] = js.undefined,
    slideTrigger_close: String = null,
    slideTrigger_open: String = null,
    sliderCursor: String = null,
    sliderTip: String = null,
    spacing_closed: js.UndefOr[Double] = js.undefined,
    spacing_open: js.UndefOr[Double] = js.undefined,
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
    if (!js.isUndefined(applyDefaultStyles)) __obj.updateDynamic("applyDefaultStyles")(applyDefaultStyles.get.asInstanceOf[js.Any])
    if (buttonClass != null) __obj.updateDynamic("buttonClass")(buttonClass.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.get.asInstanceOf[js.Any])
    if (contentIgnoreSelector != null) __obj.updateDynamic("contentIgnoreSelector")(contentIgnoreSelector.asInstanceOf[js.Any])
    if (contentSelector != null) __obj.updateDynamic("contentSelector")(contentSelector.asInstanceOf[js.Any])
    if (customHotkey != null) __obj.updateDynamic("customHotkey")(customHotkey.asInstanceOf[js.Any])
    if (customHotkeyModifier != null) __obj.updateDynamic("customHotkeyModifier")(customHotkeyModifier.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCursorHotkey)) __obj.updateDynamic("enableCursorHotkey")(enableCursorHotkey.get.asInstanceOf[js.Any])
    if (fxName != null) __obj.updateDynamic("fxName")(fxName.asInstanceOf[js.Any])
    if (fxSettings != null) __obj.updateDynamic("fxSettings")(fxSettings.asInstanceOf[js.Any])
    if (fxSpeed != null) __obj.updateDynamic("fxSpeed")(fxSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTogglerOnSlide)) __obj.updateDynamic("hideTogglerOnSlide")(hideTogglerOnSlide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initClosed)) __obj.updateDynamic("initClosed")(initClosed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initHidden)) __obj.updateDynamic("initHidden")(initHidden.get.asInstanceOf[js.Any])
    if (maskIframesOnResize != null) __obj.updateDynamic("maskIframesOnResize")(maskIframesOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSize)) __obj.updateDynamic("maxSize")(maxSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSize)) __obj.updateDynamic("minSize")(minSize.get.asInstanceOf[js.Any])
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
    if (paneClass != null) __obj.updateDynamic("paneClass")(paneClass.asInstanceOf[js.Any])
    if (paneSelector != null) __obj.updateDynamic("paneSelector")(paneSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (resizerClass != null) __obj.updateDynamic("resizerClass")(resizerClass.asInstanceOf[js.Any])
    if (resizerCursor != null) __obj.updateDynamic("resizerCursor")(resizerCursor.asInstanceOf[js.Any])
    if (!js.isUndefined(resizerDragOpacity)) __obj.updateDynamic("resizerDragOpacity")(resizerDragOpacity.get.asInstanceOf[js.Any])
    if (resizerTip != null) __obj.updateDynamic("resizerTip")(resizerTip.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToBookmarkOnLoad)) __obj.updateDynamic("scrollToBookmarkOnLoad")(scrollToBookmarkOnLoad.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showOverflowOnHover)) __obj.updateDynamic("showOverflowOnHover")(showOverflowOnHover.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(slidable)) __obj.updateDynamic("slidable")(slidable.get.asInstanceOf[js.Any])
    if (slideTrigger_close != null) __obj.updateDynamic("slideTrigger_close")(slideTrigger_close.asInstanceOf[js.Any])
    if (slideTrigger_open != null) __obj.updateDynamic("slideTrigger_open")(slideTrigger_open.asInstanceOf[js.Any])
    if (sliderCursor != null) __obj.updateDynamic("sliderCursor")(sliderCursor.asInstanceOf[js.Any])
    if (sliderTip != null) __obj.updateDynamic("sliderTip")(sliderTip.asInstanceOf[js.Any])
    if (!js.isUndefined(spacing_closed)) __obj.updateDynamic("spacing_closed")(spacing_closed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spacing_open)) __obj.updateDynamic("spacing_open")(spacing_open.get.asInstanceOf[js.Any])
    if (togglerAlign_closed != null) __obj.updateDynamic("togglerAlign_closed")(togglerAlign_closed.asInstanceOf[js.Any])
    if (togglerAlign_open != null) __obj.updateDynamic("togglerAlign_open")(togglerAlign_open.asInstanceOf[js.Any])
    if (togglerClass != null) __obj.updateDynamic("togglerClass")(togglerClass.asInstanceOf[js.Any])
    if (togglerContent_closed != null) __obj.updateDynamic("togglerContent_closed")(togglerContent_closed.asInstanceOf[js.Any])
    if (togglerContent_open != null) __obj.updateDynamic("togglerContent_open")(togglerContent_open.asInstanceOf[js.Any])
    if (togglerLength_closed != null) __obj.updateDynamic("togglerLength_closed")(togglerLength_closed.asInstanceOf[js.Any])
    if (togglerLength_open != null) __obj.updateDynamic("togglerLength_open")(togglerLength_open.asInstanceOf[js.Any])
    if (togglerTip_closed != null) __obj.updateDynamic("togglerTip_closed")(togglerTip_closed.asInstanceOf[js.Any])
    if (togglerTip_open != null) __obj.updateDynamic("togglerTip_open")(togglerTip_open.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneOptions]
  }
}

