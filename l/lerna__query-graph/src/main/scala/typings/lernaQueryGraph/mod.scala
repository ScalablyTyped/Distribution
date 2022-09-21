package typings.lernaQueryGraph

import typings.lernaPackage.mod.Package
import typings.lernaPackageGraph.mod.PackageGraphNode
import typings.lernaQueryGraph.lernaQueryGraphStrings.allDependencies
import typings.lernaQueryGraph.lernaQueryGraphStrings.dependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lerna/query-graph", "QueryGraph")
  @js.native
  open class QueryGraph protected () extends StObject {
    def this(packages: js.Array[Package]) = this()
    def this(packages: js.Array[Package], options: QueryGraphConfig) = this()
    
    def getAvailablePackages(): js.Array[Package] = js.native
    
    def markAsDone(candidateNode: PackageGraphNode): Unit = js.native
    
    def markAsTaken(name: String): Unit = js.native
  }
  /* static members */
  object QueryGraph {
    
    @JSImport("@lerna/query-graph", "QueryGraph")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param packages An array of Packages to build the list out of
      * @param [options]
      */
    inline def toposort(packages: js.Array[Package]): js.Array[Package] = ^.asInstanceOf[js.Dynamic].applyDynamic("toposort")(packages.asInstanceOf[js.Any]).asInstanceOf[js.Array[Package]]
    inline def toposort(packages: js.Array[Package], options: QueryGraphConfig): js.Array[Package] = (^.asInstanceOf[js.Dynamic].applyDynamic("toposort")(packages.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Package]]
  }
  
  @JSImport("@lerna/query-graph", "toposort")
  @js.native
  val toposort: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof QueryGraph.toposort */ Any = js.native
  
  trait QueryGraphConfig extends StObject {
    
    /**
      * "dependencies" excludes devDependencies from graph
      */
    var graphType: js.UndefOr[allDependencies | dependencies] = js.undefined
    
    /**
      * Whether or not to reject dependency cycles
      */
    var rejectCycles: js.UndefOr[Boolean] = js.undefined
  }
  object QueryGraphConfig {
    
    inline def apply(): QueryGraphConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryGraphConfig]
    }
    
    extension [Self <: QueryGraphConfig](x: Self) {
      
      inline def setGraphType(value: allDependencies | dependencies): Self = StObject.set(x, "graphType", value.asInstanceOf[js.Any])
      
      inline def setGraphTypeUndefined: Self = StObject.set(x, "graphType", js.undefined)
      
      inline def setRejectCycles(value: Boolean): Self = StObject.set(x, "rejectCycles", value.asInstanceOf[js.Any])
      
      inline def setRejectCyclesUndefined: Self = StObject.set(x, "rejectCycles", js.undefined)
    }
  }
}
