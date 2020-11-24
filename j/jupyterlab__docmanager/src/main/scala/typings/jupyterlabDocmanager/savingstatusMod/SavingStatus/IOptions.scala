package typings.jupyterlabDocmanager.savingstatusMod.SavingStatus

import typings.jupyterlabDocmanager.tokensMod.IDocumentManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for creating a new SaveStatus item
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The application document manager.
    */
  var docManager: IDocumentManager = js.native
}
object IOptions {
  
  @scala.inline
  def apply(docManager: IDocumentManager): IOptions = {
    val __obj = js.Dynamic.literal(docManager = docManager.asInstanceOf[js.Any])
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
    def setDocManager(value: IDocumentManager): Self = this.set("docManager", value.asInstanceOf[js.Any])
  }
}
