package typings.jsreportCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowedModules extends js.Object {
  
  var allowedModules: js.Array[String] = js.native
}
object AllowedModules {
  
  @scala.inline
  def apply(allowedModules: js.Array[String]): AllowedModules = {
    val __obj = js.Dynamic.literal(allowedModules = allowedModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedModules]
  }
  
  @scala.inline
  implicit class AllowedModulesOps[Self <: AllowedModules] (val x: Self) extends AnyVal {
    
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
    def setAllowedModulesVarargs(value: String*): Self = this.set("allowedModules", js.Array(value :_*))
    
    @scala.inline
    def setAllowedModules(value: js.Array[String]): Self = this.set("allowedModules", value.asInstanceOf[js.Any])
  }
}
