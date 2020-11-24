package typings.jupyterlabCells.widgetMod.Cell

import typings.jupyterlabCells.anon.PartialIConfig
import typings.jupyterlabCells.modelMod.ICellModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An options object for initializing a cell widget.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The factory object for customizable cell children.
    */
  var contentFactory: js.UndefOr[IContentFactory] = js.native
  
  /**
    * The configuration options for the text editor widget.
    */
  var editorConfig: js.UndefOr[PartialIConfig] = js.native
  
  /**
    * The model used by the cell.
    */
  var model: ICellModel = js.native
  
  /**
    * Whether to send an update request to the editor when it is shown.
    */
  var updateEditorOnShow: js.UndefOr[Boolean] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(model: ICellModel): IOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
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
    def setModel(value: ICellModel): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentFactory(value: IContentFactory): Self = this.set("contentFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentFactory: Self = this.set("contentFactory", js.undefined)
    
    @scala.inline
    def setEditorConfig(value: PartialIConfig): Self = this.set("editorConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorConfig: Self = this.set("editorConfig", js.undefined)
    
    @scala.inline
    def setUpdateEditorOnShow(value: Boolean): Self = this.set("updateEditorOnShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateEditorOnShow: Self = this.set("updateEditorOnShow", js.undefined)
  }
}
