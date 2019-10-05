package typings.knockoutDotKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomUtilityService extends js.Object {
  def BuildStyles(grid: Grid[_]): Unit
  def UpdateGridLayout(grid: Grid[_]): Unit
}

object DomUtilityService {
  @scala.inline
  def apply(BuildStyles: Grid[_] => Unit, UpdateGridLayout: Grid[_] => Unit): DomUtilityService = {
    val __obj = js.Dynamic.literal(BuildStyles = js.Any.fromFunction1(BuildStyles), UpdateGridLayout = js.Any.fromFunction1(UpdateGridLayout))
  
    __obj.asInstanceOf[DomUtilityService]
  }
}

