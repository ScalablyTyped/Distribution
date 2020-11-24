package typings.jupyterlabDocregistry.mimedocumentMod.MimeContent

import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.json
import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.string
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to initialize a MimeDocument.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * Context
    */
  var context: IContext[IModel] = js.native
  
  /**
    * Preferred data type from the model.
    */
  var dataType: js.UndefOr[string | json] = js.native
  
  /**
    * The mime type.
    */
  var mimeType: String = js.native
  
  /**
    * The render timeout.
    */
  var renderTimeout: Double = js.native
  
  /**
    * The renderer instance.
    */
  var renderer: IRenderer = js.native
}
object IOptions {
  
  @scala.inline
  def apply(context: IContext[IModel], mimeType: String, renderTimeout: Double, renderer: IRenderer): IOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], renderTimeout = renderTimeout.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
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
    def setContext(value: IContext[IModel]): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderTimeout(value: Double): Self = this.set("renderTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderer(value: IRenderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: string | json): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
  }
}
