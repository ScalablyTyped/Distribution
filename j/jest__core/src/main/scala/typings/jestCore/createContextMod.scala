package typings.jestCore

import typings.jestHasteMap.mod.HasteMapObject
import typings.jestRuntime.mod.Context
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/lib/create_context", JSImport.Namespace)
@js.native
object createContextMod extends js.Object {
  def default(config: ProjectConfig, hasHasteFSModuleMap: HasteMapObject): Context = js.native
}

