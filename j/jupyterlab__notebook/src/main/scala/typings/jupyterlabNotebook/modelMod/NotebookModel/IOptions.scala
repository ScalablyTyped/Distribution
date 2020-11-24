package typings.jupyterlabNotebook.modelMod.NotebookModel

import typings.jupyterlabObservables.modeldbMod.IModelDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An options object for initializing a notebook model.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * A factory for creating cell models.
    *
    * The default is a shared factory instance.
    */
  var contentFactory: js.UndefOr[IContentFactory] = js.native
  
  /**
    * The language preference for the model.
    */
  var languagePreference: js.UndefOr[String] = js.native
  
  /**
    * A modelDB for storing notebook data.
    */
  var modelDB: js.UndefOr[IModelDB] = js.native
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
    def setContentFactory(value: IContentFactory): Self = this.set("contentFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentFactory: Self = this.set("contentFactory", js.undefined)
    
    @scala.inline
    def setLanguagePreference(value: String): Self = this.set("languagePreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguagePreference: Self = this.set("languagePreference", js.undefined)
    
    @scala.inline
    def setModelDB(value: IModelDB): Self = this.set("modelDB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelDB: Self = this.set("modelDB", js.undefined)
  }
}
