package typings.jestResolveDependencies.mod

import typings.jestHasteMap.mod.FS
import typings.jestSnapshot.mod.SnapshotResolver
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
    resolver: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolverType */ js.Any,
    hasteFS: FS,
    snapshotResolver: SnapshotResolver
  ) = this()
}

