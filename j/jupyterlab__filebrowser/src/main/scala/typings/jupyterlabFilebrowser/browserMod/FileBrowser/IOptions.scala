package typings.jupyterlabFilebrowser.browserMod.FileBrowser

import typings.jupyterlabFilebrowser.listingMod.DirListing.IRenderer
import typings.jupyterlabFilebrowser.modelMod.FileBrowserModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An options object for initializing a file browser widget.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The widget/DOM id of the file browser.
    */
  var id: String = js.native
  
  /**
    * A file browser model instance.
    */
  var model: FileBrowserModel = js.native
  
  /**
    * An optional renderer for the directory listing area.
    *
    * The default is a shared instance of `DirListing.Renderer`.
    */
  var renderer: js.UndefOr[IRenderer] = js.native
  
  /**
    * Whether a file browser automatically restores state when instantiated.
    * The default is `true`.
    *
    * #### Notes
    * The file browser model will need to be restored manually for the file
    * browser to be able to save its state.
    */
  var restore: js.UndefOr[Boolean] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(id: String, model: FileBrowserModel): IOptions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: FileBrowserModel): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderer(value: IRenderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setRestore(value: Boolean): Self = this.set("restore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestore: Self = this.set("restore", js.undefined)
  }
}
