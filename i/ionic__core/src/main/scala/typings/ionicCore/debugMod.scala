package typings.ionicCore

import typings.ionicCore.interfaceMod.RouteChain
import typings.ionicCore.interfaceMod.RouteRedirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugMod {
  
  @JSImport("@ionic/core/dist/types/components/router/utils/debug", "printRedirects")
  @js.native
  def printRedirects(redirects: js.Array[RouteRedirect]): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/components/router/utils/debug", "printRoutes")
  @js.native
  def printRoutes(routes: js.Array[RouteChain]): Unit = js.native
}
