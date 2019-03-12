package typings
package knockoutDotKogridLib.kgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin[EntityType] extends js.Object {
  def onGridInit(grid: Grid[EntityType]): scala.Unit
}

object Plugin {
  @scala.inline
  def apply[EntityType](onGridInit: Grid[EntityType] => scala.Unit): Plugin[EntityType] = {
    val __obj = js.Dynamic.literal(onGridInit = js.Any.fromFunction1(onGridInit))
  
    __obj.asInstanceOf[Plugin[EntityType]]
  }
}

