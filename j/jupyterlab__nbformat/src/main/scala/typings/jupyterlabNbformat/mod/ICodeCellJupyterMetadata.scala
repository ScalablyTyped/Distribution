package typings.jupyterlabNbformat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICodeCellJupyterMetadata
  extends StObject
     with IBaseCellJupyterMetadata {
  
  /**
    * Whether the outputs are hidden. See https://github.com/jupyter/nbformat/issues/137.
    */
  var outputs_hidden: Boolean
}
object ICodeCellJupyterMetadata {
  
  inline def apply(outputs_hidden: Boolean, source_hidden: Boolean): ICodeCellJupyterMetadata = {
    val __obj = js.Dynamic.literal(outputs_hidden = outputs_hidden.asInstanceOf[js.Any], source_hidden = source_hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeCellJupyterMetadata]
  }
  
  extension [Self <: ICodeCellJupyterMetadata](x: Self) {
    
    inline def setOutputs_hidden(value: Boolean): Self = StObject.set(x, "outputs_hidden", value.asInstanceOf[js.Any])
  }
}
