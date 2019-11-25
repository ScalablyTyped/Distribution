package typings.knockoutDotKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowFactory[EntityType] extends js.Object {
  var rowCache: js.Array[Row[EntityType]]
}

object RowFactory {
  @scala.inline
  def apply[EntityType](rowCache: js.Array[Row[EntityType]]): RowFactory[EntityType] = {
    val __obj = js.Dynamic.literal(rowCache = rowCache.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RowFactory[EntityType]]
  }
}

