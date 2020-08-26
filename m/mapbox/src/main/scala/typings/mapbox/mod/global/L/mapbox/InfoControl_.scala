package typings.mapbox.mod.global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Control * / any */ @js.native
trait InfoControl_ extends js.Object {
  /**
    * Adds an info string to infoControl.
    */
  def addInfo(info: String): js.Any = js.native
  def onAdd(map: Map_): js.Any = js.native
  def onRemove(map: Map_): js.Any = js.native
  /**
    * Removes an info string from infoControl
    */
  def removeInfo(info: String): js.Any = js.native
}

object InfoControl_ {
  @scala.inline
  def apply(
    addInfo: String => js.Any,
    onAdd: Map_ => js.Any,
    onRemove: Map_ => js.Any,
    removeInfo: String => js.Any
  ): InfoControl_ = {
    val __obj = js.Dynamic.literal(addInfo = js.Any.fromFunction1(addInfo), onAdd = js.Any.fromFunction1(onAdd), onRemove = js.Any.fromFunction1(onRemove), removeInfo = js.Any.fromFunction1(removeInfo))
    __obj.asInstanceOf[InfoControl_]
  }
  @scala.inline
  implicit class InfoControl_Ops[Self <: InfoControl_] (val x: Self) extends AnyVal {
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
    def setAddInfo(value: String => js.Any): Self = this.set("addInfo", js.Any.fromFunction1(value))
    @scala.inline
    def setOnAdd(value: Map_ => js.Any): Self = this.set("onAdd", js.Any.fromFunction1(value))
    @scala.inline
    def setOnRemove(value: Map_ => js.Any): Self = this.set("onRemove", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveInfo(value: String => js.Any): Self = this.set("removeInfo", js.Any.fromFunction1(value))
  }
  
}

