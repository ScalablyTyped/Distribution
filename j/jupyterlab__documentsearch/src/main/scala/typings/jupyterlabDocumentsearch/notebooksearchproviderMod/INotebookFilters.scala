package typings.jupyterlabDocumentsearch.notebooksearchproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INotebookFilters extends js.Object {
  
  /**
    * Should cell output be searched?
    */
  var output: Boolean = js.native
}
object INotebookFilters {
  
  @scala.inline
  def apply(output: Boolean): INotebookFilters = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotebookFilters]
  }
  
  @scala.inline
  implicit class INotebookFiltersOps[Self <: INotebookFilters] (val x: Self) extends AnyVal {
    
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
    def setOutput(value: Boolean): Self = this.set("output", value.asInstanceOf[js.Any])
  }
}
