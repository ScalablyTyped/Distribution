package typings
package knockoutDotKogridLib.kgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Plugin[EntityType] extends js.Object {
  def onGridInit(grid: Grid[EntityType]): scala.Unit
}

