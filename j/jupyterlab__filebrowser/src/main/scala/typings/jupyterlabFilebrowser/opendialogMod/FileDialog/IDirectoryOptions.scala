package typings.jupyterlabFilebrowser.opendialogMod.FileDialog

import typings.jupyterlabApputils.dialogMod.Dialog.Header
import typings.jupyterlabApputils.dialogMod.Dialog.IRenderer
import typings.jupyterlabDocmanager.tokensMod.IDocumentManager
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the open directory dialog
  */
/* Inlined parent std.Partial<std.Pick<@jupyterlab/apputils.@jupyterlab/apputils.Dialog.IOptions<std.Promise<std.Array<@jupyterlab/services.@jupyterlab/services.Contents.IModel>>>, std.Exclude<keyof @jupyterlab/apputils.@jupyterlab/apputils.Dialog.IOptions<std.Promise<std.Array<@jupyterlab/services.@jupyterlab/services.Contents.IModel>>>, 'body' | 'buttons' | 'defaultButton'>>> */
@js.native
trait IDirectoryOptions extends js.Object {
  
  var focusNodeSelector: js.UndefOr[String] = js.native
  
  var host: js.UndefOr[HTMLElement] = js.native
  
  /**
    * Document manager
    */
  var manager: IDocumentManager = js.native
  
  var renderer: js.UndefOr[IRenderer] = js.native
  
  var title: js.UndefOr[Header] = js.native
}
object IDirectoryOptions {
  
  @scala.inline
  def apply(manager: IDocumentManager): IDirectoryOptions = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirectoryOptions]
  }
  
  @scala.inline
  implicit class IDirectoryOptionsOps[Self <: IDirectoryOptions] (val x: Self) extends AnyVal {
    
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
    def setManager(value: IDocumentManager): Self = this.set("manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusNodeSelector(value: String): Self = this.set("focusNodeSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusNodeSelector: Self = this.set("focusNodeSelector", js.undefined)
    
    @scala.inline
    def setHost(value: HTMLElement): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setRenderer(value: IRenderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setTitle(value: Header): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
