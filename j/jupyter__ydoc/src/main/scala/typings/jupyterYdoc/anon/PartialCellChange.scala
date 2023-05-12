package typings.jupyterYdoc.anon

import typings.jupyterYdoc.libApiMod.Delta
import typings.jupyterYdoc.libApiMod.MapChanges
import typings.jupyterlabNbformat.mod.IOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jupyter/ydoc.@jupyter/ydoc/lib/api.CellChange> */
trait PartialCellChange extends StObject {
  
  var attachmentsChange: js.UndefOr[OldValue] = js.undefined
  
  var executionCountChange: js.UndefOr[NewValueOldValue] = js.undefined
  
  var metadataChange: js.UndefOr[MapChanges] = js.undefined
  
  var outputsChange: js.UndefOr[Delta[js.Array[IOutput]]] = js.undefined
  
  var sourceChange: js.UndefOr[Delta[String]] = js.undefined
}
object PartialCellChange {
  
  inline def apply(): PartialCellChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCellChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCellChange] (val x: Self) extends AnyVal {
    
    inline def setAttachmentsChange(value: OldValue): Self = StObject.set(x, "attachmentsChange", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsChangeUndefined: Self = StObject.set(x, "attachmentsChange", js.undefined)
    
    inline def setExecutionCountChange(value: NewValueOldValue): Self = StObject.set(x, "executionCountChange", value.asInstanceOf[js.Any])
    
    inline def setExecutionCountChangeUndefined: Self = StObject.set(x, "executionCountChange", js.undefined)
    
    inline def setMetadataChange(value: MapChanges): Self = StObject.set(x, "metadataChange", value.asInstanceOf[js.Any])
    
    inline def setMetadataChangeUndefined: Self = StObject.set(x, "metadataChange", js.undefined)
    
    inline def setOutputsChange(value: Delta[js.Array[IOutput]]): Self = StObject.set(x, "outputsChange", value.asInstanceOf[js.Any])
    
    inline def setOutputsChangeUndefined: Self = StObject.set(x, "outputsChange", js.undefined)
    
    inline def setOutputsChangeVarargs(value: Delete[js.Array[IOutput]]*): Self = StObject.set(x, "outputsChange", js.Array(value*))
    
    inline def setSourceChange(value: Delta[String]): Self = StObject.set(x, "sourceChange", value.asInstanceOf[js.Any])
    
    inline def setSourceChangeUndefined: Self = StObject.set(x, "sourceChange", js.undefined)
    
    inline def setSourceChangeVarargs(value: Delete[String]*): Self = StObject.set(x, "sourceChange", js.Array(value*))
  }
}
