package typings.atJupyterlabCoreutils.libNbformatMod.nbformat

import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.auto
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for a code cell.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atJupyterlabCoreutils.libNbformatMod.nbformat.ICellMetadata because Already inherited */ trait ICodeCellMetadata extends IBaseCellMetadata {
  /**
    * Whether the cell is collapsed/expanded.
    */
  var collapsed: Boolean
  /**
    * The Jupyter metadata namespace
    */
  @JSName("jupyter")
  var jupyter_ICodeCellMetadata: Partial[ICodeCellJupyterMetadata]
  /**
    * Whether the cell's output is scrolled, unscrolled, or autoscrolled.
    */
  var scrolled: Boolean | auto
}

object ICodeCellMetadata {
  @scala.inline
  def apply(
    collapsed: Boolean,
    jupyter: Partial[ICodeCellJupyterMetadata],
    name: String,
    scrolled: Boolean | auto,
    tags: js.Array[String],
    trusted: Boolean
  ): ICodeCellMetadata = {
    val __obj = js.Dynamic.literal(collapsed = collapsed, jupyter = jupyter, name = name, scrolled = scrolled.asInstanceOf[js.Any], tags = tags, trusted = trusted)
  
    __obj.asInstanceOf[ICodeCellMetadata]
  }
}

