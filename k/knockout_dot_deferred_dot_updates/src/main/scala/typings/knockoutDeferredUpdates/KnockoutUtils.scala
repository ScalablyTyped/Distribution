package typings.knockoutDeferredUpdates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Utils
@js.native
trait KnockoutUtils extends StObject {
  
  def objectForEach(obj: js.Any, action: js.Function): Unit = js.native
  
  def objectMap(source: js.Any, mapping: js.Function): js.Any = js.native
}
object KnockoutUtils {
  
  @scala.inline
  def apply(objectForEach: (js.Any, js.Function) => Unit, objectMap: (js.Any, js.Function) => js.Any): KnockoutUtils = {
    val __obj = js.Dynamic.literal(objectForEach = js.Any.fromFunction2(objectForEach), objectMap = js.Any.fromFunction2(objectMap))
    __obj.asInstanceOf[KnockoutUtils]
  }
  
  @scala.inline
  implicit class KnockoutUtilsMutableBuilder[Self <: KnockoutUtils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectForEach(value: (js.Any, js.Function) => Unit): Self = StObject.set(x, "objectForEach", js.Any.fromFunction2(value))
    
    @scala.inline
    def setObjectMap(value: (js.Any, js.Function) => js.Any): Self = StObject.set(x, "objectMap", js.Any.fromFunction2(value))
  }
}
