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
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], hasteFS = hasteFS.asInstanceOf[js.Any], moduleMap = moduleMap.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Context]
  }
}

