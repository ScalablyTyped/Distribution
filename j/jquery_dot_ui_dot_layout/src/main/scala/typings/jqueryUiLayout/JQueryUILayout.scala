package typings.jqueryUiLayout

import typings.jquery.JQueryAnimationOptions
import typings.jqueryUiLayout.anon.East
import typings.jqueryUiLayout.anon.North
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryUILayout {
  
  @js.native
  trait Layout extends StObject {
    
    def addCloseBtn(selector: String, pane: String): JQuery = js.native
    
    def addOpenBtn(selector: String, pane: String): JQuery = js.native
    
    def addPinBtn(selector: String, pane: String): JQuery = js.native
    
    def addToggleBtn(selector: String, pane: String): JQuery = js.native
    
    def allowOverflow(elemOrPane: String): JQuery = js.native
    def allowOverflow(elemOrPane: HTMLElement): JQuery = js.native
    
    def close(pane: String): JQuery = js.native
    
    def hide(pane: String): JQuery = js.native
    
    def open(pane: String): JQuery = js.native
    
    var options: Options = js.native
    
    var panes: East = js.native
    
    def resetOverflow(elemOrPane: String): JQuery = js.native
    def resetOverflow(elemOrPane: HTMLElement): JQuery = js.native
    
    def resizeAll(): JQuery = js.native
    
    def resizeContent(pane: String): JQuery = js.native
    
    def show(pane: String): JQuery = js.native
    def show(pane: String, openPane: Boolean): JQuery = js.native
    
    def sizePane(pane: String, sizeInPixels: Double): JQuery = js.native
    
    var state: North = js.native
    
    def toggle(pane: String): JQuery = js.native
  }
  
  @js.native
  trait Options extends PaneOptions {
    
    var center: js.UndefOr[PaneOptions] = js.native
    
    var center__applyDefaultStyles: js.UndefOr[Boolean] = js.native
    
    var center__buttonClass: js.UndefOr[String] = js.native
    
    var center__closable: js.UndefOr[Boolean] = js.native
    
    var center__contentIgnoreSelector: js.UndefOr[String] = js.native
    
    var center__contentSelector: js.UndefOr[String] = js.native
    
    var center__customHotkey: js.UndefOr[String | Double] = js.native
    
    var center__customHotkeyModifier: js.UndefOr[String] = js.native
    
    var center__enableCursorHotkey: js.UndefOr[Boolean] = js.native
    
    var center__fxName: js.UndefOr[String] = js.native
    
    var center__fxSettings: js.UndefOr[JQueryAnimationOptions] = js.native
    
    var center__fxSpeed: js.UndefOr[String | Double] = js.native
    
    var center__hideTogglerOnSlide: js.UndefOr[Boolean] = js.native
    
    var center__initClosed: js.UndefOr[Boolean] = js.native
    
    var center__initHidden: js.UndefOr[Boolean] = js.native
    
    var center__maskIframesOnResize: js.UndefOr[Boolean | String] = js.native
    
    var center__maxSize: js.UndefOr[Double] = js.native
    
    var center__minSize: js.UndefOr[Double] = js.native
    
    var center__onclose: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var center__onclose_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var center__onclose_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var center__onhide: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var center__onhide_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var center__onhide_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var center__onopen: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var center__onopen_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var center__onopen_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var center__onresize: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var center__onresize_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var center__onresize_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var center__onshow: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var center__onshow_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var center__onshow_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var center__paneClass: js.UndefOr[String] = js.native
    
    var center__paneSelector: js.UndefOr[String] = js.native
    
    var center__resizable: js.UndefOr[Boolean] = js.native
    
    var center__resizerClass: js.UndefOr[String] = js.native
    
    var center__resizerCursor: js.UndefOr[String] = js.native
    
    var center__resizerDragOpacity: js.UndefOr[Double] = js.native
    
    var center__resizerTip: js.UndefOr[String] = js.native
    
    var center__scrollToBookmarkOnLoad: js.UndefOr[Boolean] = js.native
    
    var center__showOverflowOnHover: js.UndefOr[Boolean] = js.native
    
    var center__size: js.UndefOr[String | Double] = js.native
    
    var center__slidable: js.UndefOr[Boolean] = js.native
    
    var center__slideTrigger_close: js.UndefOr[String] = js.native
    
    var center__slideTrigger_open: js.UndefOr[String] = js.native
    
    var center__sliderCursor: js.UndefOr[String] = js.native
    
    var center__sliderTip: js.UndefOr[String] = js.native
    
    var center__spacing_closed: js.UndefOr[Double] = js.native
    
    var center__spacing_open: js.UndefOr[Double] = js.native
    
    var center__togglerAlign_closed: js.UndefOr[String | Double] = js.native
    
    var center__togglerAlign_open: js.UndefOr[String | Double] = js.native
    
    var center__togglerClass: js.UndefOr[String] = js.native
    
    var center__togglerContent_closed: js.UndefOr[String] = js.native
    
    var center__togglerContent_open: js.UndefOr[String] = js.native
    
    var center__togglerLength_closed: js.UndefOr[Double | String] = js.native
    
    var center__togglerLength_open: js.UndefOr[Double | String] = js.native
    
    var center__togglerTip_closed: js.UndefOr[String] = js.native
    
    var center__togglerTip_open: js.UndefOr[String] = js.native
    
    var defaults: js.UndefOr[PaneOptions] = js.native
    
    var defaults__applyDefaultStyles: js.UndefOr[Boolean] = js.native
    
    var defaults__buttonClass: js.UndefOr[String] = js.native
    
    var defaults__closable: js.UndefOr[Boolean] = js.native
    
    var defaults__contentIgnoreSelector: js.UndefOr[String] = js.native
    
    var defaults__contentSelector: js.UndefOr[String] = js.native
    
    var defaults__customHotkey: js.UndefOr[String | Double] = js.native
    
    var defaults__customHotkeyModifier: js.UndefOr[String] = js.native
    
    var defaults__enableCursorHotkey: js.UndefOr[Boolean] = js.native
    
    var defaults__fxName: js.UndefOr[String] = js.native
    
    var defaults__fxSettings: js.UndefOr[JQueryAnimationOptions] = js.native
    
    var defaults__fxSpeed: js.UndefOr[String | Double] = js.native
    
    var defaults__hideTogglerOnSlide: js.UndefOr[Boolean] = js.native
    
    var defaults__initClosed: js.UndefOr[Boolean] = js.native
    
    var defaults__initHidden: js.UndefOr[Boolean] = js.native
    
    var defaults__maskIframesOnResize: js.UndefOr[Boolean | String] = js.native
    
    var defaults__maxSize: js.UndefOr[Double] = js.native
    
    var defaults__minSize: js.UndefOr[Double] = js.native
    
    var defaults__onclose: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var defaults__onclose_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var defaults__onclose_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var defaults__onhide: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var defaults__onhide_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var defaults__onhide_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var defaults__onopen: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var defaults__onopen_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var defaults__onopen_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var defaults__onresize: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var defaults__onresize_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var defaults__onresize_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var defaults__onshow: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var defaults__onshow_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var defaults__onshow_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var defaults__paneClass: js.UndefOr[String] = js.native
    
    var defaults__paneSelector: js.UndefOr[String] = js.native
    
    var defaults__resizable: js.UndefOr[Boolean] = js.native
    
    var defaults__resizerClass: js.UndefOr[String] = js.native
    
    var defaults__resizerCursor: js.UndefOr[String] = js.native
    
    var defaults__resizerDragOpacity: js.UndefOr[Double] = js.native
    
    var defaults__resizerTip: js.UndefOr[String] = js.native
    
    var defaults__scrollToBookmarkOnLoad: js.UndefOr[Boolean] = js.native
    
    var defaults__showOverflowOnHover: js.UndefOr[Boolean] = js.native
    
    var defaults__size: js.UndefOr[String | Double] = js.native
    
    var defaults__slidable: js.UndefOr[Boolean] = js.native
    
    var defaults__slideTrigger_close: js.UndefOr[String] = js.native
    
    var defaults__slideTrigger_open: js.UndefOr[String] = js.native
    
    var defaults__sliderCursor: js.UndefOr[String] = js.native
    
    var defaults__sliderTip: js.UndefOr[String] = js.native
    
    var defaults__spacing_closed: js.UndefOr[Double] = js.native
    
    var defaults__spacing_open: js.UndefOr[Double] = js.native
    
    var defaults__togglerAlign_closed: js.UndefOr[String | Double] = js.native
    
    var defaults__togglerAlign_open: js.UndefOr[String | Double] = js.native
    
    var defaults__togglerClass: js.UndefOr[String] = js.native
    
    var defaults__togglerContent_closed: js.UndefOr[String] = js.native
    
    var defaults__togglerContent_open: js.UndefOr[String] = js.native
    
    var defaults__togglerLength_closed: js.UndefOr[Double | String] = js.native
    
    var defaults__togglerLength_open: js.UndefOr[Double | String] = js.native
    
    var defaults__togglerTip_closed: js.UndefOr[String] = js.native
    
    var defaults__togglerTip_open: js.UndefOr[String] = js.native
    
    var east: js.UndefOr[PaneOptions] = js.native
    
    var east__applyDefaultStyles: js.UndefOr[Boolean] = js.native
    
    var east__buttonClass: js.UndefOr[String] = js.native
    
    var east__closable: js.UndefOr[Boolean] = js.native
    
    var east__contentIgnoreSelector: js.UndefOr[String] = js.native
    
    var east__contentSelector: js.UndefOr[String] = js.native
    
    var east__customHotkey: js.UndefOr[String | Double] = js.native
    
    var east__customHotkeyModifier: js.UndefOr[String] = js.native
    
    var east__enableCursorHotkey: js.UndefOr[Boolean] = js.native
    
    var east__fxName: js.UndefOr[String] = js.native
    
    var east__fxSettings: js.UndefOr[JQueryAnimationOptions] = js.native
    
    var east__fxSpeed: js.UndefOr[String | Double] = js.native
    
    var east__hideTogglerOnSlide: js.UndefOr[Boolean] = js.native
    
    var east__initClosed: js.UndefOr[Boolean] = js.native
    
    var east__initHidden: js.UndefOr[Boolean] = js.native
    
    var east__maskIframesOnResize: js.UndefOr[Boolean | String] = js.native
    
    var east__maxSize: js.UndefOr[Double] = js.native
    
    var east__minSize: js.UndefOr[Double] = js.native
    
    var east__onclose: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var east__onclose_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var east__onclose_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var east__onhide: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var east__onhide_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var east__onhide_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var east__onopen: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var east__onopen_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var east__onopen_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var east__onresize: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var east__onresize_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var east__onresize_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var east__onshow: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var east__onshow_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var east__onshow_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var east__paneClass: js.UndefOr[String] = js.native
    
    var east__paneSelector: js.UndefOr[String] = js.native
    
    var east__resizable: js.UndefOr[Boolean] = js.native
    
    var east__resizerClass: js.UndefOr[String] = js.native
    
    var east__resizerCursor: js.UndefOr[String] = js.native
    
    var east__resizerDragOpacity: js.UndefOr[Double] = js.native
    
    var east__resizerTip: js.UndefOr[String] = js.native
    
    var east__scrollToBookmarkOnLoad: js.UndefOr[Boolean] = js.native
    
    var east__showOverflowOnHover: js.UndefOr[Boolean] = js.native
    
    var east__size: js.UndefOr[String | Double] = js.native
    
    var east__slidable: js.UndefOr[Boolean] = js.native
    
    var east__slideTrigger_close: js.UndefOr[String] = js.native
    
    var east__slideTrigger_open: js.UndefOr[String] = js.native
    
    var east__sliderCursor: js.UndefOr[String] = js.native
    
    var east__sliderTip: js.UndefOr[String] = js.native
    
    var east__spacing_closed: js.UndefOr[Double] = js.native
    
    var east__spacing_open: js.UndefOr[Double] = js.native
    
    var east__togglerAlign_closed: js.UndefOr[String | Double] = js.native
    
    var east__togglerAlign_open: js.UndefOr[String | Double] = js.native
    
    var east__togglerClass: js.UndefOr[String] = js.native
    
    var east__togglerContent_closed: js.UndefOr[String] = js.native
    
    var east__togglerContent_open: js.UndefOr[String] = js.native
    
    var east__togglerLength_closed: js.UndefOr[Double | String] = js.native
    
    var east__togglerLength_open: js.UndefOr[Double | String] = js.native
    
    var east__togglerTip_closed: js.UndefOr[String] = js.native
    
    var east__togglerTip_open: js.UndefOr[String] = js.native
    
    var north: js.UndefOr[PaneOptions] = js.native
    
    var north__applyDefaultStyles: js.UndefOr[Boolean] = js.native
    
    var north__buttonClass: js.UndefOr[String] = js.native
    
    var north__closable: js.UndefOr[Boolean] = js.native
    
    var north__contentIgnoreSelector: js.UndefOr[String] = js.native
    
    var north__contentSelector: js.UndefOr[String] = js.native
    
    var north__customHotkey: js.UndefOr[String | Double] = js.native
    
    var north__customHotkeyModifier: js.UndefOr[String] = js.native
    
    var north__enableCursorHotkey: js.UndefOr[Boolean] = js.native
    
    var north__fxName: js.UndefOr[String] = js.native
    
    var north__fxSettings: js.UndefOr[JQueryAnimationOptions] = js.native
    
    var north__fxSpeed: js.UndefOr[String | Double] = js.native
    
    var north__hideTogglerOnSlide: js.UndefOr[Boolean] = js.native
    
    var north__initClosed: js.UndefOr[Boolean] = js.native
    
    var north__initHidden: js.UndefOr[Boolean] = js.native
    
    var north__maskIframesOnResize: js.UndefOr[Boolean | String] = js.native
    
    var north__maxSize: js.UndefOr[Double] = js.native
    
    var north__minSize: js.UndefOr[Double] = js.native
    
    var north__onclose: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var north__onclose_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var north__onclose_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var north__onhide: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var north__onhide_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var north__onhide_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var north__onopen: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var north__onopen_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var north__onopen_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var north__onresize: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var north__onresize_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var north__onresize_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var north__onshow: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var north__onshow_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var north__onshow_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var north__paneClass: js.UndefOr[String] = js.native
    
    var north__paneSelector: js.UndefOr[String] = js.native
    
    var north__resizable: js.UndefOr[Boolean] = js.native
    
    var north__resizerClass: js.UndefOr[String] = js.native
    
    var north__resizerCursor: js.UndefOr[String] = js.native
    
    var north__resizerDragOpacity: js.UndefOr[Double] = js.native
    
    var north__resizerTip: js.UndefOr[String] = js.native
    
    var north__scrollToBookmarkOnLoad: js.UndefOr[Boolean] = js.native
    
    var north__showOverflowOnHover: js.UndefOr[Boolean] = js.native
    
    var north__size: js.UndefOr[String | Double] = js.native
    
    var north__slidable: js.UndefOr[Boolean] = js.native
    
    var north__slideTrigger_close: js.UndefOr[String] = js.native
    
    var north__slideTrigger_open: js.UndefOr[String] = js.native
    
    var north__sliderCursor: js.UndefOr[String] = js.native
    
    var north__sliderTip: js.UndefOr[String] = js.native
    
    var north__spacing_closed: js.UndefOr[Double] = js.native
    
    var north__spacing_open: js.UndefOr[Double] = js.native
    
    var north__togglerAlign_closed: js.UndefOr[String | Double] = js.native
    
    var north__togglerAlign_open: js.UndefOr[String | Double] = js.native
    
    var north__togglerClass: js.UndefOr[String] = js.native
    
    var north__togglerContent_closed: js.UndefOr[String] = js.native
    
    var north__togglerContent_open: js.UndefOr[String] = js.native
    
    var north__togglerLength_closed: js.UndefOr[Double | String] = js.native
    
    var north__togglerLength_open: js.UndefOr[Double | String] = js.native
    
    var north__togglerTip_closed: js.UndefOr[String] = js.native
    
    var north__togglerTip_open: js.UndefOr[String] = js.native
    
    var south: js.UndefOr[PaneOptions] = js.native
    
    var south__applyDefaultStyles: js.UndefOr[Boolean] = js.native
    
    var south__buttonClass: js.UndefOr[String] = js.native
    
    var south__closable: js.UndefOr[Boolean] = js.native
    
    var south__contentIgnoreSelector: js.UndefOr[String] = js.native
    
    var south__contentSelector: js.UndefOr[String] = js.native
    
    var south__customHotkey: js.UndefOr[String | Double] = js.native
    
    var south__customHotkeyModifier: js.UndefOr[String] = js.native
    
    var south__enableCursorHotkey: js.UndefOr[Boolean] = js.native
    
    var south__fxName: js.UndefOr[String] = js.native
    
    var south__fxSettings: js.UndefOr[JQueryAnimationOptions] = js.native
    
    var south__fxSpeed: js.UndefOr[String | Double] = js.native
    
    var south__hideTogglerOnSlide: js.UndefOr[Boolean] = js.native
    
    var south__initClosed: js.UndefOr[Boolean] = js.native
    
    var south__initHidden: js.UndefOr[Boolean] = js.native
    
    var south__maskIframesOnResize: js.UndefOr[Boolean | String] = js.native
    
    var south__maxSize: js.UndefOr[Double] = js.native
    
    var south__minSize: js.UndefOr[Double] = js.native
    
    var south__onclose: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var south__onclose_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var south__onclose_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var south__onhide: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var south__onhide_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var south__onhide_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var south__onopen: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var south__onopen_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var south__onopen_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var south__onresize: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var south__onresize_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var south__onresize_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var south__onshow: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var south__onshow_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var south__onshow_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var south__paneClass: js.UndefOr[String] = js.native
    
    var south__paneSelector: js.UndefOr[String] = js.native
    
    var south__resizable: js.UndefOr[Boolean] = js.native
    
    var south__resizerClass: js.UndefOr[String] = js.native
    
    var south__resizerCursor: js.UndefOr[String] = js.native
    
    var south__resizerDragOpacity: js.UndefOr[Double] = js.native
    
    var south__resizerTip: js.UndefOr[String] = js.native
    
    var south__scrollToBookmarkOnLoad: js.UndefOr[Boolean] = js.native
    
    var south__showOverflowOnHover: js.UndefOr[Boolean] = js.native
    
    var south__size: js.UndefOr[String | Double] = js.native
    
    var south__slidable: js.UndefOr[Boolean] = js.native
    
    var south__slideTrigger_close: js.UndefOr[String] = js.native
    
    var south__slideTrigger_open: js.UndefOr[String] = js.native
    
    var south__sliderCursor: js.UndefOr[String] = js.native
    
    var south__sliderTip: js.UndefOr[String] = js.native
    
    var south__spacing_closed: js.UndefOr[Double] = js.native
    
    var south__spacing_open: js.UndefOr[Double] = js.native
    
    var south__togglerAlign_closed: js.UndefOr[String | Double] = js.native
    
    var south__togglerAlign_open: js.UndefOr[String | Double] = js.native
    
    var south__togglerClass: js.UndefOr[String] = js.native
    
    var south__togglerContent_closed: js.UndefOr[String] = js.native
    
    var south__togglerContent_open: js.UndefOr[String] = js.native
    
    var south__togglerLength_closed: js.UndefOr[Double | String] = js.native
    
    var south__togglerLength_open: js.UndefOr[Double | String] = js.native
    
    var south__togglerTip_closed: js.UndefOr[String] = js.native
    
    var south__togglerTip_open: js.UndefOr[String] = js.native
    
    var west: js.UndefOr[PaneOptions] = js.native
    
    var west__applyDefaultStyles: js.UndefOr[Boolean] = js.native
    
    var west__buttonClass: js.UndefOr[String] = js.native
    
    var west__closable: js.UndefOr[Boolean] = js.native
    
    var west__contentIgnoreSelector: js.UndefOr[String] = js.native
    
    var west__contentSelector: js.UndefOr[String] = js.native
    
    var west__customHotkey: js.UndefOr[String | Double] = js.native
    
    var west__customHotkeyModifier: js.UndefOr[String] = js.native
    
    var west__enableCursorHotkey: js.UndefOr[Boolean] = js.native
    
    var west__fxName: js.UndefOr[String] = js.native
    
    var west__fxSettings: js.UndefOr[JQueryAnimationOptions] = js.native
    
    var west__fxSpeed: js.UndefOr[String | Double] = js.native
    
    var west__hideTogglerOnSlide: js.UndefOr[Boolean] = js.native
    
    var west__initClosed: js.UndefOr[Boolean] = js.native
    
    var west__initHidden: js.UndefOr[Boolean] = js.native
    
    var west__maskIframesOnResize: js.UndefOr[Boolean | String] = js.native
    
    var west__maxSize: js.UndefOr[Double] = js.native
    
    var west__minSize: js.UndefOr[Double] = js.native
    
    var west__onclose: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var west__onclose_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var west__onclose_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var west__onhide: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var west__onhide_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var west__onhide_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var west__onopen: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var west__onopen_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var west__onopen_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var west__onresize: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var west__onresize_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var west__onresize_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var west__onshow: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var west__onshow_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var west__onshow_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ PaneOptions, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var west__paneClass: js.UndefOr[String] = js.native
    
    var west__paneSelector: js.UndefOr[String] = js.native
    
    var west__resizable: js.UndefOr[Boolean] = js.native
    
    var west__resizerClass: js.UndefOr[String] = js.native
    
    var west__resizerCursor: js.UndefOr[String] = js.native
    
    var west__resizerDragOpacity: js.UndefOr[Double] = js.native
    
    var west__resizerTip: js.UndefOr[String] = js.native
    
    var west__scrollToBookmarkOnLoad: js.UndefOr[Boolean] = js.native
    
    var west__showOverflowOnHover: js.UndefOr[Boolean] = js.native
    
    var west__size: js.UndefOr[String | Double] = js.native
    
    var west__slidable: js.UndefOr[Boolean] = js.native
    
    var west__slideTrigger_close: js.UndefOr[String] = js.native
    
    var west__slideTrigger_open: js.UndefOr[String] = js.native
    
    var west__sliderCursor: js.UndefOr[String] = js.native
    
    var west__sliderTip: js.UndefOr[String] = js.native
    
    var west__spacing_closed: js.UndefOr[Double] = js.native
    
    var west__spacing_open: js.UndefOr[Double] = js.native
    
    var west__togglerAlign_closed: js.UndefOr[String | Double] = js.native
    
    var west__togglerAlign_open: js.UndefOr[String | Double] = js.native
    
    var west__togglerClass: js.UndefOr[String] = js.native
    
    var west__togglerContent_closed: js.UndefOr[String] = js.native
    
    var west__togglerContent_open: js.UndefOr[String] = js.native
    
    var west__togglerLength_closed: js.UndefOr[Double | String] = js.native
    
    var west__togglerLength_open: js.UndefOr[Double | String] = js.native
    
    var west__togglerTip_closed: js.UndefOr[String] = js.native
    
    var west__togglerTip_open: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenter(value: PaneOptions): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setCenter__applyDefaultStyles(value: Boolean): Self = StObject.set(x, "center__applyDefaultStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__applyDefaultStylesUndefined: Self = StObject.set(x, "center__applyDefaultStyles", js.undefined)
      
      @scala.inline
      def setCenter__buttonClass(value: String): Self = StObject.set(x, "center__buttonClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__buttonClassUndefined: Self = StObject.set(x, "center__buttonClass", js.undefined)
      
      @scala.inline
      def setCenter__closable(value: Boolean): Self = StObject.set(x, "center__closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__closableUndefined: Self = StObject.set(x, "center__closable", js.undefined)
      
      @scala.inline
      def setCenter__contentIgnoreSelector(value: String): Self = StObject.set(x, "center__contentIgnoreSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__contentIgnoreSelectorUndefined: Self = StObject.set(x, "center__contentIgnoreSelector", js.undefined)
      
      @scala.inline
      def setCenter__contentSelector(value: String): Self = StObject.set(x, "center__contentSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__contentSelectorUndefined: Self = StObject.set(x, "center__contentSelector", js.undefined)
      
      @scala.inline
      def setCenter__customHotkey(value: String | Double): Self = StObject.set(x, "center__customHotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__customHotkeyModifier(value: String): Self = StObject.set(x, "center__customHotkeyModifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__customHotkeyModifierUndefined: Self = StObject.set(x, "center__customHotkeyModifier", js.undefined)
      
      @scala.inline
      def setCenter__customHotkeyUndefined: Self = StObject.set(x, "center__customHotkey", js.undefined)
      
      @scala.inline
      def setCenter__enableCursorHotkey(value: Boolean): Self = StObject.set(x, "center__enableCursorHotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__enableCursorHotkeyUndefined: Self = StObject.set(x, "center__enableCursorHotkey", js.undefined)
      
      @scala.inline
      def setCenter__fxName(value: String): Self = StObject.set(x, "center__fxName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__fxNameUndefined: Self = StObject.set(x, "center__fxName", js.undefined)
      
      @scala.inline
      def setCenter__fxSettings(value: JQueryAnimationOptions): Self = StObject.set(x, "center__fxSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__fxSettingsUndefined: Self = StObject.set(x, "center__fxSettings", js.undefined)
      
      @scala.inline
      def setCenter__fxSpeed(value: String | Double): Self = StObject.set(x, "center__fxSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__fxSpeedUndefined: Self = StObject.set(x, "center__fxSpeed", js.undefined)
      
      @scala.inline
      def setCenter__hideTogglerOnSlide(value: Boolean): Self = StObject.set(x, "center__hideTogglerOnSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__hideTogglerOnSlideUndefined: Self = StObject.set(x, "center__hideTogglerOnSlide", js.undefined)
      
      @scala.inline
      def setCenter__initClosed(value: Boolean): Self = StObject.set(x, "center__initClosed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__initClosedUndefined: Self = StObject.set(x, "center__initClosed", js.undefined)
      
      @scala.inline
      def setCenter__initHidden(value: Boolean): Self = StObject.set(x, "center__initHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__initHiddenUndefined: Self = StObject.set(x, "center__initHidden", js.undefined)
      
      @scala.inline
      def setCenter__maskIframesOnResize(value: Boolean | String): Self = StObject.set(x, "center__maskIframesOnResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__maskIframesOnResizeUndefined: Self = StObject.set(x, "center__maskIframesOnResize", js.undefined)
      
      @scala.inline
      def setCenter__maxSize(value: Double): Self = StObject.set(x, "center__maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__maxSizeUndefined: Self = StObject.set(x, "center__maxSize", js.undefined)
      
      @scala.inline
      def setCenter__minSize(value: Double): Self = StObject.set(x, "center__minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__minSizeUndefined: Self = StObject.set(x, "center__minSize", js.undefined)
      
      @scala.inline
      def setCenter__onclose(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "center__onclose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__oncloseFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "center__onclose", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCenter__oncloseUndefined: Self = StObject.set(x, "center__onclose", js.undefined)
      
      @scala.inline
      def setCenter__onclose_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "center__onclose_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__onclose_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "center__onclose_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCenter__onclose_endUndefined: Self = StObject.set(x, "center__onclose_end", js.undefined)
      
      @scala.inline
      def setCenter__onclose_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "center__onclose_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__onclose_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "center__onclose_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCenter__onclose_startUndefined: Self = StObject.set(x, "center__onclose_start", js.undefined)
      
      @scala.inline
      def setCenter__onhide(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "center__onhide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__onhideFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "center__onhide", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCenter__onhideUndefined: Self = StObject.set(x, "center__onhide", js.undefined)
      
      @scala.inline
      def setCenter__onhide_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "center__onhide_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__onhide_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "center__onhide_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCenter__onhide_endUndefined: Self = StObject.set(x, "center__onhide_end", js.undefined)
      
      @scala.inline
      def setCenter__onhide_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "center__onhide_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__onhide_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "center__onhide_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCenter__onhide_startUndefined: Self = StObject.set(x, "center__onhide_start", js.undefined)
      
      @scala.inline
      def setCenter__onopen(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "center__onopen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__onopenFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "center__onopen", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCenter__onopenUndefined: Self = StObject.set(x, "center__onopen", js.undefined)
      
      @scala.inline
      def setCenter__onopen_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "center__onopen_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__onopen_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "center__onopen_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCenter__onopen_endUndefined: Self = StObject.set(x, "center__onopen_end", js.undefined)
      
      @scala.inline
      def setCenter__onopen_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "center__onopen_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__onopen_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "center__onopen_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCenter__onopen_startUndefined: Self = StObject.set(x, "center__onopen_start", js.undefined)
      
      @scala.inline
      def setCenter__onresize(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "center__onresize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__onresizeFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "center__onresize", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCenter__onresizeUndefined: Self = StObject.set(x, "center__onresize", js.undefined)
      
      @scala.inline
      def setCenter__onresize_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "center__onresize_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__onresize_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "center__onresize_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCenter__onresize_endUndefined: Self = StObject.set(x, "center__onresize_end", js.undefined)
      
      @scala.inline
      def setCenter__onresize_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "center__onresize_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__onresize_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "center__onresize_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCenter__onresize_startUndefined: Self = StObject.set(x, "center__onresize_start", js.undefined)
      
      @scala.inline
      def setCenter__onshow(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "center__onshow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__onshowFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "center__onshow", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCenter__onshowUndefined: Self = StObject.set(x, "center__onshow", js.undefined)
      
      @scala.inline
      def setCenter__onshow_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "center__onshow_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__onshow_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "center__onshow_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCenter__onshow_endUndefined: Self = StObject.set(x, "center__onshow_end", js.undefined)
      
      @scala.inline
      def setCenter__onshow_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "center__onshow_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__onshow_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "center__onshow_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCenter__onshow_startUndefined: Self = StObject.set(x, "center__onshow_start", js.undefined)
      
      @scala.inline
      def setCenter__paneClass(value: String): Self = StObject.set(x, "center__paneClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__paneClassUndefined: Self = StObject.set(x, "center__paneClass", js.undefined)
      
      @scala.inline
      def setCenter__paneSelector(value: String): Self = StObject.set(x, "center__paneSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__paneSelectorUndefined: Self = StObject.set(x, "center__paneSelector", js.undefined)
      
      @scala.inline
      def setCenter__resizable(value: Boolean): Self = StObject.set(x, "center__resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__resizableUndefined: Self = StObject.set(x, "center__resizable", js.undefined)
      
      @scala.inline
      def setCenter__resizerClass(value: String): Self = StObject.set(x, "center__resizerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__resizerClassUndefined: Self = StObject.set(x, "center__resizerClass", js.undefined)
      
      @scala.inline
      def setCenter__resizerCursor(value: String): Self = StObject.set(x, "center__resizerCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__resizerCursorUndefined: Self = StObject.set(x, "center__resizerCursor", js.undefined)
      
      @scala.inline
      def setCenter__resizerDragOpacity(value: Double): Self = StObject.set(x, "center__resizerDragOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__resizerDragOpacityUndefined: Self = StObject.set(x, "center__resizerDragOpacity", js.undefined)
      
      @scala.inline
      def setCenter__resizerTip(value: String): Self = StObject.set(x, "center__resizerTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__resizerTipUndefined: Self = StObject.set(x, "center__resizerTip", js.undefined)
      
      @scala.inline
      def setCenter__scrollToBookmarkOnLoad(value: Boolean): Self = StObject.set(x, "center__scrollToBookmarkOnLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__scrollToBookmarkOnLoadUndefined: Self = StObject.set(x, "center__scrollToBookmarkOnLoad", js.undefined)
      
      @scala.inline
      def setCenter__showOverflowOnHover(value: Boolean): Self = StObject.set(x, "center__showOverflowOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__showOverflowOnHoverUndefined: Self = StObject.set(x, "center__showOverflowOnHover", js.undefined)
      
      @scala.inline
      def setCenter__size(value: String | Double): Self = StObject.set(x, "center__size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__sizeUndefined: Self = StObject.set(x, "center__size", js.undefined)
      
      @scala.inline
      def setCenter__slidable(value: Boolean): Self = StObject.set(x, "center__slidable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__slidableUndefined: Self = StObject.set(x, "center__slidable", js.undefined)
      
      @scala.inline
      def setCenter__slideTrigger_close(value: String): Self = StObject.set(x, "center__slideTrigger_close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__slideTrigger_closeUndefined: Self = StObject.set(x, "center__slideTrigger_close", js.undefined)
      
      @scala.inline
      def setCenter__slideTrigger_open(value: String): Self = StObject.set(x, "center__slideTrigger_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__slideTrigger_openUndefined: Self = StObject.set(x, "center__slideTrigger_open", js.undefined)
      
      @scala.inline
      def setCenter__sliderCursor(value: String): Self = StObject.set(x, "center__sliderCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__sliderCursorUndefined: Self = StObject.set(x, "center__sliderCursor", js.undefined)
      
      @scala.inline
      def setCenter__sliderTip(value: String): Self = StObject.set(x, "center__sliderTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__sliderTipUndefined: Self = StObject.set(x, "center__sliderTip", js.undefined)
      
      @scala.inline
      def setCenter__spacing_closed(value: Double): Self = StObject.set(x, "center__spacing_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__spacing_closedUndefined: Self = StObject.set(x, "center__spacing_closed", js.undefined)
      
      @scala.inline
      def setCenter__spacing_open(value: Double): Self = StObject.set(x, "center__spacing_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__spacing_openUndefined: Self = StObject.set(x, "center__spacing_open", js.undefined)
      
      @scala.inline
      def setCenter__togglerAlign_closed(value: String | Double): Self = StObject.set(x, "center__togglerAlign_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__togglerAlign_closedUndefined: Self = StObject.set(x, "center__togglerAlign_closed", js.undefined)
      
      @scala.inline
      def setCenter__togglerAlign_open(value: String | Double): Self = StObject.set(x, "center__togglerAlign_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__togglerAlign_openUndefined: Self = StObject.set(x, "center__togglerAlign_open", js.undefined)
      
      @scala.inline
      def setCenter__togglerClass(value: String): Self = StObject.set(x, "center__togglerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__togglerClassUndefined: Self = StObject.set(x, "center__togglerClass", js.undefined)
      
      @scala.inline
      def setCenter__togglerContent_closed(value: String): Self = StObject.set(x, "center__togglerContent_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__togglerContent_closedUndefined: Self = StObject.set(x, "center__togglerContent_closed", js.undefined)
      
      @scala.inline
      def setCenter__togglerContent_open(value: String): Self = StObject.set(x, "center__togglerContent_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__togglerContent_openUndefined: Self = StObject.set(x, "center__togglerContent_open", js.undefined)
      
      @scala.inline
      def setCenter__togglerLength_closed(value: Double | String): Self = StObject.set(x, "center__togglerLength_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__togglerLength_closedUndefined: Self = StObject.set(x, "center__togglerLength_closed", js.undefined)
      
      @scala.inline
      def setCenter__togglerLength_open(value: Double | String): Self = StObject.set(x, "center__togglerLength_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__togglerLength_openUndefined: Self = StObject.set(x, "center__togglerLength_open", js.undefined)
      
      @scala.inline
      def setCenter__togglerTip_closed(value: String): Self = StObject.set(x, "center__togglerTip_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__togglerTip_closedUndefined: Self = StObject.set(x, "center__togglerTip_closed", js.undefined)
      
      @scala.inline
      def setCenter__togglerTip_open(value: String): Self = StObject.set(x, "center__togglerTip_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter__togglerTip_openUndefined: Self = StObject.set(x, "center__togglerTip_open", js.undefined)
      
      @scala.inline
      def setDefaults(value: PaneOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      @scala.inline
      def setDefaults__applyDefaultStyles(value: Boolean): Self = StObject.set(x, "defaults__applyDefaultStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__applyDefaultStylesUndefined: Self = StObject.set(x, "defaults__applyDefaultStyles", js.undefined)
      
      @scala.inline
      def setDefaults__buttonClass(value: String): Self = StObject.set(x, "defaults__buttonClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__buttonClassUndefined: Self = StObject.set(x, "defaults__buttonClass", js.undefined)
      
      @scala.inline
      def setDefaults__closable(value: Boolean): Self = StObject.set(x, "defaults__closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__closableUndefined: Self = StObject.set(x, "defaults__closable", js.undefined)
      
      @scala.inline
      def setDefaults__contentIgnoreSelector(value: String): Self = StObject.set(x, "defaults__contentIgnoreSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__contentIgnoreSelectorUndefined: Self = StObject.set(x, "defaults__contentIgnoreSelector", js.undefined)
      
      @scala.inline
      def setDefaults__contentSelector(value: String): Self = StObject.set(x, "defaults__contentSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__contentSelectorUndefined: Self = StObject.set(x, "defaults__contentSelector", js.undefined)
      
      @scala.inline
      def setDefaults__customHotkey(value: String | Double): Self = StObject.set(x, "defaults__customHotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__customHotkeyModifier(value: String): Self = StObject.set(x, "defaults__customHotkeyModifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__customHotkeyModifierUndefined: Self = StObject.set(x, "defaults__customHotkeyModifier", js.undefined)
      
      @scala.inline
      def setDefaults__customHotkeyUndefined: Self = StObject.set(x, "defaults__customHotkey", js.undefined)
      
      @scala.inline
      def setDefaults__enableCursorHotkey(value: Boolean): Self = StObject.set(x, "defaults__enableCursorHotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__enableCursorHotkeyUndefined: Self = StObject.set(x, "defaults__enableCursorHotkey", js.undefined)
      
      @scala.inline
      def setDefaults__fxName(value: String): Self = StObject.set(x, "defaults__fxName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__fxNameUndefined: Self = StObject.set(x, "defaults__fxName", js.undefined)
      
      @scala.inline
      def setDefaults__fxSettings(value: JQueryAnimationOptions): Self = StObject.set(x, "defaults__fxSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__fxSettingsUndefined: Self = StObject.set(x, "defaults__fxSettings", js.undefined)
      
      @scala.inline
      def setDefaults__fxSpeed(value: String | Double): Self = StObject.set(x, "defaults__fxSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__fxSpeedUndefined: Self = StObject.set(x, "defaults__fxSpeed", js.undefined)
      
      @scala.inline
      def setDefaults__hideTogglerOnSlide(value: Boolean): Self = StObject.set(x, "defaults__hideTogglerOnSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__hideTogglerOnSlideUndefined: Self = StObject.set(x, "defaults__hideTogglerOnSlide", js.undefined)
      
      @scala.inline
      def setDefaults__initClosed(value: Boolean): Self = StObject.set(x, "defaults__initClosed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__initClosedUndefined: Self = StObject.set(x, "defaults__initClosed", js.undefined)
      
      @scala.inline
      def setDefaults__initHidden(value: Boolean): Self = StObject.set(x, "defaults__initHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__initHiddenUndefined: Self = StObject.set(x, "defaults__initHidden", js.undefined)
      
      @scala.inline
      def setDefaults__maskIframesOnResize(value: Boolean | String): Self = StObject.set(x, "defaults__maskIframesOnResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__maskIframesOnResizeUndefined: Self = StObject.set(x, "defaults__maskIframesOnResize", js.undefined)
      
      @scala.inline
      def setDefaults__maxSize(value: Double): Self = StObject.set(x, "defaults__maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__maxSizeUndefined: Self = StObject.set(x, "defaults__maxSize", js.undefined)
      
      @scala.inline
      def setDefaults__minSize(value: Double): Self = StObject.set(x, "defaults__minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__minSizeUndefined: Self = StObject.set(x, "defaults__minSize", js.undefined)
      
      @scala.inline
      def setDefaults__onclose(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "defaults__onclose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__oncloseFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "defaults__onclose", js.Any.fromFunction5(value))
      
      @scala.inline
      def setDefaults__oncloseUndefined: Self = StObject.set(x, "defaults__onclose", js.undefined)
      
      @scala.inline
      def setDefaults__onclose_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "defaults__onclose_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__onclose_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "defaults__onclose_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setDefaults__onclose_endUndefined: Self = StObject.set(x, "defaults__onclose_end", js.undefined)
      
      @scala.inline
      def setDefaults__onclose_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "defaults__onclose_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__onclose_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "defaults__onclose_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setDefaults__onclose_startUndefined: Self = StObject.set(x, "defaults__onclose_start", js.undefined)
      
      @scala.inline
      def setDefaults__onhide(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "defaults__onhide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__onhideFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "defaults__onhide", js.Any.fromFunction5(value))
      
      @scala.inline
      def setDefaults__onhideUndefined: Self = StObject.set(x, "defaults__onhide", js.undefined)
      
      @scala.inline
      def setDefaults__onhide_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "defaults__onhide_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__onhide_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "defaults__onhide_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setDefaults__onhide_endUndefined: Self = StObject.set(x, "defaults__onhide_end", js.undefined)
      
      @scala.inline
      def setDefaults__onhide_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "defaults__onhide_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__onhide_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "defaults__onhide_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setDefaults__onhide_startUndefined: Self = StObject.set(x, "defaults__onhide_start", js.undefined)
      
      @scala.inline
      def setDefaults__onopen(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "defaults__onopen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__onopenFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "defaults__onopen", js.Any.fromFunction5(value))
      
      @scala.inline
      def setDefaults__onopenUndefined: Self = StObject.set(x, "defaults__onopen", js.undefined)
      
      @scala.inline
      def setDefaults__onopen_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "defaults__onopen_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__onopen_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "defaults__onopen_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setDefaults__onopen_endUndefined: Self = StObject.set(x, "defaults__onopen_end", js.undefined)
      
      @scala.inline
      def setDefaults__onopen_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "defaults__onopen_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__onopen_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "defaults__onopen_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setDefaults__onopen_startUndefined: Self = StObject.set(x, "defaults__onopen_start", js.undefined)
      
      @scala.inline
      def setDefaults__onresize(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "defaults__onresize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__onresizeFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "defaults__onresize", js.Any.fromFunction5(value))
      
      @scala.inline
      def setDefaults__onresizeUndefined: Self = StObject.set(x, "defaults__onresize", js.undefined)
      
      @scala.inline
      def setDefaults__onresize_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "defaults__onresize_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__onresize_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "defaults__onresize_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setDefaults__onresize_endUndefined: Self = StObject.set(x, "defaults__onresize_end", js.undefined)
      
      @scala.inline
      def setDefaults__onresize_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "defaults__onresize_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__onresize_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "defaults__onresize_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setDefaults__onresize_startUndefined: Self = StObject.set(x, "defaults__onresize_start", js.undefined)
      
      @scala.inline
      def setDefaults__onshow(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "defaults__onshow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__onshowFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "defaults__onshow", js.Any.fromFunction5(value))
      
      @scala.inline
      def setDefaults__onshowUndefined: Self = StObject.set(x, "defaults__onshow", js.undefined)
      
      @scala.inline
      def setDefaults__onshow_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "defaults__onshow_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__onshow_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "defaults__onshow_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setDefaults__onshow_endUndefined: Self = StObject.set(x, "defaults__onshow_end", js.undefined)
      
      @scala.inline
      def setDefaults__onshow_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "defaults__onshow_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__onshow_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "defaults__onshow_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setDefaults__onshow_startUndefined: Self = StObject.set(x, "defaults__onshow_start", js.undefined)
      
      @scala.inline
      def setDefaults__paneClass(value: String): Self = StObject.set(x, "defaults__paneClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__paneClassUndefined: Self = StObject.set(x, "defaults__paneClass", js.undefined)
      
      @scala.inline
      def setDefaults__paneSelector(value: String): Self = StObject.set(x, "defaults__paneSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__paneSelectorUndefined: Self = StObject.set(x, "defaults__paneSelector", js.undefined)
      
      @scala.inline
      def setDefaults__resizable(value: Boolean): Self = StObject.set(x, "defaults__resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__resizableUndefined: Self = StObject.set(x, "defaults__resizable", js.undefined)
      
      @scala.inline
      def setDefaults__resizerClass(value: String): Self = StObject.set(x, "defaults__resizerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__resizerClassUndefined: Self = StObject.set(x, "defaults__resizerClass", js.undefined)
      
      @scala.inline
      def setDefaults__resizerCursor(value: String): Self = StObject.set(x, "defaults__resizerCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__resizerCursorUndefined: Self = StObject.set(x, "defaults__resizerCursor", js.undefined)
      
      @scala.inline
      def setDefaults__resizerDragOpacity(value: Double): Self = StObject.set(x, "defaults__resizerDragOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__resizerDragOpacityUndefined: Self = StObject.set(x, "defaults__resizerDragOpacity", js.undefined)
      
      @scala.inline
      def setDefaults__resizerTip(value: String): Self = StObject.set(x, "defaults__resizerTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__resizerTipUndefined: Self = StObject.set(x, "defaults__resizerTip", js.undefined)
      
      @scala.inline
      def setDefaults__scrollToBookmarkOnLoad(value: Boolean): Self = StObject.set(x, "defaults__scrollToBookmarkOnLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__scrollToBookmarkOnLoadUndefined: Self = StObject.set(x, "defaults__scrollToBookmarkOnLoad", js.undefined)
      
      @scala.inline
      def setDefaults__showOverflowOnHover(value: Boolean): Self = StObject.set(x, "defaults__showOverflowOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__showOverflowOnHoverUndefined: Self = StObject.set(x, "defaults__showOverflowOnHover", js.undefined)
      
      @scala.inline
      def setDefaults__size(value: String | Double): Self = StObject.set(x, "defaults__size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__sizeUndefined: Self = StObject.set(x, "defaults__size", js.undefined)
      
      @scala.inline
      def setDefaults__slidable(value: Boolean): Self = StObject.set(x, "defaults__slidable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__slidableUndefined: Self = StObject.set(x, "defaults__slidable", js.undefined)
      
      @scala.inline
      def setDefaults__slideTrigger_close(value: String): Self = StObject.set(x, "defaults__slideTrigger_close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__slideTrigger_closeUndefined: Self = StObject.set(x, "defaults__slideTrigger_close", js.undefined)
      
      @scala.inline
      def setDefaults__slideTrigger_open(value: String): Self = StObject.set(x, "defaults__slideTrigger_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__slideTrigger_openUndefined: Self = StObject.set(x, "defaults__slideTrigger_open", js.undefined)
      
      @scala.inline
      def setDefaults__sliderCursor(value: String): Self = StObject.set(x, "defaults__sliderCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__sliderCursorUndefined: Self = StObject.set(x, "defaults__sliderCursor", js.undefined)
      
      @scala.inline
      def setDefaults__sliderTip(value: String): Self = StObject.set(x, "defaults__sliderTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__sliderTipUndefined: Self = StObject.set(x, "defaults__sliderTip", js.undefined)
      
      @scala.inline
      def setDefaults__spacing_closed(value: Double): Self = StObject.set(x, "defaults__spacing_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__spacing_closedUndefined: Self = StObject.set(x, "defaults__spacing_closed", js.undefined)
      
      @scala.inline
      def setDefaults__spacing_open(value: Double): Self = StObject.set(x, "defaults__spacing_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__spacing_openUndefined: Self = StObject.set(x, "defaults__spacing_open", js.undefined)
      
      @scala.inline
      def setDefaults__togglerAlign_closed(value: String | Double): Self = StObject.set(x, "defaults__togglerAlign_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__togglerAlign_closedUndefined: Self = StObject.set(x, "defaults__togglerAlign_closed", js.undefined)
      
      @scala.inline
      def setDefaults__togglerAlign_open(value: String | Double): Self = StObject.set(x, "defaults__togglerAlign_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__togglerAlign_openUndefined: Self = StObject.set(x, "defaults__togglerAlign_open", js.undefined)
      
      @scala.inline
      def setDefaults__togglerClass(value: String): Self = StObject.set(x, "defaults__togglerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__togglerClassUndefined: Self = StObject.set(x, "defaults__togglerClass", js.undefined)
      
      @scala.inline
      def setDefaults__togglerContent_closed(value: String): Self = StObject.set(x, "defaults__togglerContent_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__togglerContent_closedUndefined: Self = StObject.set(x, "defaults__togglerContent_closed", js.undefined)
      
      @scala.inline
      def setDefaults__togglerContent_open(value: String): Self = StObject.set(x, "defaults__togglerContent_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__togglerContent_openUndefined: Self = StObject.set(x, "defaults__togglerContent_open", js.undefined)
      
      @scala.inline
      def setDefaults__togglerLength_closed(value: Double | String): Self = StObject.set(x, "defaults__togglerLength_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__togglerLength_closedUndefined: Self = StObject.set(x, "defaults__togglerLength_closed", js.undefined)
      
      @scala.inline
      def setDefaults__togglerLength_open(value: Double | String): Self = StObject.set(x, "defaults__togglerLength_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__togglerLength_openUndefined: Self = StObject.set(x, "defaults__togglerLength_open", js.undefined)
      
      @scala.inline
      def setDefaults__togglerTip_closed(value: String): Self = StObject.set(x, "defaults__togglerTip_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__togglerTip_closedUndefined: Self = StObject.set(x, "defaults__togglerTip_closed", js.undefined)
      
      @scala.inline
      def setDefaults__togglerTip_open(value: String): Self = StObject.set(x, "defaults__togglerTip_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults__togglerTip_openUndefined: Self = StObject.set(x, "defaults__togglerTip_open", js.undefined)
      
      @scala.inline
      def setEast(value: PaneOptions): Self = StObject.set(x, "east", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEastUndefined: Self = StObject.set(x, "east", js.undefined)
      
      @scala.inline
      def setEast__applyDefaultStyles(value: Boolean): Self = StObject.set(x, "east__applyDefaultStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__applyDefaultStylesUndefined: Self = StObject.set(x, "east__applyDefaultStyles", js.undefined)
      
      @scala.inline
      def setEast__buttonClass(value: String): Self = StObject.set(x, "east__buttonClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__buttonClassUndefined: Self = StObject.set(x, "east__buttonClass", js.undefined)
      
      @scala.inline
      def setEast__closable(value: Boolean): Self = StObject.set(x, "east__closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__closableUndefined: Self = StObject.set(x, "east__closable", js.undefined)
      
      @scala.inline
      def setEast__contentIgnoreSelector(value: String): Self = StObject.set(x, "east__contentIgnoreSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__contentIgnoreSelectorUndefined: Self = StObject.set(x, "east__contentIgnoreSelector", js.undefined)
      
      @scala.inline
      def setEast__contentSelector(value: String): Self = StObject.set(x, "east__contentSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__contentSelectorUndefined: Self = StObject.set(x, "east__contentSelector", js.undefined)
      
      @scala.inline
      def setEast__customHotkey(value: String | Double): Self = StObject.set(x, "east__customHotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__customHotkeyModifier(value: String): Self = StObject.set(x, "east__customHotkeyModifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__customHotkeyModifierUndefined: Self = StObject.set(x, "east__customHotkeyModifier", js.undefined)
      
      @scala.inline
      def setEast__customHotkeyUndefined: Self = StObject.set(x, "east__customHotkey", js.undefined)
      
      @scala.inline
      def setEast__enableCursorHotkey(value: Boolean): Self = StObject.set(x, "east__enableCursorHotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__enableCursorHotkeyUndefined: Self = StObject.set(x, "east__enableCursorHotkey", js.undefined)
      
      @scala.inline
      def setEast__fxName(value: String): Self = StObject.set(x, "east__fxName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__fxNameUndefined: Self = StObject.set(x, "east__fxName", js.undefined)
      
      @scala.inline
      def setEast__fxSettings(value: JQueryAnimationOptions): Self = StObject.set(x, "east__fxSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__fxSettingsUndefined: Self = StObject.set(x, "east__fxSettings", js.undefined)
      
      @scala.inline
      def setEast__fxSpeed(value: String | Double): Self = StObject.set(x, "east__fxSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__fxSpeedUndefined: Self = StObject.set(x, "east__fxSpeed", js.undefined)
      
      @scala.inline
      def setEast__hideTogglerOnSlide(value: Boolean): Self = StObject.set(x, "east__hideTogglerOnSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__hideTogglerOnSlideUndefined: Self = StObject.set(x, "east__hideTogglerOnSlide", js.undefined)
      
      @scala.inline
      def setEast__initClosed(value: Boolean): Self = StObject.set(x, "east__initClosed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__initClosedUndefined: Self = StObject.set(x, "east__initClosed", js.undefined)
      
      @scala.inline
      def setEast__initHidden(value: Boolean): Self = StObject.set(x, "east__initHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__initHiddenUndefined: Self = StObject.set(x, "east__initHidden", js.undefined)
      
      @scala.inline
      def setEast__maskIframesOnResize(value: Boolean | String): Self = StObject.set(x, "east__maskIframesOnResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__maskIframesOnResizeUndefined: Self = StObject.set(x, "east__maskIframesOnResize", js.undefined)
      
      @scala.inline
      def setEast__maxSize(value: Double): Self = StObject.set(x, "east__maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__maxSizeUndefined: Self = StObject.set(x, "east__maxSize", js.undefined)
      
      @scala.inline
      def setEast__minSize(value: Double): Self = StObject.set(x, "east__minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__minSizeUndefined: Self = StObject.set(x, "east__minSize", js.undefined)
      
      @scala.inline
      def setEast__onclose(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "east__onclose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__oncloseFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "east__onclose", js.Any.fromFunction5(value))
      
      @scala.inline
      def setEast__oncloseUndefined: Self = StObject.set(x, "east__onclose", js.undefined)
      
      @scala.inline
      def setEast__onclose_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "east__onclose_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__onclose_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "east__onclose_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setEast__onclose_endUndefined: Self = StObject.set(x, "east__onclose_end", js.undefined)
      
      @scala.inline
      def setEast__onclose_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "east__onclose_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__onclose_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "east__onclose_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setEast__onclose_startUndefined: Self = StObject.set(x, "east__onclose_start", js.undefined)
      
      @scala.inline
      def setEast__onhide(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "east__onhide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__onhideFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "east__onhide", js.Any.fromFunction5(value))
      
      @scala.inline
      def setEast__onhideUndefined: Self = StObject.set(x, "east__onhide", js.undefined)
      
      @scala.inline
      def setEast__onhide_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "east__onhide_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__onhide_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "east__onhide_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setEast__onhide_endUndefined: Self = StObject.set(x, "east__onhide_end", js.undefined)
      
      @scala.inline
      def setEast__onhide_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "east__onhide_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__onhide_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "east__onhide_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setEast__onhide_startUndefined: Self = StObject.set(x, "east__onhide_start", js.undefined)
      
      @scala.inline
      def setEast__onopen(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "east__onopen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__onopenFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "east__onopen", js.Any.fromFunction5(value))
      
      @scala.inline
      def setEast__onopenUndefined: Self = StObject.set(x, "east__onopen", js.undefined)
      
      @scala.inline
      def setEast__onopen_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "east__onopen_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__onopen_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "east__onopen_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setEast__onopen_endUndefined: Self = StObject.set(x, "east__onopen_end", js.undefined)
      
      @scala.inline
      def setEast__onopen_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "east__onopen_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__onopen_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "east__onopen_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setEast__onopen_startUndefined: Self = StObject.set(x, "east__onopen_start", js.undefined)
      
      @scala.inline
      def setEast__onresize(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "east__onresize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__onresizeFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "east__onresize", js.Any.fromFunction5(value))
      
      @scala.inline
      def setEast__onresizeUndefined: Self = StObject.set(x, "east__onresize", js.undefined)
      
      @scala.inline
      def setEast__onresize_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "east__onresize_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__onresize_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "east__onresize_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setEast__onresize_endUndefined: Self = StObject.set(x, "east__onresize_end", js.undefined)
      
      @scala.inline
      def setEast__onresize_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "east__onresize_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__onresize_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "east__onresize_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setEast__onresize_startUndefined: Self = StObject.set(x, "east__onresize_start", js.undefined)
      
      @scala.inline
      def setEast__onshow(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "east__onshow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__onshowFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "east__onshow", js.Any.fromFunction5(value))
      
      @scala.inline
      def setEast__onshowUndefined: Self = StObject.set(x, "east__onshow", js.undefined)
      
      @scala.inline
      def setEast__onshow_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "east__onshow_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__onshow_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "east__onshow_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setEast__onshow_endUndefined: Self = StObject.set(x, "east__onshow_end", js.undefined)
      
      @scala.inline
      def setEast__onshow_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "east__onshow_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__onshow_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "east__onshow_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setEast__onshow_startUndefined: Self = StObject.set(x, "east__onshow_start", js.undefined)
      
      @scala.inline
      def setEast__paneClass(value: String): Self = StObject.set(x, "east__paneClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__paneClassUndefined: Self = StObject.set(x, "east__paneClass", js.undefined)
      
      @scala.inline
      def setEast__paneSelector(value: String): Self = StObject.set(x, "east__paneSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__paneSelectorUndefined: Self = StObject.set(x, "east__paneSelector", js.undefined)
      
      @scala.inline
      def setEast__resizable(value: Boolean): Self = StObject.set(x, "east__resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__resizableUndefined: Self = StObject.set(x, "east__resizable", js.undefined)
      
      @scala.inline
      def setEast__resizerClass(value: String): Self = StObject.set(x, "east__resizerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__resizerClassUndefined: Self = StObject.set(x, "east__resizerClass", js.undefined)
      
      @scala.inline
      def setEast__resizerCursor(value: String): Self = StObject.set(x, "east__resizerCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__resizerCursorUndefined: Self = StObject.set(x, "east__resizerCursor", js.undefined)
      
      @scala.inline
      def setEast__resizerDragOpacity(value: Double): Self = StObject.set(x, "east__resizerDragOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__resizerDragOpacityUndefined: Self = StObject.set(x, "east__resizerDragOpacity", js.undefined)
      
      @scala.inline
      def setEast__resizerTip(value: String): Self = StObject.set(x, "east__resizerTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__resizerTipUndefined: Self = StObject.set(x, "east__resizerTip", js.undefined)
      
      @scala.inline
      def setEast__scrollToBookmarkOnLoad(value: Boolean): Self = StObject.set(x, "east__scrollToBookmarkOnLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__scrollToBookmarkOnLoadUndefined: Self = StObject.set(x, "east__scrollToBookmarkOnLoad", js.undefined)
      
      @scala.inline
      def setEast__showOverflowOnHover(value: Boolean): Self = StObject.set(x, "east__showOverflowOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__showOverflowOnHoverUndefined: Self = StObject.set(x, "east__showOverflowOnHover", js.undefined)
      
      @scala.inline
      def setEast__size(value: String | Double): Self = StObject.set(x, "east__size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__sizeUndefined: Self = StObject.set(x, "east__size", js.undefined)
      
      @scala.inline
      def setEast__slidable(value: Boolean): Self = StObject.set(x, "east__slidable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__slidableUndefined: Self = StObject.set(x, "east__slidable", js.undefined)
      
      @scala.inline
      def setEast__slideTrigger_close(value: String): Self = StObject.set(x, "east__slideTrigger_close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__slideTrigger_closeUndefined: Self = StObject.set(x, "east__slideTrigger_close", js.undefined)
      
      @scala.inline
      def setEast__slideTrigger_open(value: String): Self = StObject.set(x, "east__slideTrigger_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__slideTrigger_openUndefined: Self = StObject.set(x, "east__slideTrigger_open", js.undefined)
      
      @scala.inline
      def setEast__sliderCursor(value: String): Self = StObject.set(x, "east__sliderCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__sliderCursorUndefined: Self = StObject.set(x, "east__sliderCursor", js.undefined)
      
      @scala.inline
      def setEast__sliderTip(value: String): Self = StObject.set(x, "east__sliderTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__sliderTipUndefined: Self = StObject.set(x, "east__sliderTip", js.undefined)
      
      @scala.inline
      def setEast__spacing_closed(value: Double): Self = StObject.set(x, "east__spacing_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__spacing_closedUndefined: Self = StObject.set(x, "east__spacing_closed", js.undefined)
      
      @scala.inline
      def setEast__spacing_open(value: Double): Self = StObject.set(x, "east__spacing_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__spacing_openUndefined: Self = StObject.set(x, "east__spacing_open", js.undefined)
      
      @scala.inline
      def setEast__togglerAlign_closed(value: String | Double): Self = StObject.set(x, "east__togglerAlign_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__togglerAlign_closedUndefined: Self = StObject.set(x, "east__togglerAlign_closed", js.undefined)
      
      @scala.inline
      def setEast__togglerAlign_open(value: String | Double): Self = StObject.set(x, "east__togglerAlign_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__togglerAlign_openUndefined: Self = StObject.set(x, "east__togglerAlign_open", js.undefined)
      
      @scala.inline
      def setEast__togglerClass(value: String): Self = StObject.set(x, "east__togglerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__togglerClassUndefined: Self = StObject.set(x, "east__togglerClass", js.undefined)
      
      @scala.inline
      def setEast__togglerContent_closed(value: String): Self = StObject.set(x, "east__togglerContent_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__togglerContent_closedUndefined: Self = StObject.set(x, "east__togglerContent_closed", js.undefined)
      
      @scala.inline
      def setEast__togglerContent_open(value: String): Self = StObject.set(x, "east__togglerContent_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__togglerContent_openUndefined: Self = StObject.set(x, "east__togglerContent_open", js.undefined)
      
      @scala.inline
      def setEast__togglerLength_closed(value: Double | String): Self = StObject.set(x, "east__togglerLength_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__togglerLength_closedUndefined: Self = StObject.set(x, "east__togglerLength_closed", js.undefined)
      
      @scala.inline
      def setEast__togglerLength_open(value: Double | String): Self = StObject.set(x, "east__togglerLength_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__togglerLength_openUndefined: Self = StObject.set(x, "east__togglerLength_open", js.undefined)
      
      @scala.inline
      def setEast__togglerTip_closed(value: String): Self = StObject.set(x, "east__togglerTip_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__togglerTip_closedUndefined: Self = StObject.set(x, "east__togglerTip_closed", js.undefined)
      
      @scala.inline
      def setEast__togglerTip_open(value: String): Self = StObject.set(x, "east__togglerTip_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEast__togglerTip_openUndefined: Self = StObject.set(x, "east__togglerTip_open", js.undefined)
      
      @scala.inline
      def setNorth(value: PaneOptions): Self = StObject.set(x, "north", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorthUndefined: Self = StObject.set(x, "north", js.undefined)
      
      @scala.inline
      def setNorth__applyDefaultStyles(value: Boolean): Self = StObject.set(x, "north__applyDefaultStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__applyDefaultStylesUndefined: Self = StObject.set(x, "north__applyDefaultStyles", js.undefined)
      
      @scala.inline
      def setNorth__buttonClass(value: String): Self = StObject.set(x, "north__buttonClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__buttonClassUndefined: Self = StObject.set(x, "north__buttonClass", js.undefined)
      
      @scala.inline
      def setNorth__closable(value: Boolean): Self = StObject.set(x, "north__closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__closableUndefined: Self = StObject.set(x, "north__closable", js.undefined)
      
      @scala.inline
      def setNorth__contentIgnoreSelector(value: String): Self = StObject.set(x, "north__contentIgnoreSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__contentIgnoreSelectorUndefined: Self = StObject.set(x, "north__contentIgnoreSelector", js.undefined)
      
      @scala.inline
      def setNorth__contentSelector(value: String): Self = StObject.set(x, "north__contentSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__contentSelectorUndefined: Self = StObject.set(x, "north__contentSelector", js.undefined)
      
      @scala.inline
      def setNorth__customHotkey(value: String | Double): Self = StObject.set(x, "north__customHotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__customHotkeyModifier(value: String): Self = StObject.set(x, "north__customHotkeyModifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__customHotkeyModifierUndefined: Self = StObject.set(x, "north__customHotkeyModifier", js.undefined)
      
      @scala.inline
      def setNorth__customHotkeyUndefined: Self = StObject.set(x, "north__customHotkey", js.undefined)
      
      @scala.inline
      def setNorth__enableCursorHotkey(value: Boolean): Self = StObject.set(x, "north__enableCursorHotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__enableCursorHotkeyUndefined: Self = StObject.set(x, "north__enableCursorHotkey", js.undefined)
      
      @scala.inline
      def setNorth__fxName(value: String): Self = StObject.set(x, "north__fxName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__fxNameUndefined: Self = StObject.set(x, "north__fxName", js.undefined)
      
      @scala.inline
      def setNorth__fxSettings(value: JQueryAnimationOptions): Self = StObject.set(x, "north__fxSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__fxSettingsUndefined: Self = StObject.set(x, "north__fxSettings", js.undefined)
      
      @scala.inline
      def setNorth__fxSpeed(value: String | Double): Self = StObject.set(x, "north__fxSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__fxSpeedUndefined: Self = StObject.set(x, "north__fxSpeed", js.undefined)
      
      @scala.inline
      def setNorth__hideTogglerOnSlide(value: Boolean): Self = StObject.set(x, "north__hideTogglerOnSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__hideTogglerOnSlideUndefined: Self = StObject.set(x, "north__hideTogglerOnSlide", js.undefined)
      
      @scala.inline
      def setNorth__initClosed(value: Boolean): Self = StObject.set(x, "north__initClosed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__initClosedUndefined: Self = StObject.set(x, "north__initClosed", js.undefined)
      
      @scala.inline
      def setNorth__initHidden(value: Boolean): Self = StObject.set(x, "north__initHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__initHiddenUndefined: Self = StObject.set(x, "north__initHidden", js.undefined)
      
      @scala.inline
      def setNorth__maskIframesOnResize(value: Boolean | String): Self = StObject.set(x, "north__maskIframesOnResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__maskIframesOnResizeUndefined: Self = StObject.set(x, "north__maskIframesOnResize", js.undefined)
      
      @scala.inline
      def setNorth__maxSize(value: Double): Self = StObject.set(x, "north__maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__maxSizeUndefined: Self = StObject.set(x, "north__maxSize", js.undefined)
      
      @scala.inline
      def setNorth__minSize(value: Double): Self = StObject.set(x, "north__minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__minSizeUndefined: Self = StObject.set(x, "north__minSize", js.undefined)
      
      @scala.inline
      def setNorth__onclose(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "north__onclose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__oncloseFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "north__onclose", js.Any.fromFunction5(value))
      
      @scala.inline
      def setNorth__oncloseUndefined: Self = StObject.set(x, "north__onclose", js.undefined)
      
      @scala.inline
      def setNorth__onclose_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "north__onclose_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__onclose_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "north__onclose_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setNorth__onclose_endUndefined: Self = StObject.set(x, "north__onclose_end", js.undefined)
      
      @scala.inline
      def setNorth__onclose_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "north__onclose_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__onclose_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "north__onclose_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setNorth__onclose_startUndefined: Self = StObject.set(x, "north__onclose_start", js.undefined)
      
      @scala.inline
      def setNorth__onhide(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "north__onhide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__onhideFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "north__onhide", js.Any.fromFunction5(value))
      
      @scala.inline
      def setNorth__onhideUndefined: Self = StObject.set(x, "north__onhide", js.undefined)
      
      @scala.inline
      def setNorth__onhide_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "north__onhide_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__onhide_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "north__onhide_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setNorth__onhide_endUndefined: Self = StObject.set(x, "north__onhide_end", js.undefined)
      
      @scala.inline
      def setNorth__onhide_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "north__onhide_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__onhide_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "north__onhide_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setNorth__onhide_startUndefined: Self = StObject.set(x, "north__onhide_start", js.undefined)
      
      @scala.inline
      def setNorth__onopen(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "north__onopen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__onopenFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "north__onopen", js.Any.fromFunction5(value))
      
      @scala.inline
      def setNorth__onopenUndefined: Self = StObject.set(x, "north__onopen", js.undefined)
      
      @scala.inline
      def setNorth__onopen_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "north__onopen_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__onopen_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "north__onopen_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setNorth__onopen_endUndefined: Self = StObject.set(x, "north__onopen_end", js.undefined)
      
      @scala.inline
      def setNorth__onopen_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "north__onopen_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__onopen_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "north__onopen_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setNorth__onopen_startUndefined: Self = StObject.set(x, "north__onopen_start", js.undefined)
      
      @scala.inline
      def setNorth__onresize(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "north__onresize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__onresizeFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "north__onresize", js.Any.fromFunction5(value))
      
      @scala.inline
      def setNorth__onresizeUndefined: Self = StObject.set(x, "north__onresize", js.undefined)
      
      @scala.inline
      def setNorth__onresize_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "north__onresize_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__onresize_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "north__onresize_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setNorth__onresize_endUndefined: Self = StObject.set(x, "north__onresize_end", js.undefined)
      
      @scala.inline
      def setNorth__onresize_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "north__onresize_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__onresize_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "north__onresize_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setNorth__onresize_startUndefined: Self = StObject.set(x, "north__onresize_start", js.undefined)
      
      @scala.inline
      def setNorth__onshow(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "north__onshow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__onshowFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "north__onshow", js.Any.fromFunction5(value))
      
      @scala.inline
      def setNorth__onshowUndefined: Self = StObject.set(x, "north__onshow", js.undefined)
      
      @scala.inline
      def setNorth__onshow_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "north__onshow_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__onshow_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "north__onshow_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setNorth__onshow_endUndefined: Self = StObject.set(x, "north__onshow_end", js.undefined)
      
      @scala.inline
      def setNorth__onshow_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "north__onshow_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__onshow_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "north__onshow_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setNorth__onshow_startUndefined: Self = StObject.set(x, "north__onshow_start", js.undefined)
      
      @scala.inline
      def setNorth__paneClass(value: String): Self = StObject.set(x, "north__paneClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__paneClassUndefined: Self = StObject.set(x, "north__paneClass", js.undefined)
      
      @scala.inline
      def setNorth__paneSelector(value: String): Self = StObject.set(x, "north__paneSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__paneSelectorUndefined: Self = StObject.set(x, "north__paneSelector", js.undefined)
      
      @scala.inline
      def setNorth__resizable(value: Boolean): Self = StObject.set(x, "north__resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__resizableUndefined: Self = StObject.set(x, "north__resizable", js.undefined)
      
      @scala.inline
      def setNorth__resizerClass(value: String): Self = StObject.set(x, "north__resizerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__resizerClassUndefined: Self = StObject.set(x, "north__resizerClass", js.undefined)
      
      @scala.inline
      def setNorth__resizerCursor(value: String): Self = StObject.set(x, "north__resizerCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__resizerCursorUndefined: Self = StObject.set(x, "north__resizerCursor", js.undefined)
      
      @scala.inline
      def setNorth__resizerDragOpacity(value: Double): Self = StObject.set(x, "north__resizerDragOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__resizerDragOpacityUndefined: Self = StObject.set(x, "north__resizerDragOpacity", js.undefined)
      
      @scala.inline
      def setNorth__resizerTip(value: String): Self = StObject.set(x, "north__resizerTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__resizerTipUndefined: Self = StObject.set(x, "north__resizerTip", js.undefined)
      
      @scala.inline
      def setNorth__scrollToBookmarkOnLoad(value: Boolean): Self = StObject.set(x, "north__scrollToBookmarkOnLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__scrollToBookmarkOnLoadUndefined: Self = StObject.set(x, "north__scrollToBookmarkOnLoad", js.undefined)
      
      @scala.inline
      def setNorth__showOverflowOnHover(value: Boolean): Self = StObject.set(x, "north__showOverflowOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__showOverflowOnHoverUndefined: Self = StObject.set(x, "north__showOverflowOnHover", js.undefined)
      
      @scala.inline
      def setNorth__size(value: String | Double): Self = StObject.set(x, "north__size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__sizeUndefined: Self = StObject.set(x, "north__size", js.undefined)
      
      @scala.inline
      def setNorth__slidable(value: Boolean): Self = StObject.set(x, "north__slidable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__slidableUndefined: Self = StObject.set(x, "north__slidable", js.undefined)
      
      @scala.inline
      def setNorth__slideTrigger_close(value: String): Self = StObject.set(x, "north__slideTrigger_close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__slideTrigger_closeUndefined: Self = StObject.set(x, "north__slideTrigger_close", js.undefined)
      
      @scala.inline
      def setNorth__slideTrigger_open(value: String): Self = StObject.set(x, "north__slideTrigger_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__slideTrigger_openUndefined: Self = StObject.set(x, "north__slideTrigger_open", js.undefined)
      
      @scala.inline
      def setNorth__sliderCursor(value: String): Self = StObject.set(x, "north__sliderCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__sliderCursorUndefined: Self = StObject.set(x, "north__sliderCursor", js.undefined)
      
      @scala.inline
      def setNorth__sliderTip(value: String): Self = StObject.set(x, "north__sliderTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__sliderTipUndefined: Self = StObject.set(x, "north__sliderTip", js.undefined)
      
      @scala.inline
      def setNorth__spacing_closed(value: Double): Self = StObject.set(x, "north__spacing_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__spacing_closedUndefined: Self = StObject.set(x, "north__spacing_closed", js.undefined)
      
      @scala.inline
      def setNorth__spacing_open(value: Double): Self = StObject.set(x, "north__spacing_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__spacing_openUndefined: Self = StObject.set(x, "north__spacing_open", js.undefined)
      
      @scala.inline
      def setNorth__togglerAlign_closed(value: String | Double): Self = StObject.set(x, "north__togglerAlign_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__togglerAlign_closedUndefined: Self = StObject.set(x, "north__togglerAlign_closed", js.undefined)
      
      @scala.inline
      def setNorth__togglerAlign_open(value: String | Double): Self = StObject.set(x, "north__togglerAlign_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__togglerAlign_openUndefined: Self = StObject.set(x, "north__togglerAlign_open", js.undefined)
      
      @scala.inline
      def setNorth__togglerClass(value: String): Self = StObject.set(x, "north__togglerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__togglerClassUndefined: Self = StObject.set(x, "north__togglerClass", js.undefined)
      
      @scala.inline
      def setNorth__togglerContent_closed(value: String): Self = StObject.set(x, "north__togglerContent_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__togglerContent_closedUndefined: Self = StObject.set(x, "north__togglerContent_closed", js.undefined)
      
      @scala.inline
      def setNorth__togglerContent_open(value: String): Self = StObject.set(x, "north__togglerContent_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__togglerContent_openUndefined: Self = StObject.set(x, "north__togglerContent_open", js.undefined)
      
      @scala.inline
      def setNorth__togglerLength_closed(value: Double | String): Self = StObject.set(x, "north__togglerLength_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__togglerLength_closedUndefined: Self = StObject.set(x, "north__togglerLength_closed", js.undefined)
      
      @scala.inline
      def setNorth__togglerLength_open(value: Double | String): Self = StObject.set(x, "north__togglerLength_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__togglerLength_openUndefined: Self = StObject.set(x, "north__togglerLength_open", js.undefined)
      
      @scala.inline
      def setNorth__togglerTip_closed(value: String): Self = StObject.set(x, "north__togglerTip_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__togglerTip_closedUndefined: Self = StObject.set(x, "north__togglerTip_closed", js.undefined)
      
      @scala.inline
      def setNorth__togglerTip_open(value: String): Self = StObject.set(x, "north__togglerTip_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth__togglerTip_openUndefined: Self = StObject.set(x, "north__togglerTip_open", js.undefined)
      
      @scala.inline
      def setSouth(value: PaneOptions): Self = StObject.set(x, "south", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouthUndefined: Self = StObject.set(x, "south", js.undefined)
      
      @scala.inline
      def setSouth__applyDefaultStyles(value: Boolean): Self = StObject.set(x, "south__applyDefaultStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__applyDefaultStylesUndefined: Self = StObject.set(x, "south__applyDefaultStyles", js.undefined)
      
      @scala.inline
      def setSouth__buttonClass(value: String): Self = StObject.set(x, "south__buttonClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__buttonClassUndefined: Self = StObject.set(x, "south__buttonClass", js.undefined)
      
      @scala.inline
      def setSouth__closable(value: Boolean): Self = StObject.set(x, "south__closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__closableUndefined: Self = StObject.set(x, "south__closable", js.undefined)
      
      @scala.inline
      def setSouth__contentIgnoreSelector(value: String): Self = StObject.set(x, "south__contentIgnoreSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__contentIgnoreSelectorUndefined: Self = StObject.set(x, "south__contentIgnoreSelector", js.undefined)
      
      @scala.inline
      def setSouth__contentSelector(value: String): Self = StObject.set(x, "south__contentSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__contentSelectorUndefined: Self = StObject.set(x, "south__contentSelector", js.undefined)
      
      @scala.inline
      def setSouth__customHotkey(value: String | Double): Self = StObject.set(x, "south__customHotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__customHotkeyModifier(value: String): Self = StObject.set(x, "south__customHotkeyModifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__customHotkeyModifierUndefined: Self = StObject.set(x, "south__customHotkeyModifier", js.undefined)
      
      @scala.inline
      def setSouth__customHotkeyUndefined: Self = StObject.set(x, "south__customHotkey", js.undefined)
      
      @scala.inline
      def setSouth__enableCursorHotkey(value: Boolean): Self = StObject.set(x, "south__enableCursorHotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__enableCursorHotkeyUndefined: Self = StObject.set(x, "south__enableCursorHotkey", js.undefined)
      
      @scala.inline
      def setSouth__fxName(value: String): Self = StObject.set(x, "south__fxName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__fxNameUndefined: Self = StObject.set(x, "south__fxName", js.undefined)
      
      @scala.inline
      def setSouth__fxSettings(value: JQueryAnimationOptions): Self = StObject.set(x, "south__fxSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__fxSettingsUndefined: Self = StObject.set(x, "south__fxSettings", js.undefined)
      
      @scala.inline
      def setSouth__fxSpeed(value: String | Double): Self = StObject.set(x, "south__fxSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__fxSpeedUndefined: Self = StObject.set(x, "south__fxSpeed", js.undefined)
      
      @scala.inline
      def setSouth__hideTogglerOnSlide(value: Boolean): Self = StObject.set(x, "south__hideTogglerOnSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__hideTogglerOnSlideUndefined: Self = StObject.set(x, "south__hideTogglerOnSlide", js.undefined)
      
      @scala.inline
      def setSouth__initClosed(value: Boolean): Self = StObject.set(x, "south__initClosed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__initClosedUndefined: Self = StObject.set(x, "south__initClosed", js.undefined)
      
      @scala.inline
      def setSouth__initHidden(value: Boolean): Self = StObject.set(x, "south__initHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__initHiddenUndefined: Self = StObject.set(x, "south__initHidden", js.undefined)
      
      @scala.inline
      def setSouth__maskIframesOnResize(value: Boolean | String): Self = StObject.set(x, "south__maskIframesOnResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__maskIframesOnResizeUndefined: Self = StObject.set(x, "south__maskIframesOnResize", js.undefined)
      
      @scala.inline
      def setSouth__maxSize(value: Double): Self = StObject.set(x, "south__maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__maxSizeUndefined: Self = StObject.set(x, "south__maxSize", js.undefined)
      
      @scala.inline
      def setSouth__minSize(value: Double): Self = StObject.set(x, "south__minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__minSizeUndefined: Self = StObject.set(x, "south__minSize", js.undefined)
      
      @scala.inline
      def setSouth__onclose(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "south__onclose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__oncloseFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "south__onclose", js.Any.fromFunction5(value))
      
      @scala.inline
      def setSouth__oncloseUndefined: Self = StObject.set(x, "south__onclose", js.undefined)
      
      @scala.inline
      def setSouth__onclose_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "south__onclose_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__onclose_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "south__onclose_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setSouth__onclose_endUndefined: Self = StObject.set(x, "south__onclose_end", js.undefined)
      
      @scala.inline
      def setSouth__onclose_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "south__onclose_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__onclose_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "south__onclose_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setSouth__onclose_startUndefined: Self = StObject.set(x, "south__onclose_start", js.undefined)
      
      @scala.inline
      def setSouth__onhide(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "south__onhide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__onhideFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "south__onhide", js.Any.fromFunction5(value))
      
      @scala.inline
      def setSouth__onhideUndefined: Self = StObject.set(x, "south__onhide", js.undefined)
      
      @scala.inline
      def setSouth__onhide_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "south__onhide_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__onhide_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "south__onhide_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setSouth__onhide_endUndefined: Self = StObject.set(x, "south__onhide_end", js.undefined)
      
      @scala.inline
      def setSouth__onhide_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "south__onhide_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__onhide_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "south__onhide_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setSouth__onhide_startUndefined: Self = StObject.set(x, "south__onhide_start", js.undefined)
      
      @scala.inline
      def setSouth__onopen(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "south__onopen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__onopenFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "south__onopen", js.Any.fromFunction5(value))
      
      @scala.inline
      def setSouth__onopenUndefined: Self = StObject.set(x, "south__onopen", js.undefined)
      
      @scala.inline
      def setSouth__onopen_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "south__onopen_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__onopen_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "south__onopen_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setSouth__onopen_endUndefined: Self = StObject.set(x, "south__onopen_end", js.undefined)
      
      @scala.inline
      def setSouth__onopen_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "south__onopen_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__onopen_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "south__onopen_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setSouth__onopen_startUndefined: Self = StObject.set(x, "south__onopen_start", js.undefined)
      
      @scala.inline
      def setSouth__onresize(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "south__onresize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__onresizeFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "south__onresize", js.Any.fromFunction5(value))
      
      @scala.inline
      def setSouth__onresizeUndefined: Self = StObject.set(x, "south__onresize", js.undefined)
      
      @scala.inline
      def setSouth__onresize_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "south__onresize_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__onresize_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "south__onresize_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setSouth__onresize_endUndefined: Self = StObject.set(x, "south__onresize_end", js.undefined)
      
      @scala.inline
      def setSouth__onresize_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "south__onresize_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__onresize_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "south__onresize_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setSouth__onresize_startUndefined: Self = StObject.set(x, "south__onresize_start", js.undefined)
      
      @scala.inline
      def setSouth__onshow(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "south__onshow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__onshowFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "south__onshow", js.Any.fromFunction5(value))
      
      @scala.inline
      def setSouth__onshowUndefined: Self = StObject.set(x, "south__onshow", js.undefined)
      
      @scala.inline
      def setSouth__onshow_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "south__onshow_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__onshow_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "south__onshow_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setSouth__onshow_endUndefined: Self = StObject.set(x, "south__onshow_end", js.undefined)
      
      @scala.inline
      def setSouth__onshow_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "south__onshow_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__onshow_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "south__onshow_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setSouth__onshow_startUndefined: Self = StObject.set(x, "south__onshow_start", js.undefined)
      
      @scala.inline
      def setSouth__paneClass(value: String): Self = StObject.set(x, "south__paneClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__paneClassUndefined: Self = StObject.set(x, "south__paneClass", js.undefined)
      
      @scala.inline
      def setSouth__paneSelector(value: String): Self = StObject.set(x, "south__paneSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__paneSelectorUndefined: Self = StObject.set(x, "south__paneSelector", js.undefined)
      
      @scala.inline
      def setSouth__resizable(value: Boolean): Self = StObject.set(x, "south__resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__resizableUndefined: Self = StObject.set(x, "south__resizable", js.undefined)
      
      @scala.inline
      def setSouth__resizerClass(value: String): Self = StObject.set(x, "south__resizerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__resizerClassUndefined: Self = StObject.set(x, "south__resizerClass", js.undefined)
      
      @scala.inline
      def setSouth__resizerCursor(value: String): Self = StObject.set(x, "south__resizerCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__resizerCursorUndefined: Self = StObject.set(x, "south__resizerCursor", js.undefined)
      
      @scala.inline
      def setSouth__resizerDragOpacity(value: Double): Self = StObject.set(x, "south__resizerDragOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__resizerDragOpacityUndefined: Self = StObject.set(x, "south__resizerDragOpacity", js.undefined)
      
      @scala.inline
      def setSouth__resizerTip(value: String): Self = StObject.set(x, "south__resizerTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__resizerTipUndefined: Self = StObject.set(x, "south__resizerTip", js.undefined)
      
      @scala.inline
      def setSouth__scrollToBookmarkOnLoad(value: Boolean): Self = StObject.set(x, "south__scrollToBookmarkOnLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__scrollToBookmarkOnLoadUndefined: Self = StObject.set(x, "south__scrollToBookmarkOnLoad", js.undefined)
      
      @scala.inline
      def setSouth__showOverflowOnHover(value: Boolean): Self = StObject.set(x, "south__showOverflowOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__showOverflowOnHoverUndefined: Self = StObject.set(x, "south__showOverflowOnHover", js.undefined)
      
      @scala.inline
      def setSouth__size(value: String | Double): Self = StObject.set(x, "south__size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__sizeUndefined: Self = StObject.set(x, "south__size", js.undefined)
      
      @scala.inline
      def setSouth__slidable(value: Boolean): Self = StObject.set(x, "south__slidable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__slidableUndefined: Self = StObject.set(x, "south__slidable", js.undefined)
      
      @scala.inline
      def setSouth__slideTrigger_close(value: String): Self = StObject.set(x, "south__slideTrigger_close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__slideTrigger_closeUndefined: Self = StObject.set(x, "south__slideTrigger_close", js.undefined)
      
      @scala.inline
      def setSouth__slideTrigger_open(value: String): Self = StObject.set(x, "south__slideTrigger_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__slideTrigger_openUndefined: Self = StObject.set(x, "south__slideTrigger_open", js.undefined)
      
      @scala.inline
      def setSouth__sliderCursor(value: String): Self = StObject.set(x, "south__sliderCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__sliderCursorUndefined: Self = StObject.set(x, "south__sliderCursor", js.undefined)
      
      @scala.inline
      def setSouth__sliderTip(value: String): Self = StObject.set(x, "south__sliderTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__sliderTipUndefined: Self = StObject.set(x, "south__sliderTip", js.undefined)
      
      @scala.inline
      def setSouth__spacing_closed(value: Double): Self = StObject.set(x, "south__spacing_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__spacing_closedUndefined: Self = StObject.set(x, "south__spacing_closed", js.undefined)
      
      @scala.inline
      def setSouth__spacing_open(value: Double): Self = StObject.set(x, "south__spacing_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__spacing_openUndefined: Self = StObject.set(x, "south__spacing_open", js.undefined)
      
      @scala.inline
      def setSouth__togglerAlign_closed(value: String | Double): Self = StObject.set(x, "south__togglerAlign_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__togglerAlign_closedUndefined: Self = StObject.set(x, "south__togglerAlign_closed", js.undefined)
      
      @scala.inline
      def setSouth__togglerAlign_open(value: String | Double): Self = StObject.set(x, "south__togglerAlign_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__togglerAlign_openUndefined: Self = StObject.set(x, "south__togglerAlign_open", js.undefined)
      
      @scala.inline
      def setSouth__togglerClass(value: String): Self = StObject.set(x, "south__togglerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__togglerClassUndefined: Self = StObject.set(x, "south__togglerClass", js.undefined)
      
      @scala.inline
      def setSouth__togglerContent_closed(value: String): Self = StObject.set(x, "south__togglerContent_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__togglerContent_closedUndefined: Self = StObject.set(x, "south__togglerContent_closed", js.undefined)
      
      @scala.inline
      def setSouth__togglerContent_open(value: String): Self = StObject.set(x, "south__togglerContent_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__togglerContent_openUndefined: Self = StObject.set(x, "south__togglerContent_open", js.undefined)
      
      @scala.inline
      def setSouth__togglerLength_closed(value: Double | String): Self = StObject.set(x, "south__togglerLength_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__togglerLength_closedUndefined: Self = StObject.set(x, "south__togglerLength_closed", js.undefined)
      
      @scala.inline
      def setSouth__togglerLength_open(value: Double | String): Self = StObject.set(x, "south__togglerLength_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__togglerLength_openUndefined: Self = StObject.set(x, "south__togglerLength_open", js.undefined)
      
      @scala.inline
      def setSouth__togglerTip_closed(value: String): Self = StObject.set(x, "south__togglerTip_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__togglerTip_closedUndefined: Self = StObject.set(x, "south__togglerTip_closed", js.undefined)
      
      @scala.inline
      def setSouth__togglerTip_open(value: String): Self = StObject.set(x, "south__togglerTip_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth__togglerTip_openUndefined: Self = StObject.set(x, "south__togglerTip_open", js.undefined)
      
      @scala.inline
      def setWest(value: PaneOptions): Self = StObject.set(x, "west", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWestUndefined: Self = StObject.set(x, "west", js.undefined)
      
      @scala.inline
      def setWest__applyDefaultStyles(value: Boolean): Self = StObject.set(x, "west__applyDefaultStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__applyDefaultStylesUndefined: Self = StObject.set(x, "west__applyDefaultStyles", js.undefined)
      
      @scala.inline
      def setWest__buttonClass(value: String): Self = StObject.set(x, "west__buttonClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__buttonClassUndefined: Self = StObject.set(x, "west__buttonClass", js.undefined)
      
      @scala.inline
      def setWest__closable(value: Boolean): Self = StObject.set(x, "west__closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__closableUndefined: Self = StObject.set(x, "west__closable", js.undefined)
      
      @scala.inline
      def setWest__contentIgnoreSelector(value: String): Self = StObject.set(x, "west__contentIgnoreSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__contentIgnoreSelectorUndefined: Self = StObject.set(x, "west__contentIgnoreSelector", js.undefined)
      
      @scala.inline
      def setWest__contentSelector(value: String): Self = StObject.set(x, "west__contentSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__contentSelectorUndefined: Self = StObject.set(x, "west__contentSelector", js.undefined)
      
      @scala.inline
      def setWest__customHotkey(value: String | Double): Self = StObject.set(x, "west__customHotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__customHotkeyModifier(value: String): Self = StObject.set(x, "west__customHotkeyModifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__customHotkeyModifierUndefined: Self = StObject.set(x, "west__customHotkeyModifier", js.undefined)
      
      @scala.inline
      def setWest__customHotkeyUndefined: Self = StObject.set(x, "west__customHotkey", js.undefined)
      
      @scala.inline
      def setWest__enableCursorHotkey(value: Boolean): Self = StObject.set(x, "west__enableCursorHotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__enableCursorHotkeyUndefined: Self = StObject.set(x, "west__enableCursorHotkey", js.undefined)
      
      @scala.inline
      def setWest__fxName(value: String): Self = StObject.set(x, "west__fxName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__fxNameUndefined: Self = StObject.set(x, "west__fxName", js.undefined)
      
      @scala.inline
      def setWest__fxSettings(value: JQueryAnimationOptions): Self = StObject.set(x, "west__fxSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__fxSettingsUndefined: Self = StObject.set(x, "west__fxSettings", js.undefined)
      
      @scala.inline
      def setWest__fxSpeed(value: String | Double): Self = StObject.set(x, "west__fxSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__fxSpeedUndefined: Self = StObject.set(x, "west__fxSpeed", js.undefined)
      
      @scala.inline
      def setWest__hideTogglerOnSlide(value: Boolean): Self = StObject.set(x, "west__hideTogglerOnSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__hideTogglerOnSlideUndefined: Self = StObject.set(x, "west__hideTogglerOnSlide", js.undefined)
      
      @scala.inline
      def setWest__initClosed(value: Boolean): Self = StObject.set(x, "west__initClosed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__initClosedUndefined: Self = StObject.set(x, "west__initClosed", js.undefined)
      
      @scala.inline
      def setWest__initHidden(value: Boolean): Self = StObject.set(x, "west__initHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__initHiddenUndefined: Self = StObject.set(x, "west__initHidden", js.undefined)
      
      @scala.inline
      def setWest__maskIframesOnResize(value: Boolean | String): Self = StObject.set(x, "west__maskIframesOnResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__maskIframesOnResizeUndefined: Self = StObject.set(x, "west__maskIframesOnResize", js.undefined)
      
      @scala.inline
      def setWest__maxSize(value: Double): Self = StObject.set(x, "west__maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__maxSizeUndefined: Self = StObject.set(x, "west__maxSize", js.undefined)
      
      @scala.inline
      def setWest__minSize(value: Double): Self = StObject.set(x, "west__minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__minSizeUndefined: Self = StObject.set(x, "west__minSize", js.undefined)
      
      @scala.inline
      def setWest__onclose(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "west__onclose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__oncloseFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "west__onclose", js.Any.fromFunction5(value))
      
      @scala.inline
      def setWest__oncloseUndefined: Self = StObject.set(x, "west__onclose", js.undefined)
      
      @scala.inline
      def setWest__onclose_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "west__onclose_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__onclose_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "west__onclose_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setWest__onclose_endUndefined: Self = StObject.set(x, "west__onclose_end", js.undefined)
      
      @scala.inline
      def setWest__onclose_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "west__onclose_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__onclose_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "west__onclose_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setWest__onclose_startUndefined: Self = StObject.set(x, "west__onclose_start", js.undefined)
      
      @scala.inline
      def setWest__onhide(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "west__onhide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__onhideFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "west__onhide", js.Any.fromFunction5(value))
      
      @scala.inline
      def setWest__onhideUndefined: Self = StObject.set(x, "west__onhide", js.undefined)
      
      @scala.inline
      def setWest__onhide_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "west__onhide_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__onhide_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "west__onhide_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setWest__onhide_endUndefined: Self = StObject.set(x, "west__onhide_end", js.undefined)
      
      @scala.inline
      def setWest__onhide_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "west__onhide_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__onhide_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "west__onhide_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setWest__onhide_startUndefined: Self = StObject.set(x, "west__onhide_start", js.undefined)
      
      @scala.inline
      def setWest__onopen(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "west__onopen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__onopenFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "west__onopen", js.Any.fromFunction5(value))
      
      @scala.inline
      def setWest__onopenUndefined: Self = StObject.set(x, "west__onopen", js.undefined)
      
      @scala.inline
      def setWest__onopen_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "west__onopen_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__onopen_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "west__onopen_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setWest__onopen_endUndefined: Self = StObject.set(x, "west__onopen_end", js.undefined)
      
      @scala.inline
      def setWest__onopen_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "west__onopen_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__onopen_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "west__onopen_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setWest__onopen_startUndefined: Self = StObject.set(x, "west__onopen_start", js.undefined)
      
      @scala.inline
      def setWest__onresize(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "west__onresize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__onresizeFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "west__onresize", js.Any.fromFunction5(value))
      
      @scala.inline
      def setWest__onresizeUndefined: Self = StObject.set(x, "west__onresize", js.undefined)
      
      @scala.inline
      def setWest__onresize_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "west__onresize_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__onresize_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "west__onresize_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setWest__onresize_endUndefined: Self = StObject.set(x, "west__onresize_end", js.undefined)
      
      @scala.inline
      def setWest__onresize_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "west__onresize_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__onresize_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "west__onresize_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setWest__onresize_startUndefined: Self = StObject.set(x, "west__onresize_start", js.undefined)
      
      @scala.inline
      def setWest__onshow(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "west__onshow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__onshowFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "west__onshow", js.Any.fromFunction5(value))
      
      @scala.inline
      def setWest__onshowUndefined: Self = StObject.set(x, "west__onshow", js.undefined)
      
      @scala.inline
      def setWest__onshow_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "west__onshow_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__onshow_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "west__onshow_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setWest__onshow_endUndefined: Self = StObject.set(x, "west__onshow_end", js.undefined)
      
      @scala.inline
      def setWest__onshow_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              /* options */ PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "west__onshow_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__onshow_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, /* options */ PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "west__onshow_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setWest__onshow_startUndefined: Self = StObject.set(x, "west__onshow_start", js.undefined)
      
      @scala.inline
      def setWest__paneClass(value: String): Self = StObject.set(x, "west__paneClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__paneClassUndefined: Self = StObject.set(x, "west__paneClass", js.undefined)
      
      @scala.inline
      def setWest__paneSelector(value: String): Self = StObject.set(x, "west__paneSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__paneSelectorUndefined: Self = StObject.set(x, "west__paneSelector", js.undefined)
      
      @scala.inline
      def setWest__resizable(value: Boolean): Self = StObject.set(x, "west__resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__resizableUndefined: Self = StObject.set(x, "west__resizable", js.undefined)
      
      @scala.inline
      def setWest__resizerClass(value: String): Self = StObject.set(x, "west__resizerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__resizerClassUndefined: Self = StObject.set(x, "west__resizerClass", js.undefined)
      
      @scala.inline
      def setWest__resizerCursor(value: String): Self = StObject.set(x, "west__resizerCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__resizerCursorUndefined: Self = StObject.set(x, "west__resizerCursor", js.undefined)
      
      @scala.inline
      def setWest__resizerDragOpacity(value: Double): Self = StObject.set(x, "west__resizerDragOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__resizerDragOpacityUndefined: Self = StObject.set(x, "west__resizerDragOpacity", js.undefined)
      
      @scala.inline
      def setWest__resizerTip(value: String): Self = StObject.set(x, "west__resizerTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__resizerTipUndefined: Self = StObject.set(x, "west__resizerTip", js.undefined)
      
      @scala.inline
      def setWest__scrollToBookmarkOnLoad(value: Boolean): Self = StObject.set(x, "west__scrollToBookmarkOnLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__scrollToBookmarkOnLoadUndefined: Self = StObject.set(x, "west__scrollToBookmarkOnLoad", js.undefined)
      
      @scala.inline
      def setWest__showOverflowOnHover(value: Boolean): Self = StObject.set(x, "west__showOverflowOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__showOverflowOnHoverUndefined: Self = StObject.set(x, "west__showOverflowOnHover", js.undefined)
      
      @scala.inline
      def setWest__size(value: String | Double): Self = StObject.set(x, "west__size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__sizeUndefined: Self = StObject.set(x, "west__size", js.undefined)
      
      @scala.inline
      def setWest__slidable(value: Boolean): Self = StObject.set(x, "west__slidable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__slidableUndefined: Self = StObject.set(x, "west__slidable", js.undefined)
      
      @scala.inline
      def setWest__slideTrigger_close(value: String): Self = StObject.set(x, "west__slideTrigger_close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__slideTrigger_closeUndefined: Self = StObject.set(x, "west__slideTrigger_close", js.undefined)
      
      @scala.inline
      def setWest__slideTrigger_open(value: String): Self = StObject.set(x, "west__slideTrigger_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__slideTrigger_openUndefined: Self = StObject.set(x, "west__slideTrigger_open", js.undefined)
      
      @scala.inline
      def setWest__sliderCursor(value: String): Self = StObject.set(x, "west__sliderCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__sliderCursorUndefined: Self = StObject.set(x, "west__sliderCursor", js.undefined)
      
      @scala.inline
      def setWest__sliderTip(value: String): Self = StObject.set(x, "west__sliderTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__sliderTipUndefined: Self = StObject.set(x, "west__sliderTip", js.undefined)
      
      @scala.inline
      def setWest__spacing_closed(value: Double): Self = StObject.set(x, "west__spacing_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__spacing_closedUndefined: Self = StObject.set(x, "west__spacing_closed", js.undefined)
      
      @scala.inline
      def setWest__spacing_open(value: Double): Self = StObject.set(x, "west__spacing_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__spacing_openUndefined: Self = StObject.set(x, "west__spacing_open", js.undefined)
      
      @scala.inline
      def setWest__togglerAlign_closed(value: String | Double): Self = StObject.set(x, "west__togglerAlign_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__togglerAlign_closedUndefined: Self = StObject.set(x, "west__togglerAlign_closed", js.undefined)
      
      @scala.inline
      def setWest__togglerAlign_open(value: String | Double): Self = StObject.set(x, "west__togglerAlign_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__togglerAlign_openUndefined: Self = StObject.set(x, "west__togglerAlign_open", js.undefined)
      
      @scala.inline
      def setWest__togglerClass(value: String): Self = StObject.set(x, "west__togglerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__togglerClassUndefined: Self = StObject.set(x, "west__togglerClass", js.undefined)
      
      @scala.inline
      def setWest__togglerContent_closed(value: String): Self = StObject.set(x, "west__togglerContent_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__togglerContent_closedUndefined: Self = StObject.set(x, "west__togglerContent_closed", js.undefined)
      
      @scala.inline
      def setWest__togglerContent_open(value: String): Self = StObject.set(x, "west__togglerContent_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__togglerContent_openUndefined: Self = StObject.set(x, "west__togglerContent_open", js.undefined)
      
      @scala.inline
      def setWest__togglerLength_closed(value: Double | String): Self = StObject.set(x, "west__togglerLength_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__togglerLength_closedUndefined: Self = StObject.set(x, "west__togglerLength_closed", js.undefined)
      
      @scala.inline
      def setWest__togglerLength_open(value: Double | String): Self = StObject.set(x, "west__togglerLength_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__togglerLength_openUndefined: Self = StObject.set(x, "west__togglerLength_open", js.undefined)
      
      @scala.inline
      def setWest__togglerTip_closed(value: String): Self = StObject.set(x, "west__togglerTip_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__togglerTip_closedUndefined: Self = StObject.set(x, "west__togglerTip_closed", js.undefined)
      
      @scala.inline
      def setWest__togglerTip_open(value: String): Self = StObject.set(x, "west__togglerTip_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest__togglerTip_openUndefined: Self = StObject.set(x, "west__togglerTip_open", js.undefined)
    }
  }
  
  @js.native
  trait PaneOptions extends StObject {
    
    var applyDefaultStyles: js.UndefOr[Boolean] = js.native
    
    var buttonClass: js.UndefOr[String] = js.native
    
    var closable: js.UndefOr[Boolean] = js.native
    
    var contentIgnoreSelector: js.UndefOr[String] = js.native
    
    var contentSelector: js.UndefOr[String] = js.native
    
    var customHotkey: js.UndefOr[String | Double] = js.native
    
    var customHotkeyModifier: js.UndefOr[String] = js.native
    
    var enableCursorHotkey: js.UndefOr[Boolean] = js.native
    
    var fxName: js.UndefOr[String] = js.native
    
    var fxSettings: js.UndefOr[JQueryAnimationOptions] = js.native
    
    var fxSpeed: js.UndefOr[String | Double] = js.native
    
    var hideTogglerOnSlide: js.UndefOr[Boolean] = js.native
    
    var initClosed: js.UndefOr[Boolean] = js.native
    
    var initHidden: js.UndefOr[Boolean] = js.native
    
    var maskIframesOnResize: js.UndefOr[Boolean | String] = js.native
    
    var maxSize: js.UndefOr[Double] = js.native
    
    var minSize: js.UndefOr[Double] = js.native
    
    var onclose: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ this.type, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var onclose_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ this.type, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var onclose_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ this.type, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var onhide: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ this.type, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var onhide_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ this.type, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var onhide_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ this.type, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var onopen: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ this.type, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var onopen_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ this.type, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var onopen_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ this.type, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var onresize: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ this.type, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var onresize_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ this.type, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var onresize_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ this.type, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var onshow: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ this.type, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var onshow_end: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ this.type, 
          /* layout_name */ String, 
          Unit
        ])
      ] = js.native
    
    var onshow_start: js.UndefOr[
        String | (js.Function5[
          /* name */ String, 
          /* pane */ JQuery, 
          /* state */ PaneState, 
          /* options */ this.type, 
          /* layout_name */ String, 
          Boolean | Unit
        ])
      ] = js.native
    
    var paneClass: js.UndefOr[String] = js.native
    
    var paneSelector: js.UndefOr[String] = js.native
    
    var resizable: js.UndefOr[Boolean] = js.native
    
    var resizerClass: js.UndefOr[String] = js.native
    
    var resizerCursor: js.UndefOr[String] = js.native
    
    var resizerDragOpacity: js.UndefOr[Double] = js.native
    
    var resizerTip: js.UndefOr[String] = js.native
    
    var scrollToBookmarkOnLoad: js.UndefOr[Boolean] = js.native
    
    var showOverflowOnHover: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[String | Double] = js.native
    
    var slidable: js.UndefOr[Boolean] = js.native
    
    var slideTrigger_close: js.UndefOr[String] = js.native
    
    var slideTrigger_open: js.UndefOr[String] = js.native
    
    var sliderCursor: js.UndefOr[String] = js.native
    
    var sliderTip: js.UndefOr[String] = js.native
    
    var spacing_closed: js.UndefOr[Double] = js.native
    
    var spacing_open: js.UndefOr[Double] = js.native
    
    var togglerAlign_closed: js.UndefOr[String | Double] = js.native
    
    var togglerAlign_open: js.UndefOr[String | Double] = js.native
    
    var togglerClass: js.UndefOr[String] = js.native
    
    var togglerContent_closed: js.UndefOr[String] = js.native
    
    var togglerContent_open: js.UndefOr[String] = js.native
    
    var togglerLength_closed: js.UndefOr[Double | String] = js.native
    
    var togglerLength_open: js.UndefOr[Double | String] = js.native
    
    var togglerTip_closed: js.UndefOr[String] = js.native
    
    var togglerTip_open: js.UndefOr[String] = js.native
  }
  object PaneOptions {
    
    @scala.inline
    def apply(): PaneOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaneOptions]
    }
    
    @scala.inline
    implicit class PaneOptionsMutableBuilder[Self <: PaneOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyDefaultStyles(value: Boolean): Self = StObject.set(x, "applyDefaultStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyDefaultStylesUndefined: Self = StObject.set(x, "applyDefaultStyles", js.undefined)
      
      @scala.inline
      def setButtonClass(value: String): Self = StObject.set(x, "buttonClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonClassUndefined: Self = StObject.set(x, "buttonClass", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setContentIgnoreSelector(value: String): Self = StObject.set(x, "contentIgnoreSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentIgnoreSelectorUndefined: Self = StObject.set(x, "contentIgnoreSelector", js.undefined)
      
      @scala.inline
      def setContentSelector(value: String): Self = StObject.set(x, "contentSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentSelectorUndefined: Self = StObject.set(x, "contentSelector", js.undefined)
      
      @scala.inline
      def setCustomHotkey(value: String | Double): Self = StObject.set(x, "customHotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHotkeyModifier(value: String): Self = StObject.set(x, "customHotkeyModifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHotkeyModifierUndefined: Self = StObject.set(x, "customHotkeyModifier", js.undefined)
      
      @scala.inline
      def setCustomHotkeyUndefined: Self = StObject.set(x, "customHotkey", js.undefined)
      
      @scala.inline
      def setEnableCursorHotkey(value: Boolean): Self = StObject.set(x, "enableCursorHotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCursorHotkeyUndefined: Self = StObject.set(x, "enableCursorHotkey", js.undefined)
      
      @scala.inline
      def setFxName(value: String): Self = StObject.set(x, "fxName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFxNameUndefined: Self = StObject.set(x, "fxName", js.undefined)
      
      @scala.inline
      def setFxSettings(value: JQueryAnimationOptions): Self = StObject.set(x, "fxSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFxSettingsUndefined: Self = StObject.set(x, "fxSettings", js.undefined)
      
      @scala.inline
      def setFxSpeed(value: String | Double): Self = StObject.set(x, "fxSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFxSpeedUndefined: Self = StObject.set(x, "fxSpeed", js.undefined)
      
      @scala.inline
      def setHideTogglerOnSlide(value: Boolean): Self = StObject.set(x, "hideTogglerOnSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideTogglerOnSlideUndefined: Self = StObject.set(x, "hideTogglerOnSlide", js.undefined)
      
      @scala.inline
      def setInitClosed(value: Boolean): Self = StObject.set(x, "initClosed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitClosedUndefined: Self = StObject.set(x, "initClosed", js.undefined)
      
      @scala.inline
      def setInitHidden(value: Boolean): Self = StObject.set(x, "initHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitHiddenUndefined: Self = StObject.set(x, "initHidden", js.undefined)
      
      @scala.inline
      def setMaskIframesOnResize(value: Boolean | String): Self = StObject.set(x, "maskIframesOnResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskIframesOnResizeUndefined: Self = StObject.set(x, "maskIframesOnResize", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      @scala.inline
      def setOnclose(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "onclose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncloseFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "onclose", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
      
      @scala.inline
      def setOnclose_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "onclose_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnclose_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "onclose_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnclose_endUndefined: Self = StObject.set(x, "onclose_end", js.undefined)
      
      @scala.inline
      def setOnclose_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "onclose_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnclose_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "onclose_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnclose_startUndefined: Self = StObject.set(x, "onclose_start", js.undefined)
      
      @scala.inline
      def setOnhide(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "onhide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnhideFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "onhide", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnhideUndefined: Self = StObject.set(x, "onhide", js.undefined)
      
      @scala.inline
      def setOnhide_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "onhide_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnhide_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "onhide_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnhide_endUndefined: Self = StObject.set(x, "onhide_end", js.undefined)
      
      @scala.inline
      def setOnhide_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "onhide_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnhide_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "onhide_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnhide_startUndefined: Self = StObject.set(x, "onhide_start", js.undefined)
      
      @scala.inline
      def setOnopen(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "onopen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnopenFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "onopen", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnopenUndefined: Self = StObject.set(x, "onopen", js.undefined)
      
      @scala.inline
      def setOnopen_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "onopen_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnopen_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "onopen_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnopen_endUndefined: Self = StObject.set(x, "onopen_end", js.undefined)
      
      @scala.inline
      def setOnopen_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "onopen_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnopen_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "onopen_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnopen_startUndefined: Self = StObject.set(x, "onopen_start", js.undefined)
      
      @scala.inline
      def setOnresize(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "onresize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnresizeFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "onresize", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnresizeUndefined: Self = StObject.set(x, "onresize", js.undefined)
      
      @scala.inline
      def setOnresize_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "onresize_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnresize_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "onresize_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnresize_endUndefined: Self = StObject.set(x, "onresize_end", js.undefined)
      
      @scala.inline
      def setOnresize_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "onresize_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnresize_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "onresize_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnresize_startUndefined: Self = StObject.set(x, "onresize_start", js.undefined)
      
      @scala.inline
      def setOnshow(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "onshow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnshowFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "onshow", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnshowUndefined: Self = StObject.set(x, "onshow", js.undefined)
      
      @scala.inline
      def setOnshow_end(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              PaneOptions, 
              /* layout_name */ String, 
              Unit
            ])
      ): Self = StObject.set(x, "onshow_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnshow_endFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
      ): Self = StObject.set(x, "onshow_end", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnshow_endUndefined: Self = StObject.set(x, "onshow_end", js.undefined)
      
      @scala.inline
      def setOnshow_start(
        value: String | (js.Function5[
              /* name */ String, 
              /* pane */ JQuery, 
              /* state */ PaneState, 
              PaneOptions, 
              /* layout_name */ String, 
              Boolean | Unit
            ])
      ): Self = StObject.set(x, "onshow_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnshow_startFunction5(
        value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Boolean | Unit
      ): Self = StObject.set(x, "onshow_start", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnshow_startUndefined: Self = StObject.set(x, "onshow_start", js.undefined)
      
      @scala.inline
      def setPaneClass(value: String): Self = StObject.set(x, "paneClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaneClassUndefined: Self = StObject.set(x, "paneClass", js.undefined)
      
      @scala.inline
      def setPaneSelector(value: String): Self = StObject.set(x, "paneSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaneSelectorUndefined: Self = StObject.set(x, "paneSelector", js.undefined)
      
      @scala.inline
      def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      @scala.inline
      def setResizerClass(value: String): Self = StObject.set(x, "resizerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizerClassUndefined: Self = StObject.set(x, "resizerClass", js.undefined)
      
      @scala.inline
      def setResizerCursor(value: String): Self = StObject.set(x, "resizerCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizerCursorUndefined: Self = StObject.set(x, "resizerCursor", js.undefined)
      
      @scala.inline
      def setResizerDragOpacity(value: Double): Self = StObject.set(x, "resizerDragOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizerDragOpacityUndefined: Self = StObject.set(x, "resizerDragOpacity", js.undefined)
      
      @scala.inline
      def setResizerTip(value: String): Self = StObject.set(x, "resizerTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizerTipUndefined: Self = StObject.set(x, "resizerTip", js.undefined)
      
      @scala.inline
      def setScrollToBookmarkOnLoad(value: Boolean): Self = StObject.set(x, "scrollToBookmarkOnLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToBookmarkOnLoadUndefined: Self = StObject.set(x, "scrollToBookmarkOnLoad", js.undefined)
      
      @scala.inline
      def setShowOverflowOnHover(value: Boolean): Self = StObject.set(x, "showOverflowOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOverflowOnHoverUndefined: Self = StObject.set(x, "showOverflowOnHover", js.undefined)
      
      @scala.inline
      def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSlidable(value: Boolean): Self = StObject.set(x, "slidable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidableUndefined: Self = StObject.set(x, "slidable", js.undefined)
      
      @scala.inline
      def setSlideTrigger_close(value: String): Self = StObject.set(x, "slideTrigger_close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideTrigger_closeUndefined: Self = StObject.set(x, "slideTrigger_close", js.undefined)
      
      @scala.inline
      def setSlideTrigger_open(value: String): Self = StObject.set(x, "slideTrigger_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideTrigger_openUndefined: Self = StObject.set(x, "slideTrigger_open", js.undefined)
      
      @scala.inline
      def setSliderCursor(value: String): Self = StObject.set(x, "sliderCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderCursorUndefined: Self = StObject.set(x, "sliderCursor", js.undefined)
      
      @scala.inline
      def setSliderTip(value: String): Self = StObject.set(x, "sliderTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderTipUndefined: Self = StObject.set(x, "sliderTip", js.undefined)
      
      @scala.inline
      def setSpacing_closed(value: Double): Self = StObject.set(x, "spacing_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacing_closedUndefined: Self = StObject.set(x, "spacing_closed", js.undefined)
      
      @scala.inline
      def setSpacing_open(value: Double): Self = StObject.set(x, "spacing_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacing_openUndefined: Self = StObject.set(x, "spacing_open", js.undefined)
      
      @scala.inline
      def setTogglerAlign_closed(value: String | Double): Self = StObject.set(x, "togglerAlign_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTogglerAlign_closedUndefined: Self = StObject.set(x, "togglerAlign_closed", js.undefined)
      
      @scala.inline
      def setTogglerAlign_open(value: String | Double): Self = StObject.set(x, "togglerAlign_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTogglerAlign_openUndefined: Self = StObject.set(x, "togglerAlign_open", js.undefined)
      
      @scala.inline
      def setTogglerClass(value: String): Self = StObject.set(x, "togglerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTogglerClassUndefined: Self = StObject.set(x, "togglerClass", js.undefined)
      
      @scala.inline
      def setTogglerContent_closed(value: String): Self = StObject.set(x, "togglerContent_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTogglerContent_closedUndefined: Self = StObject.set(x, "togglerContent_closed", js.undefined)
      
      @scala.inline
      def setTogglerContent_open(value: String): Self = StObject.set(x, "togglerContent_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTogglerContent_openUndefined: Self = StObject.set(x, "togglerContent_open", js.undefined)
      
      @scala.inline
      def setTogglerLength_closed(value: Double | String): Self = StObject.set(x, "togglerLength_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTogglerLength_closedUndefined: Self = StObject.set(x, "togglerLength_closed", js.undefined)
      
      @scala.inline
      def setTogglerLength_open(value: Double | String): Self = StObject.set(x, "togglerLength_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTogglerLength_openUndefined: Self = StObject.set(x, "togglerLength_open", js.undefined)
      
      @scala.inline
      def setTogglerTip_closed(value: String): Self = StObject.set(x, "togglerTip_closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTogglerTip_closedUndefined: Self = StObject.set(x, "togglerTip_closed", js.undefined)
      
      @scala.inline
      def setTogglerTip_open(value: String): Self = StObject.set(x, "togglerTip_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTogglerTip_openUndefined: Self = StObject.set(x, "togglerTip_open", js.undefined)
    }
  }
  
  @js.native
  trait PaneState extends StObject {
    
    var isClosed: Boolean = js.native
    
    var isHidden: Boolean = js.native
    
    var isResizing: Boolean = js.native
    
    var isSliding: Boolean = js.native
    
    var maxSize: Double = js.native
    
    var minSize: Double = js.native
    
    var noRoom: Boolean = js.native
    
    var size: Double = js.native
  }
  object PaneState {
    
    @scala.inline
    def apply(
      isClosed: Boolean,
      isHidden: Boolean,
      isResizing: Boolean,
      isSliding: Boolean,
      maxSize: Double,
      minSize: Double,
      noRoom: Boolean,
      size: Double
    ): PaneState = {
      val __obj = js.Dynamic.literal(isClosed = isClosed.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], isResizing = isResizing.asInstanceOf[js.Any], isSliding = isSliding.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], noRoom = noRoom.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaneState]
    }
    
    @scala.inline
    implicit class PaneStateMutableBuilder[Self <: PaneState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsClosed(value: Boolean): Self = StObject.set(x, "isClosed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResizing(value: Boolean): Self = StObject.set(x, "isResizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSliding(value: Boolean): Self = StObject.set(x, "isSliding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoRoom(value: Boolean): Self = StObject.set(x, "noRoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
