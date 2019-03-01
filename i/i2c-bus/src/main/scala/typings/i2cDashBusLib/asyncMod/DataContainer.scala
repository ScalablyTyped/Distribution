package typings
package i2cDashBusLib.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataContainer[T] extends js.Object {
  var data: T
}

object DataContainer {
  @scala.inline
  def apply[T](data: T): DataContainer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataContainer[T]]
  }
}

