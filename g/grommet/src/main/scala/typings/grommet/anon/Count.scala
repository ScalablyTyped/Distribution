package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count extends StObject {
  
  var count: Double
  
  var expanded: js.UndefOr[js.Array[String]] = js.undefined
  
  var show: Double
  
  var sort: js.UndefOr[DirectionProperty] = js.undefined
}
object Count {
  
  inline def apply(count: Double, show: Double): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setExpanded(value: js.Array[String]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setExpandedVarargs(value: String*): Self = StObject.set(x, "expanded", js.Array(value*))
    
    inline def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setSort(value: DirectionProperty): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
