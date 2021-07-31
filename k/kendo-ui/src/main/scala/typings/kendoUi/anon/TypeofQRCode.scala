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
  
  @scala.inline
  def apply(extend: js.Object => QRCode, fn: QRCode): TypeofQRCode = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofQRCode]
  }
  
  @scala.inline
  implicit class TypeofQRCodeMutableBuilder[Self <: TypeofQRCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => QRCode): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: QRCode): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
