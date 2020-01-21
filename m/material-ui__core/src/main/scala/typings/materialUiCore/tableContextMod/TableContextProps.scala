package typings.materialUiCore.tableContextMod

import typings.materialUiCore.tableTableMod.Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableContextProps extends js.Object {
  var padding: Padding = js.native
}

object TableContextProps {
  @scala.inline
  def apply(padding: Padding): TableContextProps = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TableContextProps]
  }
}

