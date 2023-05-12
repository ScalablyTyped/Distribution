package typings.jupyterYdoc.anon

import typings.jupyterYdoc.jupyterYdocStrings.markdown
import typings.jupyterYdoc.libApiMod.SharedCell.Cell
import typings.jupyterlabNbformat.mod.IAttachments
import typings.jupyterlabNbformat.mod.ICellMetadata
import typings.jupyterlabNbformat.mod.MultilineString
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.IMarkdownCell> & {  cell_type :string} */
trait PartialIMarkdownCellcellt
  extends StObject
     with Cell {
  
  var attachments: js.UndefOr[IAttachments] = js.undefined
  
  var cell_type: js.UndefOr[markdown] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[Partial[ICellMetadata]] = js.undefined
  
  var source: js.UndefOr[MultilineString] = js.undefined
}
object PartialIMarkdownCellcellt {
  
  inline def apply(): PartialIMarkdownCellcellt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIMarkdownCellcellt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialIMarkdownCellcellt] (val x: Self) extends AnyVal {
    
    inline def setAttachments(value: IAttachments): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setCell_type(value: markdown): Self = StObject.set(x, "cell_type", value.asInstanceOf[js.Any])
    
    inline def setCell_typeUndefined: Self = StObject.set(x, "cell_type", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMetadata(value: Partial[ICellMetadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSource(value: MultilineString): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value*))
  }
}
