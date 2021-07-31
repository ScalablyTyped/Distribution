package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Loader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLoader extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Loader
  
  /* static member */
  var fn: Loader
}
object TypeofLoader {
  
  @scala.inline
  def apply(extend: js.Object => Loader, fn: Loader): TypeofLoader = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofLoader]
  }
  
  @scala.inline
  implicit class TypeofLoaderMutableBuilder[Self <: TypeofLoader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Loader): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Loader): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
