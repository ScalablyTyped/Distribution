package typings.jupyterlabNbformat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICodeCellJupyterMetadata extends IBaseCellJupyterMetadata {
  
  /**
    * Whether the outputs are hidden. See https://github.com/jupyter/nbformat/issues/137.
    */
  var outputs_hidden: Boolean = js.native
}
object ICodeCellJupyterMetadata {
  
  @scala.inline
  def apply(outputs_hidden: Boolean, source_hidden: Boolean): ICodeCellJupyterMetadata = {
    val __obj = js.Dynamic.literal(outputs_hidden = outputs_hidden.asInstanceOf[js.Any], source_hidden = source_hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeCellJupyterMetadata]
  }
  
  @scala.inline
  implicit class ICodeCellJupyterMetadataMutableBuilder[Self <: ICodeCellJupyterMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputs_hidden(value: Boolean): Self = StObject.set(x, "outputs_hidden", value.asInstanceOf[js.Any])
  }
}
