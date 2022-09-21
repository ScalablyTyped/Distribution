package typings.lernaPackageGraph

import typings.lernaPackage.mod.Package
import typings.lernaPackageGraph.cyclicPackageGraphNodeMod.CyclicPackageGraphNode
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lerna/package-graph", "PackageGraph")
  @js.native
  open class PackageGraph protected ()
    extends StObject
       with Map[
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for K */ Any, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ Any
        ] {
    def this(packages: js.Array[Package]) = this()
    def this(packages: js.Array[Package], graphType: GraphType) = this()
    def this(packages: js.Array[Package], graphType: Unit, forceLocal: Boolean) = this()
    def this(packages: js.Array[Package], graphType: GraphType, forceLocal: Boolean) = this()
    
    /**
      * Takes a list of Packages and returns a list of those same Packages with any Packages
      * they depend on. i.e if packageA depended on packageB `graph.addDependencies([packageA])`
      * would return [packageA, packageB].
      */
    def addDependencies(filteredPackages: js.Array[Package]): js.Array[Package] = js.native
    
    /**
      * Takes a list of Packages and returns a list of those same Packages with any Packages
      * that depend on them. i.e if packageC depended on packageD `graph.addDependents([packageD])`
      * would return [packageD, packageC].
      * @param filteredPackages The packages to include dependents for.
      */
    def addDependents(filteredPackages: js.Array[Package]): js.Array[Package] = js.native
    
    /**
      * Returns the cycles of this graph. If two cycles share some elements, they will
      * be returned as a single cycle.
      *
      * @param rejectCycles Whether or not to reject cycles
      */
    def collapseCycles(rejectCycles: Boolean): Set[CyclicPackageGraphNode] = js.native
    
    /**
      * Extends a list of packages by traversing on a given property, which must refer to a
      * `PackageGraphNode` property that is a collection of `PackageGraphNode`s.
      * Returns input packages with any additional packages found by traversing `nodeProp`.
      */
    def extendList(packageList: js.Array[Package], nodeProp: NodeProperties): js.Array[Package] = js.native
    
    def get(name: String): typings.lernaPackageGraph.packageGraphNodeMod.PackageGraphNode = js.native
    
    /**
      * Remove all candidate nodes.
      * @param candidates
      */
    def prune(candidates: typings.lernaPackageGraph.packageGraphNodeMod.PackageGraphNode*): Unit = js.native
    
    def rawPackageList: js.Array[Package] = js.native
    
    /**
      * Delete by value (instead of key), as well as removing pointers
      * to itself in the other node's internal collections.
      * @param candidateNode instance to remove
      */
    def remove(candidateNode: typings.lernaPackageGraph.packageGraphNodeMod.PackageGraphNode): Unit = js.native
  }
  
  @JSImport("@lerna/package-graph", "PackageGraphNode")
  @js.native
  open class PackageGraphNode protected ()
    extends typings.lernaPackageGraph.packageGraphNodeMod.PackageGraphNode {
    def this(pkg: Package) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lernaPackageGraph.lernaPackageGraphStrings.allDependencies
    - typings.lernaPackageGraph.lernaPackageGraphStrings.dependencies
  */
  trait GraphType extends StObject
  object GraphType {
    
    inline def allDependencies: typings.lernaPackageGraph.lernaPackageGraphStrings.allDependencies = "allDependencies".asInstanceOf[typings.lernaPackageGraph.lernaPackageGraphStrings.allDependencies]
    
    inline def dependencies: typings.lernaPackageGraph.lernaPackageGraphStrings.dependencies = "dependencies".asInstanceOf[typings.lernaPackageGraph.lernaPackageGraphStrings.dependencies]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lernaPackageGraph.lernaPackageGraphStrings.localDependencies
    - typings.lernaPackageGraph.lernaPackageGraphStrings.localDependents
  */
  trait NodeProperties extends StObject
  object NodeProperties {
    
    inline def localDependencies: typings.lernaPackageGraph.lernaPackageGraphStrings.localDependencies = "localDependencies".asInstanceOf[typings.lernaPackageGraph.lernaPackageGraphStrings.localDependencies]
    
    inline def localDependents: typings.lernaPackageGraph.lernaPackageGraphStrings.localDependents = "localDependents".asInstanceOf[typings.lernaPackageGraph.lernaPackageGraphStrings.localDependents]
  }
}
