package typings.jupyterYdoc.libApiMod

import typings.jupyterYdoc.anon.Delete
import typings.jupyterYdoc.anon.NewValueOldValue
import typings.jupyterYdoc.anon.OldValue
import typings.jupyterlabNbformat.mod.IOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellChange
  extends StObject
     with SourceChange {
  
  /**
    * Cell attachment change
    */
  var attachmentsChange: js.UndefOr[OldValue] = js.undefined
  
  /**
    * Cell execution count change
    */
  var executionCountChange: js.UndefOr[NewValueOldValue] = js.undefined
  
  /**
    * Cell metadata change
    */
  var metadataChange: js.UndefOr[MapChanges] = js.undefined
  
  /**
    * Cell output changes
    */
  var outputsChange: js.UndefOr[Delta[js.Array[IOutput]]] = js.undefined
}
object CellChange {
  
  inline def apply(): CellChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellChange] (val x: Self) extends AnyVal {
    
    inline def setAttachmentsChange(value: OldValue): Self = StObject.set(x, "attachmentsChange", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsChangeUndefined: Self = StObject.set(x, "attachmentsChange", js.undefined)
    
    inline def setExecutionCountChange(value: NewValueOldValue): Self = StObject.set(x, "executionCountChange", value.asInstanceOf[js.Any])
    
    inline def setExecutionCountChangeUndefined: Self = StObject.set(x, "executionCountChange", js.undefined)
    
    inline def setMetadataChange(value: MapChanges): Self = StObject.set(x, "metadataChange", value.asInstanceOf[js.Any])
    
    inline def setMetadataChangeUndefined: Self = StObject.set(x, "metadataChange", js.undefined)
    
    inline def setOutputsChange(value: Delta[js.Array[IOutput]]): Self = StObject.set(x, "outputsChange", value.asInstanceOf[js.Any])
    
    inline def setOutputsChangeUndefined: Self = StObject.set(x, "outputsChange", js.undefined)
    
    inline def setOutputsChangeVarargs(value: Delete[js.Array[IOutput]]*): Self = StObject.set(x, "outputsChange", js.Array(value*))
  }
}
