package typings.jquerySimplemodal.SimpleModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleModalOptions extends js.Object {
  
  /** The jQuery selector to append the elements to. For ASP.NET, use 'form'. Default: 'body'. */
  var appendTo: js.UndefOr[String] = js.native
  
  /** Automatically position the container upon creation and on window resize? Default: true. (Changed in 1.4) */
  var autoPosition: js.UndefOr[Boolean] = js.native
  
  /** Resize the container if it exceeds the browser window dimensions? Default: false. (Changed in 1.4) */
  var autoResize: js.UndefOr[Boolean] = js.native
  
  /** If true, closeHTML, escClose and overlayClose will be used if set. If false, none of them will be used. Default: true. */
  var close: js.UndefOr[Boolean] = js.native
  
  /** The CSS class used to bind to the close event. Default: 'simplemodal-close'. */
  var closeClass: js.UndefOr[String] = js.native
  
  /** The HTML for the default close link. SimpleModal will automatically add the closeClass to this element. Default: ''. */
  var closeHTML: js.UndefOr[String] = js.native
  
  /** The CSS styling for the container div. Default: {}. */
  var containerCss: js.UndefOr[js.Object] = js.native
  
  /** The DOM element id for the container div. Default: 'simplemodal-container'. */
  var containerId: js.UndefOr[String] = js.native
  
  /** The CSS styling for the data div. Default: {}. */
  var dataCss: js.UndefOr[js.Object] = js.native
  
  /** The DOM element id for the data div. Default: 'simplemodal-data'. */
  var dataId: js.UndefOr[String] = js.native
  
  /** Allow Esc keypress to close the dialog? Default: true. */
  var escClose: js.UndefOr[Boolean] = js.native
  
  /** Focus in the first visible, enabled element? Default: true. */
  var focus: js.UndefOr[Boolean] = js.native
  
  /** The maximum height for the container. If not specified, the window height is used. Default: null. */
  var maxHeight: js.UndefOr[Double] = js.native
  
  /** The maximum width for the container. If not specified, the window width is used. Default: null. */
  var maxWidth: js.UndefOr[Double] = js.native
  
  /** The minimum height for the container. Default: null. */
  var minHeight: js.UndefOr[Double] = js.native
  
  /** The minimum width for the container. Default: null. */
  var minWidth: js.UndefOr[Double] = js.native
  
  /** User will be unable to interact with the page below the modal or tab away from the dialog. If false, the overlay, iframe, and certain events will be disabled allowing the user to interact with the page below the dialog. Default: true. (Added in 1.3.4. Name changed from transient in 1.3.5) */
  var modal: js.UndefOr[Boolean] = js.native
  
  /** The callback function used in place of SimpleModal's close. Default: null. */
  var onClose: js.UndefOr[js.Function1[/* dialog */ SimpleModalDialog, Unit]] = js.native
  
  /** The callback function used in place of SimpleModal's open. Default: null. */
  var onOpen: js.UndefOr[js.Function1[/* dialog */ SimpleModalDialog, Unit]] = js.native
  
  /** The callback function used after the modal dialog has opened. Default: null. */
  var onShow: js.UndefOr[js.Function1[/* dialog */ SimpleModalDialog, Unit]] = js.native
  
  /** The opacity value for the overlay div, from 0 - 100. Default: 50. */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Allow click on overlay to close the dialog? Default: false. */
  var overlayClose: js.UndefOr[Boolean] = js.native
  
  /** The CSS styling for the overlay div. Default: {}. */
  var overlayCss: js.UndefOr[js.Object] = js.native
  
  /** The DOM element id for the overlay div. Default: 'simplemodal-overlay'. */
  var overlayId: js.UndefOr[String] = js.native
  
  /** Persist the data across modal calls? Only used for existing DOM elements. If true, the data will be maintained across modal calls, if false, the data will be reverted to its original state. Default: true. */
  var persist: js.UndefOr[Boolean] = js.native
  
  /** Position of container [top, left]. Can be number of pixels or percentage. Default: null. */
  var position: js.UndefOr[js.Array[_]] = js.native
  
  /** Starting z-index value. Default: 1000. */
  var zIndex: js.UndefOr[Double] = js.native
}
object SimpleModalOptions {
  
  @scala.inline
  def apply(): SimpleModalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleModalOptions]
  }
  
  @scala.inline
  implicit class SimpleModalOptionsOps[Self <: SimpleModalOptions] (val x: Self) extends AnyVal {
    
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
    def setAppendTo(value: String): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    
    @scala.inline
    def setAutoPosition(value: Boolean): Self = this.set("autoPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPosition: Self = this.set("autoPosition", js.undefined)
    
    @scala.inline
    def setAutoResize(value: Boolean): Self = this.set("autoResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoResize: Self = this.set("autoResize", js.undefined)
    
    @scala.inline
    def setClose(value: Boolean): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setCloseClass(value: String): Self = this.set("closeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseClass: Self = this.set("closeClass", js.undefined)
    
    @scala.inline
    def setCloseHTML(value: String): Self = this.set("closeHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseHTML: Self = this.set("closeHTML", js.undefined)
    
    @scala.inline
    def setContainerCss(value: js.Object): Self = this.set("containerCss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerCss: Self = this.set("containerCss", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    
    @scala.inline
    def setDataCss(value: js.Object): Self = this.set("dataCss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataCss: Self = this.set("dataCss", js.undefined)
    
    @scala.inline
    def setDataId(value: String): Self = this.set("dataId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataId: Self = this.set("dataId", js.undefined)
    
    @scala.inline
    def setEscClose(value: Boolean): Self = this.set("escClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscClose: Self = this.set("escClose", js.undefined)
    
    @scala.inline
    def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* dialog */ SimpleModalDialog => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnOpen(value: /* dialog */ SimpleModalDialog => Unit): Self = this.set("onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOnShow(value: /* dialog */ SimpleModalDialog => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setOverlayClose(value: Boolean): Self = this.set("overlayClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayClose: Self = this.set("overlayClose", js.undefined)
    
    @scala.inline
    def setOverlayCss(value: js.Object): Self = this.set("overlayCss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayCss: Self = this.set("overlayCss", js.undefined)
    
    @scala.inline
    def setOverlayId(value: String): Self = this.set("overlayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayId: Self = this.set("overlayId", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = this.set("persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
    
    @scala.inline
    def setPositionVarargs(value: js.Any*): Self = this.set("position", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: js.Array[_]): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
