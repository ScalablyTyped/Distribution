package typings.lernaPackageGraph

import typings.lernaPackage.mod.Package
import typings.lernaPackageGraph.anon.PickResultgitCommittishgi
import typings.npmPackageArg.mod.Result
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPackageGraphNodeMod {
  
  @JSImport("@lerna/package-graph/lib/package-graph-node", "PackageGraphNode")
  @js.native
  open class PackageGraphNode protected () extends StObject {
    def this(pkg: Package) = this()
    
    var externalDependencies: Map[String, Result] = js.native
    
    var localDependencies: Map[String, Result] = js.native
    
    var localDependents: Map[String, PackageGraphNode] = js.native
    
    def location: String = js.native
    
    var name: String = js.native
    
    def pkg: Package = js.native
    
    def prereleaseId: String = js.native
    
    /**
      * Determine if the Node satisfies a resolved semver range.
      * @see https://github.com/npm/npm-package-arg#result-object
      *
      * @param resolved npm-package-arg Result object
      */
    def satisfies(result: PickResultgitCommittishgi): Boolean = js.native
    
    def version: String = js.native
  }
}
