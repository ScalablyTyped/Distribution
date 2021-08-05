package typings.kendoUi.anon

import typings.kendoUi.kendo.dataviz.ui.QRCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofQRCode extends StObject {
  
  /* static member */
  def extend(proto: js.Object): QRCode
  
  /* static member */
  var fn: QRCode
}
object TypeofQRCode {
  
  inline def apply(extend: js.Object => QRCode, fn: QRCode): TypeofQRCode = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofQRCode]
  }
  
  extension [Self <: TypeofQRCode](x: Self) {
    
    inline def setExtend(value: js.Object => QRCode): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: QRCode): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
