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
  def apply[EntityType](onGridInit: js.Function1[Grid[EntityType], scala.Unit]): Plugin[EntityType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onGridInit")(onGridInit)
    __obj.asInstanceOf[Plugin[EntityType]]
  }
}

