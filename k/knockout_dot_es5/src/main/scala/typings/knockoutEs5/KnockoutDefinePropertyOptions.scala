package typings.knockoutEs5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutDefinePropertyOptions extends js.Object {
  
  def get(): js.Any = js.native
  
  var set: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
}
object KnockoutDefinePropertyOptions {
  
  @scala.inline
  def apply(get: () => js.Any): KnockoutDefinePropertyOptions = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[KnockoutDefinePropertyOptions]
  }
  
  @scala.inline
  implicit class KnockoutDefinePropertyOptionsOps[Self <: KnockoutDefinePropertyOptions] (val x: Self) extends AnyVal {
    
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
    def setGet(value: () => js.Any): Self = this.set("get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: /* value */ js.Any => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
  }
}
