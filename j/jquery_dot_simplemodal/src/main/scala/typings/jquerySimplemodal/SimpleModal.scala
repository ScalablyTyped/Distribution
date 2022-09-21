package typings.jquerySimplemodal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SimpleModal {
  
  type JQueryExtension = js.Function1[/* options */ js.UndefOr[SimpleModalOptions], JQuery]
  
  /** Sent to callbacks as a parameter. */
  trait SimpleModalDialog extends StObject {
    
    var container: JQuery
    
    var data: Any
    
    var iframe: JQuery
    
    var overlay: JQuery
  }
  object SimpleModalDialog {
    
    inline def apply(container: JQuery, data: Any, iframe: JQuery, overlay: JQuery): SimpleModalDialog = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleModalDialog]
    }
    
    extension [Self <: SimpleModalDialog](x: Self) {
      
      inline def setContainer(value: JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIframe(value: JQuery): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
      
      inline def setOverlay(value: JQuery): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    }
  }
  
  trait SimpleModalOptions extends StObject {
    
    /** The jQuery selector to append the elements to. For ASP.NET, use 'form'. Default: 'body'. */
    var appendTo: js.UndefOr[String] = js.undefined
    
    /** Automatically position the container upon creation and on window resize? Default: true. (Changed in 1.4) */
    var autoPosition: js.UndefOr[Boolean] = js.undefined
    
    /** Resize the container if it exceeds the browser window dimensions? Default: false. (Changed in 1.4) */
    var autoResize: js.UndefOr[Boolean] = js.undefined
    
    /** If true, closeHTML, escClose and overlayClose will be used if set. If false, none of them will be used. Default: true. */
    var close: js.UndefOr[Boolean] = js.undefined
    
    /** The CSS class used to bind to the close event. Default: 'simplemodal-close'. */
    var closeClass: js.UndefOr[String] = js.undefined
    
    /** The HTML for the default close link. SimpleModal will automatically add the closeClass to this element. Default: ''. */
    var closeHTML: js.UndefOr[String] = js.undefined
    
    /** The CSS styling for the container div. Default: {}. */
    var containerCss: js.UndefOr[js.Object] = js.undefined
    
    /** The DOM element id for the container div. Default: 'simplemodal-container'. */
    var containerId: js.UndefOr[String] = js.undefined
    
    /** The CSS styling for the data div. Default: {}. */
    var dataCss: js.UndefOr[js.Object] = js.undefined
    
    /** The DOM element id for the data div. Default: 'simplemodal-data'. */
    var dataId: js.UndefOr[String] = js.undefined
    
    /** Allow Esc keypress to close the dialog? Default: true. */
    var escClose: js.UndefOr[Boolean] = js.undefined
    
    /** Focus in the first visible, enabled element? Default: true. */
    var focus: js.UndefOr[Boolean] = js.undefined
    
    /** The maximum height for the container. If not specified, the window height is used. Default: null. */
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    /** The maximum width for the container. If not specified, the window width is used. Default: null. */
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    /** The minimum height for the container. Default: null. */
    var minHeight: js.UndefOr[Double] = js.undefined
    
    /** The minimum width for the container. Default: null. */
    var minWidth: js.UndefOr[Double] = js.undefined
    
    /** User will be unable to interact with the page below the modal or tab away from the dialog. If false, the overlay, iframe, and certain events will be disabled allowing the user to interact with the page below the dialog. Default: true. (Added in 1.3.4. Name changed from transient in 1.3.5) */
    var modal: js.UndefOr[Boolean] = js.undefined
    
    /** The callback function used in place of SimpleModal's close. Default: null. */
    var onClose: js.UndefOr[js.Function1[/* dialog */ SimpleModalDialog, Unit]] = js.undefined
    
    /** The callback function used in place of SimpleModal's open. Default: null. */
    var onOpen: js.UndefOr[js.Function1[/* dialog */ SimpleModalDialog, Unit]] = js.undefined
    
    /** The callback function used after the modal dialog has opened. Default: null. */
    var onShow: js.UndefOr[js.Function1[/* dialog */ SimpleModalDialog, Unit]] = js.undefined
    
    /** The opacity value for the overlay div, from 0 - 100. Default: 50. */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Allow click on overlay to close the dialog? Default: false. */
    var overlayClose: js.UndefOr[Boolean] = js.undefined
    
    /** The CSS styling for the overlay div. Default: {}. */
    var overlayCss: js.UndefOr[js.Object] = js.undefined
    
    /** The DOM element id for the overlay div. Default: 'simplemodal-overlay'. */
    var overlayId: js.UndefOr[String] = js.undefined
    
    /** Persist the data across modal calls? Only used for existing DOM elements. If true, the data will be maintained across modal calls, if false, the data will be reverted to its original state. Default: true. */
    var persist: js.UndefOr[Boolean] = js.undefined
    
    /** Position of container [top, left]. Can be number of pixels or percentage. Default: null. */
    var position: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Starting z-index value. Default: 1000. */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object SimpleModalOptions {
    
    inline def apply(): SimpleModalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleModalOptions]
    }
    
    extension [Self <: SimpleModalOptions](x: Self) {
      
      inline def setAppendTo(value: String): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setAutoPosition(value: Boolean): Self = StObject.set(x, "autoPosition", value.asInstanceOf[js.Any])
      
      inline def setAutoPositionUndefined: Self = StObject.set(x, "autoPosition", js.undefined)
      
      inline def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
      
      inline def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
      
      inline def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseClass(value: String): Self = StObject.set(x, "closeClass", value.asInstanceOf[js.Any])
      
      inline def setCloseClassUndefined: Self = StObject.set(x, "closeClass", js.undefined)
      
      inline def setCloseHTML(value: String): Self = StObject.set(x, "closeHTML", value.asInstanceOf[js.Any])
      
      inline def setCloseHTMLUndefined: Self = StObject.set(x, "closeHTML", js.undefined)
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setContainerCss(value: js.Object): Self = StObject.set(x, "containerCss", value.asInstanceOf[js.Any])
      
      inline def setContainerCssUndefined: Self = StObject.set(x, "containerCss", js.undefined)
      
      inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
      
      inline def setDataCss(value: js.Object): Self = StObject.set(x, "dataCss", value.asInstanceOf[js.Any])
      
      inline def setDataCssUndefined: Self = StObject.set(x, "dataCss", js.undefined)
      
      inline def setDataId(value: String): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
      
      inline def setDataIdUndefined: Self = StObject.set(x, "dataId", js.undefined)
      
      inline def setEscClose(value: Boolean): Self = StObject.set(x, "escClose", value.asInstanceOf[js.Any])
      
      inline def setEscCloseUndefined: Self = StObject.set(x, "escClose", js.undefined)
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setOnClose(value: /* dialog */ SimpleModalDialog => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOpen(value: /* dialog */ SimpleModalDialog => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnShow(value: /* dialog */ SimpleModalDialog => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOverlayClose(value: Boolean): Self = StObject.set(x, "overlayClose", value.asInstanceOf[js.Any])
      
      inline def setOverlayCloseUndefined: Self = StObject.set(x, "overlayClose", js.undefined)
      
      inline def setOverlayCss(value: js.Object): Self = StObject.set(x, "overlayCss", value.asInstanceOf[js.Any])
      
      inline def setOverlayCssUndefined: Self = StObject.set(x, "overlayCss", js.undefined)
      
      inline def setOverlayId(value: String): Self = StObject.set(x, "overlayId", value.asInstanceOf[js.Any])
      
      inline def setOverlayIdUndefined: Self = StObject.set(x, "overlayId", js.undefined)
      
      inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
      
      inline def setPosition(value: js.Array[Any]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPositionVarargs(value: Any*): Self = StObject.set(x, "position", js.Array(value*))
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait Static extends StObject {
    
    def apply(element: JQuery): JQuery = js.native
    def apply(element: JQuery, options: SimpleModalOptions): JQuery = js.native
    def apply(html: String): JQuery = js.native
    def apply(html: String, options: SimpleModalOptions): JQuery = js.native
    
    def close(): Unit = js.native
    
    var defaults: SimpleModalOptions = js.native
  }
}
