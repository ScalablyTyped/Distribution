package typings.jestResolve.mod

import typings.jestHasteMap.mod.ModuleMap
import typings.jestResolve.typesMod.ResolverConfig
import typings.jestTypes.configMod.Path
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

