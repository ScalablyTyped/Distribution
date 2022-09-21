package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.jupyterlabNbformatStrings.markdown
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMarkdownCell
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
  var cell_type_IMarkdownCell: markdown
  
  /**
    * A string field representing the identifier of this particular cell.
    *
    * Notebook format 4.4 requires no id field, but format 4.5 requires an id
    * field. We need to handle both cases, so we make id optional here.
    */
  var id: js.UndefOr[String] = js.undefined
}
object IMarkdownCell {
  
  inline def apply(metadata: Partial[ICellMetadata], source: MultilineString): IMarkdownCell = {
    val __obj = js.Dynamic.literal(cell_type = "markdown", metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarkdownCell]
  }
  
  extension [Self <: IMarkdownCell](x: Self) {
    
    inline def setAttachments(value: IAttachments): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setCell_type(value: markdown): Self = StObject.set(x, "cell_type", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
