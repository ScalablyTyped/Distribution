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
    val __obj = js.Dynamic.literal(format = format, jupyter = jupyter, name = name, tags = tags, trusted = trusted)
  
    __obj.asInstanceOf[IRawCellMetadata]
  }
}

