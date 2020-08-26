package typings.mapbox.mod.global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Control * / any */ @js.native
trait ShareControl_ extends js.Object {
  def onAdd(map: Map_): js.Any = js.native
}

object ShareControl_ {
  @scala.inline
  def apply(onAdd: Map_ => js.Any): ShareControl_ = {
    val __obj = js.Dynamic.literal(onAdd = js.Any.fromFunction1(onAdd))
    __obj.asInstanceOf[ShareControl_]
  }
  @scala.inline
  implicit class ShareControl_Ops[Self <: ShareControl_] (val x: Self) extends AnyVal {
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
    def setOnAdd(value: Map_ => js.Any): Self = this.set("onAdd", js.Any.fromFunction1(value))
  }
  
}

