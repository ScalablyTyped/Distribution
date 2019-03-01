package typings
package knockoutDotKogridLib.kgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowFactory[EntityType] extends js.Object {
  var rowCache: js.Array[Row[EntityType]]
}

object RowFactory {
  @scala.inline
  def apply[EntityType](rowCache: js.Array[Row[EntityType]]): RowFactory[EntityType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rowCache")(rowCache)
    __obj.asInstanceOf[RowFactory[EntityType]]
  }
}

