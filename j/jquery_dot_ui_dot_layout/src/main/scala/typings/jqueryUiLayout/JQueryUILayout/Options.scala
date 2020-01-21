package typings.jqueryUiLayout.JQueryUILayout

import typings.jquery.JQueryAnimationOptions
import typings.jqueryUiLayout.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends PaneOptions {
  var center: js.UndefOr[PaneOptions] = js.undefined
  var center__applyDefaultStyles: js.UndefOr[Boolean] = js.undefined
  var center__buttonClass: js.UndefOr[String] = js.undefined
  var center__closable: js.UndefOr[Boolean] = js.undefined
  var center__contentIgnoreSelector: js.UndefOr[String] = js.undefined
  var center__contentSelector: js.UndefOr[String] = js.undefined
  var center__customHotkey: js.UndefOr[String | Double] = js.undefined
  var center__customHotkeyModifier: js.UndefOr[String] = js.undefined
  var center__enableCursorHotkey: js.UndefOr[Boolean] = js.undefined
  var center__fxName: js.UndefOr[String] = js.undefined
  var center__fxSettings: js.UndefOr[JQueryAnimationOptions] = js.undefined
  var center__fxSpeed: js.UndefOr[String | Double] = js.undefined
  var center__hideTogglerOnSlide: js.UndefOr[Boolean] = js.undefined
  var center__initClosed: js.UndefOr[Boolean] = js.undefined
  var center__initHidden: js.UndefOr[Boolean] = js.undefined
  var center__maskIframesOnResize: js.UndefOr[Boolean | String] = js.undefined
  var center__maxSize: js.UndefOr[Double] = js.undefined
  var center__minSize: js.UndefOr[Double] = js.undefined
  var center__onclose: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var center__onclose_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var center__onclose_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var center__onhide: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var center__onhide_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var center__onhide_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var center__onopen: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var center__onopen_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var center__onopen_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var center__onresize: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var center__onresize_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var center__onresize_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var center__onshow: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var center__onshow_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var center__onshow_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var center__paneClass: js.UndefOr[String] = js.undefined
  var center__paneSelector: js.UndefOr[String] = js.undefined
  var center__resizable: js.UndefOr[Boolean] = js.undefined
  var center__resizerClass: js.UndefOr[String] = js.undefined
  var center__resizerCursor: js.UndefOr[String] = js.undefined
  var center__resizerDragOpacity: js.UndefOr[Double] = js.undefined
  var center__resizerTip: js.UndefOr[String] = js.undefined
  var center__scrollToBookmarkOnLoad: js.UndefOr[Boolean] = js.undefined
  var center__showOverflowOnHover: js.UndefOr[Boolean] = js.undefined
  var center__size: js.UndefOr[String | Double] = js.undefined
  var center__slidable: js.UndefOr[Boolean] = js.undefined
  var center__slideTrigger_close: js.UndefOr[String] = js.undefined
  var center__slideTrigger_open: js.UndefOr[String] = js.undefined
  var center__sliderCursor: js.UndefOr[String] = js.undefined
  var center__sliderTip: js.UndefOr[String] = js.undefined
  var center__spacing_closed: js.UndefOr[Double] = js.undefined
  var center__spacing_open: js.UndefOr[Double] = js.undefined
  var center__togglerAlign_closed: js.UndefOr[String | Double] = js.undefined
  var center__togglerAlign_open: js.UndefOr[String | Double] = js.undefined
  var center__togglerClass: js.UndefOr[String] = js.undefined
  var center__togglerContent_closed: js.UndefOr[String] = js.undefined
  var center__togglerContent_open: js.UndefOr[String] = js.undefined
  var center__togglerLength_closed: js.UndefOr[Double | String] = js.undefined
  var center__togglerLength_open: js.UndefOr[Double | String] = js.undefined
  var center__togglerTip_closed: js.UndefOr[String] = js.undefined
  var center__togglerTip_open: js.UndefOr[String] = js.undefined
  var defaults: js.UndefOr[PaneOptions] = js.undefined
  var defaults__applyDefaultStyles: js.UndefOr[Boolean] = js.undefined
  var defaults__buttonClass: js.UndefOr[String] = js.undefined
  var defaults__closable: js.UndefOr[Boolean] = js.undefined
  var defaults__contentIgnoreSelector: js.UndefOr[String] = js.undefined
  var defaults__contentSelector: js.UndefOr[String] = js.undefined
  var defaults__customHotkey: js.UndefOr[String | Double] = js.undefined
  var defaults__customHotkeyModifier: js.UndefOr[String] = js.undefined
  var defaults__enableCursorHotkey: js.UndefOr[Boolean] = js.undefined
  var defaults__fxName: js.UndefOr[String] = js.undefined
  var defaults__fxSettings: js.UndefOr[JQueryAnimationOptions] = js.undefined
  var defaults__fxSpeed: js.UndefOr[String | Double] = js.undefined
  var defaults__hideTogglerOnSlide: js.UndefOr[Boolean] = js.undefined
  var defaults__initClosed: js.UndefOr[Boolean] = js.undefined
  var defaults__initHidden: js.UndefOr[Boolean] = js.undefined
  var defaults__maskIframesOnResize: js.UndefOr[Boolean | String] = js.undefined
  var defaults__maxSize: js.UndefOr[Double] = js.undefined
  var defaults__minSize: js.UndefOr[Double] = js.undefined
  var defaults__onclose: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var defaults__onclose_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var defaults__onclose_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var defaults__onhide: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var defaults__onhide_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var defaults__onhide_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var defaults__onopen: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var defaults__onopen_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var defaults__onopen_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var defaults__onresize: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var defaults__onresize_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var defaults__onresize_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var defaults__onshow: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var defaults__onshow_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var defaults__onshow_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var defaults__paneClass: js.UndefOr[String] = js.undefined
  var defaults__paneSelector: js.UndefOr[String] = js.undefined
  var defaults__resizable: js.UndefOr[Boolean] = js.undefined
  var defaults__resizerClass: js.UndefOr[String] = js.undefined
  var defaults__resizerCursor: js.UndefOr[String] = js.undefined
  var defaults__resizerDragOpacity: js.UndefOr[Double] = js.undefined
  var defaults__resizerTip: js.UndefOr[String] = js.undefined
  var defaults__scrollToBookmarkOnLoad: js.UndefOr[Boolean] = js.undefined
  var defaults__showOverflowOnHover: js.UndefOr[Boolean] = js.undefined
  var defaults__size: js.UndefOr[String | Double] = js.undefined
  var defaults__slidable: js.UndefOr[Boolean] = js.undefined
  var defaults__slideTrigger_close: js.UndefOr[String] = js.undefined
  var defaults__slideTrigger_open: js.UndefOr[String] = js.undefined
  var defaults__sliderCursor: js.UndefOr[String] = js.undefined
  var defaults__sliderTip: js.UndefOr[String] = js.undefined
  var defaults__spacing_closed: js.UndefOr[Double] = js.undefined
  var defaults__spacing_open: js.UndefOr[Double] = js.undefined
  var defaults__togglerAlign_closed: js.UndefOr[String | Double] = js.undefined
  var defaults__togglerAlign_open: js.UndefOr[String | Double] = js.undefined
  var defaults__togglerClass: js.UndefOr[String] = js.undefined
  var defaults__togglerContent_closed: js.UndefOr[String] = js.undefined
  var defaults__togglerContent_open: js.UndefOr[String] = js.undefined
  var defaults__togglerLength_closed: js.UndefOr[Double | String] = js.undefined
  var defaults__togglerLength_open: js.UndefOr[Double | String] = js.undefined
  var defaults__togglerTip_closed: js.UndefOr[String] = js.undefined
  var defaults__togglerTip_open: js.UndefOr[String] = js.undefined
  var east: js.UndefOr[PaneOptions] = js.undefined
  var east__applyDefaultStyles: js.UndefOr[Boolean] = js.undefined
  var east__buttonClass: js.UndefOr[String] = js.undefined
  var east__closable: js.UndefOr[Boolean] = js.undefined
  var east__contentIgnoreSelector: js.UndefOr[String] = js.undefined
  var east__contentSelector: js.UndefOr[String] = js.undefined
  var east__customHotkey: js.UndefOr[String | Double] = js.undefined
  var east__customHotkeyModifier: js.UndefOr[String] = js.undefined
  var east__enableCursorHotkey: js.UndefOr[Boolean] = js.undefined
  var east__fxName: js.UndefOr[String] = js.undefined
  var east__fxSettings: js.UndefOr[JQueryAnimationOptions] = js.undefined
  var east__fxSpeed: js.UndefOr[String | Double] = js.undefined
  var east__hideTogglerOnSlide: js.UndefOr[Boolean] = js.undefined
  var east__initClosed: js.UndefOr[Boolean] = js.undefined
  var east__initHidden: js.UndefOr[Boolean] = js.undefined
  var east__maskIframesOnResize: js.UndefOr[Boolean | String] = js.undefined
  var east__maxSize: js.UndefOr[Double] = js.undefined
  var east__minSize: js.UndefOr[Double] = js.undefined
  var east__onclose: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var east__onclose_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var east__onclose_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var east__onhide: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var east__onhide_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var east__onhide_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var east__onopen: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var east__onopen_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var east__onopen_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var east__onresize: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var east__onresize_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var east__onresize_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var east__onshow: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var east__onshow_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var east__onshow_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var east__paneClass: js.UndefOr[String] = js.undefined
  var east__paneSelector: js.UndefOr[String] = js.undefined
  var east__resizable: js.UndefOr[Boolean] = js.undefined
  var east__resizerClass: js.UndefOr[String] = js.undefined
  var east__resizerCursor: js.UndefOr[String] = js.undefined
  var east__resizerDragOpacity: js.UndefOr[Double] = js.undefined
  var east__resizerTip: js.UndefOr[String] = js.undefined
  var east__scrollToBookmarkOnLoad: js.UndefOr[Boolean] = js.undefined
  var east__showOverflowOnHover: js.UndefOr[Boolean] = js.undefined
  var east__size: js.UndefOr[String | Double] = js.undefined
  var east__slidable: js.UndefOr[Boolean] = js.undefined
  var east__slideTrigger_close: js.UndefOr[String] = js.undefined
  var east__slideTrigger_open: js.UndefOr[String] = js.undefined
  var east__sliderCursor: js.UndefOr[String] = js.undefined
  var east__sliderTip: js.UndefOr[String] = js.undefined
  var east__spacing_closed: js.UndefOr[Double] = js.undefined
  var east__spacing_open: js.UndefOr[Double] = js.undefined
  var east__togglerAlign_closed: js.UndefOr[String | Double] = js.undefined
  var east__togglerAlign_open: js.UndefOr[String | Double] = js.undefined
  var east__togglerClass: js.UndefOr[String] = js.undefined
  var east__togglerContent_closed: js.UndefOr[String] = js.undefined
  var east__togglerContent_open: js.UndefOr[String] = js.undefined
  var east__togglerLength_closed: js.UndefOr[Double | String] = js.undefined
  var east__togglerLength_open: js.UndefOr[Double | String] = js.undefined
  var east__togglerTip_closed: js.UndefOr[String] = js.undefined
  var east__togglerTip_open: js.UndefOr[String] = js.undefined
  var north: js.UndefOr[PaneOptions] = js.undefined
  var north__applyDefaultStyles: js.UndefOr[Boolean] = js.undefined
  var north__buttonClass: js.UndefOr[String] = js.undefined
  var north__closable: js.UndefOr[Boolean] = js.undefined
  var north__contentIgnoreSelector: js.UndefOr[String] = js.undefined
  var north__contentSelector: js.UndefOr[String] = js.undefined
  var north__customHotkey: js.UndefOr[String | Double] = js.undefined
  var north__customHotkeyModifier: js.UndefOr[String] = js.undefined
  var north__enableCursorHotkey: js.UndefOr[Boolean] = js.undefined
  var north__fxName: js.UndefOr[String] = js.undefined
  var north__fxSettings: js.UndefOr[JQueryAnimationOptions] = js.undefined
  var north__fxSpeed: js.UndefOr[String | Double] = js.undefined
  var north__hideTogglerOnSlide: js.UndefOr[Boolean] = js.undefined
  var north__initClosed: js.UndefOr[Boolean] = js.undefined
  var north__initHidden: js.UndefOr[Boolean] = js.undefined
  var north__maskIframesOnResize: js.UndefOr[Boolean | String] = js.undefined
  var north__maxSize: js.UndefOr[Double] = js.undefined
  var north__minSize: js.UndefOr[Double] = js.undefined
  var north__onclose: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var north__onclose_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var north__onclose_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var north__onhide: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var north__onhide_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var north__onhide_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var north__onopen: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var north__onopen_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var north__onopen_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var north__onresize: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var north__onresize_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var north__onresize_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var north__onshow: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var north__onshow_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var north__onshow_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var north__paneClass: js.UndefOr[String] = js.undefined
  var north__paneSelector: js.UndefOr[String] = js.undefined
  var north__resizable: js.UndefOr[Boolean] = js.undefined
  var north__resizerClass: js.UndefOr[String] = js.undefined
  var north__resizerCursor: js.UndefOr[String] = js.undefined
  var north__resizerDragOpacity: js.UndefOr[Double] = js.undefined
  var north__resizerTip: js.UndefOr[String] = js.undefined
  var north__scrollToBookmarkOnLoad: js.UndefOr[Boolean] = js.undefined
  var north__showOverflowOnHover: js.UndefOr[Boolean] = js.undefined
  var north__size: js.UndefOr[String | Double] = js.undefined
  var north__slidable: js.UndefOr[Boolean] = js.undefined
  var north__slideTrigger_close: js.UndefOr[String] = js.undefined
  var north__slideTrigger_open: js.UndefOr[String] = js.undefined
  var north__sliderCursor: js.UndefOr[String] = js.undefined
  var north__sliderTip: js.UndefOr[String] = js.undefined
  var north__spacing_closed: js.UndefOr[Double] = js.undefined
  var north__spacing_open: js.UndefOr[Double] = js.undefined
  var north__togglerAlign_closed: js.UndefOr[String | Double] = js.undefined
  var north__togglerAlign_open: js.UndefOr[String | Double] = js.undefined
  var north__togglerClass: js.UndefOr[String] = js.undefined
  var north__togglerContent_closed: js.UndefOr[String] = js.undefined
  var north__togglerContent_open: js.UndefOr[String] = js.undefined
  var north__togglerLength_closed: js.UndefOr[Double | String] = js.undefined
  var north__togglerLength_open: js.UndefOr[Double | String] = js.undefined
  var north__togglerTip_closed: js.UndefOr[String] = js.undefined
  var north__togglerTip_open: js.UndefOr[String] = js.undefined
  var south: js.UndefOr[PaneOptions] = js.undefined
  var south__applyDefaultStyles: js.UndefOr[Boolean] = js.undefined
  var south__buttonClass: js.UndefOr[String] = js.undefined
  var south__closable: js.UndefOr[Boolean] = js.undefined
  var south__contentIgnoreSelector: js.UndefOr[String] = js.undefined
  var south__contentSelector: js.UndefOr[String] = js.undefined
  var south__customHotkey: js.UndefOr[String | Double] = js.undefined
  var south__customHotkeyModifier: js.UndefOr[String] = js.undefined
  var south__enableCursorHotkey: js.UndefOr[Boolean] = js.undefined
  var south__fxName: js.UndefOr[String] = js.undefined
  var south__fxSettings: js.UndefOr[JQueryAnimationOptions] = js.undefined
  var south__fxSpeed: js.UndefOr[String | Double] = js.undefined
  var south__hideTogglerOnSlide: js.UndefOr[Boolean] = js.undefined
  var south__initClosed: js.UndefOr[Boolean] = js.undefined
  var south__initHidden: js.UndefOr[Boolean] = js.undefined
  var south__maskIframesOnResize: js.UndefOr[Boolean | String] = js.undefined
  var south__maxSize: js.UndefOr[Double] = js.undefined
  var south__minSize: js.UndefOr[Double] = js.undefined
  var south__onclose: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var south__onclose_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var south__onclose_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var south__onhide: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var south__onhide_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var south__onhide_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var south__onopen: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var south__onopen_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var south__onopen_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var south__onresize: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var south__onresize_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var south__onresize_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var south__onshow: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var south__onshow_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var south__onshow_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var south__paneClass: js.UndefOr[String] = js.undefined
  var south__paneSelector: js.UndefOr[String] = js.undefined
  var south__resizable: js.UndefOr[Boolean] = js.undefined
  var south__resizerClass: js.UndefOr[String] = js.undefined
  var south__resizerCursor: js.UndefOr[String] = js.undefined
  var south__resizerDragOpacity: js.UndefOr[Double] = js.undefined
  var south__resizerTip: js.UndefOr[String] = js.undefined
  var south__scrollToBookmarkOnLoad: js.UndefOr[Boolean] = js.undefined
  var south__showOverflowOnHover: js.UndefOr[Boolean] = js.undefined
  var south__size: js.UndefOr[String | Double] = js.undefined
  var south__slidable: js.UndefOr[Boolean] = js.undefined
  var south__slideTrigger_close: js.UndefOr[String] = js.undefined
  var south__slideTrigger_open: js.UndefOr[String] = js.undefined
  var south__sliderCursor: js.UndefOr[String] = js.undefined
  var south__sliderTip: js.UndefOr[String] = js.undefined
  var south__spacing_closed: js.UndefOr[Double] = js.undefined
  var south__spacing_open: js.UndefOr[Double] = js.undefined
  var south__togglerAlign_closed: js.UndefOr[String | Double] = js.undefined
  var south__togglerAlign_open: js.UndefOr[String | Double] = js.undefined
  var south__togglerClass: js.UndefOr[String] = js.undefined
  var south__togglerContent_closed: js.UndefOr[String] = js.undefined
  var south__togglerContent_open: js.UndefOr[String] = js.undefined
  var south__togglerLength_closed: js.UndefOr[Double | String] = js.undefined
  var south__togglerLength_open: js.UndefOr[Double | String] = js.undefined
  var south__togglerTip_closed: js.UndefOr[String] = js.undefined
  var south__togglerTip_open: js.UndefOr[String] = js.undefined
  var west: js.UndefOr[PaneOptions] = js.undefined
  var west__applyDefaultStyles: js.UndefOr[Boolean] = js.undefined
  var west__buttonClass: js.UndefOr[String] = js.undefined
  var west__closable: js.UndefOr[Boolean] = js.undefined
  var west__contentIgnoreSelector: js.UndefOr[String] = js.undefined
  var west__contentSelector: js.UndefOr[String] = js.undefined
  var west__customHotkey: js.UndefOr[String | Double] = js.undefined
  var west__customHotkeyModifier: js.UndefOr[String] = js.undefined
  var west__enableCursorHotkey: js.UndefOr[Boolean] = js.undefined
  var west__fxName: js.UndefOr[String] = js.undefined
  var west__fxSettings: js.UndefOr[JQueryAnimationOptions] = js.undefined
  var west__fxSpeed: js.UndefOr[String | Double] = js.undefined
  var west__hideTogglerOnSlide: js.UndefOr[Boolean] = js.undefined
  var west__initClosed: js.UndefOr[Boolean] = js.undefined
  var west__initHidden: js.UndefOr[Boolean] = js.undefined
  var west__maskIframesOnResize: js.UndefOr[Boolean | String] = js.undefined
  var west__maxSize: js.UndefOr[Double] = js.undefined
  var west__minSize: js.UndefOr[Double] = js.undefined
  var west__onclose: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var west__onclose_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var west__onclose_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var west__onhide: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var west__onhide_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var west__onhide_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var west__onopen: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var west__onopen_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var west__onopen_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var west__onresize: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var west__onresize_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var west__onresize_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var west__onshow: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var west__onshow_end: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ])
  ] = js.undefined
  var west__onshow_start: js.UndefOr[
    String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ])
  ] = js.undefined
  var west__paneClass: js.UndefOr[String] = js.undefined
  var west__paneSelector: js.UndefOr[String] = js.undefined
  var west__resizable: js.UndefOr[Boolean] = js.undefined
  var west__resizerClass: js.UndefOr[String] = js.undefined
  var west__resizerCursor: js.UndefOr[String] = js.undefined
  var west__resizerDragOpacity: js.UndefOr[Double] = js.undefined
  var west__resizerTip: js.UndefOr[String] = js.undefined
  var west__scrollToBookmarkOnLoad: js.UndefOr[Boolean] = js.undefined
  var west__showOverflowOnHover: js.UndefOr[Boolean] = js.undefined
  var west__size: js.UndefOr[String | Double] = js.undefined
  var west__slidable: js.UndefOr[Boolean] = js.undefined
  var west__slideTrigger_close: js.UndefOr[String] = js.undefined
  var west__slideTrigger_open: js.UndefOr[String] = js.undefined
  var west__sliderCursor: js.UndefOr[String] = js.undefined
  var west__sliderTip: js.UndefOr[String] = js.undefined
  var west__spacing_closed: js.UndefOr[Double] = js.undefined
  var west__spacing_open: js.UndefOr[Double] = js.undefined
  var west__togglerAlign_closed: js.UndefOr[String | Double] = js.undefined
  var west__togglerAlign_open: js.UndefOr[String | Double] = js.undefined
  var west__togglerClass: js.UndefOr[String] = js.undefined
  var west__togglerContent_closed: js.UndefOr[String] = js.undefined
  var west__togglerContent_open: js.UndefOr[String] = js.undefined
  var west__togglerLength_closed: js.UndefOr[Double | String] = js.undefined
  var west__togglerLength_open: js.UndefOr[Double | String] = js.undefined
  var west__togglerTip_closed: js.UndefOr[String] = js.undefined
  var west__togglerTip_open: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    PaneOptions: PaneOptions = null,
    center: PaneOptions = null,
    center__applyDefaultStyles: js.UndefOr[Boolean] = js.undefined,
    center__buttonClass: String = null,
    center__closable: js.UndefOr[Boolean] = js.undefined,
    center__contentIgnoreSelector: String = null,
    center__contentSelector: String = null,
    center__customHotkey: String | Double = null,
    center__customHotkeyModifier: String = null,
    center__enableCursorHotkey: js.UndefOr[Boolean] = js.undefined,
    center__fxName: String = null,
    center__fxSettings: JQueryAnimationOptions = null,
    center__fxSpeed: String | Double = null,
    center__hideTogglerOnSlide: js.UndefOr[Boolean] = js.undefined,
    center__initClosed: js.UndefOr[Boolean] = js.undefined,
    center__initHidden: js.UndefOr[Boolean] = js.undefined,
    center__maskIframesOnResize: Boolean | String = null,
    center__maxSize: Int | Double = null,
    center__minSize: Int | Double = null,
    center__onclose: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    center__onclose_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    center__onclose_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    center__onhide: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    center__onhide_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    center__onhide_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    center__onopen: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    center__onopen_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    center__onopen_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    center__onresize: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    center__onresize_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    center__onresize_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    center__onshow: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    center__onshow_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    center__onshow_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    center__paneClass: String = null,
    center__paneSelector: String = null,
    center__resizable: js.UndefOr[Boolean] = js.undefined,
    center__resizerClass: String = null,
    center__resizerCursor: String = null,
    center__resizerDragOpacity: Int | Double = null,
    center__resizerTip: String = null,
    center__scrollToBookmarkOnLoad: js.UndefOr[Boolean] = js.undefined,
    center__showOverflowOnHover: js.UndefOr[Boolean] = js.undefined,
    center__size: String | Double = null,
    center__slidable: js.UndefOr[Boolean] = js.undefined,
    center__slideTrigger_close: String = null,
    center__slideTrigger_open: String = null,
    center__sliderCursor: String = null,
    center__sliderTip: String = null,
    center__spacing_closed: Int | Double = null,
    center__spacing_open: Int | Double = null,
    center__togglerAlign_closed: String | Double = null,
    center__togglerAlign_open: String | Double = null,
    center__togglerClass: String = null,
    center__togglerContent_closed: String = null,
    center__togglerContent_open: String = null,
    center__togglerLength_closed: Double | String = null,
    center__togglerLength_open: Double | String = null,
    center__togglerTip_closed: String = null,
    center__togglerTip_open: String = null,
    defaults: PaneOptions = null,
    defaults__applyDefaultStyles: js.UndefOr[Boolean] = js.undefined,
    defaults__buttonClass: String = null,
    defaults__closable: js.UndefOr[Boolean] = js.undefined,
    defaults__contentIgnoreSelector: String = null,
    defaults__contentSelector: String = null,
    defaults__customHotkey: String | Double = null,
    defaults__customHotkeyModifier: String = null,
    defaults__enableCursorHotkey: js.UndefOr[Boolean] = js.undefined,
    defaults__fxName: String = null,
    defaults__fxSettings: JQueryAnimationOptions = null,
    defaults__fxSpeed: String | Double = null,
    defaults__hideTogglerOnSlide: js.UndefOr[Boolean] = js.undefined,
    defaults__initClosed: js.UndefOr[Boolean] = js.undefined,
    defaults__initHidden: js.UndefOr[Boolean] = js.undefined,
    defaults__maskIframesOnResize: Boolean | String = null,
    defaults__maxSize: Int | Double = null,
    defaults__minSize: Int | Double = null,
    defaults__onclose: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    defaults__onclose_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    defaults__onclose_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    defaults__onhide: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    defaults__onhide_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    defaults__onhide_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    defaults__onopen: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    defaults__onopen_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    defaults__onopen_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    defaults__onresize: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    defaults__onresize_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    defaults__onresize_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    defaults__onshow: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    defaults__onshow_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    defaults__onshow_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    defaults__paneClass: String = null,
    defaults__paneSelector: String = null,
    defaults__resizable: js.UndefOr[Boolean] = js.undefined,
    defaults__resizerClass: String = null,
    defaults__resizerCursor: String = null,
    defaults__resizerDragOpacity: Int | Double = null,
    defaults__resizerTip: String = null,
    defaults__scrollToBookmarkOnLoad: js.UndefOr[Boolean] = js.undefined,
    defaults__showOverflowOnHover: js.UndefOr[Boolean] = js.undefined,
    defaults__size: String | Double = null,
    defaults__slidable: js.UndefOr[Boolean] = js.undefined,
    defaults__slideTrigger_close: String = null,
    defaults__slideTrigger_open: String = null,
    defaults__sliderCursor: String = null,
    defaults__sliderTip: String = null,
    defaults__spacing_closed: Int | Double = null,
    defaults__spacing_open: Int | Double = null,
    defaults__togglerAlign_closed: String | Double = null,
    defaults__togglerAlign_open: String | Double = null,
    defaults__togglerClass: String = null,
    defaults__togglerContent_closed: String = null,
    defaults__togglerContent_open: String = null,
    defaults__togglerLength_closed: Double | String = null,
    defaults__togglerLength_open: Double | String = null,
    defaults__togglerTip_closed: String = null,
    defaults__togglerTip_open: String = null,
    east: PaneOptions = null,
    east__applyDefaultStyles: js.UndefOr[Boolean] = js.undefined,
    east__buttonClass: String = null,
    east__closable: js.UndefOr[Boolean] = js.undefined,
    east__contentIgnoreSelector: String = null,
    east__contentSelector: String = null,
    east__customHotkey: String | Double = null,
    east__customHotkeyModifier: String = null,
    east__enableCursorHotkey: js.UndefOr[Boolean] = js.undefined,
    east__fxName: String = null,
    east__fxSettings: JQueryAnimationOptions = null,
    east__fxSpeed: String | Double = null,
    east__hideTogglerOnSlide: js.UndefOr[Boolean] = js.undefined,
    east__initClosed: js.UndefOr[Boolean] = js.undefined,
    east__initHidden: js.UndefOr[Boolean] = js.undefined,
    east__maskIframesOnResize: Boolean | String = null,
    east__maxSize: Int | Double = null,
    east__minSize: Int | Double = null,
    east__onclose: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    east__onclose_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    east__onclose_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    east__onhide: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    east__onhide_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    east__onhide_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    east__onopen: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    east__onopen_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    east__onopen_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    east__onresize: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    east__onresize_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    east__onresize_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    east__onshow: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    east__onshow_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    east__onshow_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    east__paneClass: String = null,
    east__paneSelector: String = null,
    east__resizable: js.UndefOr[Boolean] = js.undefined,
    east__resizerClass: String = null,
    east__resizerCursor: String = null,
    east__resizerDragOpacity: Int | Double = null,
    east__resizerTip: String = null,
    east__scrollToBookmarkOnLoad: js.UndefOr[Boolean] = js.undefined,
    east__showOverflowOnHover: js.UndefOr[Boolean] = js.undefined,
    east__size: String | Double = null,
    east__slidable: js.UndefOr[Boolean] = js.undefined,
    east__slideTrigger_close: String = null,
    east__slideTrigger_open: String = null,
    east__sliderCursor: String = null,
    east__sliderTip: String = null,
    east__spacing_closed: Int | Double = null,
    east__spacing_open: Int | Double = null,
    east__togglerAlign_closed: String | Double = null,
    east__togglerAlign_open: String | Double = null,
    east__togglerClass: String = null,
    east__togglerContent_closed: String = null,
    east__togglerContent_open: String = null,
    east__togglerLength_closed: Double | String = null,
    east__togglerLength_open: Double | String = null,
    east__togglerTip_closed: String = null,
    east__togglerTip_open: String = null,
    north: PaneOptions = null,
    north__applyDefaultStyles: js.UndefOr[Boolean] = js.undefined,
    north__buttonClass: String = null,
    north__closable: js.UndefOr[Boolean] = js.undefined,
    north__contentIgnoreSelector: String = null,
    north__contentSelector: String = null,
    north__customHotkey: String | Double = null,
    north__customHotkeyModifier: String = null,
    north__enableCursorHotkey: js.UndefOr[Boolean] = js.undefined,
    north__fxName: String = null,
    north__fxSettings: JQueryAnimationOptions = null,
    north__fxSpeed: String | Double = null,
    north__hideTogglerOnSlide: js.UndefOr[Boolean] = js.undefined,
    north__initClosed: js.UndefOr[Boolean] = js.undefined,
    north__initHidden: js.UndefOr[Boolean] = js.undefined,
    north__maskIframesOnResize: Boolean | String = null,
    north__maxSize: Int | Double = null,
    north__minSize: Int | Double = null,
    north__onclose: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    north__onclose_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    north__onclose_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    north__onhide: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    north__onhide_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    north__onhide_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    north__onopen: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    north__onopen_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    north__onopen_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    north__onresize: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    north__onresize_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    north__onresize_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    north__onshow: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    north__onshow_end: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Unit
    ]) = null,
    north__onshow_start: String | (js.Function5[
      /* name */ String, 
      /* pane */ JQuery, 
      /* state */ PaneState, 
      /* options */ PaneOptions, 
      /* layout_name */ String, 
      Boolean | Unit
    ]) = null,
    north__paneClass: String = null,
    north__paneSelector: String = null,
    north__resizable: js.UndefOr[Boolean] = js.undefined,
    north__resizerClass: String = null,
    north__resizerCursor: String = null,
    north__resizerDragOpacity: Int | Double = null,
    north__resizerTip: String = null,
    north__scrollToBookmarkOnLoad: js.UndefOr[Boolean] = js.undefined,
    north__showOverflowOnHover: js.UndefOr[Boolean] = js.undefined,
    north__size: String | Double = null,
    north__slidable: js.UndefOr[Boolean] = js.undefined,
    north__slideTrigger_close: String = null,
    north__slideTrigger_open: String = null,
    north__sliderCursor: String = null,
    north__sliderTip: String = null,
    north__spacing_closed: Int | Double = null,
    north__spacing_open: Int | Double = null,
    north__togglerAlign_closed: String | Double = null,
    north__togglerAlign_open: String | Double = null,
    north__togglerClass: String = null,
    north__togglerContent_closed: String = null,
    north__togglerContent_open: String = null,
    north__togglerLength_closed: Double | String = null,
    north__togglerLength_open: Double | String = null,
    north__togglerTip_closed: String = null,
    north__togglerTip_open: String = null,
    south: PaneOptions = null,
    south__applyDefaultStyles: js.UndefOr[Boolean] = js.undefined,
    south__buttonClass: String = null,
    south__closable: js.UndefOr[Boolean] = js.undefined,
    south__contentIgnoreSelector: String = null,
    south__contentSelector: String = null,
    south__customHotkey: String | Double = null,
    south__customHotkeyModifier: String = null,
    south__enableCursorHotkey: js.UndefOr[Boolean] = js.undefined,
    south__fxName: String = null,
    south__fxSettings: JQueryAnimationOptions = null,
    south__fxSpeed: String | Double = null,
    south__hideTogglerOnSlide: js.UndefOr[Boolean] = js.undefined,
    south__initClosed: js.UndefOr[Boolean] = js.undefined,
    south__initHidden: js.UndefOr[Boolean] = js.undefined,
    south__maskIframesOnResize: Boolean | String = null,
    south__maxSize: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (PaneOptions != null) js.Dynamic.global.Object.assign(__obj, PaneOptions)
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(center__applyDefaultStyles)) __obj.updateDynamic("center__applyDefaultStyles")(center__applyDefaultStyles.asInstanceOf[js.Any])
    if (center__buttonClass != null) __obj.updateDynamic("center__buttonClass")(center__buttonClass.asInstanceOf[js.Any])
    if (!js.isUndefined(center__closable)) __obj.updateDynamic("center__closable")(center__closable.asInstanceOf[js.Any])
    if (center__contentIgnoreSelector != null) __obj.updateDynamic("center__contentIgnoreSelector")(center__contentIgnoreSelector.asInstanceOf[js.Any])
    if (center__contentSelector != null) __obj.updateDynamic("center__contentSelector")(center__contentSelector.asInstanceOf[js.Any])
    if (center__customHotkey != null) __obj.updateDynamic("center__customHotkey")(center__customHotkey.asInstanceOf[js.Any])
    if (center__customHotkeyModifier != null) __obj.updateDynamic("center__customHotkeyModifier")(center__customHotkeyModifier.asInstanceOf[js.Any])
    if (!js.isUndefined(center__enableCursorHotkey)) __obj.updateDynamic("center__enableCursorHotkey")(center__enableCursorHotkey.asInstanceOf[js.Any])
    if (center__fxName != null) __obj.updateDynamic("center__fxName")(center__fxName.asInstanceOf[js.Any])
    if (center__fxSettings != null) __obj.updateDynamic("center__fxSettings")(center__fxSettings.asInstanceOf[js.Any])
    if (center__fxSpeed != null) __obj.updateDynamic("center__fxSpeed")(center__fxSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(center__hideTogglerOnSlide)) __obj.updateDynamic("center__hideTogglerOnSlide")(center__hideTogglerOnSlide.asInstanceOf[js.Any])
    if (!js.isUndefined(center__initClosed)) __obj.updateDynamic("center__initClosed")(center__initClosed.asInstanceOf[js.Any])
    if (!js.isUndefined(center__initHidden)) __obj.updateDynamic("center__initHidden")(center__initHidden.asInstanceOf[js.Any])
    if (center__maskIframesOnResize != null) __obj.updateDynamic("center__maskIframesOnResize")(center__maskIframesOnResize.asInstanceOf[js.Any])
    if (center__maxSize != null) __obj.updateDynamic("center__maxSize")(center__maxSize.asInstanceOf[js.Any])
    if (center__minSize != null) __obj.updateDynamic("center__minSize")(center__minSize.asInstanceOf[js.Any])
    if (center__onclose != null) __obj.updateDynamic("center__onclose")(center__onclose.asInstanceOf[js.Any])
    if (center__onclose_end != null) __obj.updateDynamic("center__onclose_end")(center__onclose_end.asInstanceOf[js.Any])
    if (center__onclose_start != null) __obj.updateDynamic("center__onclose_start")(center__onclose_start.asInstanceOf[js.Any])
    if (center__onhide != null) __obj.updateDynamic("center__onhide")(center__onhide.asInstanceOf[js.Any])
    if (center__onhide_end != null) __obj.updateDynamic("center__onhide_end")(center__onhide_end.asInstanceOf[js.Any])
    if (center__onhide_start != null) __obj.updateDynamic("center__onhide_start")(center__onhide_start.asInstanceOf[js.Any])
    if (center__onopen != null) __obj.updateDynamic("center__onopen")(center__onopen.asInstanceOf[js.Any])
    if (center__onopen_end != null) __obj.updateDynamic("center__onopen_end")(center__onopen_end.asInstanceOf[js.Any])
    if (center__onopen_start != null) __obj.updateDynamic("center__onopen_start")(center__onopen_start.asInstanceOf[js.Any])
    if (center__onresize != null) __obj.updateDynamic("center__onresize")(center__onresize.asInstanceOf[js.Any])
    if (center__onresize_end != null) __obj.updateDynamic("center__onresize_end")(center__onresize_end.asInstanceOf[js.Any])
    if (center__onresize_start != null) __obj.updateDynamic("center__onresize_start")(center__onresize_start.asInstanceOf[js.Any])
    if (center__onshow != null) __obj.updateDynamic("center__onshow")(center__onshow.asInstanceOf[js.Any])
    if (center__onshow_end != null) __obj.updateDynamic("center__onshow_end")(center__onshow_end.asInstanceOf[js.Any])
    if (center__onshow_start != null) __obj.updateDynamic("center__onshow_start")(center__onshow_start.asInstanceOf[js.Any])
    if (center__paneClass != null) __obj.updateDynamic("center__paneClass")(center__paneClass.asInstanceOf[js.Any])
    if (center__paneSelector != null) __obj.updateDynamic("center__paneSelector")(center__paneSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(center__resizable)) __obj.updateDynamic("center__resizable")(center__resizable.asInstanceOf[js.Any])
    if (center__resizerClass != null) __obj.updateDynamic("center__resizerClass")(center__resizerClass.asInstanceOf[js.Any])
    if (center__resizerCursor != null) __obj.updateDynamic("center__resizerCursor")(center__resizerCursor.asInstanceOf[js.Any])
    if (center__resizerDragOpacity != null) __obj.updateDynamic("center__resizerDragOpacity")(center__resizerDragOpacity.asInstanceOf[js.Any])
    if (center__resizerTip != null) __obj.updateDynamic("center__resizerTip")(center__resizerTip.asInstanceOf[js.Any])
    if (!js.isUndefined(center__scrollToBookmarkOnLoad)) __obj.updateDynamic("center__scrollToBookmarkOnLoad")(center__scrollToBookmarkOnLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(center__showOverflowOnHover)) __obj.updateDynamic("center__showOverflowOnHover")(center__showOverflowOnHover.asInstanceOf[js.Any])
    if (center__size != null) __obj.updateDynamic("center__size")(center__size.asInstanceOf[js.Any])
    if (!js.isUndefined(center__slidable)) __obj.updateDynamic("center__slidable")(center__slidable.asInstanceOf[js.Any])
    if (center__slideTrigger_close != null) __obj.updateDynamic("center__slideTrigger_close")(center__slideTrigger_close.asInstanceOf[js.Any])
    if (center__slideTrigger_open != null) __obj.updateDynamic("center__slideTrigger_open")(center__slideTrigger_open.asInstanceOf[js.Any])
    if (center__sliderCursor != null) __obj.updateDynamic("center__sliderCursor")(center__sliderCursor.asInstanceOf[js.Any])
    if (center__sliderTip != null) __obj.updateDynamic("center__sliderTip")(center__sliderTip.asInstanceOf[js.Any])
    if (center__spacing_closed != null) __obj.updateDynamic("center__spacing_closed")(center__spacing_closed.asInstanceOf[js.Any])
    if (center__spacing_open != null) __obj.updateDynamic("center__spacing_open")(center__spacing_open.asInstanceOf[js.Any])
    if (center__togglerAlign_closed != null) __obj.updateDynamic("center__togglerAlign_closed")(center__togglerAlign_closed.asInstanceOf[js.Any])
    if (center__togglerAlign_open != null) __obj.updateDynamic("center__togglerAlign_open")(center__togglerAlign_open.asInstanceOf[js.Any])
    if (center__togglerClass != null) __obj.updateDynamic("center__togglerClass")(center__togglerClass.asInstanceOf[js.Any])
    if (center__togglerContent_closed != null) __obj.updateDynamic("center__togglerContent_closed")(center__togglerContent_closed.asInstanceOf[js.Any])
    if (center__togglerContent_open != null) __obj.updateDynamic("center__togglerContent_open")(center__togglerContent_open.asInstanceOf[js.Any])
    if (center__togglerLength_closed != null) __obj.updateDynamic("center__togglerLength_closed")(center__togglerLength_closed.asInstanceOf[js.Any])
    if (center__togglerLength_open != null) __obj.updateDynamic("center__togglerLength_open")(center__togglerLength_open.asInstanceOf[js.Any])
    if (center__togglerTip_closed != null) __obj.updateDynamic("center__togglerTip_closed")(center__togglerTip_closed.asInstanceOf[js.Any])
    if (center__togglerTip_open != null) __obj.updateDynamic("center__togglerTip_open")(center__togglerTip_open.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults__applyDefaultStyles)) __obj.updateDynamic("defaults__applyDefaultStyles")(defaults__applyDefaultStyles.asInstanceOf[js.Any])
    if (defaults__buttonClass != null) __obj.updateDynamic("defaults__buttonClass")(defaults__buttonClass.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults__closable)) __obj.updateDynamic("defaults__closable")(defaults__closable.asInstanceOf[js.Any])
    if (defaults__contentIgnoreSelector != null) __obj.updateDynamic("defaults__contentIgnoreSelector")(defaults__contentIgnoreSelector.asInstanceOf[js.Any])
    if (defaults__contentSelector != null) __obj.updateDynamic("defaults__contentSelector")(defaults__contentSelector.asInstanceOf[js.Any])
    if (defaults__customHotkey != null) __obj.updateDynamic("defaults__customHotkey")(defaults__customHotkey.asInstanceOf[js.Any])
    if (defaults__customHotkeyModifier != null) __obj.updateDynamic("defaults__customHotkeyModifier")(defaults__customHotkeyModifier.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults__enableCursorHotkey)) __obj.updateDynamic("defaults__enableCursorHotkey")(defaults__enableCursorHotkey.asInstanceOf[js.Any])
    if (defaults__fxName != null) __obj.updateDynamic("defaults__fxName")(defaults__fxName.asInstanceOf[js.Any])
    if (defaults__fxSettings != null) __obj.updateDynamic("defaults__fxSettings")(defaults__fxSettings.asInstanceOf[js.Any])
    if (defaults__fxSpeed != null) __obj.updateDynamic("defaults__fxSpeed")(defaults__fxSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults__hideTogglerOnSlide)) __obj.updateDynamic("defaults__hideTogglerOnSlide")(defaults__hideTogglerOnSlide.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults__initClosed)) __obj.updateDynamic("defaults__initClosed")(defaults__initClosed.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults__initHidden)) __obj.updateDynamic("defaults__initHidden")(defaults__initHidden.asInstanceOf[js.Any])
    if (defaults__maskIframesOnResize != null) __obj.updateDynamic("defaults__maskIframesOnResize")(defaults__maskIframesOnResize.asInstanceOf[js.Any])
    if (defaults__maxSize != null) __obj.updateDynamic("defaults__maxSize")(defaults__maxSize.asInstanceOf[js.Any])
    if (defaults__minSize != null) __obj.updateDynamic("defaults__minSize")(defaults__minSize.asInstanceOf[js.Any])
    if (defaults__onclose != null) __obj.updateDynamic("defaults__onclose")(defaults__onclose.asInstanceOf[js.Any])
    if (defaults__onclose_end != null) __obj.updateDynamic("defaults__onclose_end")(defaults__onclose_end.asInstanceOf[js.Any])
    if (defaults__onclose_start != null) __obj.updateDynamic("defaults__onclose_start")(defaults__onclose_start.asInstanceOf[js.Any])
    if (defaults__onhide != null) __obj.updateDynamic("defaults__onhide")(defaults__onhide.asInstanceOf[js.Any])
    if (defaults__onhide_end != null) __obj.updateDynamic("defaults__onhide_end")(defaults__onhide_end.asInstanceOf[js.Any])
    if (defaults__onhide_start != null) __obj.updateDynamic("defaults__onhide_start")(defaults__onhide_start.asInstanceOf[js.Any])
    if (defaults__onopen != null) __obj.updateDynamic("defaults__onopen")(defaults__onopen.asInstanceOf[js.Any])
    if (defaults__onopen_end != null) __obj.updateDynamic("defaults__onopen_end")(defaults__onopen_end.asInstanceOf[js.Any])
    if (defaults__onopen_start != null) __obj.updateDynamic("defaults__onopen_start")(defaults__onopen_start.asInstanceOf[js.Any])
    if (defaults__onresize != null) __obj.updateDynamic("defaults__onresize")(defaults__onresize.asInstanceOf[js.Any])
    if (defaults__onresize_end != null) __obj.updateDynamic("defaults__onresize_end")(defaults__onresize_end.asInstanceOf[js.Any])
    if (defaults__onresize_start != null) __obj.updateDynamic("defaults__onresize_start")(defaults__onresize_start.asInstanceOf[js.Any])
    if (defaults__onshow != null) __obj.updateDynamic("defaults__onshow")(defaults__onshow.asInstanceOf[js.Any])
    if (defaults__onshow_end != null) __obj.updateDynamic("defaults__onshow_end")(defaults__onshow_end.asInstanceOf[js.Any])
    if (defaults__onshow_start != null) __obj.updateDynamic("defaults__onshow_start")(defaults__onshow_start.asInstanceOf[js.Any])
    if (defaults__paneClass != null) __obj.updateDynamic("defaults__paneClass")(defaults__paneClass.asInstanceOf[js.Any])
    if (defaults__paneSelector != null) __obj.updateDynamic("defaults__paneSelector")(defaults__paneSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults__resizable)) __obj.updateDynamic("defaults__resizable")(defaults__resizable.asInstanceOf[js.Any])
    if (defaults__resizerClass != null) __obj.updateDynamic("defaults__resizerClass")(defaults__resizerClass.asInstanceOf[js.Any])
    if (defaults__resizerCursor != null) __obj.updateDynamic("defaults__resizerCursor")(defaults__resizerCursor.asInstanceOf[js.Any])
    if (defaults__resizerDragOpacity != null) __obj.updateDynamic("defaults__resizerDragOpacity")(defaults__resizerDragOpacity.asInstanceOf[js.Any])
    if (defaults__resizerTip != null) __obj.updateDynamic("defaults__resizerTip")(defaults__resizerTip.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults__scrollToBookmarkOnLoad)) __obj.updateDynamic("defaults__scrollToBookmarkOnLoad")(defaults__scrollToBookmarkOnLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults__showOverflowOnHover)) __obj.updateDynamic("defaults__showOverflowOnHover")(defaults__showOverflowOnHover.asInstanceOf[js.Any])
    if (defaults__size != null) __obj.updateDynamic("defaults__size")(defaults__size.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults__slidable)) __obj.updateDynamic("defaults__slidable")(defaults__slidable.asInstanceOf[js.Any])
    if (defaults__slideTrigger_close != null) __obj.updateDynamic("defaults__slideTrigger_close")(defaults__slideTrigger_close.asInstanceOf[js.Any])
    if (defaults__slideTrigger_open != null) __obj.updateDynamic("defaults__slideTrigger_open")(defaults__slideTrigger_open.asInstanceOf[js.Any])
    if (defaults__sliderCursor != null) __obj.updateDynamic("defaults__sliderCursor")(defaults__sliderCursor.asInstanceOf[js.Any])
    if (defaults__sliderTip != null) __obj.updateDynamic("defaults__sliderTip")(defaults__sliderTip.asInstanceOf[js.Any])
    if (defaults__spacing_closed != null) __obj.updateDynamic("defaults__spacing_closed")(defaults__spacing_closed.asInstanceOf[js.Any])
    if (defaults__spacing_open != null) __obj.updateDynamic("defaults__spacing_open")(defaults__spacing_open.asInstanceOf[js.Any])
    if (defaults__togglerAlign_closed != null) __obj.updateDynamic("defaults__togglerAlign_closed")(defaults__togglerAlign_closed.asInstanceOf[js.Any])
    if (defaults__togglerAlign_open != null) __obj.updateDynamic("defaults__togglerAlign_open")(defaults__togglerAlign_open.asInstanceOf[js.Any])
    if (defaults__togglerClass != null) __obj.updateDynamic("defaults__togglerClass")(defaults__togglerClass.asInstanceOf[js.Any])
    if (defaults__togglerContent_closed != null) __obj.updateDynamic("defaults__togglerContent_closed")(defaults__togglerContent_closed.asInstanceOf[js.Any])
    if (defaults__togglerContent_open != null) __obj.updateDynamic("defaults__togglerContent_open")(defaults__togglerContent_open.asInstanceOf[js.Any])
    if (defaults__togglerLength_closed != null) __obj.updateDynamic("defaults__togglerLength_closed")(defaults__togglerLength_closed.asInstanceOf[js.Any])
    if (defaults__togglerLength_open != null) __obj.updateDynamic("defaults__togglerLength_open")(defaults__togglerLength_open.asInstanceOf[js.Any])
    if (defaults__togglerTip_closed != null) __obj.updateDynamic("defaults__togglerTip_closed")(defaults__togglerTip_closed.asInstanceOf[js.Any])
    if (defaults__togglerTip_open != null) __obj.updateDynamic("defaults__togglerTip_open")(defaults__togglerTip_open.asInstanceOf[js.Any])
    if (east != null) __obj.updateDynamic("east")(east.asInstanceOf[js.Any])
    if (!js.isUndefined(east__applyDefaultStyles)) __obj.updateDynamic("east__applyDefaultStyles")(east__applyDefaultStyles.asInstanceOf[js.Any])
    if (east__buttonClass != null) __obj.updateDynamic("east__buttonClass")(east__buttonClass.asInstanceOf[js.Any])
    if (!js.isUndefined(east__closable)) __obj.updateDynamic("east__closable")(east__closable.asInstanceOf[js.Any])
    if (east__contentIgnoreSelector != null) __obj.updateDynamic("east__contentIgnoreSelector")(east__contentIgnoreSelector.asInstanceOf[js.Any])
    if (east__contentSelector != null) __obj.updateDynamic("east__contentSelector")(east__contentSelector.asInstanceOf[js.Any])
    if (east__customHotkey != null) __obj.updateDynamic("east__customHotkey")(east__customHotkey.asInstanceOf[js.Any])
    if (east__customHotkeyModifier != null) __obj.updateDynamic("east__customHotkeyModifier")(east__customHotkeyModifier.asInstanceOf[js.Any])
    if (!js.isUndefined(east__enableCursorHotkey)) __obj.updateDynamic("east__enableCursorHotkey")(east__enableCursorHotkey.asInstanceOf[js.Any])
    if (east__fxName != null) __obj.updateDynamic("east__fxName")(east__fxName.asInstanceOf[js.Any])
    if (east__fxSettings != null) __obj.updateDynamic("east__fxSettings")(east__fxSettings.asInstanceOf[js.Any])
    if (east__fxSpeed != null) __obj.updateDynamic("east__fxSpeed")(east__fxSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(east__hideTogglerOnSlide)) __obj.updateDynamic("east__hideTogglerOnSlide")(east__hideTogglerOnSlide.asInstanceOf[js.Any])
    if (!js.isUndefined(east__initClosed)) __obj.updateDynamic("east__initClosed")(east__initClosed.asInstanceOf[js.Any])
    if (!js.isUndefined(east__initHidden)) __obj.updateDynamic("east__initHidden")(east__initHidden.asInstanceOf[js.Any])
    if (east__maskIframesOnResize != null) __obj.updateDynamic("east__maskIframesOnResize")(east__maskIframesOnResize.asInstanceOf[js.Any])
    if (east__maxSize != null) __obj.updateDynamic("east__maxSize")(east__maxSize.asInstanceOf[js.Any])
    if (east__minSize != null) __obj.updateDynamic("east__minSize")(east__minSize.asInstanceOf[js.Any])
    if (east__onclose != null) __obj.updateDynamic("east__onclose")(east__onclose.asInstanceOf[js.Any])
    if (east__onclose_end != null) __obj.updateDynamic("east__onclose_end")(east__onclose_end.asInstanceOf[js.Any])
    if (east__onclose_start != null) __obj.updateDynamic("east__onclose_start")(east__onclose_start.asInstanceOf[js.Any])
    if (east__onhide != null) __obj.updateDynamic("east__onhide")(east__onhide.asInstanceOf[js.Any])
    if (east__onhide_end != null) __obj.updateDynamic("east__onhide_end")(east__onhide_end.asInstanceOf[js.Any])
    if (east__onhide_start != null) __obj.updateDynamic("east__onhide_start")(east__onhide_start.asInstanceOf[js.Any])
    if (east__onopen != null) __obj.updateDynamic("east__onopen")(east__onopen.asInstanceOf[js.Any])
    if (east__onopen_end != null) __obj.updateDynamic("east__onopen_end")(east__onopen_end.asInstanceOf[js.Any])
    if (east__onopen_start != null) __obj.updateDynamic("east__onopen_start")(east__onopen_start.asInstanceOf[js.Any])
    if (east__onresize != null) __obj.updateDynamic("east__onresize")(east__onresize.asInstanceOf[js.Any])
    if (east__onresize_end != null) __obj.updateDynamic("east__onresize_end")(east__onresize_end.asInstanceOf[js.Any])
    if (east__onresize_start != null) __obj.updateDynamic("east__onresize_start")(east__onresize_start.asInstanceOf[js.Any])
    if (east__onshow != null) __obj.updateDynamic("east__onshow")(east__onshow.asInstanceOf[js.Any])
    if (east__onshow_end != null) __obj.updateDynamic("east__onshow_end")(east__onshow_end.asInstanceOf[js.Any])
    if (east__onshow_start != null) __obj.updateDynamic("east__onshow_start")(east__onshow_start.asInstanceOf[js.Any])
    if (east__paneClass != null) __obj.updateDynamic("east__paneClass")(east__paneClass.asInstanceOf[js.Any])
    if (east__paneSelector != null) __obj.updateDynamic("east__paneSelector")(east__paneSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(east__resizable)) __obj.updateDynamic("east__resizable")(east__resizable.asInstanceOf[js.Any])
    if (east__resizerClass != null) __obj.updateDynamic("east__resizerClass")(east__resizerClass.asInstanceOf[js.Any])
    if (east__resizerCursor != null) __obj.updateDynamic("east__resizerCursor")(east__resizerCursor.asInstanceOf[js.Any])
    if (east__resizerDragOpacity != null) __obj.updateDynamic("east__resizerDragOpacity")(east__resizerDragOpacity.asInstanceOf[js.Any])
    if (east__resizerTip != null) __obj.updateDynamic("east__resizerTip")(east__resizerTip.asInstanceOf[js.Any])
    if (!js.isUndefined(east__scrollToBookmarkOnLoad)) __obj.updateDynamic("east__scrollToBookmarkOnLoad")(east__scrollToBookmarkOnLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(east__showOverflowOnHover)) __obj.updateDynamic("east__showOverflowOnHover")(east__showOverflowOnHover.asInstanceOf[js.Any])
    if (east__size != null) __obj.updateDynamic("east__size")(east__size.asInstanceOf[js.Any])
    if (!js.isUndefined(east__slidable)) __obj.updateDynamic("east__slidable")(east__slidable.asInstanceOf[js.Any])
    if (east__slideTrigger_close != null) __obj.updateDynamic("east__slideTrigger_close")(east__slideTrigger_close.asInstanceOf[js.Any])
    if (east__slideTrigger_open != null) __obj.updateDynamic("east__slideTrigger_open")(east__slideTrigger_open.asInstanceOf[js.Any])
    if (east__sliderCursor != null) __obj.updateDynamic("east__sliderCursor")(east__sliderCursor.asInstanceOf[js.Any])
    if (east__sliderTip != null) __obj.updateDynamic("east__sliderTip")(east__sliderTip.asInstanceOf[js.Any])
    if (east__spacing_closed != null) __obj.updateDynamic("east__spacing_closed")(east__spacing_closed.asInstanceOf[js.Any])
    if (east__spacing_open != null) __obj.updateDynamic("east__spacing_open")(east__spacing_open.asInstanceOf[js.Any])
    if (east__togglerAlign_closed != null) __obj.updateDynamic("east__togglerAlign_closed")(east__togglerAlign_closed.asInstanceOf[js.Any])
    if (east__togglerAlign_open != null) __obj.updateDynamic("east__togglerAlign_open")(east__togglerAlign_open.asInstanceOf[js.Any])
    if (east__togglerClass != null) __obj.updateDynamic("east__togglerClass")(east__togglerClass.asInstanceOf[js.Any])
    if (east__togglerContent_closed != null) __obj.updateDynamic("east__togglerContent_closed")(east__togglerContent_closed.asInstanceOf[js.Any])
    if (east__togglerContent_open != null) __obj.updateDynamic("east__togglerContent_open")(east__togglerContent_open.asInstanceOf[js.Any])
    if (east__togglerLength_closed != null) __obj.updateDynamic("east__togglerLength_closed")(east__togglerLength_closed.asInstanceOf[js.Any])
    if (east__togglerLength_open != null) __obj.updateDynamic("east__togglerLength_open")(east__togglerLength_open.asInstanceOf[js.Any])
    if (east__togglerTip_closed != null) __obj.updateDynamic("east__togglerTip_closed")(east__togglerTip_closed.asInstanceOf[js.Any])
    if (east__togglerTip_open != null) __obj.updateDynamic("east__togglerTip_open")(east__togglerTip_open.asInstanceOf[js.Any])
    if (north != null) __obj.updateDynamic("north")(north.asInstanceOf[js.Any])
    if (!js.isUndefined(north__applyDefaultStyles)) __obj.updateDynamic("north__applyDefaultStyles")(north__applyDefaultStyles.asInstanceOf[js.Any])
    if (north__buttonClass != null) __obj.updateDynamic("north__buttonClass")(north__buttonClass.asInstanceOf[js.Any])
    if (!js.isUndefined(north__closable)) __obj.updateDynamic("north__closable")(north__closable.asInstanceOf[js.Any])
    if (north__contentIgnoreSelector != null) __obj.updateDynamic("north__contentIgnoreSelector")(north__contentIgnoreSelector.asInstanceOf[js.Any])
    if (north__contentSelector != null) __obj.updateDynamic("north__contentSelector")(north__contentSelector.asInstanceOf[js.Any])
    if (north__customHotkey != null) __obj.updateDynamic("north__customHotkey")(north__customHotkey.asInstanceOf[js.Any])
    if (north__customHotkeyModifier != null) __obj.updateDynamic("north__customHotkeyModifier")(north__customHotkeyModifier.asInstanceOf[js.Any])
    if (!js.isUndefined(north__enableCursorHotkey)) __obj.updateDynamic("north__enableCursorHotkey")(north__enableCursorHotkey.asInstanceOf[js.Any])
    if (north__fxName != null) __obj.updateDynamic("north__fxName")(north__fxName.asInstanceOf[js.Any])
    if (north__fxSettings != null) __obj.updateDynamic("north__fxSettings")(north__fxSettings.asInstanceOf[js.Any])
    if (north__fxSpeed != null) __obj.updateDynamic("north__fxSpeed")(north__fxSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(north__hideTogglerOnSlide)) __obj.updateDynamic("north__hideTogglerOnSlide")(north__hideTogglerOnSlide.asInstanceOf[js.Any])
    if (!js.isUndefined(north__initClosed)) __obj.updateDynamic("north__initClosed")(north__initClosed.asInstanceOf[js.Any])
    if (!js.isUndefined(north__initHidden)) __obj.updateDynamic("north__initHidden")(north__initHidden.asInstanceOf[js.Any])
    if (north__maskIframesOnResize != null) __obj.updateDynamic("north__maskIframesOnResize")(north__maskIframesOnResize.asInstanceOf[js.Any])
    if (north__maxSize != null) __obj.updateDynamic("north__maxSize")(north__maxSize.asInstanceOf[js.Any])
    if (north__minSize != null) __obj.updateDynamic("north__minSize")(north__minSize.asInstanceOf[js.Any])
    if (north__onclose != null) __obj.updateDynamic("north__onclose")(north__onclose.asInstanceOf[js.Any])
    if (north__onclose_end != null) __obj.updateDynamic("north__onclose_end")(north__onclose_end.asInstanceOf[js.Any])
    if (north__onclose_start != null) __obj.updateDynamic("north__onclose_start")(north__onclose_start.asInstanceOf[js.Any])
    if (north__onhide != null) __obj.updateDynamic("north__onhide")(north__onhide.asInstanceOf[js.Any])
    if (north__onhide_end != null) __obj.updateDynamic("north__onhide_end")(north__onhide_end.asInstanceOf[js.Any])
    if (north__onhide_start != null) __obj.updateDynamic("north__onhide_start")(north__onhide_start.asInstanceOf[js.Any])
    if (north__onopen != null) __obj.updateDynamic("north__onopen")(north__onopen.asInstanceOf[js.Any])
    if (north__onopen_end != null) __obj.updateDynamic("north__onopen_end")(north__onopen_end.asInstanceOf[js.Any])
    if (north__onopen_start != null) __obj.updateDynamic("north__onopen_start")(north__onopen_start.asInstanceOf[js.Any])
    if (north__onresize != null) __obj.updateDynamic("north__onresize")(north__onresize.asInstanceOf[js.Any])
    if (north__onresize_end != null) __obj.updateDynamic("north__onresize_end")(north__onresize_end.asInstanceOf[js.Any])
    if (north__onresize_start != null) __obj.updateDynamic("north__onresize_start")(north__onresize_start.asInstanceOf[js.Any])
    if (north__onshow != null) __obj.updateDynamic("north__onshow")(north__onshow.asInstanceOf[js.Any])
    if (north__onshow_end != null) __obj.updateDynamic("north__onshow_end")(north__onshow_end.asInstanceOf[js.Any])
    if (north__onshow_start != null) __obj.updateDynamic("north__onshow_start")(north__onshow_start.asInstanceOf[js.Any])
    if (north__paneClass != null) __obj.updateDynamic("north__paneClass")(north__paneClass.asInstanceOf[js.Any])
    if (north__paneSelector != null) __obj.updateDynamic("north__paneSelector")(north__paneSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(north__resizable)) __obj.updateDynamic("north__resizable")(north__resizable.asInstanceOf[js.Any])
    if (north__resizerClass != null) __obj.updateDynamic("north__resizerClass")(north__resizerClass.asInstanceOf[js.Any])
    if (north__resizerCursor != null) __obj.updateDynamic("north__resizerCursor")(north__resizerCursor.asInstanceOf[js.Any])
    if (north__resizerDragOpacity != null) __obj.updateDynamic("north__resizerDragOpacity")(north__resizerDragOpacity.asInstanceOf[js.Any])
    if (north__resizerTip != null) __obj.updateDynamic("north__resizerTip")(north__resizerTip.asInstanceOf[js.Any])
    if (!js.isUndefined(north__scrollToBookmarkOnLoad)) __obj.updateDynamic("north__scrollToBookmarkOnLoad")(north__scrollToBookmarkOnLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(north__showOverflowOnHover)) __obj.updateDynamic("north__showOverflowOnHover")(north__showOverflowOnHover.asInstanceOf[js.Any])
    if (north__size != null) __obj.updateDynamic("north__size")(north__size.asInstanceOf[js.Any])
    if (!js.isUndefined(north__slidable)) __obj.updateDynamic("north__slidable")(north__slidable.asInstanceOf[js.Any])
    if (north__slideTrigger_close != null) __obj.updateDynamic("north__slideTrigger_close")(north__slideTrigger_close.asInstanceOf[js.Any])
    if (north__slideTrigger_open != null) __obj.updateDynamic("north__slideTrigger_open")(north__slideTrigger_open.asInstanceOf[js.Any])
    if (north__sliderCursor != null) __obj.updateDynamic("north__sliderCursor")(north__sliderCursor.asInstanceOf[js.Any])
    if (north__sliderTip != null) __obj.updateDynamic("north__sliderTip")(north__sliderTip.asInstanceOf[js.Any])
    if (north__spacing_closed != null) __obj.updateDynamic("north__spacing_closed")(north__spacing_closed.asInstanceOf[js.Any])
    if (north__spacing_open != null) __obj.updateDynamic("north__spacing_open")(north__spacing_open.asInstanceOf[js.Any])
    if (north__togglerAlign_closed != null) __obj.updateDynamic("north__togglerAlign_closed")(north__togglerAlign_closed.asInstanceOf[js.Any])
    if (north__togglerAlign_open != null) __obj.updateDynamic("north__togglerAlign_open")(north__togglerAlign_open.asInstanceOf[js.Any])
    if (north__togglerClass != null) __obj.updateDynamic("north__togglerClass")(north__togglerClass.asInstanceOf[js.Any])
    if (north__togglerContent_closed != null) __obj.updateDynamic("north__togglerContent_closed")(north__togglerContent_closed.asInstanceOf[js.Any])
    if (north__togglerContent_open != null) __obj.updateDynamic("north__togglerContent_open")(north__togglerContent_open.asInstanceOf[js.Any])
    if (north__togglerLength_closed != null) __obj.updateDynamic("north__togglerLength_closed")(north__togglerLength_closed.asInstanceOf[js.Any])
    if (north__togglerLength_open != null) __obj.updateDynamic("north__togglerLength_open")(north__togglerLength_open.asInstanceOf[js.Any])
    if (north__togglerTip_closed != null) __obj.updateDynamic("north__togglerTip_closed")(north__togglerTip_closed.asInstanceOf[js.Any])
    if (north__togglerTip_open != null) __obj.updateDynamic("north__togglerTip_open")(north__togglerTip_open.asInstanceOf[js.Any])
    if (south != null) __obj.updateDynamic("south")(south.asInstanceOf[js.Any])
    if (!js.isUndefined(south__applyDefaultStyles)) __obj.updateDynamic("south__applyDefaultStyles")(south__applyDefaultStyles.asInstanceOf[js.Any])
    if (south__buttonClass != null) __obj.updateDynamic("south__buttonClass")(south__buttonClass.asInstanceOf[js.Any])
    if (!js.isUndefined(south__closable)) __obj.updateDynamic("south__closable")(south__closable.asInstanceOf[js.Any])
    if (south__contentIgnoreSelector != null) __obj.updateDynamic("south__contentIgnoreSelector")(south__contentIgnoreSelector.asInstanceOf[js.Any])
    if (south__contentSelector != null) __obj.updateDynamic("south__contentSelector")(south__contentSelector.asInstanceOf[js.Any])
    if (south__customHotkey != null) __obj.updateDynamic("south__customHotkey")(south__customHotkey.asInstanceOf[js.Any])
    if (south__customHotkeyModifier != null) __obj.updateDynamic("south__customHotkeyModifier")(south__customHotkeyModifier.asInstanceOf[js.Any])
    if (!js.isUndefined(south__enableCursorHotkey)) __obj.updateDynamic("south__enableCursorHotkey")(south__enableCursorHotkey.asInstanceOf[js.Any])
    if (south__fxName != null) __obj.updateDynamic("south__fxName")(south__fxName.asInstanceOf[js.Any])
    if (south__fxSettings != null) __obj.updateDynamic("south__fxSettings")(south__fxSettings.asInstanceOf[js.Any])
    if (south__fxSpeed != null) __obj.updateDynamic("south__fxSpeed")(south__fxSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(south__hideTogglerOnSlide)) __obj.updateDynamic("south__hideTogglerOnSlide")(south__hideTogglerOnSlide.asInstanceOf[js.Any])
    if (!js.isUndefined(south__initClosed)) __obj.updateDynamic("south__initClosed")(south__initClosed.asInstanceOf[js.Any])
    if (!js.isUndefined(south__initHidden)) __obj.updateDynamic("south__initHidden")(south__initHidden.asInstanceOf[js.Any])
    if (south__maskIframesOnResize != null) __obj.updateDynamic("south__maskIframesOnResize")(south__maskIframesOnResize.asInstanceOf[js.Any])
    if (south__maxSize != null) __obj.updateDynamic("south__maxSize")(south__maxSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

