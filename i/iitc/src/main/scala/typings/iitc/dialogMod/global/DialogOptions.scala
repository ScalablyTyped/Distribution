package typings.iitc.dialogMod.global

import org.scalablytyped.runtime.StringDictionary
import typings.jqueryui.JQueryUI.ButtonOptions
import typings.spectrum.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// see https://jqueryui.com/dialog/
@js.native
trait DialogOptions extends js.Object {
  
  var appendTo: js.UndefOr[js.Any] = js.native
  
  var autoOpen: js.UndefOr[Boolean] = js.native
  
  var blurCallback: js.UndefOr[js.Any] = js.native
  
  var buttons: js.UndefOr[js.Array[ButtonOptions] | StringDictionary[js.Function0[Unit]]] = js.native
  
  var classes: js.UndefOr[js.Any] = js.native
  
  var closeCallback: js.UndefOr[js.Any] = js.native
  
  var closeOnEscape: js.UndefOr[Boolean] = js.native
  
  /** Specifies the text for the close button */
  var closeText: js.UndefOr[String] = js.native
  
  var collapseCallback: js.UndefOr[js.Any] = js.native
  
  var collapseExpandCallback: js.UndefOr[js.Any] = js.native
  
  var dialogClass: js.UndefOr[String] = js.native
  
  /**
    * moveable dialog
    * default: true
    */
  var draggable: js.UndefOr[Boolean] = js.native
  
  var expandCallback: js.UndefOr[js.Any] = js.native
  
  var focusCallback: js.UndefOr[js.Any] = js.native
  
  /** size */
  var height: js.UndefOr[String | Double] = js.native
  
  var hide: js.UndefOr[js.Any] = js.native
  
  /** Dialog contents (if no text) */
  var html: js.UndefOr[String | HTMLElement | JQuery] = js.native
  
  /** If set only one dialog can be open */
  var id: js.UndefOr[String] = js.native
  
  var maxHeight: js.UndefOr[String] = js.native
  
  var maxWidth: js.UndefOr[String] = js.native
  
  var minHeight: js.UndefOr[String] = js.native
  
  var minWidth: js.UndefOr[String] = js.native
  
  /**
    * single dialog
    * default: false
    */
  var modal: js.UndefOr[Boolean] = js.native
  
  /** position, see: https://api.jqueryui.com/position/ */
  var position: js.UndefOr[js.Any] = js.native
  
  /**
    * resizeable dialog (won't work in iitc out-of-the-box)
    * default: false
    */
  var resizable: js.UndefOr[Boolean] = js.native
  
  /**
    * Dialog contents - converted by convertTextToTableMagic
    * \n will be line breaks \t will be table fields
    */
  var text: js.UndefOr[String] = js.native
  
  /** Dialog title */
  var title: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[String | Double] = js.native
}
object DialogOptions {
  
  @scala.inline
  def apply(): DialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogOptions]
  }
  
  @scala.inline
  implicit class DialogOptionsOps[Self <: DialogOptions] (val x: Self) extends AnyVal {
    
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
    def setAppendTo(value: js.Any): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    
    @scala.inline
    def setAutoOpen(value: Boolean): Self = this.set("autoOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoOpen: Self = this.set("autoOpen", js.undefined)
    
    @scala.inline
    def setBlurCallback(value: js.Any): Self = this.set("blurCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurCallback: Self = this.set("blurCallback", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: ButtonOptions*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[ButtonOptions] | StringDictionary[js.Function0[Unit]]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setClasses(value: js.Any): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setCloseCallback(value: js.Any): Self = this.set("closeCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseCallback: Self = this.set("closeCallback", js.undefined)
    
    @scala.inline
    def setCloseOnEscape(value: Boolean): Self = this.set("closeOnEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnEscape: Self = this.set("closeOnEscape", js.undefined)
    
    @scala.inline
    def setCloseText(value: String): Self = this.set("closeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseText: Self = this.set("closeText", js.undefined)
    
    @scala.inline
    def setCollapseCallback(value: js.Any): Self = this.set("collapseCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseCallback: Self = this.set("collapseCallback", js.undefined)
    
    @scala.inline
    def setCollapseExpandCallback(value: js.Any): Self = this.set("collapseExpandCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseExpandCallback: Self = this.set("collapseExpandCallback", js.undefined)
    
    @scala.inline
    def setDialogClass(value: String): Self = this.set("dialogClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogClass: Self = this.set("dialogClass", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setExpandCallback(value: js.Any): Self = this.set("expandCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandCallback: Self = this.set("expandCallback", js.undefined)
    
    @scala.inline
    def setFocusCallback(value: js.Any): Self = this.set("focusCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusCallback: Self = this.set("focusCallback", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHide(value: js.Any): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setHtml(value: String | HTMLElement | JQuery): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: String): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: String): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: String): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: String): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
