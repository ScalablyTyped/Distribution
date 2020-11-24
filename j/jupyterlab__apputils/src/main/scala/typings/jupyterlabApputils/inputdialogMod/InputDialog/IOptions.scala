package typings.jupyterlabApputils.inputdialogMod.InputDialog

import typings.jupyterlabApputils.dialogMod.Dialog.Header
import typings.jupyterlabApputils.dialogMod.Dialog.IRenderer
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Common constructor options for input dialogs
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * Label for cancel button.
    */
  var cancelLabel: js.UndefOr[String] = js.native
  
  /**
    * The host element for the dialog. Defaults to `document.body`.
    */
  var host: js.UndefOr[HTMLElement] = js.native
  
  /**
    * Label of the requested input
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Label for ok button.
    */
  var okLabel: js.UndefOr[String] = js.native
  
  /**
    * An optional renderer for dialog items.  Defaults to a shared
    * default renderer.
    */
  var renderer: js.UndefOr[IRenderer] = js.native
  
  /**
    * The top level text for the dialog.  Defaults to an empty string.
    */
  var title: Header = js.native
}
object IOptions {
  
  @scala.inline
  def apply(title: Header): IOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setTitle(value: Header): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelLabel(value: String): Self = this.set("cancelLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelLabel: Self = this.set("cancelLabel", js.undefined)
    
    @scala.inline
    def setHost(value: HTMLElement): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOkLabel(value: String): Self = this.set("okLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOkLabel: Self = this.set("okLabel", js.undefined)
    
    @scala.inline
    def setRenderer(value: IRenderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
  }
}
