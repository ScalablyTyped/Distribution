package typings.jupyterlabCoreutils.nbformatMod.nbformat

import typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.auto
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for a code cell.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.jupyterlabCoreutils.nbformatMod.nbformat.ICellMetadata because Already inherited */ trait ICodeCellMetadata extends IBaseCellMetadata {
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
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scrolled = scrolled.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICodeCellMetadata]
  }
}

