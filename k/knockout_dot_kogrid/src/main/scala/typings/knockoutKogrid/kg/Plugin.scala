package typings.knockoutKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin[EntityType] extends js.Object {
  def onGridInit(grid: Grid[EntityType]): Unit = js.native
}

object Plugin {
  @scala.inline
  def apply[EntityType](onGridInit: Grid[EntityType] => Unit): Plugin[EntityType] = {
    val __obj = js.Dynamic.literal(onGridInit = js.Any.fromFunction1(onGridInit))
    __obj.asInstanceOf[Plugin[EntityType]]
  }
  @scala.inline
  implicit class PluginOps[Self <: Plugin[_], EntityType] (val x: Self with Plugin[EntityType]) extends AnyVal {
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
    def setOnGridInit(value: Grid[EntityType] => Unit): Self = this.set("onGridInit", js.Any.fromFunction1(value))
  }
  
}

