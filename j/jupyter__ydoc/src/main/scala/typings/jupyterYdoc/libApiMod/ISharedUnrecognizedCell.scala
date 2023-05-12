package typings.jupyterYdoc.libApiMod

import typings.jupyterlabNbformat.mod.IBaseCellMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISharedUnrecognizedCell
  extends StObject
     with ISharedBaseCell[IBaseCellMetadata]
     with ISharedCell {
  
  /**
    * The type of the cell.
    *
    * The notebook format specified the type will not be 'markdown' | 'raw' | 'code'
    */
  @JSName("cell_type")
  var cell_type_ISharedUnrecognizedCell: String = js.native
}
