package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object routeInterfaceMod {
  
  type NavigationHookCallback = js.Function0[
    typings.ionicCore.routeInterfaceMod.NavigationHookResult | js.Promise[typings.ionicCore.routeInterfaceMod.NavigationHookResult]
  ]
  
  type NavigationHookResult = scala.Boolean | typings.ionicCore.routeInterfaceMod.NavigationHookOptions
}
