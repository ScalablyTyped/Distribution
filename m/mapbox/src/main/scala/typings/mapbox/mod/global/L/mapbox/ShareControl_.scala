package typings.mapbox.mod.global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Control * / any */ trait ShareControl_ extends js.Object {
  def onAdd(map: Map_): js.Any
}

object ShareControl_ {
  @scala.inline
  def apply(onAdd: Map_ => js.Any): ShareControl_ = {
    val __obj = js.Dynamic.literal(onAdd = js.Any.fromFunction1(onAdd))
    __obj.asInstanceOf[ShareControl_]
  }
}

