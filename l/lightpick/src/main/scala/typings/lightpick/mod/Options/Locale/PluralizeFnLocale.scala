package typings.lightpick.mod.Options.Locale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluralizeFnLocale extends js.Object {
  
  var one: String = js.native
  
  var other: String = js.native
}
object PluralizeFnLocale {
  
  @scala.inline
  def apply(one: String, other: String): PluralizeFnLocale = {
    val __obj = js.Dynamic.literal(one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralizeFnLocale]
  }
  
  @scala.inline
  implicit class PluralizeFnLocaleOps[Self <: PluralizeFnLocale] (val x: Self) extends AnyVal {
    
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
    def setOne(value: String): Self = this.set("one", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOther(value: String): Self = this.set("other", value.asInstanceOf[js.Any])
  }
}
