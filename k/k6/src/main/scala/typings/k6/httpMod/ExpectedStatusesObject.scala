package typings.k6.httpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpectedStatusesObject extends StObject {
  
  var max: Double
  
  var min: Double
}
object ExpectedStatusesObject {
  
  inline def apply(max: Double, min: Double): ExpectedStatusesObject = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectedStatusesObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpectedStatusesObject] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
