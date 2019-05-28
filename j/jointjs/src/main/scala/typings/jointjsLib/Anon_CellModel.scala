package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellModel extends js.Object {
  var cellModel: js.UndefOr[TypeofClassCell] = js.undefined
  var cellNamespace: js.UndefOr[js.Any] = js.undefined
}

object Anon_CellModel {
  @scala.inline
  def apply(cellModel: TypeofClassCell = null, cellNamespace: js.Any = null): Anon_CellModel = {
    val __obj = js.Dynamic.literal()
    if (cellModel != null) __obj.updateDynamic("cellModel")(cellModel)
    if (cellNamespace != null) __obj.updateDynamic("cellNamespace")(cellNamespace)
    __obj.asInstanceOf[Anon_CellModel]
  }
}

