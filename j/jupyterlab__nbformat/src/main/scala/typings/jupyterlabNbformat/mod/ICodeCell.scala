package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.anon.PartialICodeCellMetadata
import typings.jupyterlabNbformat.jupyterlabNbformatStrings.code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICodeCell
  extends StObject
     with IBaseCell
     with _ICell {
  
  /**
    * String identifying the type of cell.
    */
  @JSName("cell_type")
  var cell_type_ICodeCell: code
  
  /**
    * The code cell's prompt number. Will be null if the cell has not been run.
    */
  var execution_count: ExecutionCount
  
  /**
    * Cell-level metadata.
    */
  @JSName("metadata")
  var metadata_ICodeCell: PartialICodeCellMetadata
  
  /**
    * Execution, display, or stream outputs.
    */
  var outputs: js.Array[IOutput]
}
object ICodeCell {
  
  @scala.inline
  def apply(metadata: PartialICodeCellMetadata, outputs: js.Array[IOutput], source: MultilineString): ICodeCell = {
    val __obj = js.Dynamic.literal(cell_type = "code", metadata = metadata.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], execution_count = null)
    __obj.asInstanceOf[ICodeCell]
  }
  
  @scala.inline
  implicit class ICodeCellMutableBuilder[Self <: ICodeCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCell_type(value: code): Self = StObject.set(x, "cell_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecution_count(value: ExecutionCount): Self = StObject.set(x, "execution_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecution_countNull: Self = StObject.set(x, "execution_count", null)
    
    @scala.inline
    def setMetadata(value: PartialICodeCellMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputs(value: js.Array[IOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsVarargs(value: IOutput*): Self = StObject.set(x, "outputs", js.Array(value :_*))
  }
}
