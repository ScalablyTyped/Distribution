package typings.luminoWidgets.commandpaletteMod.CommandPalette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The render data for a command palette item.
  */
@js.native
trait IItemRenderData extends js.Object {
  
  /**
    * Whether the item is the active item.
    */
  val active: Boolean = js.native
  
  /**
    * The indices of the matched characters in the label.
    */
  val indices: js.Array[Double] | Null = js.native
  
  /**
    * The command palette item to render.
    */
  val item: IItem = js.native
}
object IItemRenderData {
  
  @scala.inline
  def apply(active: Boolean, item: IItem): IItemRenderData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemRenderData]
  }
  
  @scala.inline
  implicit class IItemRenderDataOps[Self <: IItemRenderData] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: IItem): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesVarargs(value: Double*): Self = this.set("indices", js.Array(value :_*))
    
    @scala.inline
    def setIndices(value: js.Array[Double]): Self = this.set("indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesNull: Self = this.set("indices", null)
  }
}
