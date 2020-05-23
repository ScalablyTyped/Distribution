package typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools

import typings.jupyterlabNotebook.jupyterlabNotebookStrings.advanced
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.common
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to add an item to the notebook tools.
  */
trait IAddOptions extends js.Object {
  /**
    * The rank order of the widget among its siblings.
    */
  var rank: js.UndefOr[Double] = js.undefined
  /**
    * The section to which the tool should be added.
    */
  var section: js.UndefOr[common | advanced] = js.undefined
  /**
    * The tool to add to the notebook tools area.
    */
  var tool: Tool
}

object IAddOptions {
  @scala.inline
  def apply(tool: Tool, rank: js.UndefOr[Double] = js.undefined, section: common | advanced = null): IAddOptions = {
    val __obj = js.Dynamic.literal(tool = tool.asInstanceOf[js.Any])
    if (!js.isUndefined(rank)) __obj.updateDynamic("rank")(rank.get.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddOptions]
  }
}

