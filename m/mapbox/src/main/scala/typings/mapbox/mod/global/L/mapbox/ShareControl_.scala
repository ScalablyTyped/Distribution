package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Control * / any */ trait ShareControl_ extends StObject {
  
  def onAdd(map: Map_): js.Any
}
object ShareControl_ {
  
  @scala.inline
  def apply(onAdd: Map_ => js.Any): ShareControl_ = {
    val __obj = js.Dynamic.literal(onAdd = js.Any.fromFunction1(onAdd))
    __obj.asInstanceOf[ShareControl_]
  }
  
  @scala.inline
  implicit class ShareControl_MutableBuilder[Self <: ShareControl_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnAdd(value: Map_ => js.Any): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
  }
}
