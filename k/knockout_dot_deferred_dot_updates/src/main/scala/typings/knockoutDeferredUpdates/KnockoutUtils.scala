package typings.knockoutDeferredUpdates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Utils
@js.native
trait KnockoutUtils extends js.Object {
  
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
  implicit class KnockoutUtilsOps[Self <: KnockoutUtils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setObjectForEach(value: (js.Any, js.Function) => Unit): Self = this.set("objectForEach", js.Any.fromFunction2(value))
    
    @scala.inline
    def setObjectMap(value: (js.Any, js.Function) => js.Any): Self = this.set("objectMap", js.Any.fromFunction2(value))
  }
}
