package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Control * / any */ trait InfoControl_ extends StObject {
  
  /**
    * Adds an info string to infoControl.
    */
  def addInfo(info: String): js.Any
  
  def onAdd(map: Map_): js.Any
  
  def onRemove(map: Map_): js.Any
  
  /**
    * Removes an info string from infoControl
    */
  def removeInfo(info: String): js.Any
}
object InfoControl_ {
  
  inline def apply(
    addInfo: String => js.Any,
    onAdd: Map_ => js.Any,
    onRemove: Map_ => js.Any,
    removeInfo: String => js.Any
  ): InfoControl_ = {
    val __obj = js.Dynamic.literal(addInfo = js.Any.fromFunction1(addInfo), onAdd = js.Any.fromFunction1(onAdd), onRemove = js.Any.fromFunction1(onRemove), removeInfo = js.Any.fromFunction1(removeInfo))
    __obj.asInstanceOf[InfoControl_]
  }
  
  extension [Self <: InfoControl_](x: Self) {
    
    inline def setAddInfo(value: String => js.Any): Self = StObject.set(x, "addInfo", js.Any.fromFunction1(value))
    
    inline def setOnAdd(value: Map_ => js.Any): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    inline def setOnRemove(value: Map_ => js.Any): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
    
    inline def setRemoveInfo(value: String => js.Any): Self = StObject.set(x, "removeInfo", js.Any.fromFunction1(value))
  }
}
