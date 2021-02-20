package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Splitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSplitter extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Splitter = js.native
  
  /* static member */
  var fn: Splitter = js.native
}
object TypeofSplitter {
  
  @scala.inline
  def apply(extend: js.Object => Splitter, fn: Splitter): TypeofSplitter = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSplitter]
  }
  
  @scala.inline
  implicit class TypeofSplitterMutableBuilder[Self <: TypeofSplitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Splitter): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Splitter): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
