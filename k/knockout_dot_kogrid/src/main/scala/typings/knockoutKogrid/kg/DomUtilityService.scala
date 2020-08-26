package typings.knockoutKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomUtilityService extends js.Object {
  def BuildStyles(grid: Grid[_]): Unit = js.native
  def UpdateGridLayout(grid: Grid[_]): Unit = js.native
}

object DomUtilityService {
  @scala.inline
  def apply(BuildStyles: Grid[_] => Unit, UpdateGridLayout: Grid[_] => Unit): DomUtilityService = {
    val __obj = js.Dynamic.literal(BuildStyles = js.Any.fromFunction1(BuildStyles), UpdateGridLayout = js.Any.fromFunction1(UpdateGridLayout))
    __obj.asInstanceOf[DomUtilityService]
  }
  @scala.inline
  implicit class DomUtilityServiceOps[Self <: DomUtilityService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuildStyles(value: Grid[_] => Unit): Self = this.set("BuildStyles", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateGridLayout(value: Grid[_] => Unit): Self = this.set("UpdateGridLayout", js.Any.fromFunction1(value))
  }
  
}

