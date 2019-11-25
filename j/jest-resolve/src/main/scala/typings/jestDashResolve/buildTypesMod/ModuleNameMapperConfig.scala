package typings.jestDashResolve.buildTypesMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleNameMapperConfig extends js.Object {
  var moduleName: String
  var regex: RegExp
}

object ModuleNameMapperConfig {
  @scala.inline
  def apply(moduleName: String, regex: RegExp): ModuleNameMapperConfig = {
    val __obj = js.Dynamic.literal(moduleName = moduleName.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModuleNameMapperConfig]
  }
}

