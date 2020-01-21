package typings.jestResolveDependencies.mod

import typings.jestResolve.mod.ResolveModuleConfig
import typings.jestTypes.configMod.Path
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DependencyResolver is used to resolve the direct dependencies of a module or
  * to retrieve a list of all transitive inverse dependencies.
  */
@js.native
trait DependencyResolver extends js.Object {
  var _hasteFS: js.Any = js.native
  var _resolver: js.Any = js.native
  var _snapshotResolver: js.Any = js.native
  def resolve(file: Path): js.Array[Path] = js.native
  def resolve(file: Path, options: ResolveModuleConfig): js.Array[Path] = js.native
  def resolveInverse(paths: Set[Path], filter: js.Function1[/* file */ Path, Boolean]): js.Array[Path] = js.native
  def resolveInverse(paths: Set[Path], filter: js.Function1[/* file */ Path, Boolean], options: ResolveModuleConfig): js.Array[Path] = js.native
  def resolveInverseModuleMap(paths: Set[Path], filter: js.Function1[/* file */ Path, Boolean]): js.Array[ResolvedModule] = js.native
  def resolveInverseModuleMap(paths: Set[Path], filter: js.Function1[/* file */ Path, Boolean], options: ResolveModuleConfig): js.Array[ResolvedModule] = js.native
}

