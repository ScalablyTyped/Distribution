package typings.jupyterlabCoreutils.nbformatMod.nbformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Jupyter metadata namespace for code cells.
  */
trait ICodeCellJupyterMetadata extends IBaseCellJupyterMetadata {
  /**
    * Whether the outputs are hidden. See https://github.com/jupyter/nbformat/issues/137.
    */
  var outputs_hidden: Boolean
}

object ICodeCellJupyterMetadata {
  @scala.inline
  def apply(outputs_hidden: Boolean, source_hidden: Boolean): ICodeCellJupyterMetadata = {
    val __obj = js.Dynamic.literal(outputs_hidden = outputs_hidden.asInstanceOf[js.Any], source_hidden = source_hidden.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICodeCellJupyterMetadata]
  }
}

