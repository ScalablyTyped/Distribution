package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionConstraints extends StObject {
  
  var height: js.UndefOr[QualityConstraints] = js.undefined
  
  var width: js.UndefOr[QualityConstraints] = js.undefined
}
object DimensionConstraints {
  
  inline def apply(): DimensionConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionConstraints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DimensionConstraints] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: QualityConstraints): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: QualityConstraints): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
