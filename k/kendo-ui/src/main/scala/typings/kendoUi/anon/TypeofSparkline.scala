package typings.kendoUi.anon

import typings.kendoUi.kendo.dataviz.ui.Sparkline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSparkline extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Sparkline = js.native
  
  /* static member */
  var fn: Sparkline = js.native
}
object TypeofSparkline {
  
  @scala.inline
  def apply(extend: js.Object => Sparkline, fn: Sparkline): TypeofSparkline = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSparkline]
  }
  
  @scala.inline
  implicit class TypeofSparklineMutableBuilder[Self <: TypeofSparkline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Sparkline): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Sparkline): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
