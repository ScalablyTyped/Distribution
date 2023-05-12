package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Signature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSignature extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Signature
  
  /* static member */
  var fn: Signature
}
object TypeofSignature {
  
  inline def apply(extend: js.Object => Signature, fn: Signature): TypeofSignature = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSignature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSignature] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => Signature): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Signature): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
