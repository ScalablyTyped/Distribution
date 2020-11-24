package typings.jestResolve.typesMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleNameMapperConfig extends js.Object {
  
  var moduleName: String | js.Array[String] = js.native
  
  var regex: RegExp = js.native
}
object ModuleNameMapperConfig {
  
  @scala.inline
  def apply(moduleName: String | js.Array[String], regex: RegExp): ModuleNameMapperConfig = {
    val __obj = js.Dynamic.literal(moduleName = moduleName.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleNameMapperConfig]
  }
  
  @scala.inline
  implicit class ModuleNameMapperConfigOps[Self <: ModuleNameMapperConfig] (val x: Self) extends AnyVal {
    
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
    def setModuleNameVarargs(value: String*): Self = this.set("moduleName", js.Array(value :_*))
    
    @scala.inline
    def setModuleName(value: String | js.Array[String]): Self = this.set("moduleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegex(value: RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
  }
}
