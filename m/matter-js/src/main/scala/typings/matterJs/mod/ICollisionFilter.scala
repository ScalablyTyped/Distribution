package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICollisionFilter extends StObject {
  
  var category: js.UndefOr[Double] = js.undefined
  
  var group: js.UndefOr[Double] = js.undefined
  
  var mask: js.UndefOr[Double] = js.undefined
}
object ICollisionFilter {
  
  inline def apply(): ICollisionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICollisionFilter]
  }
  
  extension [Self <: ICollisionFilter](x: Self) {
    
    inline def setCategory(value: Double): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setGroup(value: Double): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
  }
}
