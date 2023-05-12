package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Chip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofChip extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Chip
  
  /* static member */
  var fn: Chip
}
object TypeofChip {
  
  inline def apply(extend: js.Object => Chip, fn: Chip): TypeofChip = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofChip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofChip] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => Chip): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Chip): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
