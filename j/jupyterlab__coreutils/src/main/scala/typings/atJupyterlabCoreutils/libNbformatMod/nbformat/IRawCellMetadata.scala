package typings.atJupyterlabCoreutils.libNbformatMod.nbformat

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for the raw cell.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atJupyterlabCoreutils.libNbformatMod.nbformat.ICellMetadata because Already inherited */ trait IRawCellMetadata extends IBaseCellMetadata {
  /**
    * Raw cell metadata format for nbconvert.
    */
  var format: String
}

object IRawCellMetadata {
  @scala.inline
  def apply(
    format: String,
    jupyter: Partial[IBaseCellJupyterMetadata],
    name: String,
    tags: js.Array[String],
    trusted: Boolean
  ): IRawCellMetadata = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRawCellMetadata]
  }
}

