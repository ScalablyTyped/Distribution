package typings.jupyterlabNbformat.mod

import typings.luminoCoreutils.jsonMod.PartialJSONObject
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBaseCell extends PartialJSONObject {
  
  /**
    * String identifying the type of cell.
    */
  var cell_type: String = js.native
  
  /**
    * Cell-level metadata.
    */
  var metadata: Partial[ICellMetadata] = js.native
  
  /**
    * Contents of the cell, represented as an array of lines.
    */
  var source: MultilineString = js.native
}
object IBaseCell {
  
  @scala.inline
  def apply(cell_type: String, metadata: Partial[ICellMetadata], source: MultilineString): IBaseCell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseCell]
  }
  
  @scala.inline
  implicit class IBaseCellOps[Self <: IBaseCell] (val x: Self) extends AnyVal {
    
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
    def setCell_type(value: String): Self = this.set("cell_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: Partial[ICellMetadata]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceVarargs(value: String*): Self = this.set("source", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: MultilineString): Self = this.set("source", value.asInstanceOf[js.Any])
  }
}
