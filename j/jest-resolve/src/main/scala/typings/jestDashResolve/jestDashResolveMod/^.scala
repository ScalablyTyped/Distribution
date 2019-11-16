package typings.jestDashResolve.jestDashResolveMod

import typings.atJestTypes.buildConfigMod.Path
import typings.jestDashHasteDashMap.jestDashHasteDashMapMod.ModuleMap
import typings.jestDashResolve.buildTypesMod.ResolverConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-resolve", JSImport.Namespace)
@js.native
class ^ protected () extends Resolver {
  def this(moduleMap: ModuleMap, options: ResolverConfig) = this()
}

@JSImport("jest-resolve", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clearDefaultResolverCache(): Unit = js.native
  def findNodeModule(path: Path, options: FindNodeModuleConfig): Path | Null = js.native
}

