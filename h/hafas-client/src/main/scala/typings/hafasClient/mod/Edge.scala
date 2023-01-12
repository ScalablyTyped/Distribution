package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Edge extends StObject {
  
  var dir: js.UndefOr[Double] = js.undefined
  
  var fromLoc: js.UndefOr[Station | Stop | Location] = js.undefined
  
  var icoCrd: js.UndefOr[IcoCrd] = js.undefined
  
  var icon: js.UndefOr[js.Object] = js.undefined
  
  var toLoc: js.UndefOr[Station | Stop | Location] = js.undefined
}
object Edge {
  
  inline def apply(): Edge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Edge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Edge] (val x: Self) extends AnyVal {
    
    inline def setDir(value: Double): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setFromLoc(value: Station | Stop | Location): Self = StObject.set(x, "fromLoc", value.asInstanceOf[js.Any])
    
    inline def setFromLocUndefined: Self = StObject.set(x, "fromLoc", js.undefined)
    
    inline def setIcoCrd(value: IcoCrd): Self = StObject.set(x, "icoCrd", value.asInstanceOf[js.Any])
    
    inline def setIcoCrdUndefined: Self = StObject.set(x, "icoCrd", js.undefined)
    
    inline def setIcon(value: js.Object): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setToLoc(value: Station | Stop | Location): Self = StObject.set(x, "toLoc", value.asInstanceOf[js.Any])
    
    inline def setToLocUndefined: Self = StObject.set(x, "toLoc", js.undefined)
  }
}
