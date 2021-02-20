package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.jupyterlabNbformatStrings.markdown
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMarkdownCell
  extends IBaseCell
     with _ICell {
  
  /**
    * Cell attachments.
    */
  var attachments: js.UndefOr[IAttachments] = js.native
  
  /**
    * String identifying the type of cell.
    */
  @JSName("cell_type")
  var cell_type_IMarkdownCell: markdown = js.native
}
object IMarkdownCell {
  
  @scala.inline
  def apply(cell_type: markdown, metadata: Partial[ICellMetadata], source: MultilineString): IMarkdownCell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarkdownCell]
  }
  
  @scala.inline
  implicit class IMarkdownCellMutableBuilder[Self <: IMarkdownCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: IAttachments): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setCell_type(value: markdown): Self = StObject.set(x, "cell_type", value.asInstanceOf[js.Any])
  }
}
