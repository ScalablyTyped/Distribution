package typings.jupyterlabNbformat.mod

import typings.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INotebookContent extends PartialJSONObject {
  
  var cells: js.Array[ICell] = js.native
  
  var metadata: INotebookMetadata = js.native
  
  var nbformat: Double = js.native
  
  var nbformat_minor: Double = js.native
}
object INotebookContent {
  
  @scala.inline
  def apply(cells: js.Array[ICell], metadata: INotebookMetadata, nbformat: Double, nbformat_minor: Double): INotebookContent = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], nbformat = nbformat.asInstanceOf[js.Any], nbformat_minor = nbformat_minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotebookContent]
  }
  
  @scala.inline
  implicit class INotebookContentOps[Self <: INotebookContent] (val x: Self) extends AnyVal {
    
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
    def setCellsVarargs(value: ICell*): Self = this.set("cells", js.Array(value :_*))
    
    @scala.inline
    def setCells(value: js.Array[ICell]): Self = this.set("cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: INotebookMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbformat(value: Double): Self = this.set("nbformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbformat_minor(value: Double): Self = this.set("nbformat_minor", value.asInstanceOf[js.Any])
  }
}
