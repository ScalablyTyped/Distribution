package typings.jupyterlabDocregistry.registryMod.DocumentRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to create a document registry.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The initial file types for the registry.
    * The [[DocumentRegistry.defaultFileTypes]] will be used if not given.
    */
  var initialFileTypes: js.UndefOr[js.Array[IFileType]] = js.native
  
  /**
    * The text model factory for the registry.  A default instance will
    * be used if not given.
    */
  var textModelFactory: js.UndefOr[ModelFactory] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
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
    def setInitialFileTypesVarargs(value: IFileType*): Self = this.set("initialFileTypes", js.Array(value :_*))
    
    @scala.inline
    def setInitialFileTypes(value: js.Array[IFileType]): Self = this.set("initialFileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialFileTypes: Self = this.set("initialFileTypes", js.undefined)
    
    @scala.inline
    def setTextModelFactory(value: ModelFactory): Self = this.set("textModelFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextModelFactory: Self = this.set("textModelFactory", js.undefined)
  }
}
