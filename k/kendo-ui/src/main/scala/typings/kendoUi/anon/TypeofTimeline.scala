package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Timeline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTimeline extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Timeline
  
  /* static member */
  var fn: Timeline
}
object TypeofTimeline {
  
  @scala.inline
  def apply(extend: js.Object => Timeline, fn: Timeline): TypeofTimeline = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTimeline]
  }
  
  @scala.inline
  implicit class TypeofTimelineMutableBuilder[Self <: TypeofTimeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Timeline): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Timeline): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
