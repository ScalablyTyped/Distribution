package typings.jupyterlabNotebook.tokensMod.INotebookTools

import typings.jupyterlabNotebook.jupyterlabNotebookStrings.advanced
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.common
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to add an item to the notebook tools.
  */
@js.native
trait IAddOptions extends js.Object {
  
  /**
    * The rank order of the widget among its siblings.
    */
  var rank: js.UndefOr[Double] = js.native
  
  /**
    * The section to which the tool should be added.
    */
  var section: js.UndefOr[common | advanced] = js.native
  
  /**
    * The tool to add to the notebook tools area.
    */
  var tool: ITool = js.native
}
object IAddOptions {
  
  @scala.inline
  def apply(tool: ITool): IAddOptions = {
    val __obj = js.Dynamic.literal(tool = tool.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddOptions]
  }
  
  @scala.inline
  implicit class IAddOptionsOps[Self <: IAddOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTool(value: ITool): Self = this.set("tool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
    
    @scala.inline
    def setSection(value: common | advanced): Self = this.set("section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSection: Self = this.set("section", js.undefined)
  }
}
