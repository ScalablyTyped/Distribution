package typings.luminoWidgets.commandpaletteMod.CommandPalette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The render data for a command palette header.
  */
trait IHeaderRenderData extends js.Object {
  /**
    * The category of the header.
    */
  val category: String
  /**
    * The indices of the matched characters in the category.
    */
  val indices: js.Array[Double] | Null
}

object IHeaderRenderData {
  @scala.inline
  def apply(category: String, indices: js.Array[Double] = null): IHeaderRenderData = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHeaderRenderData]
  }
}

