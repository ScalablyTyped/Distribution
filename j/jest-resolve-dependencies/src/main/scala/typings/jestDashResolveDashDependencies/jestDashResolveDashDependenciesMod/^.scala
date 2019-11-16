package typings.jestDashResolveDashDependencies.jestDashResolveDashDependenciesMod

import typings.jestDashHasteDashMap.jestDashHasteDashMapMod.FS
import typings.jestDashSnapshot.jestDashSnapshotMod.SnapshotResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DependencyResolver is used to resolve the direct dependencies of a module or
  * to retrieve a list of all transitive inverse dependencies.
  */
@JSImport("jest-resolve-dependencies", JSImport.Namespace)
@js.native
class ^ protected () extends DependencyResolver {
  def this(
    resolver: typings.jestDashResolve.jestDashResolveMod.^,
    hasteFS: FS,
    snapshotResolver: SnapshotResolver
  ) = this()
}

