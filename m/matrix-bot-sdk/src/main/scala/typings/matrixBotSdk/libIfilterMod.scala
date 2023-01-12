package typings.matrixBotSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIfilterMod {
  
  trait IFilterInfo extends StObject {
    
    var filter: Any
    
    var id: Double
  }
  object IFilterInfo {
    
    inline def apply(filter: Any, id: Double): IFilterInfo = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFilterInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFilterInfo] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
