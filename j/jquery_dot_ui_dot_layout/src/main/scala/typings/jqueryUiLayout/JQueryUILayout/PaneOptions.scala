package typings.jqueryUiLayout.JQueryUILayout

import typings.jquery.JQueryAnimationOptions
import typings.jqueryUiLayout.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaneOptions extends js.Object {
  
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
  implicit class PaneOptionsOps[Self <: PaneOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplyDefaultStyles(value: Boolean): Self = this.set("applyDefaultStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyDefaultStyles: Self = this.set("applyDefaultStyles", js.undefined)
    
    @scala.inline
    def setButtonClass(value: String): Self = this.set("buttonClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonClass: Self = this.set("buttonClass", js.undefined)
    
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    
    @scala.inline
    def setContentIgnoreSelector(value: String): Self = this.set("contentIgnoreSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentIgnoreSelector: Self = this.set("contentIgnoreSelector", js.undefined)
    
    @scala.inline
    def setContentSelector(value: String): Self = this.set("contentSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentSelector: Self = this.set("contentSelector", js.undefined)
    
    @scala.inline
    def setCustomHotkey(value: String | Double): Self = this.set("customHotkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomHotkey: Self = this.set("customHotkey", js.undefined)
    
    @scala.inline
    def setCustomHotkeyModifier(value: String): Self = this.set("customHotkeyModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomHotkeyModifier: Self = this.set("customHotkeyModifier", js.undefined)
    
    @scala.inline
    def setEnableCursorHotkey(value: Boolean): Self = this.set("enableCursorHotkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCursorHotkey: Self = this.set("enableCursorHotkey", js.undefined)
    
    @scala.inline
    def setFxName(value: String): Self = this.set("fxName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFxName: Self = this.set("fxName", js.undefined)
    
    @scala.inline
    def setFxSettings(value: JQueryAnimationOptions): Self = this.set("fxSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFxSettings: Self = this.set("fxSettings", js.undefined)
    
    @scala.inline
    def setFxSpeed(value: String | Double): Self = this.set("fxSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFxSpeed: Self = this.set("fxSpeed", js.undefined)
    
    @scala.inline
    def setHideTogglerOnSlide(value: Boolean): Self = this.set("hideTogglerOnSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideTogglerOnSlide: Self = this.set("hideTogglerOnSlide", js.undefined)
    
    @scala.inline
    def setInitClosed(value: Boolean): Self = this.set("initClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitClosed: Self = this.set("initClosed", js.undefined)
    
    @scala.inline
    def setInitHidden(value: Boolean): Self = this.set("initHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitHidden: Self = this.set("initHidden", js.undefined)
    
    @scala.inline
    def setMaskIframesOnResize(value: Boolean | String): Self = this.set("maskIframesOnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskIframesOnResize: Self = this.set("maskIframesOnResize", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    
    @scala.inline
    def setOncloseFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
    ): Self = this.set("onclose", js.Any.fromFunction5(value))
    
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
    ): Self = this.set("onclose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnclose: Self = this.set("onclose", js.undefined)
    
    @scala.inline
    def setOnclose_endFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
    ): Self = this.set("onclose_end", js.Any.fromFunction5(value))
    
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
    ): Self = this.set("onclose_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnclose_end: Self = this.set("onclose_end", js.undefined)
    
    @scala.inline
    def setOnclose_startFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Boolean | Unit
    ): Self = this.set("onclose_start", js.Any.fromFunction5(value))
    
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
    ): Self = this.set("onclose_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnclose_start: Self = this.set("onclose_start", js.undefined)
    
    @scala.inline
    def setOnhideFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
    ): Self = this.set("onhide", js.Any.fromFunction5(value))
    
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
    ): Self = this.set("onhide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnhide: Self = this.set("onhide", js.undefined)
    
    @scala.inline
    def setOnhide_endFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
    ): Self = this.set("onhide_end", js.Any.fromFunction5(value))
    
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
    ): Self = this.set("onhide_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnhide_end: Self = this.set("onhide_end", js.undefined)
    
    @scala.inline
    def setOnhide_startFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Boolean | Unit
    ): Self = this.set("onhide_start", js.Any.fromFunction5(value))
    
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
    ): Self = this.set("onhide_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnhide_start: Self = this.set("onhide_start", js.undefined)
    
    @scala.inline
    def setOnopenFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
    ): Self = this.set("onopen", js.Any.fromFunction5(value))
    
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
    ): Self = this.set("onopen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnopen: Self = this.set("onopen", js.undefined)
    
    @scala.inline
    def setOnopen_endFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
    ): Self = this.set("onopen_end", js.Any.fromFunction5(value))
    
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
    ): Self = this.set("onopen_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnopen_end: Self = this.set("onopen_end", js.undefined)
    
    @scala.inline
    def setOnopen_startFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Boolean | Unit
    ): Self = this.set("onopen_start", js.Any.fromFunction5(value))
    
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
    ): Self = this.set("onopen_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnopen_start: Self = this.set("onopen_start", js.undefined)
    
    @scala.inline
    def setOnresizeFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
    ): Self = this.set("onresize", js.Any.fromFunction5(value))
    
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
    ): Self = this.set("onresize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnresize: Self = this.set("onresize", js.undefined)
    
    @scala.inline
    def setOnresize_endFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
    ): Self = this.set("onresize_end", js.Any.fromFunction5(value))
    
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
    ): Self = this.set("onresize_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnresize_end: Self = this.set("onresize_end", js.undefined)
    
    @scala.inline
    def setOnresize_startFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Boolean | Unit
    ): Self = this.set("onresize_start", js.Any.fromFunction5(value))
    
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
    ): Self = this.set("onresize_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnresize_start: Self = this.set("onresize_start", js.undefined)
    
    @scala.inline
    def setOnshowFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
    ): Self = this.set("onshow", js.Any.fromFunction5(value))
    
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
    ): Self = this.set("onshow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnshow: Self = this.set("onshow", js.undefined)
    
    @scala.inline
    def setOnshow_endFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Unit
    ): Self = this.set("onshow_end", js.Any.fromFunction5(value))
    
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
    ): Self = this.set("onshow_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnshow_end: Self = this.set("onshow_end", js.undefined)
    
    @scala.inline
    def setOnshow_startFunction5(
      value: (/* name */ String, /* pane */ JQuery, /* state */ PaneState, PaneOptions, /* layout_name */ String) => Boolean | Unit
    ): Self = this.set("onshow_start", js.Any.fromFunction5(value))
    
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
    ): Self = this.set("onshow_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnshow_start: Self = this.set("onshow_start", js.undefined)
    
    @scala.inline
    def setPaneClass(value: String): Self = this.set("paneClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaneClass: Self = this.set("paneClass", js.undefined)
    
    @scala.inline
    def setPaneSelector(value: String): Self = this.set("paneSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaneSelector: Self = this.set("paneSelector", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setResizerClass(value: String): Self = this.set("resizerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizerClass: Self = this.set("resizerClass", js.undefined)
    
    @scala.inline
    def setResizerCursor(value: String): Self = this.set("resizerCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizerCursor: Self = this.set("resizerCursor", js.undefined)
    
    @scala.inline
    def setResizerDragOpacity(value: Double): Self = this.set("resizerDragOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizerDragOpacity: Self = this.set("resizerDragOpacity", js.undefined)
    
    @scala.inline
    def setResizerTip(value: String): Self = this.set("resizerTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizerTip: Self = this.set("resizerTip", js.undefined)
    
    @scala.inline
    def setScrollToBookmarkOnLoad(value: Boolean): Self = this.set("scrollToBookmarkOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToBookmarkOnLoad: Self = this.set("scrollToBookmarkOnLoad", js.undefined)
    
    @scala.inline
    def setShowOverflowOnHover(value: Boolean): Self = this.set("showOverflowOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOverflowOnHover: Self = this.set("showOverflowOnHover", js.undefined)
    
    @scala.inline
    def setSize(value: String | Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSlidable(value: Boolean): Self = this.set("slidable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlidable: Self = this.set("slidable", js.undefined)
    
    @scala.inline
    def setSlideTrigger_close(value: String): Self = this.set("slideTrigger_close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideTrigger_close: Self = this.set("slideTrigger_close", js.undefined)
    
    @scala.inline
    def setSlideTrigger_open(value: String): Self = this.set("slideTrigger_open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideTrigger_open: Self = this.set("slideTrigger_open", js.undefined)
    
    @scala.inline
    def setSliderCursor(value: String): Self = this.set("sliderCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSliderCursor: Self = this.set("sliderCursor", js.undefined)
    
    @scala.inline
    def setSliderTip(value: String): Self = this.set("sliderTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSliderTip: Self = this.set("sliderTip", js.undefined)
    
    @scala.inline
    def setSpacing_closed(value: Double): Self = this.set("spacing_closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing_closed: Self = this.set("spacing_closed", js.undefined)
    
    @scala.inline
    def setSpacing_open(value: Double): Self = this.set("spacing_open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing_open: Self = this.set("spacing_open", js.undefined)
    
    @scala.inline
    def setTogglerAlign_closed(value: String | Double): Self = this.set("togglerAlign_closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTogglerAlign_closed: Self = this.set("togglerAlign_closed", js.undefined)
    
    @scala.inline
    def setTogglerAlign_open(value: String | Double): Self = this.set("togglerAlign_open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTogglerAlign_open: Self = this.set("togglerAlign_open", js.undefined)
    
    @scala.inline
    def setTogglerClass(value: String): Self = this.set("togglerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTogglerClass: Self = this.set("togglerClass", js.undefined)
    
    @scala.inline
    def setTogglerContent_closed(value: String): Self = this.set("togglerContent_closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTogglerContent_closed: Self = this.set("togglerContent_closed", js.undefined)
    
    @scala.inline
    def setTogglerContent_open(value: String): Self = this.set("togglerContent_open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTogglerContent_open: Self = this.set("togglerContent_open", js.undefined)
    
    @scala.inline
    def setTogglerLength_closed(value: Double | String): Self = this.set("togglerLength_closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTogglerLength_closed: Self = this.set("togglerLength_closed", js.undefined)
    
    @scala.inline
    def setTogglerLength_open(value: Double | String): Self = this.set("togglerLength_open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTogglerLength_open: Self = this.set("togglerLength_open", js.undefined)
    
    @scala.inline
    def setTogglerTip_closed(value: String): Self = this.set("togglerTip_closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTogglerTip_closed: Self = this.set("togglerTip_closed", js.undefined)
    
    @scala.inline
    def setTogglerTip_open(value: String): Self = this.set("togglerTip_open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTogglerTip_open: Self = this.set("togglerTip_open", js.undefined)
  }
}
