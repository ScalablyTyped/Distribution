package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Breadcrumb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBreadcrumb extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Breadcrumb
  
  /* static member */
  var fn: Breadcrumb
}
object TypeofBreadcrumb {
  
  inline def apply(extend: js.Object => Breadcrumb, fn: Breadcrumb): TypeofBreadcrumb = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBreadcrumb]
  }
  
  extension [Self <: TypeofBreadcrumb](x: Self) {
    
    inline def setExtend(value: js.Object => Breadcrumb): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Breadcrumb): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
