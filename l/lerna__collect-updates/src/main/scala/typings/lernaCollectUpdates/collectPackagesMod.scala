package typings.lernaCollectUpdates

import typings.lernaPackageGraph.packageGraphNodeMod.PackageGraphNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectPackagesMod {
  
  @JSImport("@lerna/collect-updates/lib/collect-packages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collectPackages(packages: PackageGraphNode, options: PackageCollectorOptions): js.Array[PackageGraphNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectPackages")(packages.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[PackageGraphNode]]
  
  trait PackageCollectorOptions extends StObject {
    
    var excludeDependents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, all nodes passed in are candidates
      */
    var isCandidate: js.UndefOr[js.Function2[/* node */ PackageGraphNode, /* name */ String, Boolean]] = js.undefined
    
    var onInclude: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.undefined
  }
  object PackageCollectorOptions {
    
    inline def apply(): PackageCollectorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackageCollectorOptions]
    }
    
    extension [Self <: PackageCollectorOptions](x: Self) {
      
      inline def setExcludeDependents(value: Boolean): Self = StObject.set(x, "excludeDependents", value.asInstanceOf[js.Any])
      
      inline def setExcludeDependentsUndefined: Self = StObject.set(x, "excludeDependents", js.undefined)
      
      inline def setIsCandidate(value: (/* node */ PackageGraphNode, /* name */ String) => Boolean): Self = StObject.set(x, "isCandidate", js.Any.fromFunction2(value))
      
      inline def setIsCandidateUndefined: Self = StObject.set(x, "isCandidate", js.undefined)
      
      inline def setOnInclude(value: /* name */ String => Unit): Self = StObject.set(x, "onInclude", js.Any.fromFunction1(value))
      
      inline def setOnIncludeUndefined: Self = StObject.set(x, "onInclude", js.undefined)
    }
  }
}
