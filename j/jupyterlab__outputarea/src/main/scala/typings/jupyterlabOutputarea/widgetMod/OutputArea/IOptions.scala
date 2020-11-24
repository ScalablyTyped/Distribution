package typings.jupyterlabOutputarea.widgetMod.OutputArea

import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options to create an `OutputArea`.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The content factory used by the widget to create children.
    */
  var contentFactory: js.UndefOr[IContentFactory] = js.native
  
  /**
    * The model used by the widget.
    */
  var model: IOutputAreaModel = js.native
  
  /**
    * The rendermime instance used by the widget.
    */
  var rendermime: IRenderMimeRegistry = js.native
}
object IOptions {
  
  @scala.inline
  def apply(model: IOutputAreaModel, rendermime: IRenderMimeRegistry): IOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
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
    def setModel(value: IOutputAreaModel): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendermime(value: IRenderMimeRegistry): Self = this.set("rendermime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentFactory(value: IContentFactory): Self = this.set("contentFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentFactory: Self = this.set("contentFactory", js.undefined)
  }
}
