package typings.jestCore.updateGlobalConfigMod

import typings.jestTypes.configMod.GlobalConfig
import typings.jestWatcher.typesMod.AllowedConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/core/build/lib/updateGlobalConfig", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(globalConfig: GlobalConfig): GlobalConfig = js.native
  def apply(globalConfig: GlobalConfig, options: AllowedConfigOptions with ExtraConfigOptions): GlobalConfig = js.native
}
