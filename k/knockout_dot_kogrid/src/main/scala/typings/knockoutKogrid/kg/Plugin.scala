package typings.knockoutKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin[EntityType] extends js.Object {
  def onGridInit(grid: Grid[EntityType]): Unit
}

object Plugin {
  @scala.inline
  def apply[EntityType](onGridInit: Grid[EntityType] => Unit): Plugin[EntityType] = {
    val __obj = js.Dynamic.literal(onGridInit = js.Any.fromFunction1(onGridInit))
    __obj.asInstanceOf[Plugin[EntityType]]
  }
}

