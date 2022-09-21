package typings.lernaPackageGraph

import typings.lernaPackageGraph.packageGraphNodeMod.PackageGraphNode
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cyclicPackageGraphNodeMod {
  
  @JSImport("@lerna/package-graph/lib/cyclic-package-graph-node", "CyclicPackageGraphNode")
  @js.native
  open class CyclicPackageGraphNode ()
    extends StObject
       with Map[
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for K */ Any, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ Any
        ] {
    
    /**
      * Checks if a given node is contained in this cycle (or in a nested one)
      *
      * @param name The name of the package to search in this cycle
      */
    def contains(name: String): Boolean = js.native
    
    /**
      * Flattens a CyclicPackageGraphNode (which can have multiple level of cycles).
      */
    def flatten(): js.Array[PackageGraphNode] = js.native
    
    def insert(node: CyclicPackageGraphNode): Unit = js.native
    /**
      * Adds a graph node, or a nested cycle, to this group.
      *
      * @param node node to insert
      */
    def insert(node: PackageGraphNode): Unit = js.native
    
    def isCycle: Boolean = js.native
    
    var localDependencies: Map[String, PackageGraphNode | CyclicPackageGraphNode] = js.native
    
    var localDependents: Map[String, PackageGraphNode | CyclicPackageGraphNode] = js.native
    
    var name: String = js.native
    
    def unlink(candidateNode: CyclicPackageGraphNode): Unit = js.native
    /**
      * Remove pointers to candidate node from internal collections.
      * @param candidateNode instance to unlink
      */
    def unlink(candidateNode: PackageGraphNode): Unit = js.native
  }
}
