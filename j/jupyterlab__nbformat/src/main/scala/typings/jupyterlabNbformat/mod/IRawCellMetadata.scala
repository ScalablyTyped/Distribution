package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.PartialIBaseCellJupyterMe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.jupyterlabNbformat.mod.ICellMetadata because Already inherited */ trait IRawCellMetadata extends IBaseCellMetadata {
  /**
    * Raw cell metadata format for nbconvert.
    */
  var format: String
}

object IRawCellMetadata {
  @scala.inline
  def apply(
    format: String,
    jupyter: PartialIBaseCellJupyterMe,
    name: String,
    tags: js.Array[String],
    trusted: Boolean
  ): IRawCellMetadata = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRawCellMetadata]
  }
}

