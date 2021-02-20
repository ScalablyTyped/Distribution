package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationControlPointOptionsObject extends StObject {
  
  var positioner: js.UndefOr[AnnotationControlPointPositionerFunction] = js.native
}
object AnnotationControlPointOptionsObject {
  
  @scala.inline
  def apply(): AnnotationControlPointOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationControlPointOptionsObject]
  }
  
  @scala.inline
  implicit class AnnotationControlPointOptionsObjectMutableBuilder[Self <: AnnotationControlPointOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPositioner(value: AnnotationControlPointPositionerFunction): Self = StObject.set(x, "positioner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionerUndefined: Self = StObject.set(x, "positioner", js.undefined)
  }
}
