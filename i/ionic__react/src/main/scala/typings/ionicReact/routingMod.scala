package typings.ionicReact

import typings.ionicReact.navManagerMod.NavManagerProps
import typings.ionicReact.routeManagerContextMod.RouteManagerContextState
import typings.ionicReact.stackContextMod.StackContextState
import typings.ionicReact.viewLifeCycleManagerMod.ViewTransitionManagerProps
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routingMod {
  
  @JSImport("@ionic/react/dist/types/routing", "LocationHistory")
  @js.native
  class LocationHistory ()
    extends typings.ionicReact.locationHistoryMod.LocationHistory
  
  @JSImport("@ionic/react/dist/types/routing", "NavManager")
  @js.native
  class NavManager protected ()
    extends typings.ionicReact.navManagerMod.NavManager {
    def this(props: NavManagerProps) = this()
  }
  
  @JSImport("@ionic/react/dist/types/routing", "RouteManagerContext")
  @js.native
  val RouteManagerContext: Context[RouteManagerContextState] = js.native
  
  @JSImport("@ionic/react/dist/types/routing", "StackContext")
  @js.native
  val StackContext: Context[StackContextState] = js.native
  
  @JSImport("@ionic/react/dist/types/routing", "ViewLifeCycleManager")
  @js.native
  class ViewLifeCycleManager protected ()
    extends typings.ionicReact.viewLifeCycleManagerMod.ViewLifeCycleManager {
    def this(props: ViewTransitionManagerProps) = this()
  }
  
  @JSImport("@ionic/react/dist/types/routing", "ViewStacks")
  @js.native
  abstract class ViewStacks ()
    extends typings.ionicReact.viewStacksMod.ViewStacks
}
