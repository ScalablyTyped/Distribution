package typings.jupyterYdoc.anon

import typings.jupyterYdoc.jupyterYdocStrings.raw
import typings.jupyterYdoc.libApiMod.SharedCell.Cell
import typings.jupyterlabNbformat.anon.PartialIRawCellMetadata
import typings.jupyterlabNbformat.mod.IAttachments
import typings.jupyterlabNbformat.mod.MultilineString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.IRawCell> & {  cell_type :string} */
trait PartialIRawCellcelltypest
  extends StObject
     with Cell {
  
  var attachments: js.UndefOr[IAttachments] = js.undefined
  
  var cell_type: js.UndefOr[raw] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[PartialIRawCellMetadata] = js.undefined
  
  var source: js.UndefOr[MultilineString] = js.undefined
}
object PartialIRawCellcelltypest {
  
  inline def apply(): PartialIRawCellcelltypest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIRawCellcelltypest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialIRawCellcelltypest] (val x: Self) extends AnyVal {
    
    inline def setAttachments(value: IAttachments): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setCell_type(value: raw): Self = StObject.set(x, "cell_type", value.asInstanceOf[js.Any])
    
    inline def setCell_typeUndefined: Self = StObject.set(x, "cell_type", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMetadata(value: PartialIRawCellMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSource(value: MultilineString): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value*))
  }
}
