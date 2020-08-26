package typings.luminoWidgets.commandpaletteMod.CommandPalette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The render data for a command palette header.
  */
@js.native
trait IHeaderRenderData extends js.Object {
  /**
    * The category of the header.
    */
  val category: String = js.native
  /**
    * The indices of the matched characters in the category.
    */
  val indices: js.Array[Double] | Null = js.native
}

object IHeaderRenderData {
  @scala.inline
  def apply(category: String): IHeaderRenderData = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHeaderRenderData]
  }
  @scala.inline
  implicit class IHeaderRenderDataOps[Self <: IHeaderRenderData] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndicesVarargs(value: Double*): Self = this.set("indices", js.Array(value :_*))
    @scala.inline
    def setIndices(value: js.Array[Double]): Self = this.set("indices", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndicesNull: Self = this.set("indices", null)
  }
  
}

