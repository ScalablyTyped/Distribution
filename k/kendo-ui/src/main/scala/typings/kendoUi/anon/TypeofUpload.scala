package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Upload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofUpload extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Upload
  
  /* static member */
  var fn: Upload
}
object TypeofUpload {
  
  inline def apply(extend: js.Object => Upload, fn: Upload): TypeofUpload = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofUpload]
  }
  
  extension [Self <: TypeofUpload](x: Self) {
    
    inline def setExtend(value: js.Object => Upload): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Upload): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
