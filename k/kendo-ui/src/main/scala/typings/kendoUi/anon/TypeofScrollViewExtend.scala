package typings.kendoUi.anon

import typings.kendoUi.kendo.mobile.ui.ScrollView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofScrollViewExtend extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ScrollView = js.native
  
  /* static member */
  var fn: ScrollView = js.native
}
object TypeofScrollViewExtend {
  
  @scala.inline
  def apply(extend: js.Object => ScrollView, fn: ScrollView): TypeofScrollViewExtend = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofScrollViewExtend]
  }
  
  @scala.inline
  implicit class TypeofScrollViewExtendMutableBuilder[Self <: TypeofScrollViewExtend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => ScrollView): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: ScrollView): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
