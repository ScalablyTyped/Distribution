package typings.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory

import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.json
import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.string
import typings.jupyterlabDocregistry.mimedocumentMod.MimeDocument
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IFileType
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to initialize a MimeDocumentFactory.
  */
@js.native
trait IOptions[T /* <: MimeDocument */] extends IWidgetFactoryOptions[T] {
  
  /**
    * Preferred data type from the model.
    */
  var dataType: js.UndefOr[string | json] = js.native
  
  /**
    * The primary file type associated with the document.
    */
  var primaryFileType: js.UndefOr[IFileType] = js.native
  
  /**
    * The render timeout.
    */
  var renderTimeout: js.UndefOr[Double] = js.native
  
  /**
    * The rendermime instance.
    */
  var rendermime: IRenderMimeRegistry = js.native
}
object IOptions {
  
  @scala.inline
  def apply[T /* <: MimeDocument */](fileTypes: js.Array[String], name: String, rendermime: IRenderMimeRegistry): IOptions[T] = {
    val __obj = js.Dynamic.literal(fileTypes = fileTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions[_], T /* <: MimeDocument */] (val x: Self with IOptions[T]) extends AnyVal {
    
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
    def setRendermime(value: IRenderMimeRegistry): Self = this.set("rendermime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: string | json): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setPrimaryFileType(value: IFileType): Self = this.set("primaryFileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryFileType: Self = this.set("primaryFileType", js.undefined)
    
    @scala.inline
    def setRenderTimeout(value: Double): Self = this.set("renderTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderTimeout: Self = this.set("renderTimeout", js.undefined)
  }
}
