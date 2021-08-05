package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationControlPointOptionsObject extends StObject {
  
  var positioner: js.UndefOr[AnnotationControlPointPositionerFunction] = js.undefined
}
object AnnotationControlPointOptionsObject {
  
  inline def apply(): AnnotationControlPointOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationControlPointOptionsObject]
  }
  
  extension [Self <: AnnotationControlPointOptionsObject](x: Self) {
    
    inline def setPositioner(value: AnnotationControlPointPositionerFunction): Self = StObject.set(x, "positioner", value.asInstanceOf[js.Any])
    
    inline def setPositionerUndefined: Self = StObject.set(x, "positioner", js.undefined)
  }
}
