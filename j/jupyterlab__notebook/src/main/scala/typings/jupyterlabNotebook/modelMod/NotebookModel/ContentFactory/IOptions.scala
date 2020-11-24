package typings.jupyterlabNotebook.modelMod.NotebookModel.ContentFactory

import typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory
import typings.jupyterlabObservables.modeldbMod.IModelDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to initialize a `ContentFactory`.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The factory for code cell model content.
    */
  var codeCellContentFactory: js.UndefOr[IContentFactory] = js.native
  
  /**
    * The modelDB in which to place new content.
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
    def setCodeCellContentFactory(value: IContentFactory): Self = this.set("codeCellContentFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeCellContentFactory: Self = this.set("codeCellContentFactory", js.undefined)
    
    @scala.inline
    def setModelDB(value: IModelDB): Self = this.set("modelDB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelDB: Self = this.set("modelDB", js.undefined)
  }
}
