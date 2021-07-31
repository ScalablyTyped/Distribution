package typings.jupyterlabNbformat.mod

import typings.luminoCoreutils.jsonMod.PartialJSONObject
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBaseCell
  extends StObject
     with PartialJSONObject {
  
  /**
    * String identifying the type of cell.
    */
  var cell_type: String
  
  /**
    * Cell-level metadata.
    */
  var metadata: Partial[ICellMetadata]
  
  /**
    * Contents of the cell, represented as an array of lines.
    */
  var source: MultilineString
}
object IBaseCell {
  
  @scala.inline
  def apply(cell_type: String, metadata: Partial[ICellMetadata], source: MultilineString): IBaseCell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseCell]
  }
  
  @scala.inline
  implicit class IBaseCellMutableBuilder[Self <: IBaseCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCell_type(value: String): Self = StObject.set(x, "cell_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: Partial[ICellMetadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: MultilineString): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value :_*))
  }
}
