package typings.kendoUi.anon

import typings.kendoUi.kendo.mobile.ui.ActionSheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofActionSheetExtend extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ActionSheet
  
  /* static member */
  var fn: ActionSheet
}
object TypeofActionSheetExtend {
  
  inline def apply(extend: js.Object => ActionSheet, fn: ActionSheet): TypeofActionSheetExtend = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofActionSheetExtend]
  }
  
  extension [Self <: TypeofActionSheetExtend](x: Self) {
    
    inline def setExtend(value: js.Object => ActionSheet): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: ActionSheet): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
