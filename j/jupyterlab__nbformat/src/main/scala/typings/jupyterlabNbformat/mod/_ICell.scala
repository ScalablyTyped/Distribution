package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.anon.PartialICodeCellMetadata
import typings.jupyterlabNbformat.anon.PartialIRawCellMetadata
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ICell extends StObject
object _ICell {
  
  inline def ICodeCell(metadata: PartialICodeCellMetadata, outputs: js.Array[IOutput], source: MultilineString): typings.jupyterlabNbformat.mod.ICodeCell = {
    val __obj = js.Dynamic.literal(cell_type = "code", metadata = metadata.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], execution_count = null)
    __obj.asInstanceOf[typings.jupyterlabNbformat.mod.ICodeCell]
  }
  
  inline def IMarkdownCell(metadata: Partial[ICellMetadata], source: MultilineString): typings.jupyterlabNbformat.mod.IMarkdownCell = {
    val __obj = js.Dynamic.literal(cell_type = "markdown", metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabNbformat.mod.IMarkdownCell]
  }
  
  inline def IRawCell(metadata: PartialIRawCellMetadata, source: MultilineString): typings.jupyterlabNbformat.mod.IRawCell = {
    val __obj = js.Dynamic.literal(cell_type = "raw", metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabNbformat.mod.IRawCell]
  }
}
