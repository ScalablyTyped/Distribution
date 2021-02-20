package typings.ionicCore

import typings.ionicCore.interfaceMod.RouteChain
import typings.ionicCore.interfaceMod.RouteID
import typings.ionicCore.interfaceMod.RouteRedirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchingMod {
  
  @JSImport("@ionic/core/dist/types/components/router/utils/matching", "RouterSegments")
  @js.native
  class RouterSegments protected () extends StObject {
    def this(path: js.Array[String]) = this()
    
    def next(): String = js.native
    
    var path: js.Any = js.native
  }
  
  @JSImport("@ionic/core/dist/types/components/router/utils/matching", "computePriority")
  @js.native
  def computePriority(chain: RouteChain): Double = js.native
  
  @JSImport("@ionic/core/dist/types/components/router/utils/matching", "matchesIDs")
  @js.native
  def matchesIDs(ids: js.Array[String], chain: RouteChain): Double = js.native
  
  @JSImport("@ionic/core/dist/types/components/router/utils/matching", "matchesPath")
  @js.native
  def matchesPath(inputPath: js.Array[String], chain: RouteChain): RouteChain | Null = js.native
  
  @JSImport("@ionic/core/dist/types/components/router/utils/matching", "matchesRedirect")
  @js.native
  def matchesRedirect(input: js.Array[String], route: RouteRedirect): /* is @ionic/core.@ionic/core/dist/types/components/router/utils/interface.RouteRedirect */ Boolean = js.native
  
  @JSImport("@ionic/core/dist/types/components/router/utils/matching", "mergeParams")
  @js.native
  def mergeParams(a: js.Any, b: js.Any): js.Any = js.native
  
  @JSImport("@ionic/core/dist/types/components/router/utils/matching", "routeRedirect")
  @js.native
  def routeRedirect(path: js.Array[String], routes: js.Array[RouteRedirect]): js.UndefOr[RouteRedirect] = js.native
  
  @JSImport("@ionic/core/dist/types/components/router/utils/matching", "routerIDsToChain")
  @js.native
  def routerIDsToChain(ids: js.Array[RouteID], chains: js.Array[RouteChain]): RouteChain | Null = js.native
  
  @JSImport("@ionic/core/dist/types/components/router/utils/matching", "routerPathToChain")
  @js.native
  def routerPathToChain(path: js.Array[String], chains: js.Array[RouteChain]): RouteChain | Null = js.native
}
