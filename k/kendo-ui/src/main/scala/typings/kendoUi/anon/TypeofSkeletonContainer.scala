package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.SkeletonContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSkeletonContainer extends StObject {
  
  /* static member */
  def extend(proto: js.Object): SkeletonContainer
  
  /* static member */
  var fn: SkeletonContainer
}
object TypeofSkeletonContainer {
  
  inline def apply(extend: js.Object => SkeletonContainer, fn: SkeletonContainer): TypeofSkeletonContainer = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSkeletonContainer]
  }
  
  extension [Self <: TypeofSkeletonContainer](x: Self) {
    
    inline def setExtend(value: js.Object => SkeletonContainer): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: SkeletonContainer): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
