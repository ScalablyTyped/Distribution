package typings.iitc

import org.scalablytyped.runtime.StringDictionary
import typings.jqueryui.JQueryUI.ButtonOptions
import typings.spectrum.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogMod {
  
  object global {
    
    /** The number of dialogs on screen. */
    @JSGlobal("DIALOG_COUNT")
    @js.native
    def DIALOG_COUNT: Double = js.native
    inline def DIALOG_COUNT_=(x: Double): Unit = js.Dynamic.global.updateDynamic("DIALOG_COUNT")(x.asInstanceOf[js.Any])
    
    /** The dialog that has focus. */
    @JSGlobal("DIALOG_FOCUS")
    @js.native
    def DIALOG_FOCUS: js.Any = js.native
    inline def DIALOG_FOCUS_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("DIALOG_FOCUS")(x.asInstanceOf[js.Any])
    
    /** The global ID of onscreen dialogs. */
    @JSGlobal("DIALOG_ID")
    @js.native
    def DIALOG_ID: Double = js.native
    inline def DIALOG_ID_=(x: Double): Unit = js.Dynamic.global.updateDynamic("DIALOG_ID")(x.asInstanceOf[js.Any])
    
    /**
      * Controls how quickly the slide toggle animation
      * should play for dialog collapsing and expanding.
      * @default 100
      */
    @JSGlobal("DIALOG_SLIDE_DURATION")
    @js.native
    def DIALOG_SLIDE_DURATION: Double = js.native
    inline def DIALOG_SLIDE_DURATION_=(x: Double): Unit = js.Dynamic.global.updateDynamic("DIALOG_SLIDE_DURATION")(x.asInstanceOf[js.Any])
    
    /** custom alert box */
    inline def alert(text: String, isHTML: Boolean, closeCallback: js.Any): JQuery = (js.Dynamic.global.applyDynamic("alert")(text.asInstanceOf[js.Any], isHTML.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any])).asInstanceOf[JQuery]
    
    /** Create and show dialog */
    inline def dialog(data: DialogOptions): JQuery = js.Dynamic.global.applyDynamic("dialog")(data.asInstanceOf[js.Any]).asInstanceOf[JQuery]
    
    /** init */
    inline def setupDialogs(): Unit = js.Dynamic.global.applyDynamic("setupDialogs")().asInstanceOf[Unit]
    
    // see https://jqueryui.com/dialog/
    trait DialogOptions extends StObject {
      
      var appendTo: js.UndefOr[js.Any] = js.undefined
      
      var autoOpen: js.UndefOr[Boolean] = js.undefined
      
      var blurCallback: js.UndefOr[js.Any] = js.undefined
      
      var buttons: js.UndefOr[js.Array[ButtonOptions] | StringDictionary[js.Function0[Unit]]] = js.undefined
      
      var classes: js.UndefOr[js.Any] = js.undefined
      
      var closeCallback: js.UndefOr[js.Any] = js.undefined
      
      var closeOnEscape: js.UndefOr[Boolean] = js.undefined
      
      /** Specifies the text for the close button */
      var closeText: js.UndefOr[String] = js.undefined
      
      var collapseCallback: js.UndefOr[js.Any] = js.undefined
      
      var collapseExpandCallback: js.UndefOr[js.Any] = js.undefined
      
      var dialogClass: js.UndefOr[String] = js.undefined
      
      /**
        * moveable dialog
        * default: true
        */
      var draggable: js.UndefOr[Boolean] = js.undefined
      
      var expandCallback: js.UndefOr[js.Any] = js.undefined
      
      var focusCallback: js.UndefOr[js.Any] = js.undefined
      
      /** size */
      var height: js.UndefOr[String | Double] = js.undefined
      
      var hide: js.UndefOr[js.Any] = js.undefined
      
      /** Dialog contents (if no text) */
      var html: js.UndefOr[String | HTMLElement | JQuery] = js.undefined
      
      /** If set only one dialog can be open */
      var id: js.UndefOr[String] = js.undefined
      
      var maxHeight: js.UndefOr[String] = js.undefined
      
      var maxWidth: js.UndefOr[String] = js.undefined
      
      var minHeight: js.UndefOr[String] = js.undefined
      
      var minWidth: js.UndefOr[String] = js.undefined
      
      /**
        * single dialog
        * default: false
        */
      var modal: js.UndefOr[Boolean] = js.undefined
      
      /** position, see: https://api.jqueryui.com/position/ */
      var position: js.UndefOr[js.Any] = js.undefined
      
      /**
        * resizeable dialog (won't work in iitc out-of-the-box)
        * default: false
        */
      var resizable: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Dialog contents - converted by convertTextToTableMagic
        * \n will be line breaks \t will be table fields
        */
      var text: js.UndefOr[String] = js.undefined
      
      /** Dialog title */
      var title: js.UndefOr[String] = js.undefined
      
      var width: js.UndefOr[String | Double] = js.undefined
    }
    object DialogOptions {
      
      inline def apply(): DialogOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DialogOptions]
      }
      
      extension [Self <: DialogOptions](x: Self) {
        
        inline def setAppendTo(value: js.Any): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
        
        inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
        
        inline def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
        
        inline def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
        
        inline def setBlurCallback(value: js.Any): Self = StObject.set(x, "blurCallback", value.asInstanceOf[js.Any])
        
        inline def setBlurCallbackUndefined: Self = StObject.set(x, "blurCallback", js.undefined)
        
        inline def setButtons(value: js.Array[ButtonOptions] | StringDictionary[js.Function0[Unit]]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
        
        inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
        
        inline def setButtonsVarargs(value: ButtonOptions*): Self = StObject.set(x, "buttons", js.Array(value :_*))
        
        inline def setClasses(value: js.Any): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
        
        inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
        
        inline def setCloseCallback(value: js.Any): Self = StObject.set(x, "closeCallback", value.asInstanceOf[js.Any])
        
        inline def setCloseCallbackUndefined: Self = StObject.set(x, "closeCallback", js.undefined)
        
        inline def setCloseOnEscape(value: Boolean): Self = StObject.set(x, "closeOnEscape", value.asInstanceOf[js.Any])
        
        inline def setCloseOnEscapeUndefined: Self = StObject.set(x, "closeOnEscape", js.undefined)
        
        inline def setCloseText(value: String): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
        
        inline def setCloseTextUndefined: Self = StObject.set(x, "closeText", js.undefined)
        
        inline def setCollapseCallback(value: js.Any): Self = StObject.set(x, "collapseCallback", value.asInstanceOf[js.Any])
        
        inline def setCollapseCallbackUndefined: Self = StObject.set(x, "collapseCallback", js.undefined)
        
        inline def setCollapseExpandCallback(value: js.Any): Self = StObject.set(x, "collapseExpandCallback", value.asInstanceOf[js.Any])
        
        inline def setCollapseExpandCallbackUndefined: Self = StObject.set(x, "collapseExpandCallback", js.undefined)
        
        inline def setDialogClass(value: String): Self = StObject.set(x, "dialogClass", value.asInstanceOf[js.Any])
        
        inline def setDialogClassUndefined: Self = StObject.set(x, "dialogClass", js.undefined)
        
        inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
        
        inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
        
        inline def setExpandCallback(value: js.Any): Self = StObject.set(x, "expandCallback", value.asInstanceOf[js.Any])
        
        inline def setExpandCallbackUndefined: Self = StObject.set(x, "expandCallback", js.undefined)
        
        inline def setFocusCallback(value: js.Any): Self = StObject.set(x, "focusCallback", value.asInstanceOf[js.Any])
        
        inline def setFocusCallbackUndefined: Self = StObject.set(x, "focusCallback", js.undefined)
        
        inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setHide(value: js.Any): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
        
        inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
        
        inline def setHtml(value: String | HTMLElement | JQuery): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
        
        inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
        
        inline def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
        
        inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
        
        inline def setMinHeight(value: String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
        
        inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
        
        inline def setMinWidth(value: String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
        
        inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
        
        inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
        
        inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
        
        inline def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
        
        inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
  }
}
