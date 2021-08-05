package typings.ionicCore

import typings.ionicCore.interfaceMod.RouteChain
import typings.ionicCore.interfaceMod.RouteID
import typings.ionicCore.interfaceMod.RouteRedirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchingMod {
  
  @JSImport("@ionic/core/dist/types/components/router/utils/matching", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/core/dist/types/components/router/utils/matching", "RouterSegments")
  @js.native
  class RouterSegments protected () extends StObject {
    def this(path: js.Array[String]) = this()
    
    def next(): String = js.native
    
    /* private */ var path: js.Any = js.native
  }
  
  inline def computePriority(chain: RouteChain): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computePriority")(chain.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def matchesIDs(ids: js.Array[String], chain: RouteChain): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesIDs")(ids.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def matchesPath(inputPath: js.Array[String], chain: RouteChain): RouteChain | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesPath")(inputPath.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[RouteChain | Null]
  
  inline def matchesRedirect(input: js.Array[String], route: RouteRedirect): /* is @ionic/core.@ionic/core/dist/types/components/router/utils/interface.RouteRedirect */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesRedirect")(input.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[/* is @ionic/core.@ionic/core/dist/types/components/router/utils/interface.RouteRedirect */ Boolean]
  
  inline def mergeParams(a: js.Any, b: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeParams")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def routeRedirect(path: js.Array[String], routes: js.Array[RouteRedirect]): js.UndefOr[RouteRedirect] = (^.asInstanceOf[js.Dynamic].applyDynamic("routeRedirect")(path.asInstanceOf[js.Any], routes.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[RouteRedirect]]
  
  inline def routerIDsToChain(ids: js.Array[RouteID], chains: js.Array[RouteChain]): RouteChain | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("routerIDsToChain")(ids.asInstanceOf[js.Any], chains.asInstanceOf[js.Any])).asInstanceOf[RouteChain | Null]
  
  inline def routerPathToChain(path: js.Array[String], chains: js.Array[RouteChain]): RouteChain | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("routerPathToChain")(path.asInstanceOf[js.Any], chains.asInstanceOf[js.Any])).asInstanceOf[RouteChain | Null]
}
