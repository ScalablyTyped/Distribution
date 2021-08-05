package typings.kendoUi.anon

import typings.kendoUi.kendo.dataviz.ui.Barcode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBarcode extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Barcode
  
  /* static member */
  var fn: Barcode
}
object TypeofBarcode {
  
  inline def apply(extend: js.Object => Barcode, fn: Barcode): TypeofBarcode = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBarcode]
  }
  
  extension [Self <: TypeofBarcode](x: Self) {
    
    inline def setExtend(value: js.Object => Barcode): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Barcode): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
