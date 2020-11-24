package typings.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutUtils extends js.Object {
  
  def uniqueId(prefix: String): String = js.native
  
  def unwrapProperties(wrappedProperies: js.Any): js.Any = js.native
}
object KnockoutUtils {
  
  @scala.inline
  def apply(uniqueId: String => String, unwrapProperties: js.Any => js.Any): KnockoutUtils = {
    val __obj = js.Dynamic.literal(uniqueId = js.Any.fromFunction1(uniqueId), unwrapProperties = js.Any.fromFunction1(unwrapProperties))
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
    def setUniqueId(value: String => String): Self = this.set("uniqueId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnwrapProperties(value: js.Any => js.Any): Self = this.set("unwrapProperties", js.Any.fromFunction1(value))
  }
}
