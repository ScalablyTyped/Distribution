package typings.jupyterlabNotebook.widgetMod.StaticNotebook

import typings.jupyterlabCoreutils.nbformatMod.nbformat.CellType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A config object for the notebook widget
  */
trait INotebookConfig extends js.Object {
  /**
    * The default type for new notebook cells.
    */
  var defaultCell: CellType
  /**
    * Enable scrolling past the last cell
    */
  var scrollPastEnd: Boolean
}

object INotebookConfig {
  @scala.inline
  def apply(defaultCell: CellType, scrollPastEnd: Boolean): INotebookConfig = {
    val __obj = js.Dynamic.literal(defaultCell = defaultCell.asInstanceOf[js.Any], scrollPastEnd = scrollPastEnd.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INotebookConfig]
  }
}

