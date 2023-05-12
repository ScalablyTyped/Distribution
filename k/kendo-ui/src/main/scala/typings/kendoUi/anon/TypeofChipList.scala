package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.ChipList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofChipList extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ChipList
  
  /* static member */
  var fn: ChipList
}
object TypeofChipList {
  
  inline def apply(extend: js.Object => ChipList, fn: ChipList): TypeofChipList = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofChipList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofChipList] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => ChipList): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: ChipList): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
