package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.anon.PartialIBaseCellJupyterMe
import typings.jupyterlabNbformat.anon.PartialICodeCellJupyterMe
import typings.jupyterlabNbformat.jupyterlabNbformatStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabNbformat.mod.IBaseCellMetadata
  - typings.jupyterlabNbformat.mod.IRawCellMetadata
  - typings.jupyterlabNbformat.mod.ICodeCellMetadata
*/
trait ICellMetadata extends StObject
object ICellMetadata {
  
  inline def IBaseCellMetadata(jupyter: PartialIBaseCellJupyterMe, name: String, tags: js.Array[String], trusted: Boolean): typings.jupyterlabNbformat.mod.IBaseCellMetadata = {
    val __obj = js.Dynamic.literal(jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabNbformat.mod.IBaseCellMetadata]
  }
  
  inline def ICodeCellMetadata(
    collapsed: Boolean,
    jupyter: PartialICodeCellJupyterMe,
    name: String,
    scrolled: Boolean | auto,
    tags: js.Array[String],
    trusted: Boolean
  ): typings.jupyterlabNbformat.mod.ICodeCellMetadata = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scrolled = scrolled.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabNbformat.mod.ICodeCellMetadata]
  }
  
  inline def IRawCellMetadata(
    format: String,
    jupyter: PartialIBaseCellJupyterMe,
    name: String,
    tags: js.Array[String],
    trusted: Boolean
  ): typings.jupyterlabNbformat.mod.IRawCellMetadata = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabNbformat.mod.IRawCellMetadata]
  }
}
