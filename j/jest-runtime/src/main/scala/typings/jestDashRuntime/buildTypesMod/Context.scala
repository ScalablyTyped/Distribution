package typings.jestDashRuntime.buildTypesMod

import typings.atJestTypes.buildConfigMod.ProjectConfig
import typings.jestDashHasteDashMap.jestDashHasteDashMapMod.FS
import typings.jestDashHasteDashMap.jestDashHasteDashMapMod.ModuleMap
import typings.jestDashResolve.jestDashResolveMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var config: ProjectConfig
  var hasteFS: FS
  var moduleMap: ModuleMap
  var resolver: ^
}

object Context {
  @scala.inline
  def apply(config: ProjectConfig, hasteFS: FS, moduleMap: ModuleMap, resolver: ^): Context = {
    val __obj = js.Dynamic.literal(config = config, hasteFS = hasteFS, moduleMap = moduleMap, resolver = resolver)
  
    __obj.asInstanceOf[Context]
  }
}

