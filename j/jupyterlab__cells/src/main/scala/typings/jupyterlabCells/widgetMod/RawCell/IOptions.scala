package typings.jupyterlabCells.widgetMod.RawCell

import typings.jupyterlabCells.modelMod.ICellModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An options object for initializing a base cell widget.
  */
@js.native
trait IOptions
  extends typings.jupyterlabCells.widgetMod.Cell.IOptions
object IOptions {
  
  @scala.inline
  def apply(model: ICellModel): IOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}
