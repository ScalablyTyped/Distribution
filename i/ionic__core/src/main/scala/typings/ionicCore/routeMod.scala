package typings.ionicCore

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.routeInterfaceMod.NavigationHookCallback
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeMod {
  
  @JSImport("@ionic/core/dist/types/components/route/route", "Route")
  @js.native
  class Route () extends ComponentInterface {
    
    /**
      * A navigation hook that is fired when the route tries to enter.
      * Returning `true` allows the navigation to proceed, while returning
      * `false` causes it to be cancelled. Returning a `NavigationHookOptions`
      * object causes the router to redirect to the path specified.
      */
    var beforeEnter: js.UndefOr[NavigationHookCallback] = js.native
    
    /**
      * A navigation hook that is fired when the route tries to leave.
      * Returning `true` allows the navigation to proceed, while returning
      * `false` causes it to be cancelled. Returning a `NavigationHookOptions`
      * object causes the router to redirect to the path specified.
      */
    var beforeLeave: js.UndefOr[NavigationHookCallback] = js.native
    
    /**
      * Name of the component to load/select in the navigation outlet (`ion-tabs`, `ion-nav`)
      * when the route matches.
      *
      * The value of this property is not always the tagname of the component to load,
      * in `ion-tabs` it actually refers to the name of the `ion-tab` to select.
      */
    var component: String = js.native
    
    /**
      * A key value `{ 'red': true, 'blue': 'white'}` containing props that should be passed
      * to the defined component when rendered.
      */
    var componentProps: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MRoute(): Unit = js.native
    
    /**
      * Used internally by `ion-router` to know when this route did change.
      */
    var ionRouteDataChanged: EventEmitter[_] = js.native
    
    def onComponentProps(newValue: js.Any, oldValue: js.Any): Unit = js.native
    
    def onUpdate(newValue: js.Any): Unit = js.native
    
    /**
      * Relative path that needs to match in order for this route to apply.
      *
      * Accepts paths similar to expressjs so that you can define parameters
      * in the url /foo/:bar where bar would be available in incoming props.
      */
    var url: String = js.native
  }
}
