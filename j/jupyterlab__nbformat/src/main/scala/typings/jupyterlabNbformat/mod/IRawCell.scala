package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.anon.PartialIRawCellMetadata
import typings.jupyterlabNbformat.jupyterlabNbformatStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRawCell
  extends StObject
     with IBaseCell
     with _ICell {
  
  /**
    * Cell attachments.
    */
  var attachments: js.UndefOr[IAttachments] = js.undefined
  
  /**
    * String identifying the type of cell.
    */
  @JSName("cell_type")
  var cell_type_IRawCell: raw
  
  /**
    * Cell-level metadata.
    */
  @JSName("metadata")
  var metadata_IRawCell: PartialIRawCellMetadata
}
object IRawCell {
  
  @scala.inline
  def apply(metadata: PartialIRawCellMetadata, source: MultilineString): IRawCell = {
    val __obj = js.Dynamic.literal(cell_type = "raw", metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRawCell]
  }
  
  @scala.inline
  implicit class IRawCellMutableBuilder[Self <: IRawCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: IAttachments): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setCell_type(value: raw): Self = StObject.set(x, "cell_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: PartialIRawCellMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
