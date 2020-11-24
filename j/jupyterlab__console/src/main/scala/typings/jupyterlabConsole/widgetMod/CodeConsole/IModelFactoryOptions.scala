package typings.jupyterlabConsole.widgetMod.CodeConsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to initialize a `ModelFactory`.
  */
@js.native
trait IModelFactoryOptions extends js.Object {
  
  /**
    * The factory for output area models.
    */
  var codeCellContentFactory: js.UndefOr[typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory] = js.native
}
object IModelFactoryOptions {
  
  @scala.inline
  def apply(): IModelFactoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModelFactoryOptions]
  }
  
  @scala.inline
  implicit class IModelFactoryOptionsOps[Self <: IModelFactoryOptions] (val x: Self) extends AnyVal {
    
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
    def setCodeCellContentFactory(value: typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory): Self = this.set("codeCellContentFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeCellContentFactory: Self = this.set("codeCellContentFactory", js.undefined)
  }
}
