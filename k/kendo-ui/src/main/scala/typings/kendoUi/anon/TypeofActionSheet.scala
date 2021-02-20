package typings.kendoUi.anon

import typings.kendoUi.kendo.mobile.ui.ActionSheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofActionSheet extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ActionSheet = js.native
  
  /* static member */
  var fn: ActionSheet = js.native
}
object TypeofActionSheet {
  
  @scala.inline
  def apply(extend: js.Object => ActionSheet, fn: ActionSheet): TypeofActionSheet = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofActionSheet]
  }
  
  @scala.inline
  implicit class TypeofActionSheetMutableBuilder[Self <: TypeofActionSheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => ActionSheet): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: ActionSheet): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
