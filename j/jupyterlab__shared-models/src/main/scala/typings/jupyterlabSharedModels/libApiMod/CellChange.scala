package typings.jupyterlabSharedModels.libApiMod

import typings.jupyterlabNbformat.mod.IOutput
import typings.jupyterlabSharedModels.anon.Delete
import typings.jupyterlabSharedModels.anon.NewValue
import typings.jupyterlabSharedModels.anon.OldValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellChange[MetadataType] extends StObject {
  
  var executionCountChange: js.UndefOr[NewValue] = js.undefined
  
  var metadataChange: js.UndefOr[OldValue[MetadataType]] = js.undefined
  
  var outputsChange: js.UndefOr[Delta[js.Array[IOutput]]] = js.undefined
  
  var sourceChange: js.UndefOr[Delta[String]] = js.undefined
}
object CellChange {
  
  inline def apply[MetadataType](): CellChange[MetadataType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellChange[MetadataType]]
  }
  
  extension [Self <: CellChange[?], MetadataType](x: Self & CellChange[MetadataType]) {
    
    inline def setExecutionCountChange(value: NewValue): Self = StObject.set(x, "executionCountChange", value.asInstanceOf[js.Any])
    
    inline def setExecutionCountChangeUndefined: Self = StObject.set(x, "executionCountChange", js.undefined)
    
    inline def setMetadataChange(value: OldValue[MetadataType]): Self = StObject.set(x, "metadataChange", value.asInstanceOf[js.Any])
    
    inline def setMetadataChangeUndefined: Self = StObject.set(x, "metadataChange", js.undefined)
    
    inline def setOutputsChange(value: Delta[js.Array[IOutput]]): Self = StObject.set(x, "outputsChange", value.asInstanceOf[js.Any])
    
    inline def setOutputsChangeUndefined: Self = StObject.set(x, "outputsChange", js.undefined)
    
    inline def setOutputsChangeVarargs(value: Delete[js.Array[IOutput]]*): Self = StObject.set(x, "outputsChange", js.Array(value*))
    
    inline def setSourceChange(value: Delta[String]): Self = StObject.set(x, "sourceChange", value.asInstanceOf[js.Any])
    
    inline def setSourceChangeUndefined: Self = StObject.set(x, "sourceChange", js.undefined)
    
    inline def setSourceChangeVarargs(value: Delete[String]*): Self = StObject.set(x, "sourceChange", js.Array(value*))
  }
}
