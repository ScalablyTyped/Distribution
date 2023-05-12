package typings.jupyterYdoc.anon

import typings.jupyterYdoc.jupyterYdocStrings.code
import typings.jupyterYdoc.libApiMod.SharedCell.Cell
import typings.jupyterlabNbformat.anon.PartialICodeCellMetadata
import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.jupyterlabNbformat.mod.IOutput
import typings.jupyterlabNbformat.mod.MultilineString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.ICodeCell> & {  cell_type :string} */
trait PartialICodeCellcelltypes
  extends StObject
     with Cell {
  
  var cell_type: js.UndefOr[code] = js.undefined
  
  var execution_count: js.UndefOr[ExecutionCount] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[PartialICodeCellMetadata] = js.undefined
  
  var outputs: js.UndefOr[js.Array[IOutput]] = js.undefined
  
  var source: js.UndefOr[MultilineString] = js.undefined
}
object PartialICodeCellcelltypes {
  
  inline def apply(): PartialICodeCellcelltypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialICodeCellcelltypes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialICodeCellcelltypes] (val x: Self) extends AnyVal {
    
    inline def setCell_type(value: code): Self = StObject.set(x, "cell_type", value.asInstanceOf[js.Any])
    
    inline def setCell_typeUndefined: Self = StObject.set(x, "cell_type", js.undefined)
    
    inline def setExecution_count(value: ExecutionCount): Self = StObject.set(x, "execution_count", value.asInstanceOf[js.Any])
    
    inline def setExecution_countNull: Self = StObject.set(x, "execution_count", null)
    
    inline def setExecution_countUndefined: Self = StObject.set(x, "execution_count", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMetadata(value: PartialICodeCellMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOutputs(value: js.Array[IOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setOutputsVarargs(value: IOutput*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setSource(value: MultilineString): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value*))
  }
}
